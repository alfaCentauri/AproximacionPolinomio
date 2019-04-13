/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aproxpolinomino;

import java.util.ArrayList;
import java.util.Scanner;

/**Clase principal Main, ejecuta el programa.
 *
 * @author Ricardo Presilla
 * @version 1.0.
 */
public class Aproxpolinomino {

    /**Cuerpo del programa se cargan 4 puntos y se proyecta el 5 por aproximación 
     * de Lagrance.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0;
        ArrayList<Punto> tabla = new ArrayList<Punto>();
        Punto p = new Punto();
        p.AsignarX(1);
        p.AsignarY(1);
        tabla.add(p);
        p = new Punto();
        p.AsignarX(2);
        p.AsignarY(4);
        tabla.add(p);
        p = new Punto();
        p.AsignarX(3);
        p.AsignarY(9);
        tabla.add(p);
        p = new Punto();
        p.AsignarX(5);
        p.AsignarY(25);
        tabla.add(p);
        Polinomios poli = new Polinomios();
        Scanner entrada = new Scanner( System.in );
        System.out.print( "Escriba un número entero: " );
        numero = entrada.nextInt();
        double resp = poli.Lagrance(tabla, numero);
        System.out.println("x = "+numero);
        System.out.print("y= ");
        System.out.println(resp);
    }
    
}
