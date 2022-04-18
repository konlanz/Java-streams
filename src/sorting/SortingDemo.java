package sorting;

import picture.Picture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void showSortedDemo(){
        List<Picture> pictures = new ArrayList<>(Arrays.asList(new Picture("pic1", 20),
                new Picture("pic2", 1),new Picture("pic3", 10),
                new Picture("pic4", 13), new Picture("pic5", 5)
        ));

        //your can sort using comparator
        pictures.stream().sorted((a,b)->a.getLikes().compareTo(b.getLikes()))
                .forEach(picture -> System.out.println(picture.getName()) );
        //using a simple version
        pictures.stream().sorted(Comparator.comparing(Picture::getName))
                .forEach(System.out::println);

        //You can reverse sort by using reverse

        pictures.stream().sorted(Comparator.comparing(Picture::getLikes))
                .forEach(System.out::println);


        var sum =  pictures.stream().map(Picture::getLikes)
                .reduce(Integer::sum).get();
        System.out.println(sum);

        var total = pictures.stream().map(Picture::getName)
                .mapToInt(String::length).sum();
        System.out.println(total);


    }

    public static void main(String[] args) {
        showSortedDemo();
    }
}
