package File;

import Entity.*;
import java.io.*;
import java.util.*;

public class FileIO {

    public static void loadFromFile(MenuItem[] items) {
        try {
            Scanner sc = new Scanner(new File("./File/Menu.txt"));
            int idx = 0;
            while (sc.hasNextLine() && idx < items.length) {
                String data[] = sc.nextLine().split(";");
                items[idx++] = new MenuItem(data[0], data[1], Double.parseDouble(data[2]));
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Load Error: " + e.getMessage());
        }
    }

    public static void saveChangesInFile(MenuItem[] items) {
        try {
            FileWriter writer = new FileWriter(new File("./File/Menu.txt"));
            for (MenuItem m : items) {
                if (m != null) {
                    writer.write(m.getId() + ";" + m.getName() + ";" + m.getPrice() + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Save Error: " + e.getMessage());
        }
    }
}