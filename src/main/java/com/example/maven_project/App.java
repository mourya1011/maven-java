package com.example.maven_project;

import java.io.InputStream;

public class App {

    public static void main(String[] args) {

        InputStream input =
            App.class.getClassLoader()
                    .getResourceAsStream("config.properties");

        if (input != null) {
            System.out.println("config.properties found!");
        } else {
            System.out.println("config.properties not found!");
        }
    }
}