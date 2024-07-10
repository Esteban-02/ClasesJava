import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\tHola mundo");
        

        //diagonalInversa();
        


        arraynombres();
        
        //usoArrayList();
        //miArray();
        
        //recorridoInverso();
        //bordesMatriz();
        //cicloFor();
        //calculadora();


        //int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero >> "));
        //JOptionPane.showMessageDialog(null, num1);

        //arbol(5);
        //divisiones(5000000);
        //descompsicionNumero(5547);

        

    }
    private static void diagonalInversa() {
        Random random = new Random();

        int[][] diagonal  = new int[4][4];

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[0].length; j++) {
                if (j==diagonal[0].length-1-i) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }
    



    }





    public static void arraynombres() {
        ArrayList<String> nombres = new ArrayList<>();
        String nombre = "";
        boolean bandera = true;

        do {
            nombre = JOptionPane.showInputDialog("Ingrese un nombre: ");
            nombres.add(nombre);
            if (nombre.equalsIgnoreCase("salir")) {
                bandera = false;
            }
            
        } while (bandera == true);
        System.out.println(nombres);

        System.out.println();
        

    
    }
    private static void usoArrayList() {
        ArrayList<Integer> miArrayList = new ArrayList<>();
        do {
            int numeros = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese un numero "));
            
            if (numeros==0) {
                break;
            }
            miArrayList.add(numeros);
        } while (true);

        System.out.println("Tamanio "+ miArrayList.size());

        for (int i = 0; i < miArrayList.size(); i++) {
            
            System.out.println(miArrayList.get(i));
        }
    }
    /**
     * Ejercicio con while que descompone un numero de varias cifras en digitos diferentes para luego sumar cada uno
     * @param i
     */
    private static void descompsicionNumero(int i) {
        int cont = 0;
        while (i>0) {
            System.out.println(i%10);
            cont = cont+(i%10);
            i = i/10;
            
        }
        System.out.println("La suma del numero "+ i +" es >> "+ cont);
        
    }

    /**
     * Metodo que genera 2 numeros y verifica si es mayor o no
     */
    public static void numAleatroios() {
        Random numAleatorios = new Random();
        int num1 = numAleatorios.nextInt(100 - 55) + 55;
        System.out.println(num1);

        int num2 = numAleatorios.nextInt(100);
        System.out.println(num2);

        if (num1 > num2) {
            System.out.println("num1 es mayor");
        }

    }
    /**
     * Este metodo realiza un triangulo con <b>*</b> con ciclos anidados de for
     * 
     * @param num Numero de * que se compone el triangulo
     */
    public static void  arbol(int num) {
        for (int j = 0; j < num; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    /**
     * Metodo con ciclo while que realiza divisiones de un numero de 10 en 10
     * @param num Numero que se va a dividir de 10 en 10
     */

    public static void divisiones(int num){
        int cont = 0;
        while (num > 10) {
            cont ++;
            num = num / 10; // realiza las divisiones ( corregir con do while)
            System.out.println(cont + " >> "+ num);            
        }
    }

    public static void palabrasIguales(){
        Scanner lectura = new Scanner(System.in);
        System.out.print("ingrese el primer texto >> ");
        String text1 = lectura.nextLine();
        System.out.print("Ingrese el segundo texto >> ");
        String text2 = lectura.nextLine();
        lectura.nextLine();
        if (text1 == text2) {
            System.out.print("Son iguales");
        }

    }

    public static void trianguloTipos(){
        int a = 5;
        int b = 6;
        int c = 55;

        if (a == b && a == c && c == b) {
            System.out.println("Triangulo equilatero");
            
        }else if( a == b || a == c || c == b){
            System.out.println("Triangulo Isoceles");
        }else if(a!= b && a !=c && c != b){
            System.out.println("triangulo escaleno");
        }

    }



    public static void calculadora(){
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = lectura.nextDouble();
        lectura.nextLine();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = lectura.nextDouble();
        lectura.nextLine();
        System.out.print("Ingrese el signo de operacion que se va a realizar: ");
        String opc = lectura.nextLine();

        switch (opc) {
            case "+":
                System.out.println("La suma es >>" + (num1+num2));
                break;
            case "-":
                System.out.println("La resta es >> "+(num1-num2));
                break;
            case "*":
                System.out.println("La muliplicacion es >> "+ (num1*num2));
                break;
            case "/":
                System.out.println("La division es: "+ (num1/num2));
                break;
            default:
                System.out.println("Opcion incorrecta.");
                break;
        }

    }

    public static void cicloFor(){
        /*
         * for (int i = 0; i < 1000; i+=10) {
            System.out.println(i);
            
        }
         */

        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            
        }

        
        
    }

    public static void miArray(){
        Scanner lectura = new Scanner(System.in);
        String nombrePersonas;
        boolean bandera = true;
        List <String> nombres = new ArrayList<>();
        do {
            System.out.print("Ingrese los nombres de los usuario >> ");
            nombrePersonas = lectura.nextLine();
            
            if (nombrePersonas.equals("Salir")) {
                bandera = false;
                break;
            }
            nombres.add(nombrePersonas);
        } while (bandera == true);
        
        System.out.println(nombres);
        System.out.println("otra forma de impresion");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        System.out.println("Borrar un usuario");
        System.out.print("Ingrese el nombre que va a borrar >> ");
        String nombreEliminar = lectura.nextLine();
        if (nombres.contains(nombreEliminar)) {
            int nombreBuscar = nombres.indexOf(nombreEliminar);
            nombres.remove(nombreBuscar);
        }
        System.out.println(nombres);
        

    }

    /**
     * Este metodo imprime una matriz con los bordes con el numero 1
     * y los valores del centro tienen el numero 0
     */
    public static void bordesMatriz(){
        int [][] matriz = new int[5][15];
        System.out.println(matriz[0].length);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i==0 || j==0 || i==matriz.length-1 || j == matriz[0].length-1) {
                    System.out.print("1");
                    
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void recorridoInverso(){
        Random random = new Random();
        int [][] matriz = new int[4][7];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(100)+50;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Imprimir inverso");

        for (int i = matriz.length-1; i >= 0; i--) {
            for (int j = matriz[0].length-1; j >= 0; j--) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    

}
