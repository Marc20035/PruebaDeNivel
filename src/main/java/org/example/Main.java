package org.example;

public class Main {
    public static void main(String[] args) {
        String archivo = "C:\\Users\\Usuario\\IdeaProjects\\PruebaDeNivel\\src\\main\\java\\org\\example\\palabras.csv";

        Diccionario diccionario = new Diccionario();

        diccionario.lectura(archivo);

    }
}