package org.example;

import org.example.LeafClass.FileLeaf;
import org.example.componentInterface.FileSystemComponent;
import org.example.compositeClass.DirectoryComposite;
import org.example.custom_iterator.FileSystemIterator;

import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new FileLeaf("Resume.pdf");
        FileSystemComponent file2 = new FileLeaf("Photo.jpeg");
        FileSystemComponent file3 = new FileLeaf("Notes.txt");

        DirectoryComposite root = new DirectoryComposite("root");
        DirectoryComposite doc = new DirectoryComposite("doc");
        DirectoryComposite img = new DirectoryComposite("image");

        doc.addComponent(file1);
        doc.addComponent(file2);
        img.addComponent(file3);

        root.addComponent(doc);
        root.addComponent(img);

        Iterator<FileSystemComponent> iterator = root.createIterator();

        while(iterator.hasNext()){
            FileSystemComponent component = iterator.next();
            component.display();
        }
    }
}