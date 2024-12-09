package task1;

public class AnnotatedClass {
    @AuthorInfo(author = "Orhan Kemal")
    public void annotatedMethod(){
        System.out.println("Annotated Method executed");
    }

    @AuthorInfo(author = "Yasar Kemal", creationDate = "1934-08-25")
    public void annotatedMethod2(){}

    @AuthorInfo(author = "Jaden Sancho", creationDate = "1965-01-13")
    public void annotatedMethod3(){}
}
