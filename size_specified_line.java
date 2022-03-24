package TEATIME;
import java.util.Scanner;
import java.io.File;
public class size_specified_line {

 public static void main(String[] args) {
  System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
 }
}

