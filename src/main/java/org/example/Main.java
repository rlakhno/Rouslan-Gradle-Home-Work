package org.example;

public class Main {
    public static void main(String[] args) {
        ConvertToJson convertToJson = new ConvertToJson();
        MyName myName = new MyName("Rouslan", "Lakhno");
        String text = convertToJson.toJson(myName);
        System.out.println(text);
    }
}