public class Main {

    public static void main(String[] args) {

        Studente[] studenti = new Studente[3];

        studenti[0] = new Studente("Luca", 7);
        studenti[1] = new Studente("Anna", 5);
        studenti[2] = new Studente("Marco", 9);

        // Salva su file
        GestioneFile.salvaStudenti(studenti);

        // Legge dal file
        Studente[] letti = GestioneFile.leggiStudenti();

        System.out.println("Studenti letti dal file:");

        int somma = 0;
        int cont = 0;

        for (int i = 0; i < letti.length; i++) {

            if (letti[i] != null) {
                letti[i].stampa();
                somma += letti[i].voto;
                cont++;
            }
        }

        if (cont > 0) {
            double media = somma / (double) cont;
            System.out.println("Media: " + media);
        }
    }
}