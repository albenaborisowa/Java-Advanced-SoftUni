package GenericCountMethodString;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Box<String>> boxes = new ArrayList<>();
        int linesCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < linesCount; i++) {
            boxes.add(new Box<>(scanner.nextLine()));
        }

        Box<String> elementBox = new Box<>(scanner.nextLine());
        System.out.println(countGreater(boxes, elementBox));
    }

    private static <T extends Comparable<T>> long countGreater(List<Box<T>> boxes, Box<T> elementBox) {
        return boxes.stream()
                .filter(b -> b.compareTo(elementBox) > 0)
                .count();
    }
}

