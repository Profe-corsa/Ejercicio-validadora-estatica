/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.b02;


import java.util.Scanner;
/**
 *
 * @author crist
 */
public class ValidarRespuesta {

    public static boolean validarS_N() {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        while (true) {
            System.out.print("¿Continúa? (S/N): ");
            respuesta = scanner.nextLine().toUpperCase();

            if (respuesta.equals("S")) {
                return true;
            } else if (respuesta.equals("N")) {
                return false;
            } else {
                System.out.println("Error. Ingrese 'S' o 'N'.");
            }
        }
    }
}