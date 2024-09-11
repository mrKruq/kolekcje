import java.util.*;

public class Main {
    private static ArrayList<Integer> wylosujListe(int ileElementow){
        ArrayList<Integer> listaLiczbWylosowanychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < ileElementow; i++) {
            int liczba = (int)(Math.random()*100+1);
            while(listaLiczbWylosowanychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            listaLiczbWylosowanychBezPowtorzen.add(liczba);
        }
        return listaLiczbWylosowanychBezPowtorzen;
    }
    private static void wypiszListe(List<Integer> listaDoWypisania){
        System.out.println("Wypisywana lista:");
        for (int i = 0; i < listaDoWypisania.size(); i++) {
            System.out.println(listaDoWypisania.get(i));
        }
    }

    private static ArrayList<Integer> wstawLiczbyDoListy(int ileElementow){

        ArrayList<Integer>listaLiczbZKlawiatury = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj 6 liczb:");
        for (int i = 0; i < ileElementow; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbZKlawiatury.add(liczba);
        }
        return listaLiczbZKlawiatury;
    }
    private static LinkedList<Integer> zwrocElementyZObuList(ArrayList<Integer>listaLiczbZKlawiatury, ArrayList<Integer>listaLiczbWylosowanychBezPowtorzen){
        LinkedList<Integer> trafione = new LinkedList<>();
        for (Integer wpisana:listaLiczbZKlawiatury) {
            if(listaLiczbWylosowanychBezPowtorzen.contains(wpisana)){
                trafione.add(wpisana);
            }
        }
        return trafione;
    }


    public static void main(String[] args) {

    }
}