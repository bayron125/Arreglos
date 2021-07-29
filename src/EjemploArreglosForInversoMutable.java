import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void Reversar(String[]arreglo){
        int total=arreglo.length;
        int total2=total;

        for(int i=0; i<total2; i++){
            String primero = arreglo[i];
            String ultimo = arreglo[total-1-i];
            arreglo[i]=ultimo;
            arreglo[total-1-i]=primero;
            total2--;
        }
    }

    public static void main(String[] args) {
        String[] persona = new String[10];
        persona[0]="Miguel Zapata";
        persona[1]="Juan David";
        persona[2]="Bayron Trujillo";
        persona[3]="Steven Rico";
        persona[4]="Ariane Souza";
        persona[5]="Xiomara Valverde";
        persona[6]="Juanito Alimaña";
        persona[7]="Rosario Tijeras";
        persona[8]="Pedro Navaja";
        persona[9]="Tito Peres";
        System.out.println("--------lista---------");
        for(String p : persona){
            System.out.println(p);
        }
        Arrays.sort(persona);

        System.out.println("----lista ordenada alfabéticamente----");
        for(String p : persona){
            System.out.println(p);
        }

        Reversar(persona);
        //Collections.reverse(Arrays.asList(persona)); // Metodo utilizado para invertir una lista de librerias

        System.out.println("---lista organizada de manera inversa---");
        for(String p : persona){
            System.out.println(p);
        }
    }
}
