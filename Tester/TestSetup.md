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

8- Complete your test class like this. Example adding 7 & 10, result should be 17. Also my example of the JUnit class is pictured below:

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
![image](https://user-images.githubusercontent.com/115587796/202017056-54e8e8b8-445d-4228-abf6-e03f1e2f4d80.png)


![junit](https://user-images.githubusercontent.com/115587796/202016718-094d5de0-f920-4340-9a61-175137e8282a.PNG)


![successtest](https://user-images.githubusercontent.com/115587796/202017102-4888ab1d-bf0f-41e4-ae63-b2cce52c309d.PNG)


9- Write click on your test class in package explorer and click on Run as -> JUnit Test.

10- This is the result of the test.

IntelliJ: Note that I used IntelliJ IDEA community 2022.2.3 for the screenshots. Also, you need to set up your jre before these steps. I am using JDK 17

1- Right-click on the main folder of your project-> new -> directory. You should call this 'test'.

2- Right-click on the test folder and create the proper package. I suggest creating the same packaging names as the original class. Then, you right-click on the test directory -> mark directory as -> test sources root.

3- In the right package in the test directory, you need to create a Java class (I suggest to use Test.java).

4- In the created class, type '@Test'. Then, among the options that IntelliJ gives you, select Add 'JUnitx' to classpath.

5- Write your test method in your test class. The method signature is like:

@Test
public void test<name of original method>(){
...
}
    
You can do your assertions like below:

Assertions.assertTrue(f.flipEquiv(node1_1, node2_1));
    
These are the imports that I added:

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
    
You can check your methods like below:

Assertions.assertEquals(<Expected>,<actual>);
Assertions.assertTrue(<actual>);
    
For running your unit tests, right-click on the test and click on Run .
    
<h1> If that didn't help refer to this link <a href="https://stackoverflow.com/questions/8751553/how-to-write-a-unit-test">here</a> </h1>
