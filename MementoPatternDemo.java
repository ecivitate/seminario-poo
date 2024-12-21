public class MementoPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Versão 1");
        history.saveState(editor.save());
        System.out.println("Texto atual: " + editor.getText());

        editor.setText("Versão 2");
        history.saveState(editor.save());
        System.out.println("Texto atual: " + editor.getText());

        editor.setText("Versão 3");
        System.out.println("Texto atual: " + editor.getText());

        // Undo
        editor.restore(history.undo());
        System.out.println("Após desfazer: " + editor.getText());

        // Undo novamente
        editor.restore(history.undo());
        System.out.println("Após desfazer novamente: " + editor.getText());
    }
}