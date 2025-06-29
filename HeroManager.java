import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager {
    private ArrayList<Hero> heroes;

    public HeroManager() {
        heroes = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public boolean removeHero(String name) {
        return heroes.removeIf(h -> h.getName().equalsIgnoreCase(name));
    }

    public void bubbleSortByPower() {
        for (int i = 0; i < heroes.size() - 1; i++) {
            for (int j = 0; j < heroes.size() - i - 1; j++) {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }

    public void insertionSortByPower() {
        for (int i = 1; i < heroes.size(); i++) {
            Hero key = heroes.get(i);
            int j = i - 1;
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j--;
            }
            heroes.set(j + 1, key);
        }
    }

    public void displayHeroes() {
        for (Hero h : heroes) {
            System.out.println(h);
        }
    }

    public void displayHeroes2DArray() {
        String[][] array = new String[heroes.size()][3];
        for (int i = 0; i < heroes.size(); i++) {
            array[i][0] = heroes.get(i).getName();
            array[i][1] = String.valueOf(heroes.get(i).getPowerLevel());
            array[i][2] = heroes.get(i).getAffiliation().toString();
        }
        System.out.println(Arrays.deepToString(array));
    }
}
