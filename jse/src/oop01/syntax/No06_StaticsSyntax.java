package oop01.syntax;

/*
  Date 	 : 2015 . 5 . 20
  Author : 양문석
  Desc   : Static문법에 관하여..
 */

/*
 - 정적변수
 - 클래스가 JVM 상으로 로딩시에 메모리 할당을 한다
 - 해시코드 (Hash Code)의 출력
 - 객체의 해시코드는 JVM의 해시알고리즘에 의해 패키지 명과
   클래스명이 조합되어 해시코드가 산출된다.
  
 -string 은 객체변수의 값이 같을경우 즉 같은 문자열을 가지고 있다면,
  해시코드를 공유 한다 .
  string str1 = "헐크";
  string str2 = "헐크";
  str1.hashCode() = str2.hashCode; // true 
 */

/*
  static 사용을 고려해야 하는 상황
 - 멤버변수 중 모든 인스턴스에 공통적으로 사용해야 하는 것에 붙여사용.
 - 인스턴스 변수를 사용하지 않고, 클래스에서 바로접근하려 할때.
 */

public class No06_StaticsSyntax {

}
