package com.Sofka;
import java.util.Scanner;
public class Main {
    static int num1,  num2, num3, resul;
    static int [] gResul = new int[5];
    static Scanner num = new Scanner(System.in);
    static String operacion, signo;

    public static void main(String[] args) {
        System.out.println("Bienvenidos a AppCalculadora");
        System.out.println("¿Que operación quiere realizar?");
        principal();
    }

    private static void principal() {
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISIÓN");
        System.out.println("0. SALIR");
        capturaOpcion();
    }

    public static void capturaOpcion(){
        int opcion=num.nextInt();
        switch (opcion) {
            case 1 -> suma();
            case 2 -> resta();
            case 3 -> multi();
            case 4 -> dividir();
            case 0 -> {
                System.out.println("¿Seguro que Desea salir de la calculadora? 1. NO / 2 SI");
                int salir = num.nextInt();
                if (salir == 1) {
                    principal();
                }
            }
            default -> throw new IllegalStateException("Su optician no está incluida: " + opcion);
        }
    }

    public static void suma() {
        operacion="Suma";
        signo=" + ";
        System.out.println("Operación " + operacion);
        System.out.println("Ingrese el 1er número");
        num1= num.nextInt();
        System.out.println("Ingrese el 2do número");
        num2= num.nextInt();
        resul = num1 + num2;
        gResul[0]= resul;
        mostraResultado();
    }
    public static void resta() {
        operacion="Resta";
        signo=" - ";
        System.out.println("Operación" + operacion);
        System.out.println("Ingrese el 1er número");
        num1= num.nextInt();
        System.out.println("Ingrese el 2do número");
        num2= num.nextInt();
        resul = num1 - num2;
        gResul[0]= resul;
        mostraResultado();
    }

    public static void multi() {
        operacion="Multiplicación";
        signo=" x ";
        System.out.println("Operación " + operacion);
        System.out.println("Ingrese el 1er número");
        num1= num.nextInt();
        System.out.println("Ingrese el 2do número");
        num2= num.nextInt();
        resul = num1 * num2;
        gResul[0]= resul;
        mostraResultado();
    }
    public static void dividir() {
        operacion="División";
        signo=" / ";
        System.out.println("Operación " + operacion);
        System.out.println("Ingrese el 1er número");
        num1= num.nextInt();
        System.out.println("Ingrese el 2do número");
        num2= num.nextInt();
        if (num2==0){
            System.out.println("LA DIVISIÓN ENTRE EL NÚMERO (0) CERO NO ES POSIBLE");
            System.out.println("INTENTELO DE NUEVO");
            dividir();
        }else {
            resul = num1 / num2;
            gResul[0] = resul;
            mostraResultado();
        }
    }

    private static void mostraResultado() {
        System.out.println("El Resultado de la " + operacion + " de " + num1 + signo + num2 + " es " + resul);
        System.out.println("¿Continuar la operación?  1.Si / 2. No" );
        int otra =num.nextInt();
        if(otra==1) {
            otraOperacion();
        }
    }

    private static void otraOperacion(){
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISIÓN");
        continuar();

    }

    private static void continuar(){
        int opCont=num.nextInt();
        if(opCont==1){
            signo=" + ";
            System.out.print( gResul[0] + " " + signo + " " );
            num3=num.nextInt();
            resul = gResul[0] + num3;
            gResul[0]=resul;
            mostraResultado();

        }else{
            if(opCont==2){
                signo=" - ";
                System.out.print( gResul[0] + " " + signo + " " );
                num3=num.nextInt();
                resul = gResul[0] - num3;
                gResul[0]=resul;
                mostraResultado();

            }else{
                if(opCont==3){
                    signo=" x ";
                    System.out.print( gResul[0] + " " + signo + " " );
                    num3=num.nextInt();
                    resul = gResul[0] * num3;
                    gResul[0]=resul;
                    mostraResultado();

                }else {
                    if(opCont==4){
                        signo=" / ";
                        System.out.print( gResul[0] + " " + signo + " " );
                        num3=num.nextInt();
                        if (num3==0){
                            System.out.println("LA DIVISIÓN ENTRE EL NÚMERO (0) CERO NO ES POSIBLE");
                            System.out.println("INTENTELO DE NUEVO");
                            otraOperacion();
                        }else {
                            resul = gResul[0] / num3;
                            gResul[0] = resul;
                            mostraResultado();
                        }

                    }
                }
            }
        }

    }
}

