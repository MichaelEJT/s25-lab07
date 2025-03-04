package AndrewWebServices;

import java.util.Map;
import java.util.HashMap;

/*
 * InMemoryDatabase is a fake for the AndrewWS database which is used to improve test efficiency.
 * Remember, fakes are fully functional classes with simplified implementation.
 * What is the simplest core functionality that we need for a functional database?
 * 
 * Hint: there are two methods you need to implement
 */
public class InMemoryDatabase extends Database {
    // Implement your fake database here
    private Map<String, Integer> database;

    public InMemoryDatabase() {
        database = new HashMap<>();
        database.put("Scotty", 17214);
    }

    @Override
    public int getPassword(String accountName) {
        return database.getOrDefault(accountName, 0);
    }
}