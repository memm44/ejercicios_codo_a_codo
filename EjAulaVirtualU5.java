package ejaulavirtualu5;

import java.util.Scanner;
// Miguel Mavo, ejercicios unidad 5
public class EjAulaVirtualU5 {
    public static void main(String[] args) {
       
        System.out.println(cubo(3));
       
    }
    static void ejercicio1(){
        System.out.println("Hola Mundo");
    }

    public static void ejercicio2(){
        int res=0;
        Scanner lector= new Scanner(System.in);
        System.out.println("ingrese numero 1");
        int num1= lector.nextInt();
        System.out.println("ingrese numero 2");
        int num2 = lector.nextInt();
        System.out.print("ingrese S para suma ó R para Resta ");
        String r = lector.next();
        switch (r){
            case "s":
                res=suma(num1,num2);
                break;
            case "r":
                res=resta(num1,num2);
        }
        System.out.println("el resultado es "+res);
    }
    public static int suma(int n1,int n2){
        return n1+n2;
    }
    public static int resta(int n1,int n2){
        return n1-n2;
    }
    public static Boolean esPar(int num){
        return num%2==0;
    }
    public static int cubo(int num){
        return (int) (Math.pow(num,3));
    }
    public static int cantidadDivisores(int num){
        int cont_div=0;
        for (int i=1; i<=num; i++){
            if (num%i==0){
                cont_div++;
            } 
        }
        return cont_div;
    }
    
    
    public static int mayordeTres(int num1, int num2, int num3){
        int mayor;
        if (num1>num2 && num1>num3) 
            mayor=num1;
        else if (num2>num1 && num2>num3)
            mayor=num2;
        else 
            mayor=num3;   
        return mayor;
    }
    public static void imprimirSimbolo(int n,char caracter){
        int i =0;
        while(i<n){
             System.out.print(caracter);
             i++;
        }
    }
    public static int azar(int num){
        return (int) (Math.random()*num);
    }
    public static boolean esVocal(char letra){
        boolean vocal;
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':    
                System.out.println("es vocal ");
                vocal = true;
                break;
            default:
                System.out.println("no es vocal");
                vocal = false;
                break;
        }
        return vocal;
    }
    public static String obtenerMes(int num_mes){
        String mes;
        switch (num_mes) {
            case 1:
                mes="Enero";
                break;
            case 2:
                mes="Febrero";
                break;
            case 3:
                mes="Marzo";
                break;
            case 4:
                mes="Abril";
                break;
            case 5:
                mes="Mayo";
                break;
            case 6:
                mes="Junio";
                break;
            case 7:
                mes="Julio";
                break;
            case 8:
                mes="Agosto";
                break;
            case 9:
                mes="Septiembre";
                break;
            case 10:
                mes="Octubre";
                break;
            case 11:
                mes="Noviembre";
                break;
            case 12:
                mes="Diciembre";
                break;
            default:
                mes="";
        }
        return mes;
    }
}