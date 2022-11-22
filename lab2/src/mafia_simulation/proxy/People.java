package mafia_simulation.proxy;

public class People {

    private String name;

    public People(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
