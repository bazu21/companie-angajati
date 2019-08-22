public class Productie extends Departament implements Evaluator {

     ////static final  = constanta
    ////nume = "productie"
    //nivelComp = 3

    public Productie() {
        super("Productie", 3);
    }

    public StatusCandidat evalueaza(Candidat candidat){
         //implementata din evaluator

        if (candidat.getNivelDeCompetenta() > super.getNivelMinimDeCompetente()) {

            return StatusCandidat.ACCEPTAT;

        }else if (candidat.getNivelDeCompetenta()< super.getNivelMinimDeCompetente()){

            return StatusCandidat.RESPINS;


        }else{
            return StatusCandidat.IN_ASTEPTARE;

        }
    }

     }


