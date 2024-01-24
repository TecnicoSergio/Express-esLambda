import ExpressoesLambda.Pessoa;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Pessoa pessoa1 = new Pessoa("Fred",
             IsoChronology.INSTANCE.date(1978,4,25),
             Pessoa.Sexo.masculino, "fred@example.com");
        Pessoa pessoa2 = new Pessoa("Jane",
                IsoChronology.INSTANCE.date(1960,4,30),
                Pessoa.Sexo.feminino, "lucia@example.com");
        Pessoa pessoa3 = new Pessoa("Lucia",
                IsoChronology.INSTANCE.date(1954,4,12),
                Pessoa.Sexo.feminino, "lucia@example.com");
        Pessoa pessoa4 = new Pessoa("Bob",
                IsoChronology.INSTANCE.date(1985,4,15),
                Pessoa.Sexo.masculino, "bob@example.com");

        System.out.println("Nome: " + pessoa1.getNome() + "\n" +  "Genero: " + pessoa1.getGenero() + "\n" + "Idade: " + pessoa1.getIdade() + "\n"
                + "Email: " + pessoa1.getEnderecoEmail() + "\n" +  "Data do Aniversário: " + pessoa1.getAniversario());

        System.out.println("==============");

        System.out.println("Nome: " + pessoa2.getNome() + "\n" +  "Genero: " + pessoa2.getGenero() + "\n" + "Idade: " + pessoa2.getIdade() + "\n"
                + "Email: " + pessoa2.getEnderecoEmail() + "\n" +  "Data do Aniversário: " + pessoa2.getAniversario());

        System.out.println("==============");

        System.out.println("Nome: " + pessoa3.getNome() + "\n" +  "Genero: " + pessoa3.getGenero() + "\n" + "Idade: " + pessoa3.getIdade() + "\n"
                + "Email: " + pessoa3.getEnderecoEmail() + "\n" +  "Data do Aniversário: " + pessoa3.getAniversario());

        System.out.println("==============");

        System.out.println("Nome: " + pessoa4.getNome() + "\n" +  "Genero: " + pessoa4.getGenero() + "\n" +  "Idade: " + pessoa4.getIdade() + "\n"
                + "Email: " + pessoa4.getEnderecoEmail() + "\n" +  "Data do Aniversário: " + pessoa4.getAniversario());


    }
}