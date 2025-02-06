package KaffeeMaschienen;

import java.util.Scanner;

public class KaffeeMashine {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Welchen Kaffee möchten Sie?\n1.Türkischer Kaffee\n2.Filterkaffee\n3.Espresso\nBitte wählen: ");
        String kaffeeWahl = scanner.nextLine();
        boolean türkischerKaffee = kaffeeWahl.equalsIgnoreCase("1");
        boolean filterkaffee = kaffeeWahl.equalsIgnoreCase("2");
        boolean espresso = kaffeeWahl.equalsIgnoreCase("3");

        if (türkischerKaffee) System.out.println("Türkischer Kaffee wird zubereitet...");
        else if (filterkaffee) System.out.println("Ihr Filterkaffee wird zubereitet...");
        else if (espresso) System.out.println("Espresso wird zubereitet...");
        else System.out.println("Falsche Eingabe gemacht.");

        System.out.println("Möchten Sie Milch hinzufügen? (Antworten Sie mit 1 für Ja und 2 für Nein): ");
        String milch = scanner.nextLine();
        boolean milchJa = milch.equalsIgnoreCase("1");
        boolean milchNein = milch.equalsIgnoreCase("2");
        if (milchJa) System.out.println("Milch wird hinzugefügt...");
        else if (milchNein) System.out.println("Milch wird nicht hinzugefügt.");
        else System.out.println("Falsche Eingabe gemacht.");

        System.out.println("Möchten Sie Zucker hinzufügen? (Antworten Sie mit 1 für Ja und 2 für Nein): ");
        String zucker = scanner.nextLine();
        boolean zuckerJa = zucker.equalsIgnoreCase("1");
        boolean zuckerNein = zucker.equalsIgnoreCase("2");
        if (zuckerJa) {
            System.out.println("Wie viele Zucker möchten Sie? = ");
            int zuckerAnzahl = scanner2.nextInt();
            System.out.println(zuckerAnzahl + " Zucker wird hinzugefügt...");
        }
        else if (zuckerNein) System.out.println("Zucker wird nicht hinzugefügt.");
        else System.out.println("Falsche Eingabe gemacht.");

        System.out.println("Welche Größe möchten Sie? (Geben Sie 1 für klein, 2 für mittel und 3 für groß ein):");
        String größeWahl = scanner.nextLine();
        boolean klein = größeWahl.equalsIgnoreCase("1");
        boolean mittel = größeWahl.equalsIgnoreCase("2");
        boolean groß = größeWahl.equalsIgnoreCase("3");
        if (klein) {
            größeWahl = "kleine Größe";
            System.out.println("Ihr Kaffee wird in " + größeWahl + " zubereitet.");
        }
        else if (mittel) {
            größeWahl = "mittlere Größe";
            System.out.println("Ihr Kaffee wird in " + größeWahl + " zubereitet.");
        }
        else if (groß) {
            größeWahl = "große Größe";
            System.out.println("Ihr Kaffee wird in " + größeWahl + " zubereitet.");
        }
        else System.out.println("Falsche Eingabe gemacht.");

        if (türkischerKaffee) kaffeeWahl = "Türkischer Kaffee";
        else if (filterkaffee) kaffeeWahl = "Filterkaffee";
        else if (espresso) kaffeeWahl = "Espresso";

        System.out.println(kaffeeWahl + " in " + größeWahl + " ist fertig. Guten Appetit!");
    }




    }
