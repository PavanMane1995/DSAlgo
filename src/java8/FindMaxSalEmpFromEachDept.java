package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMaxSalEmpFromEachDept {
    public static void main(String[] args) {
        List<Employee> empList = Constant.EMP_LIST;

        //Approach 1
        Map<String, Optional<Employee>> collect = empList.stream().collect(
                Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSal))))
        );
        System.out.println(collect);

        //Approach 2

        Map<String, Employee> collect1 = empList.stream()
                .collect(Collectors.toMap(Employee::getDept, Function.identity(), BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSal))));
        System.out.println(collect1);
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}
