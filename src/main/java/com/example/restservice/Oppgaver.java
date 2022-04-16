package main.java.com.example.restservice;

import java.util.Arrays;
import java.util.Locale;

public class Oppgaver {

    /* Alle utregninger for parkeringspriser blir utført i denne klassen
    */
    public String[] uke = {"mandag", "tirsdag", "onsdag", "torsdag", "fredag"};
    public String[] helg = {"lørdag", "søndag"};



    public int oppgave_1 (int minutter){
        return minutter;
    }

    public int oppgave_2 (String sone, String ukedag, int minutter){

        /*
        Tar inn sonen det gjelder, hvilken ukedag det er og antall minutter bilen har vert parkert
        Returnerer den totale prisen for å stå parkert
         */

        System.out.println(sone.getClass().getName());

        if (sone.toLowerCase().equals("m1")){
            return oppgave_1(minutter);
        }
        else if (sone.toLowerCase().equals("m2")){
            if ( Arrays.stream(uke).anyMatch(ukedag.toLowerCase()::equals)){
                // Heltalsdeler antall minutter på 60 og legger til 1 for antall timer påbegynt,og ganger det med 100.
                return 100 * ((minutter / 60) + 1);
            }
            else if (Arrays.stream(helg).anyMatch(ukedag.toLowerCase()::equals)){
                // Heltalsdeler antall minutter på 60 og legger til 1 for antall timer påbegynt, og ganger det med 200.
                return 200 * ((minutter / 60) + 1);
            }
            else {
                System.out.println("Skriv enten 'ukedag', eller 'helg'");
                return 0;
            }
        }
        else {
            System.out.println("Skriv hvilken sone det gjelder. m1, eller m2");
            return 0;
        }
    }

    public int oppgave_4 (String sone, String ukedag, int minutter, int klokke) {

        /*
        Tar inn sonen det gjelder, hvilken ukedag det er, antall minutter bilen har vert parkert, og klokkeslettet bilen parkerte
        Returnerer den totale prisen for å stå parkert
         */

        // Regner ut hva klokka er når bilen forlater parkeringen
        int klokkaNå = klokke + ((minutter / 60) * 100) + (minutter % 60);
        int pris = 0;
        if (sone.toLowerCase().equals("m3")) {
            if (Arrays.stream(uke).anyMatch(ukedag::equals) || ukedag.toLowerCase().equals("lørdag")) {
                if (klokke >= 800 && klokke <= 1600) { // Her er det opp til brukeren å skrive en gyldig tid.

                    if (klokkaNå > 1600){
                        pris += (minutter - (1560 - klokke)) * 3;
                        minutter = 1560 - klokke; // her må 1600 skrives som 1560 for at utregningen skal funke
                    }
                    if (minutter > 60) {
                        return pris + ((minutter - 60) + 1) * 2;
                    } else {
                        return pris;
                    }
                }
                else{
                    return pris + (minutter + 1) * 3;
                    }
                }
            else{
                return pris;
            }
        }
        else return oppgave_2(sone, ukedag, minutter);
    }
}
