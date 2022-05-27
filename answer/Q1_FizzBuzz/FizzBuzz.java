class Main {

  public static void main(String args[]) {
    for (int i = 1; i <= 100; i++) {
      String str = "";

      // ここから記述
      str = String.valueOf(i);
      if(i%3 == 0 && i%5 != 0){str = "Fizz";}
      else if(i%5 == 0 && i%3 != 0){str = "Buzz";}
      else if(i%3 == 0 && i%5 == 0){str = "FizzBuzz";}
      // ここまで記述

      System.out.println(str);
    }
  }
}
