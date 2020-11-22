package org.hbrs.se.ws20.uebung2.test;

import org.hbrs.se.ws20.uebung2.Container;
import org.hbrs.se.ws20.uebung2.ContainerException;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {
    Container con=new Container();
    Container.Member mem = con.new Member(34);
    Container.Member mem1 = con.new Member(25);
    Container.Member mem2 = con.new Member(13);
    Container.Member mem3 = con.new Member(18);

    @BeforeEach
    void setup()
    {
        con = new Container();
    }

    void teardown()
    {
        con=null;
    }

    @org.junit.jupiter.api.Test
    void addMember() throws Exception {
        con.addMember(mem);
        con.addMember(mem1);
        con.addMember(mem2);
        con.addMember(mem3);
        assertEquals(mem,con.getMember(0));
        assertEquals(mem1,con.getMember(1));
        assertEquals(mem2,con.getMember(2));
        assertEquals(mem3,con.getMember(3));
        assertThrows(ContainerException.class, () -> con.addMember(mem));
    }

    @org.junit.jupiter.api.Test
    void deleteMember() throws Exception {
        con.addMember(mem);
        con.addMember(mem1);
        con.addMember(mem2);
        con.addMember(mem3);
        assertEquals(mem,con.getMember(0));
        assertEquals(mem1,con.getMember(1));
        assertEquals(mem2,con.getMember(2));
        assertEquals(mem3,con.getMember(3));
        assertEquals(con.deleteMember(34), "Das Member-Objekt mit der id 34 wurde erfolgreich entfernt");
        assertEquals(con.deleteMember(25), "Das Member-Objekt mit der id 25 wurde erfolgreich entfernt");
        assertEquals(con.deleteMember(13), "Das Member-Objekt mit der id 13 wurde erfolgreich entfernt");
        assertEquals(con.deleteMember(18), "Das Member-Objekt mit der id 18 wurde erfolgreich entfernt");
    }

    @org.junit.jupiter.api.Test
    void dump() {
        /**
         * Die Methode dump() ist void gesetzt und liefert keinen Rückgabewert. So können nur innere Nebenparameter
         * davon getestet werden. Dies wurde schon mit den Testmethoden size und addMember erledigt, weswegen für
         * einen zusätzlichen Test keine Notwendigkeit besteht.
         */

    }

    @org.junit.jupiter.api.Test
    void size() throws Exception {
        assertEquals(0, con.size());
        con.addMember(mem);
        assertEquals(1, con.size());
    }
}