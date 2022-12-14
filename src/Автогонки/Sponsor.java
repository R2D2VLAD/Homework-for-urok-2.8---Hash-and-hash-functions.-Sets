package Автогонки;

public class Sponsor {

    private final String name;
    private final String amount;

    public Sponsor(String name, String amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public void toSponsorRace() {
        System.out.println("Спонсор " + getName() + ", проспонсировал заезд на " + getAmount());
    }
}