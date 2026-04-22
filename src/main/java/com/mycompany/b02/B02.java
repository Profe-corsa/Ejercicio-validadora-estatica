/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b02;


import java.util.Scanner;
/**
 *
 * @author crist
 */
public class B02 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            suma += numero;

        } while (ValidarRespuesta.validarS_N());

        System.out.println("La suma total es: " + suma);
    }
}
