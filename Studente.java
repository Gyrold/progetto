public class Studente {

    String nome;
    int voto;

    public Studente(String n, int v) {
        nome = n;
        voto = v;
    }

    public void stampa() {
        System.out.println(nome + " - voto: " + voto);
    }
}