package src.LyambdaLearning;

import src.StreamApiLearn.domains.Department;
import src.StreamApiLearn.domains.Employee;
import src.StreamApiLearn.domains.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda {
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

    interface Function<T1, T2, R> {
        R apply(T1 arg1, T2 arg2);
    }

    public static void main(String[] args) {
//        Function<Integer, Integer,Integer> function = (x,y) -> x+y;
//        System.out.println(function.apply(3,6));
//
//        emps.forEach(employee -> employee.setAge(employee.getAge()+1));
//
//        int ages = emps.stream()
//                .reduce(0,(integer, employee) -> integer+employee.getAge(),Integer::sum);
//        System.out.println(ages);
//
//        add(emps.get(1)::getFirstName,emps.get(1)::setLastName);
//        System.out.println(emps.get(1).toString());


        EmpInfo empInfo = new EmpInfo();
        empInfo.testEmp(emps, new EmpCheck() {
            @Override
            public boolean check(Employee e) {
                return false;
            }
        });

        empInfo.testEmp(emps, (Employee e) -> e.getAge() > 30);

    }

    static class EmpInfo {
        void testEmp(List<Employee> employees, EmpCheck empCheck) {
            for (Employee e : employees) {
                if (empCheck.check(e)) {
                    System.out.println(e);
                }
            }
        }
    }

    interface EmpCheck {
        boolean check(Employee e);
    }

    static class checkOverate implements EmpCheck {

        @Override
        public boolean check(Employee e) {
            return e.getAge() > 30;
        }
    }
//    public static void add(Supplier<String> stringSupplier, Consumer<String> stringConsumer){
//        stringConsumer.accept(stringSupplier.get());
//    }
}
