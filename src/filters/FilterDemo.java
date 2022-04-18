package filters;

import picture.Picture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo {
    public static void showFilterDemo(){
        List<Picture> pictures = new ArrayList<>(Arrays.asList(new Picture("pic1", 20),
                new Picture("pic2", 1),new Picture("pic3", 10),
                new Picture("pic4", 13), new Picture("pic5", 5)
        ));

        //using streams
       var countPicture = pictures.stream().filter(picture -> picture.getLikes()>8).count();
        System.out.println(countPicture);
        //you can perform any filtering with the filter function the streams
       var getPic2 = pictures.stream().filter(picture -> picture.getName().equals("pic3")).toArray();
        System.out.println(getPic2[0]);

    }

    public static void main(String[] args) {
        showFilterDemo();
    }
}
