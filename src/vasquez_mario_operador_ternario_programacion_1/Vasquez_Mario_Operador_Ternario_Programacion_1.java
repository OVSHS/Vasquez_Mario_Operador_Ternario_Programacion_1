/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vasquez_mario_operador_ternario_programacion_1;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Vasquez_Mario_Operador_Ternario_Programacion_1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        // Comentario
        
       /*
        El Operador Ternario se puede considerar una herramienta muy util de trabajo que se encarga de tomar distintos tipos de decisiones simples en una unica linea de codigo.
        Tambien permite tomar desiciones basadas en una condicion y asignar un valor a una variable si la condicion es como tal verdadera o falsa. Se caracteriza por ser usada por el ¨?¨.
        */
       
       // Ejemplo Con Valor Constante:
        
        String comprobacionNota;
        System.out.println("+++Valor constante+++");
        
        System.out.println("Prueba de conocimiento,mayor a 8 significa que es capacitado,menor seria incapacitado");
        System.out.println("Ingrese su nota de prueba: ");
        double notaprueba= lea.nextDouble();
        comprobacionNota=notaprueba>=8 ? "Ingresado" : "Rechazado";
        System.out.println("Resultado de la prueba,usted fue: " + comprobacionNota);
        
       
       // Ejemplo Con Variables 
        System.out.println("\n+++Con Variables+++");
        
        System.out.println("Comparacion para saber cual numero es mayor");
        System.out.println("Ingrese primer numero: ");
        int numerouno = lea.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int numerodos = lea.nextInt();
        int numeromayor = numerouno > numerodos ? numerouno : numerodos;
        System.out.println("El numero mayor es: " + numeromayor);
        
        
        // Ejemplo Con Formulas
        System.out.println("\n+++Con Formulas+++");
        
        System.out.println("Calcular el Area de un rectangulo,Ingrese el largo y ancho:");
        System.out.println("De ser negativo el area sera 0");
        System.out.println("Ingrese el largo: ");
        double largo = lea.nextDouble();
        System.out.println("Ingrese el ancho: ");
        double ancho = lea.nextDouble();
        double area = largo>0 && ancho>0 ? largo * ancho : 0;
        System.out.println("El area de un triangulo es: " + area);
        
      
    }
    
}