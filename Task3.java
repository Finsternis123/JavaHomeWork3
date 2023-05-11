package JavaWork.JavaHomeWork.JavaHomeWork3;


import java.util.Collections;
import java.util.ArrayList;

public class Task3 {

    public static int count(ArrayList<String> planets, String word) {
        return Collections.frequency(planets, word);
    }

    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Земля");
        planets.add("Уран");
        planets.add("Венера");
        planets.add("Уран");
        planets.add("Меркурий");
        planets.add("Земля");

        System.out.println(planets);
        System.out.println("Количество планет: " + planets.size());

        for (int i = 0; i < planets.size(); i++) {
            int value = 0;
            if (count(planets, planets.get(i)) > 1) {
                value++;
                System.out.println(planets.get(i) + " = " + value);
            }
              else {
                  System.out.println(planets.get(i) + " = 1");      
            }
        }
    }
}

