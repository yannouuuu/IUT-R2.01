package semaine7.td07;

import java.util.Map;
import java.util.HashMap;

public class  PhoneBook{
    private Map<String, PhoneNumber> directory;
    
    public PhoneBook(){
        directory = new HashMap<>();
    }
}
