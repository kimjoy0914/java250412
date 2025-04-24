package com.day2;

public class LocalVariable {
  void method(int i) {
    System.out.println("지역변수 i는 " + i);
  }

  public static void main(String[] args) {
    LocalVariable lv = new LocalVariable();
    lv.method(2);
  }
}
