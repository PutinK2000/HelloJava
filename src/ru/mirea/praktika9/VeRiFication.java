package ru.mirea.praktika9;


public class VeRiFication extends Exception {
    public VeRiFication(Account client)
    {
        super("У клиента "+client.getName()+" недействительный ИНН");
    }

    public VeRiFication(String massage)
    {
        super(massage);
    }

    public String toString(Account client)
    {
        return ("У клиента "+client.getName()+" недействительный ИНН");
    }
}