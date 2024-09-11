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
    }
}