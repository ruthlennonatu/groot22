Eclipse:

For making unit test for your project, please follow these steps (I am using Eclipse in order to write this test):

1- Click on New -> Java Project.

2- Write down your project name and click on finish.

3- Right click on your project. Then, click on New -> Class.

4- Write down your class name and click on finish.
Example:

public class Math {
    int a, b;
    Math(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add() {
        return a + b;
    }
}

5- Click on File -> New -> JUnit Test Case.

6- Check setUp() and click on finish. SetUp() will be the place that you initialize your test.

7- Click OK.

8- Complete your test class like this. Example adding 7 & 10, result should be 17.:

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MathTest {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(7, 10);
    }
    @Test
    public void testAdd() {
        Assert.assertEquals(17, math.add());
    }
}

9- Write click on your test class in package explorer and click on Run as -> JUnit Test.

10- This is the result of the test.

IntelliJ: Note that I used IntelliJ IDEA community 2022.2.3 for the screenshots. Also, you need to set up your jre before these steps. I am using JDK 17

1- Right-click on the main folder of your project-> new -> directory. You should call this 'test'.

2- Right-click on the test folder and create the proper package. I suggest creating the same packaging names as the original class. Then, you right-click on the test directory -> mark directory as -> test sources root.

3- In the right package in the test directory, you need to create a Java class (I suggest to use Test.java).

4- In the created class, type '@Test'. Then, among the options that IntelliJ gives you, select Add 'JUnitx' to classpath.
