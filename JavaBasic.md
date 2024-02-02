# String 🚀

### Concepts
1. String Pool
   - object of string will be stored in pool.
2. Immutability
   - If you want to make changes in in existing string.. it will not do that.. instead it will create a new object of that string
   - Why String objects are immutable in Java?💡
     
As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin". If one reference variable changes the value of the object, it will be affected by all the reference variables. That is why String objects are immutable in Java.
  
### to deal with this java has stringbuilder class
- StringBhilder in mutable.


## Serialization in java:

- saving state of object in to the file
- process of converting an object (stored in heap memory) form java supproted form to network or file supproted form.
#### implimentation:

![8055b9bb-e0d3-4018-a6d9-77b853ee70cd](https://github.com/aishwarya0714/Daily-Preparation-/assets/136805991/a33d9623-4883-4a89-b17b-a39ea2a1a45b)

## Deserialization in java:

- reading state of object from the file
- process of converting an object (stored in heap memory) form network or file supproted form to java supproted form.
#### implimentation:

![ca48e34f-1767-49ef-8f41-18161eb58d99](https://github.com/aishwarya0714/Daily-Preparation-/assets/136805991/3fbc81a6-a699-48a2-87f8-d72769b68498)



![WhatsApp Image 2024-01-06 at 9 18 53 PM](https://github.com/aishwarya0714/Daily-Preparation-/assets/136805991/00556cf8-91be-4c69-8ba3-4bdd6a04d759)

##### code:

```
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
    int i = 10;
    int j= 20;
}
public class SerializationDemo {
    public static void main(String[] args)throws Exception{
    Dog d1 = new Dog();
// Serialization
    FileOutputStream fs = new FileOutputStream("demo.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fs);
    oos.writeObject(d1);

    // DeSerializationDemo
    FileInputStream fi = new FileInputStream("demo.txt");
    ObjectInputStream ois = new ObjectInputStream(fi);
    Dog d2 = (Dog)ois.readObject();
    System.out.println(d2.i+d2.j);
    }
}

```

- Serializable Interface comes under java.io
- it dont contains any method (required ability can be provided by JVM).
- "if you want to serialize an object it should be serialize object and class should implement serializable object".


### String Literal
- object of string will be stored in string constant pool.

### new Keyword
- it will create object of string outside pool in heap memory.

<img width="244" alt="image" src="https://github.com/aishwarya0714/Daily-Preparation-/assets/136805991/2d5f1597-1e00-4d41-a6fa-f51d8cb5674f">

## String Methods

### 1. charAt() - 
   ```
class HelloWorld {
    public static void main(String[] args) {
        String s = "Sudiksha sss";
        int count1 = 0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='s'){
                count1++;
            }
        }
        System.out.println(count1);     
    }
} 
```
   ##### ⚠️ Exception - StringIndexOutOfBoundsException

### 2. compareTo() -
   The compareTo() method compares two strings lexicographically.

   ##### ⚠️ Exception - ClassCastException: If this object cannot get compared with the specified object. 
   ##### NullPointerException: If the specified object is null.

### 3. concat() - 
   combine string at the end of string 
   
### 4. contains() - 
   check if specified char is present in string and return True else return false.

   ⌛Limitations -
      1. he contains() method should not be used to search for a character in a string. Doing so results in an error.
      2. The contains() method only checks for the presence or absence of a string in another string. 
      3. It never reveals at which index the searched index is found. Because of these limitations, it is better to use the indexOf() method instead of the contains() method.

 ##### ⚠️ Exception - NullPointerException

### 5. equals() - 
      comapres the content of string.

### 6. endsWith() - 
      checks if string ends with given string.

### 7. equalsIgnoreCase() - 
   The Java String class equalsIgnoreCase() method compares the two given strings on the basis of the content of the string irrespective of the case (lower and upper) of the string

### 8. format() - 
   The java string format() method returns the formatted string by given locale, format and arguments.
```
String s5 = String.format("value is %f", 14.5);
System.out.println(s5);
```
   
```
      public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        String s3= "aes";
        // 2. compareTo()
        System.out.println(s.compareTo(s1));
        System.out.println(s.compareTo(s3));
        // 3. concat() 

        System.out.println(s.concat(s3));

        // 4. contains()
        System.out.println(s.contains("e"));

        // 5. endsWith()
        System.out.println(s.endsWith("a"));
    }
}
```
# Functions/Methods 🚀
- Static int fun() - return - end of function
- Static void fun() - sout 
