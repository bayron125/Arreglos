

public class EjemploArreglosForOrdeamientoBurbujaMetodo {
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

    public static void burbuja(Object[] arreglo){
        int largo = arreglo.length;
        int contador=0;
        for(int i = 0; i < largo-1 ; i++){
            for(int j = 0; j<largo-1-i; j++){
                if(((Comparable)arreglo[1+j]).compareTo(arreglo[j])<0){
                    Object temporal = arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]=temporal;

                }contador++;
            }
        }

        System.out.println("contador = "+contador);
    }

    public static void burbuja(String[] arreglo){
        int largo = arreglo.length;
        int contador=0;
        for(int i = 0; i < largo-1 ; i++){
            for(int j = 0; j<largo-1-i; j++){
                if((arreglo[1+j]).compareTo(arreglo[j])<0){
                    String temporal = arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]=temporal;

                }contador++;
            }
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

        burbuja(persona);

        for (String p: persona){
            System.out.println("persona = " + p);
        }
        System.out.println("------productos---------");

        String []productos = new String[7];
        productos[0]="Memoria Kingstong Pendrive 64Gb";
        productos[1]="Samsung Galaxy";
        productos[2]="Samsung externo";
        productos[3]="Asus notebook";
        productos[4]="Macbook air";
        productos[5]="Chromecast 4ta generacion";
        productos[6]="Bicicleta oxford";

        burbuja(productos);

        for (String prod:productos
             ) {
            System.out.println("producto ="+prod);

        }

        System.out.println("------------ Ordemaniento numeros------------");

        Integer [] numeros={23,13,56,34,12,87,12,34,8,32,1,23,45};

        burbuja(numeros);
        for (Integer num:numeros) {
            System.out.println(num);

        }


    }
}
