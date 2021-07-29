import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        int []numeros = new int[4];


        String[] productos ={"Memoria Kingstong Pendrive 64Gb","Samsung Galaxy","Samsung externo","Asus notebook","Macbook air","Chromecast 4ta generacion","Bicicleta oxford" } ;

        int largoProductos= productos.length;
        Arrays.sort(productos);// metodo para organizar arreglos de forma alfebetica


        System.out.println("--------usando for----------");
        for(int i = 0; i<largoProductos; i++){
            System.out.println("producto "+i+ " = " + productos[i]);
        }

        System.out.println("----------usando While------------");

        int j = 0;
        while( j<largoProductos ){
            System.out.println("producto " + j + " = " + productos[j]);
            j++;
        }

        System.out.println("------------usando do-While------------");

        j=0;
        do{
            System.out.println("producto " + j + " = " + productos[j]);
            j++;
        }while (j<largoProductos);

        System.out.println("----------------------------------------");


        int largoNumeros = numeros.length;

        for(int i=0; i<largoNumeros; i++){
            numeros[i]=(int)Math.floor(Math.random()*100);

        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println();
        Arrays.sort(numeros);

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]+"\n");


    }
}
