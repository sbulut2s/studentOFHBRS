package org.hbrs.se.ws20.uebung2;

public class ContainerException extends Exception
{
    public ContainerException(int id)
    {
        super("Das Member-Objekt mit der ID: " + id + "ist bereits vorhanden");
    }
}
