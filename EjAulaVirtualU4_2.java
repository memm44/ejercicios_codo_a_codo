package actividadespracticas4.pkg1;

import java.util.Scanner;

/**
 *
 * @author Miguel Mavo
 * Estructuras  Condicionales,Selectivas,Operadores  Lógicos  y Relacionales
 */
public class EjAulaVirtualU4_1 {

    public static void main(String[] args) {
        ejercicio12();
    }
    static void ejercicio7(){
         Scanner lector= new Scanner(System.in);
         System.out.println("ingresa un numero ");
         int num = lector.nextInt();
         if (num%2==0)
             System.out.println("el num es positivo");
         else
             System.out.println("el num es negativo");
    }
    static void ejercicio8(){
         Scanner lector= new Scanner(System.in);
         System.out.println("ingresa una edad ");
         int edad = lector.nextInt();
         System.out.print("ingresa genero ");
         char gen = lector.next().charAt(0);
         if (edad >=1 && edad <=120 && gen=='f'||gen=='m' )
             if (edad>60 && gen=='f')
                 System.out.println("Si se jubila");
             else if (edad>65 && gen=='m')
                 System.out.println("Si se jubila");
             else
                 System.out.println("No se jubila");
         else
             System.out.println("datos incorrectos");
    }
    static void ejercicio9(){
         Scanner lector= new Scanner(System.in);
         System.out.println("ingresa una cantidad de alumnos ");
         int cant_alumnos = lector.nextInt();
         System.out.println("ingresa una cantidad de sillas ");
         int sillas = lector.nextInt();
         if (sillas==cant_alumnos){
             System.out.println("alcanzan las sillas");
         }
         else if (cant_alumnos>=sillas){
             int faltantes= cant_alumnos-sillas;
             System.out.println("faltan "+faltantes +" sillas");
         }
    }
    static void ejercicio10(){
        Scanner lector= new Scanner(System.in);
         System.out.println("ingresa numero 1 ");
         int n1 = lector.nextInt();
         System.out.println("ingresa numero 2 ");
         int  n2 = lector.nextInt();
         if ((n1>=1 && n1<=100) && (n2>=1 && n2<=100)){
             if (n1%n2==0)
                 System.out.println(n1+ " Es divissible por "+n2);
             else
                 System.out.println(n1+ " No es divisible por "+n2);
        }
         else {
              System.out.println("numero(s) fuera del rango establecido 0-100");
         }
    }
    static void ejercicio11(){
        Scanner lector= new Scanner(System.in);
        System.out.println("ingresa lado a");
        String Triangulo="";
          int lado1 = lector.nextInt();
          System.out.println("ingresa lado b ");
          int  lado2 = lector.nextInt();
          System.out.println("ingresa lado c ");
          int  lado3 = lector.nextInt();
          if (lado1==lado2 && lado2==lado3 && lado1==lado3)
              Triangulo="equilatero";
          if ((lado1==lado2 && lado1!=lado3) || (lado2==lado3 && lado1!=lado2) 
                  || (lado3==lado1 && lado1!=lado2))
              Triangulo="isoceles";
          if (lado1 != lado2 && lado2!=lado3 && lado1!=lado3)
              Triangulo="escaleno";
          System.out.println("el triangulo es de tipo "+Triangulo);
    }   
    static void ejercicio12(){
         Scanner lector= new Scanner(System.in);
         System.out.println("ingresa un caracter ");
         char caracter= lector.next().charAt(0);
         switch (caracter){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                 System.out.println("es una vocal");
                 break;
             default:
                 System.out.println("No es una vocal");
                 break;
                 
         }
    }
    static void ejercicio13(){
         Scanner lector= new Scanner(System.in);
         System.out.println("ingresa un numero entre 1 y 12 ");
         int num= lector.nextInt();
         if (num>=1 && num<=12){
             switch (num){
             case 1:
                 System.out.println("Enero");
                  break;
             case 2:
                 System.out.println("Feberero");
                  break;
             case 3:
                 System.out.println("Marzo");
                  break;
             case 4:
                 System.out.println("Abril");
                  break;
             case 5:
                 System.out.println("Mayo");
                  break;
             case 6:
                 System.out.println("Junio");
                  break;
             case 7:
                 System.out.println("Julio");
                  break;
             case 8:
                 System.out.println("Agosto");
                  break;
             case 9:
                 System.out.println("Septiembre");
                  break;
             case 10:
                 System.out.println("Octubre");
                  break;
             case 11:
                 System.out.println("Noviembre");
                 break;   
             case 12:
                 System.out.println("Diciembre");
                 break;  
         }
             
         }
         else{
             System.out.println("numero fuera del rango 1-12");
         }
    }
    static void ejercicio14(){
         Scanner lector= new Scanner(System.in);
         System.out.println("ingresa una letra correspondiente a los n romanos ");
         char car= lector.next().charAt(0);
             switch (car){
             case 'I':
                 System.out.println("1");
                  break;
             case 'L':
                 System.out.println("50");
                  break;
             case 'C':
                 System.out.println("100");
                  break;
             case 'D':
                 System.out.println("500");
                  break;
             case 'X':
                 System.out.println("10");
                  break;
             case 'M':
                 System.out.println("1000");
                  break;
             case 'V':
                 System.out.println("5");
                  break;
             default:
                 System.out.println("Caracter inexistente");
         }
    }
    static void ejercicio15(){
         Scanner lector= new Scanner(System.in);
         System.out.println("ingresa un numero ");
         float n1= lector.nextInt();
         System.out.println("ingresa un numero ");
         float n2= lector.nextInt();
         System.out.println("ingresa un simbolo de operacion: + - * / ");
         char op = lector.next().charAt(0);
         switch (op){
             case '+':
                 System.out.println(n1+n2);
                 break;
             case '-':
                  System.out.println(n1-n2);
                 break;
             case '*':
                  System.out.println(n1*n2);
                 break;
             case '/':
                 if(n2==0){
                     System.out.println("no se puede dividir por cero");
                 }
                 else{
                     System.out.println(n1/n2);
                 }
                 break;
             default:
                 System.out.println("opcion incorrecta");
                 break;
                 
         }
    }
    
}