package actividadespracticas4;

import java.util.Scanner;

/**
 * Constantes, Tipos de Datos, 
 * Clase Math, Objeto Scanner, Operadores Unarios, Binariosy Matemáticos,
 * Casting
 * @author Miguel Mavo
 * 
 */
public class EjAulaVirtualU4_1 {

    public static void main(String[] args) {
        //llamar al ejercicio que se quiera comprobar
        ejercicio6();
        
    }
    static void ejercicio1(){
        Scanner lector = new Scanner(System.in);
        System.out.print("ingrese el area del cuadrado ");
        int area= lector.nextInt();
        int perimetro = (area/2);
        System.out.println(perimetro);
    }
    static void ejercicio2(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        int num1 = lector.nextInt();
        System.out.println("ingrese el numero 2");
        int num2 = lector.nextInt();
        int div= num1/num2;
        int resto = num1%num2;
        System.out.println(div);
        System.out.println(resto);
        
    }
    static void ejercicio3(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        int num1 = lector.nextInt();
        System.out.println("ingrese el numero 2");
        int num2 = lector.nextInt();
        float div= (float)num1/num2;
        System.out.println(div);
        
    }
    static void ejercicio4(){
        Scanner lector = new Scanner(System.in);
        final double PI=3.14;
        System.out.print("ingrese el diametro de un circulo ");
        int diametro= lector.nextInt();
        int perimetro = (int)(2*PI*(diametro/2));
        System.out.println(perimetro);
    }
    static void ejercicio5(){
        Scanner lector = new Scanner(System.in);
        System.out.print("ingrese el radio de un circulo ");
        int radio = lector.nextInt();
        double perimetro;
        double superficie;
        superficie = Math.PI*Math.pow(radio,2);
        perimetro = 2*Math.PI*radio;
        System.out.println(perimetro);
        System.out.println(superficie);
    }
    static void ejercicio6(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese base ");
        int b = lector.nextInt();
        System.out.println("ingrese altura ");
        int h = lector.nextInt();
        double superficie = b*h/2;
        double hipotenusa= Math.sqrt((Math.pow(b,2)+Math.pow(h,2)));
        System.out.println(superficie);
        double perimetro = b+h+hipotenusa;
        System.out.println(perimetro);
        
    }
    
    
}