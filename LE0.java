class Student {
    String name;
    int age;
    
    void setName(String name) {
        this.name = name;
    }
    
    void setAge(int age) {
        this.age = age;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
}

public class LE0
{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("John");
		s1.setAge(21);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}
}
