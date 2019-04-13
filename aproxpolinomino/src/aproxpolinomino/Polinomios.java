package aproxpolinomino;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**Esta es una clase utilitaria que permite manipular los polinomios que le son
 * pasados a la misma.
 * @author Ricardo Presilla
 * @version 1.0.
 */
public class Polinomios {
    void Polinomios(){}
    /**Este método se encarga de encontrar f(x), la imagen de x correspondiente al
     * polinómio que es generado por la serie de puntos suministrados, almacenados
     * en la variable en la lista de arreglos Serie.
     * @param Serie  Tipo ArrayList tipo Punto, almacena una serie de puntos que 
     *               representan a la grafica.
     * @param x      Tipo double, almacena la coordenada X de la grafica, para 
     *               la cual se desea encontrar su imagen en Y, coordenada Y.
     * @return El un double con el valor de f(x).
     */
    public double Lagrance(ArrayList<Punto> Serie, double x)
    {
        double f=0;
        int n=Serie.size(),i,j,k;
        double A=1,B=1;
        try{
            double V[]= new double [n];
            double X[]= new double [n];
            double F[]= new double [n];
            for(i=0;i<n;i++)
            {
                X[i]=Serie.get(i).ObtenerX();
                F[i]=Serie.get(i).ObtenerY();
            }
            for(i=0;i<n;i++)
            {
                A=1;
                B=1;
                for(j=0; j<n; j++)
                {
                    if(j!=i)
                    {
                        A=A*(x-X[j]);
                    }
                }
                for(k=0; k<n; k++)
                {
                    if(k!=i)
                    {
                        B=B*(X[i]-X[k]);
                    }
                }
                V[i]=A/B;
            }
            for(i=0; i<n; i++)
            {
                f=f+F[i]*V[i];
            }
        }catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error: Operación cancelada.\n"+ex, "Atención",JOptionPane.ERROR_MESSAGE);
        }
        return f;
    }
}
