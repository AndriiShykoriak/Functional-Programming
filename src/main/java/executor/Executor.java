package executor;

import operations.Generate;
import operations.Operation;

public class Executor {
    public static void start() {
        Operation.execute();
        Generate.execute();
    }
}
