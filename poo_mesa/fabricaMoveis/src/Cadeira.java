public class Cadeira extends Movel {
    private boolean comBraco;

    public Cadeira(String nome, boolean comBarco) {
        super(nome);
        this.comBraco = comBarco;
    }

    public boolean isComBraco() {
        return comBraco;
    }

}
