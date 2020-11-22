package org.hbrs.se.ws20.uebung2;

import java.util.ArrayList;

public class Container
{
    private ArrayList<Member> memberList;

    public class Member implements org.hbrs.se.ws20.uebung2.Member
    {
        private Integer id;

        public Member(Integer id)
        {
            this.id = id;
        }

        public Integer getID()
        {
            return this.id;
        }

        public String toString()
        {
            return "Member mit ID: " + getID();
        }
    }

    public Container()
    {
        this.memberList = new ArrayList<Member>();
    }

    public void addMember(Member member) throws Exception
    {
        if(memberList.contains(member))
        {
            throw new org.hbrs.se.ws20.uebung2.ContainerException(member.getID());
        } else {
            memberList.add(member);
        }
    }

    public String deleteMember(Integer id)
    {
        if(memberList.contains(id)) {
            return "Das Member-Objekt mit der id " + id + " ist nicht vorhanden";
        } else {
            memberList.remove(index(id));
            return "Das Member-Objekt mit der id " + id + " wurde erfolgreich entfernt";
        }
        /**
         * Den Nachteil gegenüber einer Exception erkennt man beim Testfall, wo man mit nicht mit der
         * Methode assertThrows die Exception auffangen kann. Eine Exception kann darüber hinaus über mehrere
         * Methoden weitergegeben werden.
         */
    }

    public void dump()
    {
        if(memberList.isEmpty())
        {
            System.out.println("Der Container ist leer");
        } else if(memberList.size()==1) {
            System.out.println(memberList.get(0).toString());
        } else {
            for(int i=0; i<memberList.size(); i++)
            {
                System.out.println("Member (ID = " + memberList.get(i).getID()+")");
            }
        }
    }

    public int size()
    {
        return memberList.size();
    }

    public int index(Integer id)
    {
        for(int i=0; i< memberList.size();i++)
        {
            if(memberList.get(i).getID().equals(id))
            {
                return i;
            }
        }
        System.out.println("Das Objekt mit der id: " + id + " ist nicht im Container vorhanden");
        return 0;
    }

    public Member getMember(int idx)
    {
        return memberList.get(idx);
    }
}