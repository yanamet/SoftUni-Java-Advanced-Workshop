package CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<String>();

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String[] commandsArray = input.split("\\s+");
            String command = commandsArray[0];
            switch (command) {
                case "Add":
                    String element = commandsArray[1];
                    customList.add(element);
                    break;

                case "Remove":
                    int index = Integer.parseInt(commandsArray[1]);
                    customList.remove(index);
                    break;

                case "Contains":
                    element = commandsArray[1];
                    System.out.println(customList.contains(element));
                    break;

                case "Swap":
                    int firstIndex = Integer.parseInt(commandsArray[1]);
                    int secondIndex = Integer.parseInt(commandsArray[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;

                case "Greater":
                    String stringToCompare = commandsArray[1];
                    System.out.println(customList.countGreaterThan(stringToCompare));
                    break;

                case "Max":
                    System.out.println(customList.getMax());
                    break;

                case "Min":
                    System.out.println(customList.getMin());
                    break;

                case "Print":
                    customList.print();
                    break;

                case "Sort":
                    Sorter.sort(customList);
                    break;
            }

            input = scanner.nextLine();
        }


    }
}
