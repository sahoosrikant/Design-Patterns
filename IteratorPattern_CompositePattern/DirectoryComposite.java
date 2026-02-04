package org.example.compositeClass;

import org.example.componentInterface.FileSystemComponent;
import org.example.custom_iterator.FileSystemIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DirectoryComposite extends FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public DirectoryComposite(String name){
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
    }

    public void removeComponents(FileSystemComponent component){
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Directory :"+name);
    }

    @Override
    public Iterator<FileSystemComponent> createIterator() {
        return new FileSystemIterator(components.iterator());
    }
}
