package practice;

import java8.Constant;
import java8.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {

    int id; String name; boolean isActive;
    Comparator<Employee> a1 = Comparator.comparingDouble(Employee::getSal);
    public static void main(String[] args) {
        List<Employee> eList = Constant.EMP_LIST;
        //Function<Employee, String> func = t -> ;
        List<Employee> collect = eList
                .stream()
                .sorted((o1, o2) -> Double.compare(o1.getSal(), o2.getSal()))
                .collect(Collectors.toList());
        System.out.println(collect);

        //List<Employee> collect1 = eList.stream().sorted().forEach();
    }


}
