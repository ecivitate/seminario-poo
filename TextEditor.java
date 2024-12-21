public class TextEditor {
    private String text;

    // Método para alterar o texto
    public void setText(String text) {
        this.text = text;
    }

    // Método para obter o texto atual
    public String getText() {
        return text;
    }

    // Salva o estado atual em um Memento
    public Memento save() {
        return new Memento(text);
    }

    // Restaura o estado a partir de um Memento
    public void restore(Memento memento) {
        this.text = memento.getState();
    }

    // Classe aninhada Memento, encapsulada dentro de TextEditor
    public static class Memento {
        private final String state;

        // Construtor privado para evitar criação fora de TextEditor
        private Memento(String state) {
            this.state = state;
        }

        // Permite que o estado seja acessado apenas pela classe TextEditor
        private String getState() {
            return state;
        }
    }
}
