package WordGenerator;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.Arrays;

/**
 * Created by lucky on 1/19/16.
 */
public class Sort {


    public String[] sortAlphabetical(String[] stringList){

        if(stringList.length <= 1)
            return stringList;

        Arrays.sort(stringList);

        return stringList;
    }
}
