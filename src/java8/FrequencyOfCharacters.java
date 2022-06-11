package java8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//WAP using stream to find frequency of each character in a given String
public class FrequencyOfCharacters {

    public static void main(String[] args) {

        List<Employee> list = Stream.of(
                new Employee(1, "Pavan", "DEV", 60000),
                new Employee(2, "Vijay", "TEST", 50000.0),
                new Employee(3, "Khaja", "DEV", 50000.0),
                new Employee(4, "Venkatesh", "DEV", 50000.0),
                new Employee(5, "Ram", "CIVIL", 50000.0),
                new Employee(6, "Sanjay", "TEST", 50000.0)
        ).collect(Collectors.toList());


        Map<String, Long> collect = list.stream().map(Employee::getDept).collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );
        //System.out.println(collect);

        Map<String, Long> collect1 = list.stream().collect(
                Collectors.groupingBy(Employee::getDept, Collectors.counting())
        );
        System.out.println(collect1);
    }
}
