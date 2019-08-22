public class Marketing  extends Departament implements Evaluator {


    ////static final  = constanta
    ////nume = "marketing"
    //nivelComp = 6


    public Marketing() {
        super("Marketing", 6);
    }

    public StatusCandidat evalueaza(Candidat candidat) {
        //implementata din interfata evaluator

        if (candidat.getNivelDeCompetenta() > super.getNivelMinimDeCompetente()) {

            return StatusCandidat.ACCEPTAT;

        }else if (candidat.getNivelDeCompetenta()< super.getNivelMinimDeCompetente()){

        return StatusCandidat.RESPINS;


    }else{
    return StatusCandidat.IN_ASTEPTARE;

}
 }
}

