package com.ConstructorInjection;

public class BaseballCoach implements ICoach2 {




    private IFortune ifortune;
    private String name;
    private String email;
    private String teamName;
    private Address address;

    public BaseballCoach(IFortune ifortune, String name, String email, String teamName, Address address) {
        this.ifortune = ifortune;
        this.name = name;
        this.email = email;
        this.teamName = teamName;
        this.address = address;
    }
    @Override
    public String toString() {
        return "BaseballCoach{" +
                "ifortune=" + ifortune +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", teamName='" + teamName + '\'' +
                ", address=" + address +
                '}';
    }

//    public IFortune getIfortune() {
//        return ifortune;
//    }
//
//    public void setIfortune(IFortune ifortune) {
//        this.ifortune = ifortune;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getTeamName() {
//        return teamName;
//    }
//
//    public void setTeamName(String teamName) {
//        this.teamName = teamName;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }


    @Override
    public String getDailyWorkout() {
        return "Practice Daily";
    }

    @Override
    public String getFortune() {
        return ifortune.getFortune();
    }

//    @Override
//    public String getName() {
//        return name;
//    }
}
