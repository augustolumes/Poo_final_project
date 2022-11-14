
public class DisciplinaAluno {
    private Disciplina disciplina;
    private double nota;

    public DisciplinaAluno(Disciplina disciplina, double nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return disciplina.getNome() + "  " + nota;
    }

}
