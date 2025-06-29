public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        manager.addHero(new Hero("Rocket Racoon", 85, Affiliation.GUARDIANS_OF_THE_GALAXY));
        manager.addHero(new Hero("Batman", 80, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 88, Affiliation.X_MEN));
        manager.addHero(new Hero("Invisible Woman", 75, Affiliation.FANTASTIC_FOUR));

        System.out.println("Original List:");
        manager.displayHeroes();

        System.out.println("\nSorted by Bubble Sort:");
        manager.bubbleSortByPower();
        manager.displayHeroes();

        System.out.println("\nSorted by Insertion Sort:");
        manager.insertionSortByPower();
        manager.displayHeroes();

        System.out.println("\nRemoving Batman:");
        manager.removeHero("Batman");
        manager.displayHeroes();

        System.out.println("\nAdding Wonder Woman:");
        manager.addHero(new Hero("Wonder Woman", 90, Affiliation.JUSTICE_LEAGUE));
        manager.displayHeroes();

        System.out.println("\nDisplay in 2D Array Format:");
        manager.displayHeroes2DArray();
    }
}
