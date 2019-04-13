/*
 * Punto.java
 *
 * Created on 1 de agosto de 2008, 01:29 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package aproxpolinomino;

/**Esta clase contiene la información de un punto de la gr�fica.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class Punto {
    private double X;
    private double Y;
    /**Crea una nueva instancia de la clase Punto.
     * @param x Tipo double.
     * @param y Tipo double.
     */
    public Punto(double x, double y) {
        X=x;
        Y=y;
    }
    public Punto()
    {
        X=0;
        Y=0;
    }
    public double ObtenerX()
    {
        return X;
    }
    public double ObtenerY()
    {
        return Y;
    }
    public void AsignarX(double x)
    {
        X=x;
    }
    public void AsignarY(double y)
    {
        Y=y;
    }
}
