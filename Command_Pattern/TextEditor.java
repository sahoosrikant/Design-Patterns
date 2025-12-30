package org.example.editor;

//Receiver
public class TextEditor {

    private StringBuilder content = new StringBuilder();

    public void insert(String text){
        content.append(text);
        System.out.println("Inserted Text :" + text);
        System.out.println("Content Now :" + content);
    }

    public String delete(int length){
        int start = content.length()-length;
        String deletedText = content.substring(start);
        content.delete(start,content.length());
        System.out.println("Removed last :" + length + " characters");
        System.out.println("Content Now :" + content);
        return deletedText;
    }

    public String getText(){
        return content.toString();
    }


}
