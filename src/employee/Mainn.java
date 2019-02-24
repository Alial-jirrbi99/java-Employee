/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER E15
 */
public class Mainn {
     public static void main(String[] args) {
        
        Employee[] employee = new Employee[10];

        for (int i = 0; i < employee.length; i++) {

            Employee emp = new Employee();
            /*
                Enter The Enformation 
            */  
            System.out.println("Enter a employee information : ");
            
            emp.setName(JOptionPane.
                    showInputDialog(null, "Name", "Employee",
                            JOptionPane.INFORMATION_MESSAGE));
            
            emp.setDepartment(JOptionPane.
                    showInputDialog(null, "Department", "Employee",
                            JOptionPane.INFORMATION_MESSAGE));
            
            emp.setSalary(Double.parseDouble(JOptionPane.
                    showInputDialog(null, "Salary", "Employee",
                            JOptionPane.INFORMATION_MESSAGE)));
            employee[i] = emp;
        }
        
        sortArray(employee);
        showData(employee);

    }

    public static void sortArray(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            for (int j = i + 1; j < e.length-1; j++) {
                if (e[j].getSalary() > e[i].getSalary()) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
    }
    private static void showData(Employee[] e){
        System.out.printf("%-10s%-15s%-13s\n","Name","Department","Salary");
        for (Employee employee : e) {
          
            System.out.printf("%-10s%-15s%-15.2f\n",
                    employee.getName(),
                    employee.getDepartment(),
                    employee.getSalary());
        }
    }
}

