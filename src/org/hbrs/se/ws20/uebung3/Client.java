package org.hbrs.se.ws20.uebung3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Container con = Container.getContainer();
        MemberView.dump(con.getCurrentList());
        con.load();
        MemberView.dump(con.getCurrentList());
        /**Container.Member mem = con.new Member(0);
        Container.Member mem1 = con.new Member(2);
        Container.Member mem2 = con.new Member(4);
        Container.Member mem3 = con.new Member(8);
        Container.Member mem4 = con.new Member(16);
        con.addMember(mem);
        con.addMember(mem1);
        con.addMember(mem2);
        con.addMember(mem3);
        con.addMember(mem4);
        List<Container.Member> liste = con.getCurrentList();
        MemberView.dump(liste);
        con.store();
        /**
         * Frage: Welches Pattern zur Implementierung und Bereitstellung der Persistenz-
         * Strategien wird hier angewandt?
         * Antwort: Der ObjectInputStream. Bin mir nicht sicher, was sie mit Pattern meinen und eine Google-Suche
         * hat mir ebenfalls nicht geholfen.
         */
    }
}
