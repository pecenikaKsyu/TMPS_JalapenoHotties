package mafia_simulation.observer;

public class CartelMercenaries implements GunFight{

    @Override
    public void update(Status currentState) {
        switch (currentState) {
            case NO_ENEMY:
                System.out.println("Everything clear, capische?");
                break;
            case FIGHT:
                System.out.println("Enemigo avistado, prepárate para luchar");
                break;
            case LOST:
                System.out.println("Run back, rapidooooooo!");
                break;
            case CHANGE_STRATEGY:
                System.out.println("Need to find new way to eliminate the mercenaries, cabron!");
                break;
            case WIN:
                System.out.println("Staff is in our hands,comprendido?");
                break;
            default:
                break;
        }
    }
}
