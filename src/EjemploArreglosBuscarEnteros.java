import java.util.Scanner;

public class EjemploArreglosBuscarEnteros {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner x = new Scanner(System.in);

        System.out.println("Ingresa 10 numeros: ");
        for (int i = 0; i<a.length; i++){
            a[i]=x.nextInt();
        }

        System.out.println("ingresa el valor a identificar");
        int valor=x.nextInt();
        int ubicacion=-1;
        for (int i = 0; i<a.length; i++){
            if(a[i]==valor) {
                ubicacion = i;
                break;
            }
        }
        if(ubicacion==-1){
            System.out.println("El valor " + valor + " no se encuentra el en arreglo");
        }else{
            System.out.println("el valor "+ valor + " se encuentra en la posicion "+ ubicacion);
        }

    }
}
