package streamsapiquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountAndAvg {
    public static void main(String[] args) {
       List<Employee> employeeList= Arrays.asList(
                new Employee(1,"kevin",27,"Male",12000),
                new Employee(2,"messi",38,"Male",200000),
                new Employee(3,"nadal",42,"Male",100000),
                new Employee(4,"gkr",28,"Male",80000),
                new Employee(5,"admas",21,"Female",900000),
                new Employee(6,"natalia",24,"Female",40000));
        /**
         *  Find the average of **salary** by male and female
         *  Count the employees by gender
         */

        Map<String, Long> genderCount = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(" GenderCount = " + genderCount);
        Map <String,Double> countAverage = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(" Average Salary = " + countAverage);
    }
}
