import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
       String[] productos ={"Memoria Kingstong Pendrive 64Gb","Samsung Galaxy","Samsung externo","Asus notebook","Macbook air","Chromecast 4ta generacion","Bicicleta oxford" } ;

        int largoProductos= productos.length;
        Arrays.sort(productos);// metodo para organizar arreglos de forma alfebetica


        System.out.println("--------usando for----------");


        for(int i = 0; i<largoProductos; i++){
            System.out.println("producto "+i+ " = " + productos[i]);
        }

        System.out.println("-------Invertir orden alfabetico--");

        for(int i = 0; i<largoProductos; i++){
            System.out.println("producto "+(largoProductos-i)+ " = " + productos[largoProductos-i-1]);
        }

        System.out.println("---------Usando for inverso------");

        for(int i = largoProductos-1; i>=0; i--){
            System.out.println("producto "+i+ " = " + productos[i]);
        }
    }
}
