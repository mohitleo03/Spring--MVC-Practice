package bean_life;
public class Basketball implements ICoach
{
    private IFortune ifortune;
    public Basketball()
    {
        System.out.println("Program in constructor");

    }
    public IFortune getIfortune()
    {
        return ifortune;
    }
    public void setIfortune(IFortune ifortune)
    {
        this.ifortune = ifortune;
    }
    @Override
    public String getDailyFortune()
    {
        // TODO Auto-generated method stub
        return ifortune.getFortune();
    }
    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice 3 hrs daily";
    }
    public void startplay()
    {
        System.out.println("init method call");
    }
    public void stopplay()
    {
        System.out.println("Destroy method call");
    }
}