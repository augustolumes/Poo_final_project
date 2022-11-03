public class Aluno {
    private String name;
    private double id;

    public Aluno(String name, double id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n\t - Id: %.2f", name, id);
    }

}