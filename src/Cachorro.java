public class Cachorro extends Animal {
    private String som = "AU AU";

    @Override
    public String toString() {
        return super.toString() + " O Cachorro faz: " + som;
    }
    public Cachorro (String nome, String porte, String raca, String cor, int idade){
        this.setNome(nome);
        this.setPorte(porte);
        this.setRaca(raca);
        this.setCor(cor);
        this.setIdade(idade);
    }
}
