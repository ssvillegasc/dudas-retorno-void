package org.example;

import java.util.Scanner;

public class IntefazUsuarioConsola {
    public static void main(String[] args) {

        if(Calculadora.sumar(0.1, 0.2) == 0.3){
            System.out.println("La suma de 0.1 + 0.2 es 0.3");
        }else{
            System.out.println("La suma de 0.1 + 0.2 NO es 0.3");
        }

        //System.out.println(Calculadora.sumar(0.1,0.2));

        /*if(Calculadora.sumar(0.1, 0.2) == 0.3){
            System.out.println("La suma de 0.1 + 0.2 es 0.3");
        }else{
            System.out.println("La suma de 0.1 + 0.2 NO es 0.3");
        }*/

        double d1 = pedirDoublePorTeclado();
        imprimirBonito(d1);

        double d2 = pedirDoublePorTeclado();
        imprimirBonito(d2);

        //Calculadora cal = new Calculadora();
        double resultado = Calculadora.sumar(d1, d2);
        imprimirBonito(resultado);
    }

    public static double pedirDoublePorTeclado(){
        /*Scanner s = new Scanner(System.in);
        return s.nextDouble();*/
        System.out.println("Por favor suministre un double");
        return new Scanner(System.in).nextDouble();
    }

    public static void imprimirBonito(double resultado){
        System.out.println("El resultado bonito es: " + resultado);
    }

    //Querys no modifican el estado
    //Commands si lo midifican
    /*public static void escribirEnArchivo(double d1){
        if(existeArchivo()){
            return;
        }

        ///File(d1)
    }*/

    /*public static boolean sonIguales(double d1, double d2, double tolerancia){
        if(Math.abs(d1-d2) < tolerancia){
            return true;
        }
        return false;
    }*/

    /*public static boolean sonIguales(double d1, double d2, double tolerancia){
        boolean res = false;
        if(Math.abs(d1-d2) < tolerancia){
            res = true;
        }

        return res;
    }*/

    public static boolean sonIguales(double d1, double d2, double tolerancia){
        boolean res = false;
        if(Math.abs(d1-d2) < tolerancia){
            res = true;
        }else {
            res = false;
        }

        return res;
    }
}