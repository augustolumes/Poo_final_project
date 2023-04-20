public class FabricaMoveis {
    private int numCadeiras;
    private int numMesas;
    private int numEstantes;
    private int numSofas;

    public FabricaMoveis(int numCadeiras, int numMesas, int numEstantes, int numSofas) {
        this.numCadeiras = numCadeiras;
        this.numMesas = numMesas;
        this.numEstantes = numEstantes;
        this.numSofas = numSofas;
    }

    public int getNumCadeiras() {
        return numCadeiras;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public int getNumEstantes() {
        return numEstantes;
    }

    public int getNumSofas() {
        return numSofas;
    }

}
