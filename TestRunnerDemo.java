package ru.gb.lesson2.tests;

public class TestRunnerDemo {

  // private никому не видно
  // default (package-private) внутри пакета
  // protected внутри пакета + наследники
  // public всем

  public static void main(String[] args) {

    TestRunner.run(TestRunnerDemo.class);

  }

  @Test
   void test1() {
    System.out.println("test1");
  }
  @Test
  void test4() {
    System.out.println("test4");
  }
  @Test
  void test5() {
    System.out.println("test5");
  }


  @BeforeEach
  void test7() {
    System.out.println("BeforeEach");
  }

  @AfterEach
  void test2() {
    System.out.println("AfterEach");
  }

  @BeforeAll
  void test3() {
    System.out.println("test3");
  }

  @BeforeAll
  void test313() {
    System.out.println("test6");
  }

  @AfterAll
  void test444() {
    System.out.println("test666");
  }

  @AfterAll
  void test666() {
    System.out.println("test777");
  }

}
