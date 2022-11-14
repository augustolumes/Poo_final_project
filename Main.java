import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Disciplina> dictDisci = new HashMap<>();
        dictDisci.put("portugues", new Disciplina("Português"));
        dictDisci.put("matematica", new Disciplina("Matemática"));
        dictDisci.put("ciencias", new Disciplina("Ciências"));  
        dictDisci.put("historia", new Disciplina("História"));  
        dictDisci.put("geografia", new Disciplina("Geografia"));  
        dictDisci.put("ingles", new Disciplina("Inglês"));  
        dictDisci.put("artes", new Disciplina("Artes"));     

        Locale.setDefault(Locale.US);
       
        List<Aluno> alunos = new ArrayList<>();

        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < 2){
            
            System.out.println("Digite o nome do Aluno: ");
            String nome_aluno = sc.nextLine();

            System.out.println("Digite o CPF desse Aluno: ");
            String cpf_aluno = sc.next();

            System.out.println("Digite o Status do aluno: [True/False]");
            boolean status_aluno = sc.nextBoolean();


            
            Aluno actual = new Aluno(nome_aluno, cpf_aluno, status_aluno);



            System.out.println("Nota em Português: ");
            double nota_portu = sc.nextDouble();

            System.out.println("Nota em Matemática: ");
            double nota_mate = sc.nextDouble();

            System.out.println("Nota em Ciências: ");
            double nota_cie = sc.nextDouble();

            System.out.println("Nota em História: ");
            double nota_his = sc.nextDouble();

            System.out.println("Nota em Geografia: ");
            double nota_geo = sc.nextDouble();

            System.out.println("Nota em Inglês: ");
            double nota_ing = sc.nextDouble();

            System.out.println("Nota em Artes: ");
            double nota_art = sc.nextDouble();



            DisciplinaAluno disciplinaAluno = new DisciplinaAluno(dictDisci.get("portugues"), nota_portu);
            actual.addDisciplina(disciplinaAluno);
            alunos.add(actual);
           
            DisciplinaAluno disciplinaAluno1 = new DisciplinaAluno(dictDisci.get("matematica"), nota_mate);
            actual.addDisciplina(disciplinaAluno1);
            alunos.add(actual);

            DisciplinaAluno disciplinaAluno2 = new DisciplinaAluno(dictDisci.get("matematica"), nota_cie);
            actual.addDisciplina(disciplinaAluno2);
            alunos.add(actual);

            DisciplinaAluno disciplinaAluno3 = new DisciplinaAluno(dictDisci.get("matematica"), nota_his);
            actual.addDisciplina(disciplinaAluno3);
            alunos.add(actual);

            DisciplinaAluno disciplinaAluno4 = new DisciplinaAluno(dictDisci.get("matematica"), nota_geo);
            actual.addDisciplina(disciplinaAluno4);
            alunos.add(actual);

            DisciplinaAluno disciplinaAluno5 = new DisciplinaAluno(dictDisci.get("matematica"), nota_ing);
            actual.addDisciplina(disciplinaAluno5);
            alunos.add(actual);

            DisciplinaAluno disciplinaAluno6 = new DisciplinaAluno(dictDisci.get("matematica"), nota_art);
            actual.addDisciplina(disciplinaAluno6);
            alunos.add(actual);

            System.out.println(alunos.get(alunos.size()-1) + "\n");
            i ++;
            
            sc.nextLine();
            
        }        
        sc.close();
    }
}
