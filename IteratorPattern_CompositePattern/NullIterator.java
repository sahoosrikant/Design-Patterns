package org.example.custom_iterator;

import org.example.componentInterface.FileSystemComponent;

import java.util.Iterator;

public class NullIterator implements Iterator<FileSystemComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public FileSystemComponent next() {
        return null;
    }
}
