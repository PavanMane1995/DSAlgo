package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Constant {

    public final static List<Employee> EMP_LIST = Stream.of(
            new Employee(1, "Pavan", "DEV", 60000),
            new Employee(2, "Vijay", "TEST", 50100.0),
            new Employee(3, "Khaja", "DEV", 51000.0),
            new Employee(4, "Venkatesh", "DEV", 20000.0),
            new Employee(5, "Ram", "CIVIL", 40000.0),
            new Employee(6, "Sanjay", "TEST", 50100.0)
    ).collect(Collectors.toList());
}
