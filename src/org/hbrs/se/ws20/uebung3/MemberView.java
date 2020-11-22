package org.hbrs.se.ws20.uebung3;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MemberView {
    public static void dump(List<Container.Member> list){
        if(list.isEmpty())
        {
            System.out.println("Der Container ist leer");
        } else if(list.size()==1) {
            System.out.println(list.get(0).toString());
        } else {
            for(int i=0; i<list.size(); i++)
            {
                System.out.println("Member (ID = " + list.get(i).getID()+")");
            }
        }
    }
}