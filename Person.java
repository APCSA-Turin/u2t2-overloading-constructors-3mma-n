public class Person {
    private String name;
    private int fullness;
    private int starveRate;
    private String hungerString;
    public Person(String name, int fullness, int starveRate) {
        this.name = name;
        this.fullness = Math.random();
        this.starveRate = starveRate;
    }
    public starve() {
        fullness -= starveRate;
    }
    public setHungerString() {
        if (fullness > 100) {
            hungerString = "stuffed";
        }
        else if (fullness > 90) {
            hungerString = "plenty full";
        }
        else if (fullness > 75) {
            hungerString = "somewhat full";
        }
        else if (fullness > 50) {
            hungerString = "a little hungry";
        }
        else if (fullness > 25) {
            hungerString = "pretty hungry";
        }
        else if (fullness > 10) {
            hungerString = "very hungry";
        }
        else if (fullness > 0) {
            hungerString = "starving";
        }
        else {
            hungerString = "dead";
        }
    }
    public void eatFood(int foodVal) {
        fullness += foodVal;
        int currentString = hungerString;
        setHungerString();
        if (currentString == hungerString) {
            System.out.println(name + " feels a little better, but is still" + hungerString + ".");
        }
        else {
            System.out.println(name + " is no longer" + currentString + ", and is now " + hungerString + ".");
        }
    }
    public boolean printDetails() {
        if (fullness > 0) {
            System.out.println(name + " is " + hungerString + "!");
            return false;
        }
        else {
            System.out.println(name + "has passed away.");
            return true;
        }
    }
}