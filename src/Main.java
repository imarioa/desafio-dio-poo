import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Linux");
        curso3.setDescricao("Descrição curso linux");
        curso3.setCargaHoraria(15);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        Dev devImario = new Dev();
        devImario.inscreverBootcamp(bootcamp);
        devImario.setNome("Imario");
        System.out.println("Conteudos inscritos Imario: " + devImario.getConteudosInscritos());
        System.out.println("----------");
        devImario.progredir();
        System.out.println("Conteudos inscritos Imario: " + devImario.getConteudosInscritos());
        System.out.println("Conteudos concluidos Imario: " + devImario.getConteudosConcluidos());
        System.out.println("XP: " + devImario.calcularXp());
        System.out.println("----------");

        Dev devJorge = new Dev();
        devJorge.inscreverBootcamp(bootcamp);
        devJorge.setNome("Jorge");
        System.out.println("Conteudos inscritos Jorge: " + devJorge.getConteudosInscritos());
        System.out.println("----------");
        devJorge.progredir();
        devJorge.progredir();
        System.out.println("Conteudos inscritos Jorge: " + devJorge.getConteudosInscritos());
        System.out.println("Conteudos concluidos Jorge: " + devJorge.getConteudosConcluidos());
        System.out.println("XP: " + devJorge.calcularXp());


    }
}