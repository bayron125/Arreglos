import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        String[] a = new String[4];
        Scanner x = new Scanner(System.in);

        System.out.println("Ingresa 10 palabras: ");
        for (int i = 0; i<a.length; i++){
            a[i]=x.next();
        }

        System.out.println("Ingresa la palabra a buscar: ");
        String nombre=x.next();
        int ubicacion=-1;
        for (int i = 0; i<a.length; i++){
            if(a[i].equals(nombre)) {
                ubicacion = i;
                break;
            }
        }
        if(ubicacion==-1){
            System.out.println("la palabra " + nombre + " no se encuentra en el arreglo");
        }else{
            System.out.println("la palabra " + nombre + " se encuentra en la posicion "+ ubicacion);
        }

    }
}
