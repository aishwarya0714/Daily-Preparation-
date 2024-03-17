# Static Members

```
// Static members
class Student{
    String name; //instance veriable
    int roll_no; //instance veriable
    static String clg; //static  veriable
    
    // instance method to print values
    public void show(){
        System.out.println(name+":"+roll_no+":"+clg);
    }
    
    // static methos to print values - to use instance varibale with static method pass obj into it
    public static void show1(Student obj){
        System.out.println(obj.name+":"+obj.roll_no+":"+clg);
    }
    
}
class HelloWorld {
    public static void main(String[] args) {
    //   create an  object to access instance variables
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    
    s1.name="Aishwarya";
    s1.roll_no=1;
    
    s2.name="Sudiksha";
    s2.roll_no=2;
    
    s3.name="Anita";
    s3.roll_no=3;
    
    // to access static memebers from class use class name 
    
    Student.clg="MU";
    
    // if you want to access static methods also u have to use class name other wise use obj to access them
    
    s1.show();
    s2.show();
    
    // call instace variables with static method bu passing obj name
    Student.show1(s3);
    
    }
}
```

<img width="116" alt="image" src="https://github.com/aishwarya0714/Daily-Preparation-/assets/136805991/62ee1285-4aac-4912-ab33-2c40482d4ec7">

