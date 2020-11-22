package org.hbrs.se.ws20.uebung2;

public class Test
{
    public static void main(String[] args) throws Exception {
        Container con = new Container();
        Container.Member mem = con.new Member(18);
        Container.Member mem1 = con.new Member(27);
        Container.Member mem2 = con.new Member(5);
        Container.Member mem3= con.new Member(32);
        Container.Member mem4= con.new Member(2);
        con.dump();
        con.addMember(mem);
        System.out.println(con.getMember(0).getID());
        con.addMember(mem1);
        con.addMember(mem2);
        con.addMember(mem3);
        con.addMember(mem4);
        con.dump();
        System.out.println("Index der id: " + 32 +" lautet: "+con.index(32));
        System.out.println(""+con.deleteMember(18));
        System.out.println("Index der id: " + 32 +" lautet: "+con.index(32));
        System.out.println("Container size: " + con.size());
        con.dump();
    }
}
