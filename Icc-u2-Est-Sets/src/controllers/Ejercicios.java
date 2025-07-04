package controllers;

import java.util.*;

public class Ejercicios {
    public static boolean sinDuplicados(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) if (!set.add(n)) return false;
        return true;
    }

    public static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println();
    }
    public static boolean esIsograma(String palabra) {
        Set<Character> letras = new HashSet<>();
        for (char c : palabra.toCharArray()) if (!letras.add(c)) return false;
        return true;
    }

    public static void analizarArraysYPalabras() {
        int[] datos = new int[]{1, 2, 3, 4, 5};
        int[] datos2 = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45};

        if (sinDuplicados(datos)) imprimir(datos);
        if (sinDuplicados(datos2)) imprimir(datos2); 

        String[] palabras = {"murcielago", "camaleon", "Tangamandapio"};
        for (String palabra : palabras) {
            boolean iso = esIsograma(palabra.toLowerCase());
            System.out.println(palabra + " --> " + iso);
        }
    }

    public static Set<String> obtenerPalabras(String texto) {
        String[] palabras = texto.split("\\s+");
        return new HashSet<>(Arrays.asList(palabras));
    }

    public static void compararTextos(String texto1, String texto2) {
        Set<String> set1 = obtenerPalabras(texto1);
        Set<String> set2 = obtenerPalabras(texto2);

        System.out.println("Texto 1: " + set1.size() + " palabras únicas");
        System.out.println("Texto 2: " + set2.size() + " palabras únicas");

        Set<String> comunes = new HashSet<>(set1);
        comunes.retainAll(set2);
        System.out.println("Palabras comunes: " + comunes.size());

        int totalUnicas = set1.size() + set2.size() - comunes.size();
        double porcentajeCoincidencia = (double) comunes.size() / totalUnicas * 100;
        System.out.printf("Porcentaje de coincidencia léxica: %.2f%%\n", porcentajeCoincidencia);

        Set<String> soloEn1 = new HashSet<>(set1);
        soloEn1.removeAll(set2);
        System.out.println("Palabras solo en texto 1: " + soloEn1);

        Set<String> soloEn2 = new HashSet<>(set2);
        soloEn2.removeAll(set1);
        System.out.println("Palabras solo en texto 2: " + soloEn2);
    }
}

