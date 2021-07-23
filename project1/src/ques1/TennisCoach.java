package ques1;

public class TennisCoach implements Coach {

    //define a private field for dependency
    private Ifortune ifortune;
    public TennisCoach(Ifortune ifortune) {
        this.ifortune=ifortune;
    }
    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice Tennis";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return ifortune.getFortune();
    }

}