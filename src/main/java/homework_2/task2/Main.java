package homework_2.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Developer> developers = new ArrayList<>();


        developers.add(new Frontender());
        developers.add(new Backender());
        developers.add(new FullStack());
        developers.add(new Frontender());

        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i) instanceof Frontender) {
                (developers.get(i)).developGUI();
            }
        }
    }
}
