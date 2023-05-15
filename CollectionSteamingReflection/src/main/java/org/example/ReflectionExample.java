package org.example;
import java.lang.reflect.*;

public class ReflectionExample {
    private int intValue;
    private String stringValue;

    public ReflectionExample(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }
    public int getIntValue() {
        return intValue;
    }
    public String getStringValue() {
        return stringValue;
    }
    public void printValues() {
        System.out.println("intValue: " + intValue);
        System.out.println("stringValue: " + stringValue);
    }
    public static void main(String[] args) throws Exception {
        Class<?> exampleClass = ReflectionExample.class;

        // Get information about fields
        Field[] fields = exampleClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType());
            System.out.println("Field modifiers: " + Modifier.toString(field.getModifiers()));
        }

        // Get information about constructors
        Constructor<?>[] constructors = exampleClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor name: " + constructor.getName());
            System.out.println("Constructor parameters: ");
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getType() + " " + parameter.getName());
            }
            System.out.println("Constructor modifiers: " + Modifier.toString(constructor.getModifiers()));
        }

        // Get information about methods
        Method[] methods = exampleClass.getMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Method return type: " + method.getReturnType());
            System.out.println("Method parameters: ");
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getType() + " " + parameter.getName());
            }
            System.out.println("Method modifiers: " + Modifier.toString(method.getModifiers()));
        }

        // Create an instance of the class using reflection
        Constructor<?> constructor = exampleClass.getConstructor(int.class, String.class);
        ReflectionExample example = (ReflectionExample) constructor.newInstance(42, "Julia is the best!");

        // Call a method on the instance using reflection
        Method method = exampleClass.getMethod("printValues");
        method.invoke(example);
    }
}
