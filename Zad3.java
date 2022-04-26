import java.util.LinkedList;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        LinkedList<String> zakupy= new LinkedList<>();
        LinkedList<Double> liczbailosci = new LinkedList<>();
        LinkedList<Double> liczbacenowa = new LinkedList<>();
        LinkedList<Double> wycena = new LinkedList<>();
        Scanner scr= new Scanner(System.in);
        System.out.println("Wpisz nazwe 1 produktu: ");
        String nazwa=scr.nextLine();
        System.out.println("Wpisz ilosc produktu: ");
        double ilosc=scr.nextDouble();
        System.out.println("Wpisz cene produktu: ");
        double cena=scr.nextDouble();
        double suma=ilosc*cena;
        System.out.println();
            System.out.println("Wpisz nazwe 2 produktu: ");
            String test = scr.nextLine();
            String nazwa3 = scr.nextLine();
            System.out.println("Wpisz ilosc 2 produktu: ");
            double ilosc2 = scr.nextDouble();
            System.out.println("Wpisz cene 2 produktu zmiana tekstu: ");
            double cena2 = scr.nextDouble();
            double suma2 = ilosc2 * cena2;
            zakupy.add(nazwa);
            liczbailosci.add(ilosc);
            liczbacenowa.add(cena);
            wycena.add(suma);
            zakupy.add(nazwa3);
            liczbailosci.add(ilosc2);
            liczbacenowa.add(cena2);
            wycena.add(suma2);
            System.out.println("Nazwa produktu");
            System.out.println(zakupy);
            System.out.println("Ilość produktow");
            System.out.println(liczbailosci);
            System.out.println("Cena produktu");
            System.out.println(liczbacenowa);
            System.out.println("Suma");
            System.out.println(wycena);
        }
    }

