package task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        TestClass testObject = new TestClass(null, 25, null);
        TestClass testObject2 = new TestClass("Veli", 25, null);
        TestClass testObject3 = new TestClass("Ali", 25, "marcoreus11@gmail.com");

        checkingNulls(testObject);
        checkingNulls(testObject2);
        checkingNulls(testObject3);
    }

    public static void checkingNulls(Object obj){
        Class<?> clazz = obj.getClass();
        for(Field field : clazz.getDeclaredFields()){
            if(field.isAnnotationPresent(NotNull.class)){
                field.setAccessible(true);
                try{
                    Object value = field.get(obj);
                    if(value == null){
                        System.out.println("Validation error: Field "
                                + field.getName() + " must not be null");
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
