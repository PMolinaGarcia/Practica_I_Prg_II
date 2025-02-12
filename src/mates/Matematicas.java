package mates;

public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */

    public static double generarNumeroPiIterativo(long pasos){

        long puntosCirculo=0;
        int j=1;

        for (long i=0; i<pasos; i++){

            double coordenadaXPunto=2*Math.random()-1;
            double coordenadaYPunto=2*Math.random()-1;

            if (coordenadaXPunto*coordenadaXPunto+coordenadaYPunto*coordenadaYPunto<=1){
                puntosCirculo++;
            }

            if ((double) i/(pasos-1) >= (double) j/10){
                System.out.println("Se ha utilizado un "+j*10+"% de los puntos.");
                j++;
            }

        }

        return 4.0*puntosCirculo/pasos;
    }
}
