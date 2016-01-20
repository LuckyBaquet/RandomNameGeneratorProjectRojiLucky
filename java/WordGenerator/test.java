package WordGenerator;

import java.util.Arrays;

/**
 * Created by lucky on 1/20/16.
 */
public class test {



    public static void main(String[] args) {

      String[] stringArray = {"apple", "b","cat","deeeedd"};

        int count = 0;
        for(String name:stringArray){
            System.out.println(Arrays.toString(stringArray));
            stringArray[count] = "New Name";
            count++;

        }

        System.out.println(Arrays.toString(stringArray));


    }



}

