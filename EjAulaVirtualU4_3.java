package actividadespracticas4.pkg2;

import java.util.Scanner;

/**
 *
 * @author Miguel Mavo
 * Estructuras Iterativas
 */
public class EjAulaVirtualU4_2 {
    
    public static void main(String[] args) {
        ejercicio22();
    }
    static void ejercicio16(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = lector.nextInt();
        System.out.println("ingrese un opcion \n 1=for\n 2=while\n 3=do-while");
        int op = lector.nextInt();
        switch(op){
            case 1:
                System.out.println("bucle FOR seleccionado");
                for (int i=num+1;i<num+11;i++){
                    System.out.println("numero "+i);
                }
                break;
            case 2:
                System.out.println("bucle WHILE seleccionado");
                int i=num+1;
                while (i<num+11){
                    System.out.println("numero "+i);
                    i++;
                }
                break;
            case 3:
                System.out.println("bucle DO WHILE seleccionado");
                int j=num+1;
                do{
                    System.out.println("numero "+j);
                    j++;
                }
                while(j<num+11);
                break;
            default:
                System.out.println("incorrecto");
        }
    }
    static void ejercicio17(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int n=lector.nextInt();
        System.out.println("tabla con FOR");
        for (int i=1; i<=10; i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
    static void ejercicio18(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int n=lector.nextInt();
        int i=1;
        System.out.println("tabla con WHILE");
        while (i<=10){
            System.out.println(n+"x"+i+"="+n*i);
            i++;
        }
    }
    static void ejercicio19(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese cantidad de filas");
        int n=lector.nextInt();
        char simbolo = '*';
        for (int i=n; i>0; i--){
            System.out.println("");
            for (int j=i; j>0; j--){
                System.out.print(simbolo);
            }   
        }
    }
    static void ejercicio20(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int cant_a= lector.nextInt();
        float acum=0,prom;
        int i =1;
        do{
            System.out.println("ingrese nota "+i);
            double nota= lector.nextInt();
            i++;
            acum+=nota;
        }
        while(i<=cant_a);
        prom = acum/cant_a;
        System.out.println("el promedio es "+prom);
    }
    static void ejercicio21(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero natural");
        int num= lector.nextInt();
        int cont =1;
        int total=1;
        if (num>0){
            while(cont<=num){
                total*=cont;
                cont++;
            }
            System.out.println("el factorial de "+num+ " es "+total);
        }else{
            System.out.println("el numero debe ser positivo");
        }
        
    }
    static void ejercicio22(){
        Scanner lector = new Scanner(System.in);
        final int filas;
        System.out.println("ingrese cantidad de filas");
        filas=lector.nextInt();
        char simbolo = '*';
        int i=0;
        while(i<filas){
            int j=0;
            while(j<=i){
                System.out.print(simbolo);
                j++;
            }
            i++;
            System.out.println();
        }
        
    }
    
    static void ejercicio23(){
        Scanner lector = new Scanner(System.in);
        long mayor=0;
        long menor=1000000;
        int n;
        do {
            System.out.println("ingrese numero");
            n=lector.nextInt();
            if (n>mayor){
                mayor=n;
            }
            if (n!=0 && n<menor){
                menor=n;
            }
        }while(n!=0);
        System.out.println("el mayor es "+mayor);
        System.out.println("el menor es "+menor);
    }
    static void ejercicio24(){
        Scanner lector = new Scanner(System.in);
        int cant=0;
        float acum=0;
        float n;
        do {
            System.out.println("ingrese peso en kg delalumno");
            n=lector.nextFloat();
            if(n!=0){
            cant++;
            acum+=n;
            }
        }while(n!=0);
        float prom= acum/cant;
        String msg=String.format("el promedio es %.2f",prom);
        System.out.println(msg);
    }
    static void ejercicio25(){
        Scanner lector = new Scanner(System.in);
        String clave="eureka";
        String intenta;
        int intentos=0;
        do {
            System.out.print("ingrese clave ");
            intenta=lector.nextLine();
            intentos++;
            if (intentos>3)
                System.out.println("agotaste los 3 intentos");
        }while(!intenta.equals(clave));
        System.out.println("clave correcta");
    }
    static void ejercicio26(){
        Scanner lector = new Scanner(System.in);
        long mayor=0;
        long menor=1000000;
        int cant=0;
        float acum=0;
        int n=1;
        while(n!=0){
            System.out.println("ingrese numero ");
            n=lector.nextInt();
            if (n>mayor){
                mayor=n;
            }
            if (n!=0 && n<menor){
                menor=n;
            } 
            if (n!=0){
                cant++;
                acum+=n;
            } 
        }
        double prom= acum/cant;
        System.out.println("el mayor es "+mayor);
        System.out.println("el menor es "+menor);
        System.out.println("el promedio es "+prom);
    }
    static void ejercicio27(){
        Scanner lector = new Scanner(System.in);
        float acum=0;
        float sueldo;
        do {
            System.out.println("ingrese sueldo ");
            sueldo=lector.nextFloat();
            if(sueldo>0){
            acum+=sueldo;
            }
        }while(sueldo>=0);
        System.out.println("la sumatoria de su sueldo es "+acum);
    }
    static void ejercicio28(){
        Scanner lector = new Scanner(System.in);
        String User="admin";
        int Pass=1234;
        boolean evalua=false;
        String intentaUser;
        int intentaPass;
        do {
            System.out.println("ingrese usuario ");
            intentaUser=lector.next();
            System.out.println("ingrese clave ");
            intentaPass=lector.nextInt();
            if (intentaUser.equals(User) && intentaPass==Pass)
                evalua=true;
        }while(evalua!=true);
        System.out.println("usuario y clave correctos");
    }
    static void ejercicio29(){
        Scanner lector = new Scanner(System.in);
        int acum=0;
        int n1,n2;
        boolean evalua=false;
        do {
            System.out.println("ingrese num1 ");
            n1 =lector.nextInt();
            System.out.println("ingrese num2 ");
            n2 =lector.nextInt();
            acum+=n1+n2;
            if(n1==0&&n2==0)
               evalua=true;
        }while(evalua!=true);
        System.out.println("la sumatoria de los num "+acum);
    }
    static void ejercicio30(){
        Scanner lector = new Scanner(System.in);
        float total;
        int n1,n2;
            System.out.println("ingrese num1 ");
            n1 =lector.nextInt();
            do{
            System.out.println("ingrese num2 ");
            n2 =lector.nextInt();
            if(n2==0){
                System.out.println("no se puede dividir por cero! ");
            }
            }while(n2==0);
            total=(float)n1/n2;
            System.out.println("la division es "+total);   
    }
}