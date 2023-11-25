package Selenium_Topics;

import org.junit.*;

public class Selenium_JUnit_06_Annotations {

    @Before
    public void before(){
        System.out.println("Bir test baslamadan once @Before calisir");
    }

    @After
    public void after(){
        System.out.println("Bir testten sonra @After calisir");

    }

    @Test
    public void test() {
        System.out.println("Merhaba JUNIT serverler. Testimiz basladi");

    }

    @Test
    public void test2() {
        System.out.println("Merhaba JUNIT serverler. Test 2 basladi");

    }

    @Test
    public void test3() {
        System.out.println("Merhaba JUNIT serverler. Test 3 basladi");

    }
    @BeforeClass
    public static void beforeClass() {

        System.out.println("Ben  @BeforeClass im. Classtan once calistim");

    }

    @AfterClass
    public static void afterClass() {

        System.out.println("Ben  AfterClass im. Classtan sonra calistim");

    }
}
