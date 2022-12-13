package mafia_simulation.observer;

public class GusMercenaries implements GunFight {

    @Override
    public void update(Status currentState) {
        switch (currentState) {
            case ATTACK:
                System.out.println("Good guys attacked the bad a**holes");
                break;
            case FIGHT:
                System.out.println("While we have ammo we will fight");
                break;
            case WIN:
                System.out.println("There are no cabron left on battlefield");
                break;
            case LOST:
                System.out.println("**NO SIGNAL**");
                break;
            case RETURN:
                System.out.println("Crew is K.I.A.");
                break;
            default:
                break;
        }
    }
}
