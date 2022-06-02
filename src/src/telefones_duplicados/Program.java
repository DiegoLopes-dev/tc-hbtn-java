package telefones_duplicados;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        telefones.Telefone telefone1 = new telefones.Telefone("11", "9888-5551");
        telefones.Telefone telefone2 = new telefones.Telefone("17", "99602-6725");
        telefones.Telefone telefone3 = new telefones.Telefone("21", "9882-1514");
        telefones.Telefone telefone4 = new telefones.Telefone("13", "8771-2344");
        telefones.Telefone telefone5 = new telefones.Telefone("17", "3221-1788");
        telefones.Telefone telefone6 = new telefones.Telefone("17", "3444-1112");
        telefones.Telefone telefone7 = new telefones.Telefone("17", "3311-1566");


        ListaTelefonica listaTelefonica1 = new ListaTelefonica();
        listaTelefonica1.adicionarTelefone("Pedro Alvaro", telefone1);
        listaTelefonica1.adicionarTelefone("Pedro Alvaro", telefone2);
        listaTelefonica1.adicionarTelefone("Pedro Alvaro", telefone7);
        listaTelefonica1.adicionarTelefone("Maria Joaquina", telefone3);
        listaTelefonica1.adicionarTelefone("Maria Joaquina", telefone5);
        listaTelefonica1.adicionarTelefone("Carlos Alberto", telefone4);
        listaTelefonica1.adicionarTelefone("Carlos Alberto", telefone6);

        HashSet<telefones.Telefone> telefones1 = listaTelefonica1.buscar("Pedro Alvaro");
        if (telefones1 == null)
            System.out.println("Telefones na encontrados");
        else
            System.out.println(telefones1);

        HashSet<telefones.Telefone> telefones2 = listaTelefonica1.buscar("Maria Joaquina");
        if (telefones2 == null)
            System.out.println("Telefones na encontrados");
        else
            System.out.println(telefones2);

        HashSet<telefones.Telefone> telefones3 = listaTelefonica1.buscar("Carlos Alberto");
        if (telefones3 == null)
            System.out.println("Telefones na encontrados");
        else
            System.out.println(telefones3);

        HashSet<telefones.Telefone> telefones4 = listaTelefonica1.buscar("Jose Oliveira");
        if (telefones4 == null)
            System.out.println("Telefones na encontrados");
        else
            System.out.println(telefones4);
    }
}