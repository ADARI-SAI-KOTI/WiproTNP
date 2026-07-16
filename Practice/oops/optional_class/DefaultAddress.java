// Given a String address, print the address if it is not null or else print the default address as "India".
import java.util.Optional;

public class DefaultAddress {
    public static void main(String[] args) {
        String address = args.length > 0 ? args[0] : null;

        Optional<String> addressOpt = Optional.ofNullable(address);
        
        System.out.println(addressOpt.orElse("India"));
    }
}