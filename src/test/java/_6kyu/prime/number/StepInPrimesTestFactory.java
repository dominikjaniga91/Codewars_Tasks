package _6kyu.prime.number;

import org.testng.annotations.Factory;

public class StepInPrimesTestFactory {

    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new StepInPrimesTest(2, 100, 110, new long[]{101, 103}) ,
                new StepInPrimesTest(4, 100, 110, new long[]{103, 107}) ,
                new StepInPrimesTest(6, 100, 110, new long[]{101, 107}) ,
                new StepInPrimesTest(8, 300, 400, new long[]{359, 367}) ,
                new StepInPrimesTest(10, 300, 400, new long[]{307, 317}),
                new StepInPrimesTest(4, 30_000, 100_000, new long[]{30_109, 30_113}),
                new StepInPrimesTest(6, 30_000, 100_000, new long[]{30_091, 30_097}),
                new StepInPrimesTest(6, 30_000, 100_000, new long[]{30_091, 30_097}),
                new StepInPrimesTest(11, 30_000, 100_000, null),
                new StepInPrimesTest(2, 10_000_000, 11_000_000, new long[]{10_000_139, 10_000_141}),
        };
    }
}
