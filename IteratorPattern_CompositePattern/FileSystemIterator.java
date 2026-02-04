package org.example.custom_iterator;

import org.example.componentInterface.FileSystemComponent;

import java.util.Iterator;
import java.util.Stack;

public class FileSystemIterator implements Iterator<FileSystemComponent> {

    private Stack<Iterator<FileSystemComponent>> stack = new Stack<>();

    public FileSystemIterator(Iterator<FileSystemComponent> iterator){
        stack.push(iterator);
    }
    @Override
    public boolean hasNext() {
        while(!stack.isEmpty()){
            Iterator<FileSystemComponent> iterator = stack.peek();
            if(iterator.hasNext()){
                return true;
            }
            stack.pop();
        }
        return false;
    }

    @Override
    public FileSystemComponent next() {
        if(hasNext()){
            Iterator<FileSystemComponent> iterator = stack.peek();

            FileSystemComponent component = iterator.next();

            stack.push(component.createIterator());

            return component;
        }
        return null;
    }

}
