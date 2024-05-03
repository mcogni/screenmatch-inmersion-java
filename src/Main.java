import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en JAVA!");
        //System.out.println("Película Matrix");

        int fechaDeLanzamiento=1999;
        double evaluacion=4.5;
        boolean incluidoEnElPlanBasico=true;
        String nombre="Matrix";
        String sinopsis= """
                La mejor película de fin de milenio
                """;
        double mediaEvaluacionUsuario=0;
        //""" indica bloque de texto en una línea

        System.out.println("Película: "+nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion=(4+5+3)/3;
        System.out.println("Media de evaluación de Matrix: "+mediaEvaluacion);

        if(fechaDeLanzamiento>2023){
            System.out.println("Película popular actualmente");
        } else{
            System.out.println("Película retro");
        }

        for (int i = 0; i <3; i++) {
            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingresa tu evaluación para Matrix");
            double notaMatrix=teclado.nextDouble();
            mediaEvaluacionUsuario=mediaEvaluacionUsuario+notaMatrix;
            //scanner es una clase de java.util pack que permite colectar ingresos del usuario.
            //nextDouble escanea el dato ingresado como double
        }
        System.out.println("La media de la película Matrix es "+mediaEvaluacionUsuario/3);
    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Alt+Intro with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.
// Press Mayús+F10 or click the green arrow button in the gutter to run the code.
// Press Mayús+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.