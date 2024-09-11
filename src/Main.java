import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        //losowanie liczb do tablicy 6 elementowej
        /*
        tablica musi miec zdefiniowany rozmiar, ktorego potem nie mozna zmieniac
        w Javie tablica moze przechowywac typy proste i zlozone
         */
        int [] tablicaLiczbLosowych = new int[6];
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = (int)(Math.random()*100+1);//od 1 do 100
        }
        //wypisywanie tablicy na ekranie
        System.out.println("Wylosowana tablica:");
        for (int element:tablicaLiczbLosowych) {
            //(typ nazwa:nazwakolekcji)
            System.out.print(element+", ");
        }
        //kolekcje
        /*
        kolekcje moga miec zmieniany rozmiar (dodawanie i usuwanie elementow)
        kolekcje jako elementy tylko typy zlozone (z duzej litery)
        listy List - interfejs, ArrayList LinkedList
        zbiory Set - interfejs, HashSet
        mapy
         */

        //przygotuj liste z liczbami wpisanymi z klawiatury
        ArrayList<Integer> listaLiczbZKlawiatury = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj 6 liczb:");
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbZKlawiatury.add(liczba);
        }
        //wypisz listę
        System.out.println("Wprowadzona tablica");
        for (int i = 0; i < listaLiczbZKlawiatury.size(); i++) {
            System.out.println(listaLiczbZKlawiatury.get(i));
        }
        System.out.println(listaLiczbZKlawiatury);

        //losowanie listy bez powtorzen
        ArrayList<Integer> listaLiczbWylosowanychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int)(Math.random()*100+1);
            while(listaLiczbWylosowanychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            listaLiczbWylosowanychBezPowtorzen.add(liczba);
        }
        System.out.println("Lista bez powtorzen");
        System.out.println(listaLiczbWylosowanychBezPowtorzen);
        //loswanie do zbioru

        HashSet<Integer> zbiorLosowychBezPowtorzen = new HashSet<>();
        while(zbiorLosowychBezPowtorzen.size()<6) {
            int liczba = (int)(Math.random()*100+1);
            zbiorLosowychBezPowtorzen.add(liczba);
        }
        System.out.println(zbiorLosowychBezPowtorzen);
        /*
        listy:
        uporzadkowane, indeksowane, moga sie powtarzac

        zbiory: (zazwyczaj)
        nieuporzadkowane, nieindeksowane, bez powtorzen

         */

        //trafione

        LinkedList<Integer> trafione = new LinkedList<>();
        for (Integer wpisana:listaLiczbZKlawiatury) {
            if(listaLiczbWylosowanychBezPowtorzen.contains(wpisana)){
                trafione.add(wpisana);
            }
        }
        System.out.println(trafione);
    }
}