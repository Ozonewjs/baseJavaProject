package utils.myannotation;
import static utils.myannotation.UseCase.MyAnno;
/**
 * @author ozone
 */
public class User {
    @MyAnno(name = "zhang")
    private String name;

    @MyAnno(name = "zhang@example.com")
    private String email;


    @MyAnno(name = "sayHelloWorld")
    public String sayHello(){
        return "";
    }

}
