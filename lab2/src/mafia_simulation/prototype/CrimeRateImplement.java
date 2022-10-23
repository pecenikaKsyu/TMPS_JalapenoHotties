package mafia_simulation.prototype;

public class CrimeRateImplement implements CrimeRate {

    private Court court;
    private Authorities authorities;
    private CityPower cityPower;

    /**
     * Constructor
     */
    public CrimeRateImplement(Court court, Authorities authorities, CityPower cityPower) {
        this.court = court;
        this.authorities = authorities;
        this.cityPower = cityPower;
    }

    /**
     * Create mage
     */
    public Court createCourt() {
        try {
            return court.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * Create warlord
     */
    public Authorities createAuthorities() {
        try {
            return authorities.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * Create beast
     */
    public CityPower createCityPower() {
        try {
            return cityPower.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}