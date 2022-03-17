import java.util.Scanner;

class Main {

  // public static void sum(int a, int b, int c) {
  public static int sum(int a, int b, int c) {
    return a + b + c;
    // int result = a + b + c;
    // System.out.println("Сумма чисел = " + result);
  }

  public static void main(String[] args) {
    System.out.println("Программа расчета суммы трех чисел");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введи первое число: ");
    int value1 = scanner.nextInt();
    System.out.println("Введи второе число: ");
    int value2 = scanner.nextInt();
    System.out.println("Введи третье число: ");
    int value3 = scanner.nextInt();
    // sum(value1, value2, value3);
    int result  = sum(value1, value2, value3);
    System.out.println("Сумма чисел = " + result);
  }
}