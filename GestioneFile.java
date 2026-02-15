import java.io.*;

public class GestioneFile {

    public static void salvaStudenti(Studente[] studenti) {

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("studenti.txt"));

            for (int i = 0; i < studenti.length; i++) {
                pw.println(studenti[i].nome + ";" + studenti[i].voto);
            }

            pw.close();

        } catch (IOException e) {
            System.out.println("Errore scrittura file");
        }
    }


    public static Studente[] leggiStudenti() {

        Studente[] elenco = new Studente[10];
        int cont = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("studenti.txt"));

            String riga;

            while ((riga = br.readLine()) != null) {

                String[] parti = riga.split(";");

                String nome = parti[0];
                int voto = Integer.parseInt(parti[1]);

                elenco[cont] = new Studente(nome, voto);
                cont++;
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Errore lettura file");
        }

        return elenco;
    }
}