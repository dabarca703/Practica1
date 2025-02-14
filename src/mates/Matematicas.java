
package mates;

public class Matematicas{
    /**
     * Genera una aproximación al número Pi mediante el método de
     * Montecarlo. El parámetro `pasos` indica el número de puntos
     * generados.
     */
    public static double generarNumeroPiIterativo(long pasos){
        long puntosDentroCirculo = 0;
        for (long i = 0; i < pasos; i++) {
            double x = Math.random(); // Coordenada x aleatoria entre 0 y 1
            double y = Math.random(); // Coordenada y aleatoria entre 0 y 1
            
            // Verificar si el punto cae dentro del círculo unitario
            if (x * x + y * y <= 1) {
                puntosDentroCirculo++;
            }
        }
        // Aproximación de Pi usando la proporción de puntos dentro del círculo
        return 4.0 * puntosDentroCirculo / pasos;
    }
}

