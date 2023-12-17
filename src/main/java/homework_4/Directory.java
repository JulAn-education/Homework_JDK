package homework_4;
/*
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник сотрудников
 */

import java.util.ArrayList;
import java.util.List;


public class Directory {

   private List<Employee> employeeList;

    public Directory() {
        this.employeeList = new ArrayList<>();
    }

    public List<Employee> filterByExp(int exp){
        List<Employee> list1 = new ArrayList<>();
        for (Employee employee: employeeList) {

            if(employee.getExp() == exp){
                list1.add(employee);
            }
        }
        //return employeeList.stream().filter(employee -> employee.getExp()>= exp).collect(Collectors.toList());
        return list1;
    }

    public List<String> filterByPhone(String name){
        List<String> listPhone = new ArrayList<>();
        for(Employee employee : employeeList){
            if(employee.getName().equals(name)){
                listPhone.add(employee.getPhoneNumber());
            }
        }
        //return employeeList.stream().filter(employee -> employee.getName().equals(name))
        //        .map(Employee::getPhoneNumber).collect(Collectors.toList());
        return listPhone;
    }

    public Employee filterID(int id){
        for (Employee employee : employeeList) {
            if(employee.getId() == id){
               return employee;
            }
        }
        return new Employee();

    }

    public void newEmployee(Employee employee){

        employeeList.add(new Employee(employee.getId(), employee.getPhoneNumber(),
                employee.getName(), employee.getExp()));


    }


}
