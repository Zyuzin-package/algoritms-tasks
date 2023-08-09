package src.StreamApiLearn;

import com.google.common.primitives.Ints;
import src.StreamApiLearn.domains.Department;
import src.StreamApiLearn.domains.Employee;
import src.StreamApiLearn.domains.Event;
import src.StreamApiLearn.domains.Position;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    private static List<Employee> emps = List.of(
            new Employee("Michael", "Smith", 243, 43, Position.CHEF),
            new Employee("Jane", "Smith", 523, 40, Position.MANAGER),
            new Employee("Jury", "Gagarin", 6423, 26, Position.MANAGER),
            new Employee("Jack", "London", 5543, 53, Position.WORKER),
            new Employee("Eric", "Jackson", 2534, 22, Position.WORKER),
            new Employee("Andrew", "Bosh", 3456, 44, Position.WORKER),
            new Employee("Joe", "Smith", 723, 30, Position.MANAGER),
            new Employee("Jack", "Gagarin", 7423, 35, Position.MANAGER),
            new Employee("Jane", "London", 7543, 42, Position.WORKER),
            new Employee("Mike", "Jackson", 7534, 31, Position.WORKER),
            new Employee("Jack", "Bosh", 7456, 54, Position.WORKER),
            new Employee("Mark", "Smith", 123, 41, Position.MANAGER),
            new Employee("Jane", "Gagarin", 1423, 28, Position.MANAGER),
            new Employee("Sam", "London", 1543, 52, Position.WORKER),
            new Employee("Jack", "Jackson", 1534, 27, Position.WORKER),
            new Employee("Eric", "Bosh", 1456, 32, Position.WORKER)
    );

    private static List<Department> deps = List.of(
            new Department(1, 0, "Head"),
            new Department(2, 1, "West"),
            new Department(3, 1, "East"),
            new Department(4, 2, "Germany"),
            new Department(5, 2, "France"),
            new Department(6, 3, "China"),
            new Department(7, 3, "Japan")
    );

    private static List<Employee> empsUpdated = new ArrayList<>();


    public static void main(String[] args) {
        List<Employee> updatedEmployee = new ArrayList<>();
        emps.stream().count();
        emps.forEach(e -> {
            int temp = e.getAge();
            temp = temp + 100;
        });

        Map<Integer, Employee> map = emps.stream().collect(
                Collectors.toMap(
                        Employee::getId,
                        e -> e
                )
        );

//        System.out.println(emps.stream().max((Comparator.comparingInt(Employee::getAge))));
//        System.out.println(emps.stream().noneMatch(e -> e.getAge() > 100));
//        System.out.println(emps.stream().anyMatch(e -> e.getPosition() == Position.CHEF));
//        System.out.println(emps.stream().anyMatch(e -> e.getAge() < 100));


//        IntStream intStream = IntStream.of(100, 200, 300, 400, 500);
//
//        List<Event> events = intStream.mapToObj(value ->
//                new Event(UUID.randomUUID(), LocalDateTime.of(value, 12, 1, 1, 0), "")
//        ).collect(Collectors.toList());
//
//
//        emps.stream().dropWhile(employee -> employee.getAge() > 30).forEach(System.out::println);
//        System.out.println("\n");
//        emps.stream().takeWhile(employee -> employee.getAge() > 30).forEach(System.out::println);
//        System.out.println("\n");
//
//        List<Integer>  i = IntStream.of(100, 200, 300, 400, 500).flatMap(value -> IntStream.of(value - 50, value)).boxed().toList();
//

        Stream<Employee> employee = emps.stream()
                .filter(e -> e.getAge() <= 30 && e.getPosition() != Position.WORKER)
                .sorted(Comparator.comparing(Employee::getLastName));
        print(employee);

        Stream<Employee> employee1 = emps.stream()
                .filter(e -> e.getAge() >= 40).limit(4)
                .sorted(Comparator.comparing(Employee::getAge));
        print(employee1);

        Stream<Employee> employeeStream = emps.stream()
                .filter(e -> e.getAge() >= 40)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(4);

        print(employeeStream);

        IntSummaryStatistics statistics = emps.stream()
                .mapToInt(Employee::getAge).summaryStatistics();
        System.out.println(statistics);
    }

    private static void print(Stream<Employee> stream) {
        stream
                .map(emp -> String.format(
                        "%4d | %-15s %-10s age %s %s",
                        emp.getId(),
                        emp.getLastName(),
                        emp.getFirstName(),
                        emp.getAge(),
                        emp.getPosition()
                ))
                .forEach(System.out::println);

        System.out.println();
    }

//            System.out.println(emps.size());
//
//    empsUpdated = emps.stream()
//            .filter(p -> p.getAge() > 20)
//            .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(empsUpdated);
//        System.out.println(empsUpdated.size() + "\n________________");
//
//    empsUpdated = emps.stream()
//            .filter(p -> p.getAge() > 30)
//            .map(p -> new Employee(p.getFirstName(), p.getLastName(), p.getId(), p.getAge() + 100, null))
//            .collect(Collectors.toList());
//        System.out.println(empsUpdated);
//        System.out.println(empsUpdated.size() + "\n________________");
//
//
//    Optional<Employee> employee = emps.stream()
//            .filter(p -> p.getAge()>35)
//            .findAny();
//
//        System.out.println(employee.get()+ "\n________________");
//
//    long count = emps.stream()
//            .filter(p -> p.getAge()>35)
//            .count();
//
//        System.out.println(count+ "\n________________");
//        emps.forEach(employee1 -> employee1.setAge(employee1.getAge()+100));
//        System.out.println(emps);
}
