public abstract class Pessoa{
    private String nome;
    private String cpf;
    private boolean status;


    public Pessoa(String nome, String cpf, boolean status) {
        this.nome = nome;
        this.cpf = cpf;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    

    public String verificarStatus(){
        if (isStatus() == false){
            return "INATIVO";
        }
        else{
            return "ATIVO";
        }
    }
}