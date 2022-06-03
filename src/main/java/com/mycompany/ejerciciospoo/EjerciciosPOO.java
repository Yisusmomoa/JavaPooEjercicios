/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciospoo;

import ClaseCuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author bjls2
 */
public class EjerciciosPOO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;
        
        Cuenta cuenta1=new Cuenta();
        
        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();
        
        cuenta1.setNombreCliente(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setSaldo(tipo);
        cuenta1.setTipoInteres(importe);
        
        cuenta1.ingreso(5000);
        
        System.out.println(cuenta1.showInfo());
        
    }
}
