package org.example.invoker;

import org.example.command.EditorCommand;

import java.util.Stack;

//Invoker
//Undo stack → commands already executed
//Redo stack → commands that were undone
public class EditorInvoker {

    private Stack<EditorCommand> undoStack = new Stack<>();
    private Stack<EditorCommand> redoStack = new Stack<>();

    public void executeCommand(EditorCommand command){
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo(){
        if(!undoStack.isEmpty()){
            EditorCommand command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo(){
        if(!redoStack.isEmpty()){
            EditorCommand command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        }
    }

}
