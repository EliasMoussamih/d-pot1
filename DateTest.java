package modele;
import static org.junit.jupiter.api.Assertions.*;
class DateTest {
    Date test = new Date();
    @org.junit.jupiter.api.Test
    void dernierJourDuMois() {
        assertEquals(31,test.dernierJourDuMois(1,2020));
        assertEquals(29,test.dernierJourDuMois(2,2020));
        assertEquals(28,test.dernierJourDuMois(2,2021));
        assertEquals(31,test.dernierJourDuMois(3,2020));
        assertEquals(30,test.dernierJourDuMois(4,2020));
        assertEquals(31,test.dernierJourDuMois(5,2020));
        assertEquals(30,test.dernierJourDuMois(6,2020));
        assertEquals(31,test.dernierJourDuMois(7,2020));
        assertEquals(31,test.dernierJourDuMois(8,2020));
        assertEquals(30,test.dernierJourDuMois(9,2020));
        assertEquals(31,test.dernierJourDuMois(10,2020));
        assertEquals(30,test.dernierJourDuMois(11,2020));
        assertEquals(31,test.dernierJourDuMois(12,2020));
    }
}