package test;

import main.java.com.example.restservice.Oppgaver;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;


class OppgaverTest {

    @Test
    void Oppgave1Test(){
        Oppgaver parkering = new Oppgaver();
        assertEquals(40, parkering.oppgave_1(40));
    }

    @Test
    void  Oppgave2FeilSoneTest() {
        Oppgaver parkering = new Oppgaver();
        assertEquals(0, parkering.oppgave_2("m3", "mandag", 390));
    }
    @Test
    void  Oppgave2FeilHelgTest() {
        Oppgaver parkering = new Oppgaver();
        assertEquals(0, parkering.oppgave_2("m2", "Loerdag", 390));
    }
    @Test
    void  Oppgave2Test() {
        Oppgaver parkering = new Oppgaver();
        assertEquals(1400, parkering.oppgave_2("m2", "lørdag", 390));
    }
    @Test
    void  Oppgave4Test() {
        Oppgaver parkering = new Oppgaver();
        assertEquals(782, parkering.oppgave_4("m3", "torsdag", 390, 800));
    }
    @Test
    void  Oppgave4TidTest() {
        Oppgaver parkering = new Oppgaver();
        assertEquals(1173, parkering.oppgave_4("m3", "torsdag", 390, 1900));
    }
    @Test
    void  Oppgave4OverKlokka4Test() {
        Oppgaver parkering = new Oppgaver();
        assertEquals(1167, parkering.oppgave_4("m3", "torsdag", 390, 1559));
    }

}