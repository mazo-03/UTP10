package task1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        AnnotatedClass annotatedClass = new AnnotatedClass();
//        annotatedClass.annotatedMethod();

        Class <AnnotatedClass> _class = AnnotatedClass.class;
        for(Method method : _class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(AuthorInfo.class)){
                AuthorInfo authorInfo = method.getAnnotation(AuthorInfo.class);
                System.out.println(
                        "Author: " + authorInfo.author() +
                        " Creation Date: " + authorInfo.creationDate()
                );
            }
        }
    }
}