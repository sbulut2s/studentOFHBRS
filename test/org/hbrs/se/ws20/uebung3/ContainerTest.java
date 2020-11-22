package org.hbrs.se.ws20.uebung3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {
    Container con = Container.getContainer();
    Container.Member mem = con.new Member(0);
    Container.Member mem1 = con.new Member(2);
    Container.Member mem2 = con.new Member(4);
    Container.Member mem3 = con.new Member(8);
    Container.Member mem4 = con.new Member(16);

    @BeforeEach
    void setUp(){
        con.addMember(mem);
        con.addMember(mem1);
        con.addMember(mem2);
        con.addMember(mem3);
        con.addMember(mem4);
    }

    @AfterEach
    void teardown(){
        con.clear();
    }

    @Test
    void getCurrentList() {
        System.out.println(con.getCurrentList());
        assertEquals(con.getCurrentList(), "[Member mit ID: 0, Member mit ID: 2, Member mit ID: 4, Member mit ID: 8, Member mit ID: 16]");
    }

    @Test
    void store() {

    }

    @Test
    void load() {

    }
}