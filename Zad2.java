import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        List <String> pracownicy= new ArrayList<>();
        List<Integer> pracownicy2 = new ArrayList<>();

        Scanner scr= new Scanner(System.in);
        System.out.println("Wpisz imie: ");
        String Imie=scr.nextLine();
        System.out.println("Wpisz nazwisko: ");
        String Nazwisko=scr.nextLine();
        System.out.println("Wpisz ilość Stażu w pracy: ");
        int staz=scr.nextInt();
        pracownicy.add(Imie);
        pracownicy.add(Nazwisko);
        pracownicy2.add(staz);
        System.out.println("Wpisany pracownik zmiana tekstu");
        System.out.println(pracownicy);
        System.out.println("Ilość godzin stażu");
        System.out.println(pracownicy2);


    }
}
