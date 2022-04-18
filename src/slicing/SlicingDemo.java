package slicing;

import picture.Picture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlicingDemo {
    public static void slicingDemo(){
        List<Picture> pictures = new ArrayList<>(Arrays.asList(new Picture("pic1", 20),
                new Picture("pic2", 1),new Picture("pic3", 10),
                new Picture("pic4", 13), new Picture("pic5", 5)
        ));
        //You can use the limit;
        pictures.stream().limit(2)
                .forEach(picture -> System.out.println(picture.getName()));
        //you can use skip
        pictures.stream().skip(1).
                forEach(picture -> System.out.println(picture.getName()));
        //take while that stop when the conditions is true.

        pictures.stream().takeWhile(picture -> picture.getLikes()<10)
                .forEach(System.out::println);
        //we have the the drop while as well.
        pictures.stream().dropWhile(picture -> picture.getLikes()<10)
                .forEach(picture -> System.out.println(picture.getName()));

    }

    public static void main(String[] args) {
        slicingDemo();
    }
}
