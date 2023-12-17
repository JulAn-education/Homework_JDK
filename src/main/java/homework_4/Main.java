package homework_4;

public class Main {

    public static void main(String[] args) {


        Directory dir = new Directory();
        dir.newEmployee(new Employee(1, "2326589", "Kate", 5));
        dir.newEmployee(new Employee(2, "1457896", "Tom", 7));
        dir.newEmployee(new Employee(3, "5874236", "Pit", 9));
        dir.newEmployee(new Employee(4, "9652147", "Oleg", 8));
        dir.newEmployee(new Employee(5, "6985321", "Timmy", 6));
        dir.newEmployee(new Employee(6, "4125789", "Poll", 7));

        System.out.println(dir.filterID(1));
        System.out.println(dir.filterByPhone("Timmy"));
        System.out.println(dir.filterByExp(7));



    }
}
