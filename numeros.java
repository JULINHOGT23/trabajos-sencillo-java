import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int j = numero.nextInt();
        // ingesamos el segundo numero
        System.out.println("Dame el primer número");
        int v = numero.nextInt();
        
        // verificamos si el numero j es mayor que v
        if (j!=v);{
        System.out.println(j + " es diferente que " + v);
        }
        // verificamos si j es mayor que v
        if (j>v);{
        System.out.println(j + " es mayor que " + v);
        }
        // vericamos que j es menor o igual que v
        if (j<=v);{
        System.out.println(v + " es menor o igual que " + j);
        }
    }

}