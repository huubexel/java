import java.util.*;

public class MyMenu {

    private final Map<Integer, PlayerAction> actions;
    private boolean isInCombat;

    public MyMenu() {
        actions = new HashMap<>();
        actions.put(0, DoNothingAction());
        actions.put(1, LookAroundAction());
        actions.put(2, FightAction());
    }

    public List<String> printMenuOptions() {
        // Or you could also print the menuOptions right here
        // since the method is called printMenuOptions.
        List<String> menuOptions = new ArrayList<>();
        menuOptions.add("What do you want to?");
        menuOptions.add("\t0) Do nothing");
        menuOptions.add("\t1) Look around");
        if (isInCombat) {
            menuOptions.add("\t2) Fight!");
        }
        return menuOptions;
    }

    public void doOption() {
        int option = getNumber();
        if (actions.containsKey(option)) {
            switch (option) {
                case 2:
                    if (isInCombat) {
                        actions.get(option).execute();
                    }
                    break;
                case 1:
                case 0:
                    actions.get(option).execute();
                    break;
            }
        } else {
            System.out.println("Sorry, that is not an option!");
        }
    }

    public int getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}