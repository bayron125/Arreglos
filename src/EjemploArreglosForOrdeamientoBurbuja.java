import java.util.Arrays;

public class EjemploArreglosForOrdeamientoBurbuja {
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

    public static void burbuja(String[]arreglo){


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

        int contador=0;

        int largo = persona.length;
        for(int i = 0; i < largo-1 ; i++){
            for(int j = 0; j<largo-1-i; j++){
                if(persona[1+j].compareTo(persona[j])<0){
                    String temporal = persona[j];
                    persona[j]= persona[j+1];
                    persona[j+1]=temporal;

                }contador++;
            }
        }
        System.out.println("contador = " + contador);

        for (String p: persona){
            System.out.println("persona = " + p);
        }
    }
}
