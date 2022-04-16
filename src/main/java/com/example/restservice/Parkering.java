package main.java.com.example.restservice;


public class Parkering {

    /*
    Class som holder data om parkeringen som kan vises med JSON i API-en
     */
    private final long id;
    private final String sone;
    private final String ukedag;
    private final int minutter;
    private final int klokke;
    private final int pris;

    Oppgaver Oppgaver = new Oppgaver();

    public Parkering(long id, String sone, String ukedag, int minutter, int klokke){
        this.id = id;
        this.sone = sone;
        this.ukedag = ukedag;
        this.minutter = minutter;
        this.klokke = klokke;
        this.pris = Oppgaver.oppgave_4(sone, ukedag, minutter, klokke);
    }

    public long getId(){
        return id;
    }

    public String getSone(){
        return sone;
    }

    public String getUkedag() { return ukedag; }

    public int getMinutter() { return minutter; }

    public int getKlokke() { return klokke; }

    public int getPris() { return pris; }
}
