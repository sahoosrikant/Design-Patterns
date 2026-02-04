package org.example.LeafClass;

import org.example.componentInterface.FileSystemComponent;
import org.example.custom_iterator.NullIterator;

import java.util.Iterator;

public class FileLeaf extends FileSystemComponent {

    String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File : "+name);
    }

    @Override
    public Iterator<FileSystemComponent> createIterator() {
        return new NullIterator();
    }
}
