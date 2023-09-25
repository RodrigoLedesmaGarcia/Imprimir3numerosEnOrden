
package www.rodrigoledesmagarcia.com.mx;

import java.util.Scanner;

public class TresNumerosEnOrden {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("   **** PROGRAMA QUE ORDENA TRES NUMEROS EN ORDEN ****");
        System.out.print("Ingrese el primer nÚmero: ");
        numero1 = input.nextInt();
        System.out.print("Ingrese el segundo nÚmero: ");
        numero2 = input.nextInt();
        System.out.print("Ingrese el tercer número: ");
        numero3 = input.nextInt();

        if(numero1 > numero2 && numero2 > numero3){
            System.out.println("El número "+numero1+" es el mayor, seguido del número "+numero2+" y al final del número "+numero3);
        } else if( numero1  > numero3 && numero3 > numero2) {
            System.out.println("El número "+numero1+" es el mayor, seguido del número "+numero3+" y al final del número "+numero2);
        } else if (numero2 > numero1 && numero1 > numero3) {
            System.out.println("El número "+numero2+" es el mayor, seguido del número "+numero1+" y al final del número "+numero3);
        } else if (numero2 > numero3 && numero3 > numero1) {
            System.out.println("El número "+numero2+" es el mayor, seguido del número "+numero3+" y al final del número "+numero1);
        } else if (numero3 > numero1 && numero1 > numero2) {
            System.out.println("El número "+numero3+" es el mayor, seguido del número "+numero1+ " y al final del número "+numero2);
        }else if (numero3 > numero2 && numero2 > numero1) {
            System.out.println("El número "+numero3+" es el mayor, seguido del número "+numero2+ " y al final del número "+numero1);
        }

    }
}
