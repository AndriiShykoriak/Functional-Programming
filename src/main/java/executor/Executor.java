package executor;

import operations.operationsOnUsers;
import operations.operationsRandom;

public class Executor {
    public static void start() {
        operationsOnUsers.execute();
        operationsRandom.execute();
    }
}
