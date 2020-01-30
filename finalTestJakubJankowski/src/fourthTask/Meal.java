package fourthTask;

import java.util.ArrayList;

class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void add(String meal) {
        for (String string : meals) {
            if (string.equalsIgnoreCase(meal)) {
                System.out.println("Can't add same meal");
                return;
            }
        }
        meals.add(meal);
    }

    public void print() {
        System.out.println("Available meals:");
        meals.forEach(System.out::println);
    }

    public void clear() {
        meals.clear();
    }
}

