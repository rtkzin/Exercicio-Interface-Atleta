public class Triatleta extends Pessoa implements Ciclista, Corredor, Nadador {
    public void correr() {
        System.out.println(getNome() + " corre.");
    }
    public void pedalar() {
        System.out.println(getNome() + " pedala.");
    }
    public void nadar() {
        System.out.println(getNome() + " nada.");
    }
    public void aquecer() {
        System.out.println(getNome() + " tem que aquecer antes do treino.");
    }
}
