import mafia_simulation.abstract_factory.factorymethods.SalieriFarm;
import mafia_simulation.abstract_factory.factorymethods.MorelloDocks;
import mafia_simulation.builder.*;
import mafia_simulation.prototype.*;

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

    }
}
