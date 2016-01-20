package WordGeneratorTester;

import WordGenerator.Sort;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lucky on 1/19/16.
 */
public class SortUnitTest {

    @Test
    public void sortAlphabeticalTest(){
        Sort sorter = new Sort();
        String[] strings = {"ABC", "OOP", "JLV","ZZZ", "AAAAAA", "AAABBBA","ASDF"};
        String[] sortedStrings = sorter.sortAlphabetical(strings);

        int compareResult;
        boolean sorted = false;

        for(int i = 1; i < sortedStrings.length ; i++){
            compareResult = sortedStrings[i].compareToIgnoreCase(sortedStrings[i-1]);
            if (compareResult<=0){
                sorted = false;
                break;
            }
            else sorted = true;
        }

        assertTrue(sorted);



    }


}
