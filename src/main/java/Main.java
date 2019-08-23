import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Companie companie = new Companie("SDA");

        Departament departamentMarketing = new Marketing();
        Departament departamentProductie = new Productie();
        Departament departamentHr = new Departament("Hr", 5);


        List<Departament> departamente = new ArrayList<>();

        departamente.add(departamentMarketing);
        departamente.add(departamentProductie);
        departamente.add(departamentHr);

        companie.setDepartamente(departamente);//adaugat

        Candidat candidat1 = new Candidat("Pop", "Ionut", 10, "Marketing");
        Candidat candidat2 = new Candidat("Pop", "Andreea", 1, "Productie");
        Candidat candidat3 = new Candidat("Pop", "Andreea", 7, "Productie");
        Candidat candidat4 = new Candidat("Pop", "Andreea", 3, "HR");

        List<Candidat> candidati = new ArrayList<>();
        candidati.add(candidat1);
        candidati.add(candidat2);
        candidati.add(candidat3);
        candidati.add(candidat4);

        companie.setAngajati(candidati);

//print in consola candidati dupa recrutare

        ///scriere in fisier candidatii dupa recrutare

        try {
            companie.recruteaza();

        } catch (IncapacitateEvaluare evaluare) {

        }
        writeCandidatesToTxtFile(companie.getAngajati());
    }

    public static void writeCandidatesToTxtFile(List<Candidat> candidats) {
        BufferedWriter writer = null;

        try {

            writer = new BufferedWriter(new FileWriter("candidati.txt"));
            writer.write(candidats.toString());

        } catch (
                IOException evaluare) {

        } finally {

            try {
                writer.close();

            } catch (IOException evaluare) {


            }

        }

    }
}

///fisier.json stocheaza txt
//key:value
//countries:[
//  { country
//   name:"canada"
//  moneda:"euro"
//   }
// 1 deschid fisierul(dau numele)
// 2 ce scriu? (string,char,byte)
// 3 inchid fisierul
// arunca exceptii IOException (exceptie de tip check)

// finally se executa intotdeuna
// clasa tuturor exceptiilor "throwable"

// colectii - list si maps
// list - arraylist,linkedlist
// add adauga elemente in array
// set - hashcode ()-
// maps - specific "key" si "value" care pot sa fie orice obiect
// se adauga elemente cu "put".
//verificam daca ii goala sau nu cu "size" sau "empty"
//

// final = la metode (nu poate fi supra scrisa
// final = clasa(nu poate fi extends de alte clase )
// static = variabila sau metoda (apartine clasei,toate variabilele au acelasi nume)
//interfata = sunt niste definitii de metode care le lipseste implementarea (nu are body)
//          = fiecare clasa care preia interf trebuie sa fie implementata
//          = public default test() - esti obligat sa implementezi si are body
//          = variabilele din interfata pot sa fie constante "public final"
//          = nu avem constructor
//          = nu poti sa ai "new",nu poti instantia
//abstract = fara implementare
//         = nu are body(implementare)
//         = poate fi mostenita
//         = nu are constructor
//         = poate fi extinsa
