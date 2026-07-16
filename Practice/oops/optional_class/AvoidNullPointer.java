// Use Optional class and avoid NullPointerException from the below code: String names[ ] = new String[5]; System.out.print(names[0].length( ));
import java.util.Optional;

public class AvoidNullPointer {
    public static void main(String[] args) {
        String[] names = new String[5];
        
        Optional<String> nameOpt = Optional.ofNullable(names[0]);
        
        if (nameOpt.isPresent()) {
            System.out.print(nameOpt.get().length());
        } else {
            System.out.print("String is null, length cannot be determined safely.");
        }
    }
}