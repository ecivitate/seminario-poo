import java.util.Stack;

class History {
    private final Stack<TextEditor.Memento> mementoStack = new Stack<>();

    // Salva o estado no histórico
    public void saveState(TextEditor.Memento memento) {
        mementoStack.push(memento);
    }

    // Restaura o estado anterior
    public TextEditor.Memento undo() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }
}