/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Manoj Nuvvala
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> enmployees = new ArrayList<>();
        System.out.println("Answer for question 12: MANOJ NUVVALA");

        enmployees.add(new Employee(01, "Iron Man", 100000));
        enmployees.add(new Employee(02, "Thor", 90000));
        enmployees.add(new Employee(03, "Captian America", 87000));
        enmployees.add(new Employee(07, "Hulk", 79000));
        enmployees.add(new Employee(25, "Hawk Eye", 65000));
        enmployees.add(new Employee(145, "Black widow", 5000));
        enmployees.add(new Employee(04, "Thanos", 99999));
        System.out.println("****************Original list**************");
        for (Employee employee : enmployees) {
            System.out.println(employee);
        }
        System.out.println("*****************Sorted based on id************");
        Collections.sort(enmployees);
        for (Employee employee : enmployees) {
            System.out.println(employee);
        }

        Collections.sort(enmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
            }
        });
        System.out.println("***************Sorted based on salary***********");
        for (Employee employee : enmployees) {
            System.out.println(employee);
        }

        Collections.sort(enmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return arg0.getEmpName().compareTo(arg1.getEmpName());
            }
        });
        System.out.println("**************Sorted based on name************");
        for (Employee employee : enmployees) {
            System.out.println(employee);
        }
    }
}
