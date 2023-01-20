package interviewPreparation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class FindTheMaxNumberInArray {
    public static void main(String[] args) {
        Integer[]a=new Integer[]{1,2,3,4,5,6,0,5,9,8,7};

        List<Integer> integerList= Arrays.asList(a);

     int i= integerList.stream().max(Comparator.comparingInt(Integer::intValue)).get();
     IntSummaryStatistics j=integerList.stream().mapToInt(value -> i).summaryStatistics();
        System.out.println( "Sum "+j.getSum());

        System.out.println("Max Num" +i);


        LocalDate localDate=  LocalDate.now();

        LocalDate localDate1=localDate.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));





    }
}
