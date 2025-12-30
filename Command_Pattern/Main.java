package org.example;

import org.example.command.DeleteTextCommand;
import org.example.command.InsertTextCommand;
import org.example.editor.TextEditor;
import org.example.invoker.EditorInvoker;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        EditorInvoker editorInvoker = new EditorInvoker();

        editorInvoker.executeCommand(new InsertTextCommand(textEditor, "Hello"));
        editorInvoker.executeCommand(new InsertTextCommand(textEditor, "World"));

        System.out.println(textEditor.getText());

        editorInvoker.executeCommand(new DeleteTextCommand(textEditor, 5));

        System.out.println(textEditor.getText());

        editorInvoker.undo();

        System.out.println(textEditor.getText());

        editorInvoker.undo();

        System.out.println(textEditor.getText());

        editorInvoker.redo();

        System.out.println(textEditor.getText());
    }
}