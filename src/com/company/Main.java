package com.company;

public class Main {

    public static void main(String[] args) {
        double alfa = 45;
        double beta = 45;
        if (alfa + beta < 180) {
            if (alfa + beta == 90) System.out.println("Это прямоугольный треугольник");
            else System.out.println("Треугольник существует");
        }
        else System.out.println("Треугольник не существует");
    }
}
