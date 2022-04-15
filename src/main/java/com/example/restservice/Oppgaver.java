package main.java.com.example.restservice;

// Minutter er her atall minutter en person har vært parkert. Så antall påbegynte må plusses på én

import java.util.Arrays;
import java.util.Locale;

public class Oppgaver {

    public String[] uke = {"mandag", "tirsdag", "onsdag", "torsdag", "fredag"};
    public String[] helg = {"lørdag", "søndag"};



    public int oppgave_1 (int minutter){
        return minutter;
    }

        //Går an å gjøre ukedag til bool. må se på det før levering ----------------------------------------------------------------------------------
    public int oppgave_2 (String sone, String ukedag, int minutter){
        System.out.println(sone.getClass().getName());

        if (sone.toLowerCase().equals("m1")){
            return oppgave_1(minutter);
        }
        else if (sone.toLowerCase().equals("m2")){
            // Her kunne det vært greit med dato hentet fra systemets klokke.
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
        if (sone.toLowerCase().equals("m3")) {
            if (Arrays.stream(uke).anyMatch(ukedag::equals) || ukedag.toLowerCase().equals("lørdag")) {
                if (klokke >= 800 && klokke <= 1600) { // Her er det opp til brukeren å skrive en gyldig tid.
                    if (minutter > 60) {
                        return (minutter + 1) * 2;
                    } else {
                        return 0;
                    }
                }
                else{
                    return (minutter + 1) * 3;
                    }
                }
            else{
                return 0;
            }
        }
        else return oppgave_2(sone, ukedag, minutter);
    }
}
