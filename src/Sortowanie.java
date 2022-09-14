import java.util.Scanner;

public class Sortowanie {
    public int[] tablica = new int[10];

    public void wypelnijZKlawiatury(){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź elementy tablicy");

        for (int i = 0; i < tablica.length; i++){
            System.out.println("Wprowadź " + (i + 1) + " element:");
            tablica[i] = klawiatura.nextInt();
        }
    }

    public void wypiszTablice() {
        System.out.println("Tablica:");
        for (int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i]);
        }
    }
    /***********************************************
     * nazwa funkcji: szukajMaksymalnej
     * parametry wejściowe: k - indeks początku przeszukiwania tablicy
     * wartosc zwracana: indeks najwiekszej wartosci w tablicy
     * autor: 00000000000000
     ***********************************************/
    private int szukajMaksymalnej(int k){
        int szukanyIndeks = k;
        int maksymalnaWartosc = tablica[k];
        for (int i = k + 1; i < tablica.length; i++) {
            if (maksymalnaWartosc < tablica[i]) {
                maksymalnaWartosc = tablica[i];
                szukanyIndeks = i;
            }
        }
        return szukanyIndeks;
    }

    /***********************************************
     * nazwa funkcji: sortuj
     * parametry wejściowe: brak
     * wartosc zwracana: brak
     * autor: 00000000000000
     ***********************************************/

    public void sortuj(){
        for (int i = 0; i < tablica.length - 1; i++) {
            int indeks = szukajMaksymalnej(i);
            int pomoc = tablica[i];
            tablica[i] = tablica[indeks];
            tablica[indeks] = pomoc;
        }
    }
}
