package maps;

import picture.Picture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
    public static void showMapDemo(){
        List<Picture> pictures = new ArrayList<>(Arrays.asList(new Picture("pic1", 20),
                new Picture("pic2", 1),new Picture("pic3", 10),
                new Picture("pic4", 13), new Picture("pic5", 5)
        ));

        pictures.stream().map(Picture::getName).forEach(System.out::println);
    }
    public static void showFlatMap(){
        var numbers = Stream.of(List.of(1,5,9,3,5,7), List.of(7,9,4,1,5,6,3));
      //  numbers.forEach(System.out::println);

        //flatten the list to get the numbers;
//        numbers.flatMap(list->list.stream())
//                .forEach(number-> System.out.println(number));
        numbers.flatMap(Collection::stream)
              .forEach(System.out::println);

    }

    public static void main(String[] args) {
        showFlatMap();
        showMapDemo();
    }
}
