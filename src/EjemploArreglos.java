import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        int []numeros = new int[4];
        String []productos = new String[7];
        productos[0]="Memoria Kingstong Pendrive 64Gb";
        productos[1]="Samsung Galaxy";
        productos[2]="Samsung externo";
        productos[3]="Asus notebook";
        productos[4]="Macbook air";
        productos[5]="Chromecast 4ta generacion";
        productos[6]="Bicicleta oxford";

        Arrays.sort(productos);

        String producto1=productos[0];
        String producto2=productos[1];
        String producto3=productos[2];
        String producto4=productos[3];
        String producto5=productos[4];
        String producto6=productos[5];
        String producto7=productos[6];


        System.out.println("productos[0] = " + producto1);
        System.out.println("productos[1] = " + producto2);
        System.out.println("productos[2] = " + producto3);
        System.out.println("productos[3] = " + producto4);
        System.out.println("productos[4] = " + producto5);
        System.out.println("productos[5] = " + producto6);
        System.out.println("productos[6] = " + producto7);

        
        int largo = numeros.length;

        for(int i=0; i<largo; i++){
            numeros[i]=(int)Math.floor(Math.random()*100);

        }
        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];
        int d = numeros[3];

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]+"\n");

        Arrays.sort(numeros);

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]+"\n");


    }
}
