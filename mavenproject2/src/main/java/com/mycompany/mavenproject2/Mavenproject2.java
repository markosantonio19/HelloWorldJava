/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        
        System.out.println("CALCULADORA");
        Scanner marko = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int numero1 = marko.nextInt();
        System.out.println("ingrese segundo  numero");
        int numero2 = marko.nextInt();
        
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        int divicion = numero1/numero2;
        
        System.out.println("la suma es: "+ suma);
        System.out.println("la resta es"+ resta);
        System.out.println("la multiplicacion es "+ multiplicacion);
        System.out.println("la divicion es "+ divicion);
        
        System.out.println("progrsamado por markitos");
             
        
        
    }
}
