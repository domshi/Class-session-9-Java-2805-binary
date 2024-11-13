import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {

    try {
      DataOutputStream out = new DataOutputStream(new FileOutputStream("myfile.dat"));
      out.writeUTF("Hi, Dom\n");
      out.writeDouble(123.2342);
      
      out.close();
    }
    catch (Exception e) {
      System.out.println(e);
    }

    try {
      DataInputStream input = new DataInputStream(new FileInputStream("myfile.dat"));
      //DataInputStream input = new DataInputStream(new FileInputStream("a.txt"));
      System.out.println(input.readUTF());
      System.out.println(input.readDouble());
    }
    catch (Exception e) {
      System.out.println(e);
    }
    
  }

  
}