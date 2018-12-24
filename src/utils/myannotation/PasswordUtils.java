package utils.myannotation;

import static utils.myannotation.UseCase.*;

/**
 * @author ozone
 */
public class PasswordUtils {
    @UseCases(id="47",description="Passwords must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }
}
