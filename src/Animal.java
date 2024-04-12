public class Animal {
    private String nome;
    private String porte;
    private String raca;
    private String cor;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Animal(){
    }

    public Animal(String nome, String porte,String raca, String cor,int idade){
        this.nome = nome;
        this.porte  = porte;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }

    @Override
    public String toString() {
        String s = "Nome = " + nome + " Porte = " + porte +
                 " Raça = " + raca +
                " Idade = " + idade + " Cor = " + cor;
        return s;
    }

}
