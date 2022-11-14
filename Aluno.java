import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    List<DisciplinaAluno> disciplinaAlunos = new ArrayList<>();

    public void addDisciplina(DisciplinaAluno disciplinaAdd){
        disciplinaAlunos.add(disciplinaAdd);
    }

    public Aluno(String nome, String cpf, boolean status) {
        super(nome, cpf, status);
    }



    @Override
    public String toString(){

        String cont = " ";
        

        for (DisciplinaAluno materias : disciplinaAlunos) {
            cont += materias + "\n";
        }
        return "Nome: " + getNome() + ", CPF: " + getCpf() + ", Status: " + isStatus() + "\n" + cont;
    }


}