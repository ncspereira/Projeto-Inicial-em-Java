public class Gato extends Animal {
    private String som = "MIAU MIAU";

    @Override
    public String toString() {
        return super.toString() + " O Gato faz: " + som;
    }
    public Gato (String nome, String porte, String raca, String cor, int idade){
        this.setNome(nome);
        this.setPorte(porte);
        this.setRaca(raca);
        this.setCor(cor);
        this.setIdade(idade);
    }
}

