package com.multithreading.pools.generics.unbound;

/**
 * Created by RANGAREJ on 6/6/2018.
 */
public class Main {
    public static void main(String[] args) {
        Data<Integer> integerData = new Data<>(10);
        integerData.info();
        System.out.println(integerData.getData());
        Data<Long> longData = new Data<>(10L);
        longData.info();
        System.out.println(longData.getData());
        Data<Employee> employeeData=new Data<>(new Employee(10,"ranga"));
        employeeData.info();
        System.out.println(employeeData.getData());
    }

}

class Data<T> {
    private T t;

    public Data(T t) {
        this.t = t;
    }

    public void info() {
        System.out.println(t.getClass().getName());
    }

    public T getData() {
        return t;
    }
}
class Employee{
    int empId;
    String eName;

    public Employee(int empId, String eName) {
        this.empId = empId;
        this.eName = eName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", eName='" + eName + '\'' +
                '}';
    }
}