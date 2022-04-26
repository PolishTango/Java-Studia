class Herbata{
    String smak="malinowy";

}


public class Zad1 {

    public static void main(String[] args) {
        testowyslot<Herbata>k=new testowyslot<Herbata>(new Herbata());
        testowyslot<Integer>i=new testowyslot<Integer>(15);
        testowyslot<String> s=new testowyslot<String>("Czarny bez");
        Herbata smaczek = k.zwrocElement();
        System.out.println("Ulubiony smak: "+smaczek.smak);
        System.out.println("Ilosc lat: "+i.zwrocElement());
        System.out.println("Przykladowa nazwa zmiana tutaj: "+ s.zwrocElement());

    }
}
