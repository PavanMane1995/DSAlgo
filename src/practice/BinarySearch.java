package practice;

import java8.Constant;
import java8.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {

    // int id; String name; boolean isActive;
    // Comparator<Employee> a1 = Comparator.comparingDouble(Employee::getSal);
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println("Bimary " +binarySearch(arr, 2));

       /* List<Employee> eList = Constant.EMP_LIST;
        //Function<Employee, String> func = t -> ;
        List<Employee> collect = eList
                .stream()
                .sorted((o1, o2) -> Double.compare(o1.getSal(), o2.getSal()))
                .collect(Collectors.toList());
        System.out.println(collect);*/


        //List<Employee> collect1 = eList.stream().sorted().forEach();
    }

    private static int binarySearch(int[] arr, int target) {
        int index = -1;
        int st = 0, end = arr.length-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            System.out.println(mid);
            if (arr[mid] == target) {
                return mid;
                //if(findstart)end = mid - 1;
                //else st = mid+1;
            } else if (arr[mid] > target) {
                end = mid - 1;
                index = mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
                index = mid+1;
            }

        }
    return index;

    }
}
