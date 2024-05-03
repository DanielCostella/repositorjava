import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion en java");
        //System.out.println("Pelicula Matrix");


        //Declaracion de variables
         int fechaDeLanzamiento = 1999;
         double evaluacion= 4.5;
         boolean incluidoEnELPlanBasico= true;
         String nombre= "Matrix";
         String sinopsis = """
                 La mejor pelicula del fin del milenio
                 """;
        double mediaEvaluacionUsuario= 0;



        System.out.println("pelicula: "+ nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnELPlanBasico);


        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix:"+ mediaEvaluacion);


        if (fechaDeLanzamiento >= 2023) {
            System.out.println(" Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la nota que le darias a matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario=  mediaEvaluacion + notaMatrix;
        }

        System.out.println(" la media de la pelicula " +
                "Matrix calculada por el usuario es: " + mediaEvaluacion / 3);
    }
}