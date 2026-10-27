class Student{
    private String name;
    private double gpa;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name ; 
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
}


public class main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aashish @Codingal");
        s.setGpa(4.5);
        s.setAge(23);
        System.out.println(s.getName());
        System.out.println(s.getGpa());
        System.out.println(s.getAge());
    }
}
