package org.example.command;

import org.example.editor.TextEditor;

//Commands
public class InsertTextCommand implements EditorCommand{

    private TextEditor textEditor;
    private String textToAdd;

    public InsertTextCommand(TextEditor textEditor, String textToAdd) {
        this.textEditor = textEditor;
        this.textToAdd = textToAdd;
    }

    @Override
    public void execute() {
        textEditor.insert(textToAdd);
    }

    @Override
    public void undo() {
        textEditor.delete(textToAdd.length());
    }
}
