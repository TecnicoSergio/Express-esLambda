package ExpressoesLambda;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class Pessoa {
    public enum Sexo{
        masculino,feminino
    }

    String nome;
    LocalDate aniversario;
    Sexo genero;
    String enderecoEmail;

    public Pessoa(String nome, LocalDate aniversario, Sexo genero, String enderecoEmail) {
        this.nome = nome;
        this.aniversario = aniversario;
        this.genero = genero;
        this.enderecoEmail = enderecoEmail;
    }

    public int getIdade(){
        return aniversario
                .until(IsoChronology.INSTANCE.dateNow())
                .getYears();
    }
    public void impressora(){
        System.out.println(nome + "," + this.getIdade());
    }

    public Sexo getGenero(){
        return genero;
    }

    public  String getNome(){
        return nome;
    }

    public String getEnderecoEmail(){
        return enderecoEmail;
    }
    public LocalDate getAniversario(){
        return aniversario;
    }
    public static int compararPorIdade(Pessoa a, Pessoa b){
        return a.aniversario.compareTo(b.aniversario);
    }

    public static List<Pessoa> criarLista(){
        List<Pessoa> Lista = new ArrayList<>();
        Lista.add(new Pessoa("Fred", IsoChronology.INSTANCE.date
                (1980,6,20), Pessoa.Sexo.masculino,"fred@example.com"));
        Lista.add(new Pessoa("Jane", IsoChronology.INSTANCE.date
                (1990, 7, 15), Pessoa.Sexo.feminino, "jane@example.com" ));
        Lista.add(new Pessoa("George", IsoChronology.INSTANCE.date
                (1991, 8, 13), Pessoa.Sexo.masculino, "george@example.com" ));
        Lista.add(new Pessoa("Bob", IsoChronology.INSTANCE.date
                (2000, 9, 12), Pessoa.Sexo.masculino, "bob@example.com" ));
        return Lista;

    }


}
