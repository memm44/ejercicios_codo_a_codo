package Ejercicios;
import java.util.Arrays;
import java.util.Scanner;
// Ejercicios Unidad 6 CFP01 Codo a Codo
// Miguel Mavo
public class EjAulaVirtualU6 {

    public static void main(String[] args) {
	//en el main se llama al ejercicio que se quiera chequear.
        ejercicio30(); 
    }

    public static void ejercicio1(){
        Scanner lector = new Scanner(System.in);
        int[] arreglo= new int[5];
        for (int i=0; i<5; i++){
            System.out.println("ingrese elemento "+(i+1));
            arreglo[i]=lector.nextInt();
        }
        for (int i = 0; i <5; i++) {
            System.out.println(arreglo[i]);
        }

    }
    public static void ejercicio2(){
        float[]arreglo = {1,2,3,4,5};
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]/2);
        }
    }
    public static void ejercicio3(){
        char[]arreglo = {'A','V','A','J'};
        for (int i = arreglo.length-1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }
    }
    public static void ejercicio4(){
        int[] arreglo = new int[10] ;
        float acum=0;
        for (int i=0; i<arreglo.length; i++){
            arreglo[i]= (int) (Math.random()*6+1);
            System.out.println(arreglo[i]);
            acum+=arreglo[i];
        }
        System.out.println("el promedio del arreglo es " +acum/arreglo.length);
    }
    public static void ejercicio5(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese num de posiciones del arreglo");
        int pos= lector.nextInt();
        String[] arreglo= new String[pos];
        for (int i=0; i<arreglo.length; i++){
            System.out.println("ingrese nombre "+(i+1));
            arreglo[i]=lector.next();
        }
        System.out.println("Mostrando Nombres..");
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    public static void ejercicio6(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese num de posiciones del arreglo: ");
        int pos= lector.nextInt();
        int[] arreglo= new int[pos];
        for (int i=0; i<arreglo.length; i++){
            System.out.println("ingrese elemento "+(i+1));
            arreglo[i]=lector.nextInt();
        }
        System.out.println("Ingresados");
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("ingrese num a buscar dentro del arreglo: ");
        int buscado= lector.nextInt();
        String mensaje="numero "+buscado+" no conseguido";
        for (int i = 0; i <arreglo.length; i++) {
            if (arreglo[i]==buscado) {
                mensaje= "numero encontrado en la posicion "+i;
            }
        }
        System.out.println("Resultados: "+mensaje);
    }
    public static void ejercicio7(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese num T: ");
        int t = lector.nextInt();
        System.out.println("ingrese num M: ");
        int m = lector.nextInt();
        int[] arreglo= new int[t];

        int j=0;
        int i=0;
        while (arreglo[arreglo.length-1]==0) {
            if (i%m==0) {
                arreglo[j]=i;
                j++;
            }
            i++;
        }
        for (int k = 0; k < arreglo.length; k++) {
            System.out.println(arreglo[k]);
        }
    }
    public static void ejercicio8(){
        Scanner lector = new Scanner(System.in);
        int[] arreglo_A = new int[5];
        int[] arreglo_B = new int[5];
        int[] arreglo_C = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("ingrese 5 elementos del areglo a "+(i+1));
            arreglo_A[i]=lector.nextInt();
        }
        for (int j=0;j<5;j++){
            System.out.println("ingrese 5 elemento del arreglo b "+(j+1));
            arreglo_B[j]=lector.nextInt();
        }
        for (int k=0;k<5;k++) {
            arreglo_C[k]=arreglo_A[k]+arreglo_B[k];
        }
        System.out.println("Mostrando union de arreglos");
        for (int l = 0; l < arreglo_C.length; l++) {
            System.out.println(arreglo_C[l]);
        }
    }
    public static void ejercicio9(){
        Scanner lector = new Scanner(System.in);
        int cant_positivos=0;
        int cant_negativos=0;
        System.out.println("ingrese num de posiciones del arreglo");
        int pos= lector.nextInt();
        int[] arreglo= new int[pos];
        for (int i=0; i<arreglo.length; i++){
            System.out.println("ingrese numero "+(i+1));
            arreglo[i]=lector.nextInt();
            if (arreglo[i]>0) {
                cant_positivos++;
            }
            else if (arreglo[i]<0 && arreglo[i]!=0){
                cant_negativos++;
            }
        }
        System.out.println("Cantidad positivos: "+cant_positivos);
        System.out.println("Cantidad negativos: "+cant_negativos);
    }
    public static void ejercicio10(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese num de posiciones del arreglo de paises");
        int pos= lector.nextInt();
        String[] arreglo= new String[pos];
        for (int i=0; i<arreglo.length; i++){
            System.out.println("ingrese nombre de pais"+(i+1));
            arreglo[i]=lector.next();
        }
        System.out.println("ingrese posicion del arreglo ");
        int pbusca=lector.nextInt();
        System.out.println("en la posicion "+pbusca+" se encuentra el pais "+arreglo[pbusca]);
    }
    public static void ejercicio11(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese num de posiciones del arreglo");
        int pos= lector.nextInt();
        int[] arreglo = new int[pos];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int) (Math.random()*20)+1;
        }
        System.out.println("numeros generados ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("ingrese posicion a vaciar ");
        int pos_del = lector.nextInt();
        arreglo[pos_del]=0;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    public static void ejercicio12(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese num de posiciones del arreglo");
        int pos= lector.nextInt();
        int[] arreglo = new int[pos];
        rellena_arreglo(arreglo);
        muestra_arreglo(arreglo);

    }
    public static void rellena_arreglo(int[] arreg){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese numero ");
        int num= lector.nextInt();
        int i=0;int j=0;
        while (arreg[arreg.length-1]==0) {
            if (i%num==0 && i!=0) {
                arreg[j]=i;
                j++;
            }
            i++;
        }
    }
    public static void muestra_arreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    public static void ejercicio13(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese num de posiciones del arreglo");
        int pos= lector.nextInt();
        int[] arreglo = new int[pos];
        int mayor1=arreglo[0];
        int mayor2=arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            arreglo[i]= (int) (Math.random()*50)+1;
            if (arreglo[i]>mayor1){
                mayor1= arreglo[i];
            }
            if (arreglo[i]>mayor2 && arreglo[i]!=mayor1) {
                mayor2 = arreglo[i];
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);

        }
        System.out.println("mayor1 "+mayor1);
        System.out.println("mayor2 "+mayor2);
    }
    public static void ejercicio14(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese tamano del arreglo");
        int pos= lector.nextInt();
        int maximo=0;
        int[] arreglo = new int[pos];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int) (Math.random()*55);
        }
        System.out.println("numeros generados aleatoriamente.");
        for (int indice:arreglo) {
            System.out.println(indice);
        }
        for (int indice: arreglo) {
            if (indice>maximo) {
                maximo=indice;
            }
        }
        System.out.println("el maximo valor del arreglo es "+maximo);;
    }
    public static void ejercicio15(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese tamano del arreglo");
        String[] arreglo= new String[5];
        for (int i=0; i<arreglo.length; i++){
            System.out.println("ingrese nombre "+(i+1));
            arreglo[i]=lector.next();
        }
        System.out.println("ingrese nombre a buscar ");
        String buscado =lector.next();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(buscado)) {
                System.out.println("el nombre fue encontrado en la posicion "+i);
            }
        }
    }
    public static void ejercicio16(){
        int[][] matriz = new int[3][3] ;
        int min = 0;
        int max=9;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=(int) (Math.random()*(max-min+1)+min);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
        System.out.println("");
    }
    public static void ejercicio17(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese tamano de las filas");
        int filas = lector.nextInt();
        System.out.println("ingrese tamano de las filas");
        int col = lector.nextInt();
        int[][] matriz= new int[filas][col];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("ingrese elemento [" + i +"], ["+ j +"]");
                int ing = lector.nextInt();
                matriz[i][j]= ing;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }
    public static void ejercicio18(){
        boolean[][] matriz = new boolean [4][3];
        boolean var;
        int vacios = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int val= (int)(Math.random()*2);
                if (val==1) {
                    var= true;
                }
                else{
                    var= false;
                }
                matriz[i][j]= var;
                if (var==true) {
                    vacios++;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]\t");
            }
            System.out.println("");
        }
        System.out.println("los puestos vacios del cine son "+vacios);

    }
    public static void ejercicio19(){
        Scanner lector = new Scanner(System.in);
        String matriz[][]= new String [4][2];
        matriz[0][0]="id aula";
        matriz[1][0]="azul";
        matriz[2][0]="verde";
        matriz[3][0]="amarillo";
        matriz[0][1]="cant bancos";
        matriz[1][1]="40";
        matriz[2][1]="35";
        matriz[3][1]="30";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("ingrese el numero de alumnos inscritos ");
        int nalumnos = lector.nextInt();
        if (nalumnos<=40) {
            if (nalumnos<= Integer.parseInt(matriz[3][1])) {
                System.out.println("asignada al aula amarilla");
            }
            else if (nalumnos<=Integer.parseInt(matriz[2][1])){
                System.out.println("asignado al aula verde");
            }
            else if (nalumnos<=Integer.parseInt(matriz[1][1])){
                System.out.println("asignado al aula azul");
            }
        }
        else{
            System.out.println("cantidad incorrecta");
        }
    }
    public static void ejercicio20(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese una palabra ");
        String palabra = lector.next();
        System.out.println(palabra.toUpperCase());
    }
    public static void ejercicio21(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese 3 cadenas de texto separadas por espacio ");
        String palabra = lector.nextLine();
        String[] vector = palabra.split(" ");
        for (int i = vector.length-1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        System.out.println("longitud "+palabra.length());
    }
    public static void ejercicio22(){
        Scanner lector = new Scanner(System.in);
        System.out.print("ingrese una cadena de caracteres ");
        String palabra = lector.nextLine();
        System.out.println(palabra.substring(0,1).toUpperCase()+palabra.substring(1)+".");
    }
    public static void ejercicio23(){
        Scanner lector = new Scanner(System.in);
        System.out.print("ingrese una numero ");
        String numero = lector.nextLine();
        System.out.println(Integer.parseInt(numero.substring(0,1))+Integer.parseInt(numero.substring(1,2))+Integer.parseInt(numero.substring(2,3)));
    }
    public static void ejercicio24(){
        Scanner lector = new Scanner(System.in);
        int limite=4;
        System.out.print("ingrese un numero entre 2 y "+limite+" digitos: ");
        String numero = lector.nextLine();
        char[]asc = new char[numero.length()];
        char[]desc = new char[numero.length()];
        if (numero.length() >1 && numero.length()<=limite){
            char[] div = numero.toCharArray();
            for (int i = 0; i <div.length ; i++) {
                asc[i]=div[i];
                desc[(div.length-1)-i]=div[i];
            }
            boolean iguales = Arrays.equals(asc,desc);
            if (iguales)
                System.out.println("Es Capicúa");
            else
                System.out.println("No es Capicúa");
        }else
            System.out.println("datos fuera de rango entre 2 y "+limite);
    }
    public static String iniciales(String frase){
        String[] div  = frase.split(" ");
        String formada =div[0].substring(0,1).toUpperCase()+div[1].substring(0,1).toUpperCase();
        return formada;
    }
    public static void ejercicio26(String nombre){
        char[] desc = nombre.toCharArray();
        for (int i = desc.length-1; i >=0; i--) {
            System.out.print(desc[i]);
        }
        System.out.println();
    }
    public static void ejercicio27(){
        Scanner lector = new Scanner(System.in);
        int vocal =0;
        int conso = 0;
        System.out.print("ingrese su nombre ");
        String nombre = lector.nextLine();
        char[] conv_nombre =nombre.toCharArray();
        for (int i = 0; i < conv_nombre.length; i++) {
            if (conv_nombre[i]=='a'|| conv_nombre[i]=='e'|| conv_nombre[i]=='i'
                    || conv_nombre[i]=='o'|| conv_nombre[i]=='u' ||
                    conv_nombre[i]=='A'|| conv_nombre[i]=='E'|| conv_nombre[i]=='I'
                    || conv_nombre[i]=='O'|| conv_nombre[i]=='U') {
                vocal++;
            }
            else{
                conso++;
            }
        }
        System.out.format("su nombre tiene %d vocales y %d consonantes \n",vocal,conso);
    }
    public static void ejercicio28(){
        Scanner lector  = new Scanner(System.in);
        System.out.println("ingrese una frase ");
        int cont = 0 ;
        String frase = lector.nextLine();
        String[] div = frase.split(" ");
        for (int i = 0; i < div.length; i++) {
            if (!(div[i].equals(""))){
                cont++;
            }

        }
        System.out.println("hay "+cont+" palabras en tu frase");
    }
    public static void ejercicio29(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese su nombre y apellido ");
        String  original= lector.nextLine();
        String [] div= original.split(" ");
        String org = div[0].substring(0,1).toUpperCase()+div[0].substring(1).toLowerCase()+" "+
                div[1].substring(0,1).toUpperCase()+div[1].substring(1).toLowerCase();
        System.out.println(org);
    }
    public static void ejercicio30(){
        Scanner lector = new Scanner(System.in);
        int [] vector;
        System.out.println("cuantos numeros desea ingresar en el vector ");
        int tam = lector.nextInt();
        vector= new int [tam];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese numero "+(i+1));
            vector[i]= lector.nextInt();
        }
        System.out.println("ORIGINAL");
        for (int i =0 ; i<vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        burbuja(vector);
        System.out.println();
        System.out.println("ORDENADO {BURBUJA}");
        for (int i = 0; i <vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }

    }
    public static int[] burbuja(int[]vector){
        int aux =0;
        boolean bandera= false;
        int i=0;
        while (i<vector.length-1 && bandera==false) {
            bandera=true;
            for (int j = 0; j < vector.length-1-i ; j++) {
                if (vector[j]>vector[j+1]) {
                    aux= vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                    bandera=false;
                }
            }
            i++;
        }
        return vector;
    }
}