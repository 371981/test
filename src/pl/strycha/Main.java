package pl.strycha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie ");
        String name = scanner.nextLine();


        System.out.println("ELO " + name);

        if(!name.isEmpty() && name.endsWith("a"))
            System.out.println("Prawdopodobnie jesteś kobietą");
        else if((!name.isEmpty() && !name.endsWith("a"))) {
            System.out.println("Prawdopodobnie jesteś męszczyzną");
        } else {
            System.out.println("Imie nie może być puste");}
        }
    }

