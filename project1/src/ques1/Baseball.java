package ques1;

public class Baseball implements coach{
    private Ifortune ifortune;


    public Baseball(Ifortune ifortune) {
        this.ifortune = ifortune;
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice Baseball";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return ifortune.getFortune();
    }

}