import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\tHola mundo");

        //int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero >> "));
        //JOptionPane.showMessageDialog(null, num1);

        //arbol(5);
        //divisiones(5000000);
        descompsicionNumero(5547);

        cicloWhile();

        

    }
    /**
     * <b>WHILE</b>
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
     * <b>IF</b>
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
     * <b>FOR</b>
     * Este metodo realiza un triangulo con <b>*</b> con ciclos anidados de for
     * 
     * @param num Numero de * que se compone el triangulo
     */
    public static void arbol(int num) {
        for (int j = 0; j < num; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    /**
     * <b>While</b>
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

    public static void cicloWhile(){
        Scanner lectura = new Scanner(System.in);
        boolean bandera = true;
        int contador = 0;

        do{
            System.out.print("Ingrese un numero mayor a 15 >>")
            int num = lectura.nextInt();
            if(num < 15 ){
                bandera = false;
            }
            contador += contador;

        }
    }

    

}
