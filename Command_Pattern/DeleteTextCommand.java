package org.example.command;

import org.example.editor.TextEditor;

//Command
public class DeleteTextCommand implements EditorCommand{

    private TextEditor textEditor;
    private int length;
    private String deletedText;

    public DeleteTextCommand(TextEditor textEditor, int length) {
        this.textEditor = textEditor;
        this.length = length;
    }

    @Override
    public void execute() {
        deletedText = textEditor.delete(length);
    }

    @Override
    public void undo() {
        textEditor.insert(deletedText);
    }
}
