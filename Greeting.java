interface Greeting_1 {
    void greet();    
}

class Greeting_2 implements Greeting_1 {
    public void greet() {
        System.out.println("Hello, welcome to the Greeting_2");
    }
}

public class Greeting {
    public static void main(String[] args) {
        Greeting_1 a = new Greeting_2();
        a.greet();

        Greeting_1 b = new Greeting_1() {
            public void greet(){
                System.out.println("Hello from anonymous class!");
            }
        };

        b.greet();
    }
}

//Comparison between Named Class and Anonymous Inner Class:

/*
1. Named class has a class name, while anonymous class has no name.
 
2. Named class is written separately, while anonymous class is written at the time of creating the object.
 
3. Named class can be used again to create multiple objects.
 
4. Anonymous class is mainly useful when we need the implementation only once.
 
5. Named class is better for bigger or reusable code.
 
6. Anonymous class is useful for small and simple implementations.
 */
