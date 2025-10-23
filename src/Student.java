public class Student {
    String name;
    int age ;
    boolean isJunior;
    char gender;

    public Student(){
        name = " ";
        age = 0;
        isJunior = false;
        gender = 'm';
    }
    public Student(String name,int age,boolean isJunior,char gender){
        this.name= name;
        this.age=age;
        this.isJunior=isJunior;
        this.gender = gender;
    }
    public void info(){
        System.out.println("name" + age );
        System.out.println("Age: " + age);
        System.out.println("isJunior: " + isJunior);
        System.out.println("Gender: " + gender);
    }
}
