package GenericSwapMethodString;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Box<String>> boxes = new ArrayList<>();
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            boxes.add(new Box<>(scanner.nextLine()));
        }

        int[] swapIndices = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        swap(boxes, swapIndices[0], swapIndices[1]);
        boxes.forEach(System.out::println);
    }

    private static <T> void swap(List<Box<T>> boxes, int firstIdx, int secondIdx) {
        Box<T> temp = boxes.get(firstIdx);
        boxes.set(firstIdx, boxes.get(secondIdx));
        boxes.set(secondIdx, temp);
    }
}

