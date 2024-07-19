class EncapsulatedObj {
    private String name;
    private int age;
    private int salary;


    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getName(){
       return name;
    }

    public int getAge(){
        return age;
    }

    public int getSalary(){
        return salary;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        EncapsulatedObj obj = new EncapsulatedObj();

        obj.setName("Nerdrover");
        obj.setAge(22);
        obj.setSalary(500000);

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
}
