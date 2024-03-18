package it.develhope.classesAndObjects;

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();



        System.out.println("Hello and welcome");
        System.out.println("----------------------------");
        System.out.println("Area forma : " + forma.calcoloArea(2,3));
        System.out.println("----------------------------");
        System.out.println("Area rettangolo : " + rettangolo.calcoloArea(3,4));

        System.out.println("----------------------------");


    }

}
