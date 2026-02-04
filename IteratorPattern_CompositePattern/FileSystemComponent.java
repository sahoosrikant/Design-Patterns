package org.example.componentInterface;

import java.util.Iterator;

public abstract class FileSystemComponent {

    public void display(){
        throw new UnsupportedOperationException();
    }

    public Iterator<FileSystemComponent> createIterator(){
        throw new UnsupportedOperationException();
    }
}
