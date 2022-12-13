import mafia_simulation.Singleton;
import mafia_simulation.abstract_factory.factorymethods.SalieriFarm;
import mafia_simulation.abstract_factory.factorymethods.MorelloDocks;
import mafia_simulation.adapter.Capo;
import mafia_simulation.adapter.Interceptor;
import mafia_simulation.builder.*;
import mafia_simulation.composite.MorelloLetter;
import mafia_simulation.composite.SalieriLetter;
import mafia_simulation.composite.abstractions.LetterComposite;
import mafia_simulation.observer.Activity;
import mafia_simulation.observer.CartelMercenaries;
import mafia_simulation.observer.GusMercenaries;
import mafia_simulation.prototype.*;
import mafia_simulation.proxy.BusProxy;
import mafia_simulation.proxy.People;

public class LostHeaven {
    public static void main(String[] args){
        var mafia1 = new SalieriFarm();
        var base = mafia1.createBase();
        var don = mafia1.createDon();
        var crew = mafia1.createCrew();

        var mafia2 = new MorelloDocks();
        var base2 = mafia2.createBase();
        var don2 = mafia2.createDon();
        var crew2 = mafia2.createCrew();

        System.out.println(base.getDescription());
        System.out.println(don.getDescription());
        System.out.println(crew.getDescription());

        System.out.println(base2.getDescription());
        System.out.println(don2.getDescription());
        System.out.println(crew2.getDescription());

        Hero driver =
                new Hero.Builder(Profession.DRIVER, "Ice Pick Willie")
                        .withHairType(HairType.BALD).withWeapon(Weapon.Colt045).build();
        System.out.println(driver);

        Hero  assassin =
                new Hero.Builder(Profession.ASSASSIN, "Ralph De Santo").withHairColor(HairColor.BLACK)
                        .withHairType(HairType.SHORT).withSuit(Suit.PLATE_MAIL).withWeapon(Weapon.SmithWeson)
                        .build();
        System.out.println(assassin);

        Hero gunman =
                new Hero.Builder(Profession.GUNMAN, "Pepe Sopranno").withHairColor(HairColor.BLOND)
                        .withHairType(HairType.CURLY).withWeapon(Weapon.TommyGun).build();
        System.out.println(gunman);


        CrimeRate secondaryCharacters;
        Court court;
        Authorities authorities;
        CityPower cityPower;

        secondaryCharacters = new CrimeRateImplement(new Judge(),new Mayor(), new Police());
        court = secondaryCharacters.createCourt();
        authorities = secondaryCharacters.createAuthorities();
        cityPower = secondaryCharacters.createCityPower();
        System.out.println(court);
        System.out.println(authorities);
        System.out.println(cityPower);

        Singleton singleton = Singleton.getInstance("Detective Norman, your business smells shitty a little bit");
        Singleton anotherSingleton = Singleton.getInstance("Lucas Bertone, house your breaks");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        Capo captain = new Capo((new Interceptor()));
        captain.transport();
        captain.attack();

        BusProxy ship = new BusProxy();
        ship.onBoard(new People("Group A"));
        ship.onBoard(new People("Group B"));
        ship.onBoard(new People("Group C"));
        ship.onBoard(new People("Group D"));
        ship.onBoard(new People("Group E"));
        ship.onBoard(new People("Group F"));
        ship.onBoard(new People("Group G"));
        ship.onBoard(new People("Group H"));
        ship.onBoard(new People("Group I"));


        System.out.println(" The Salieri say: ");

        LetterComposite SalieriMessage = new SalieriLetter().messageFromSalieri();
        SalieriMessage.print();

        System.out.println(" The Morello say: ");
        LetterComposite MorelloMessage = new MorelloLetter().messageFromMorello();
        MorelloMessage.print();

        Activity battles = new Activity();
        battles.addObserver(new GusMercenaries());
        battles.addObserver(new CartelMercenaries());

        battles.timePasses();
        battles.timePasses();
        battles.timePasses();
        battles.timePasses();
        battles.timePasses();

    }
}
