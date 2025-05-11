package org.codearena;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class PerformanceRule implements TestRule {

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                Runtime runtime = Runtime.getRuntime();
                runtime.gc(); // Try to clean up

                long startMemory = runtime.totalMemory() - runtime.freeMemory();
                long startTime = System.nanoTime();

                base.evaluate(); // Run the actual test

                long endTime = System.nanoTime();
                long endMemory = runtime.totalMemory() - runtime.freeMemory();

                System.out.println("----- " + description.getMethodName() + " -----");
                System.out.printf("Time Taken (ms): %.3f%n", (endTime - startTime) / 1_000_000.0);
                System.out.printf("Memory Used (KB): %.3f%n", (endMemory - startMemory) / 1024.0);
            }
        };
    }
}
