public class TesteTriatleta {
    public static void main (String[] args) {

        Triatleta triatleta = new Triatleta();
        triatleta.setNome("Kristian Blummentfelt");

        triatleta.aquecer();
        triatleta.nadar();
        triatleta.pedalar();
        triatleta.correr();
    }
}