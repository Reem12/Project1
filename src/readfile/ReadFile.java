/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readfile;

/**
 *
 * @author reem
 */
import java.util.*;
import java.io.*;

public class ReadFile {
private Scanner x;

public void open(){
     try{
         x = new Scanner(new File("input.txt"));
     }
     catch(Exception e){
     System.out.println("Could not find file");
     }

}
//read file 
public void read(){
String s = "";
while(x.hasNext()){
s = s + x.next() +" ";
}

 String [] s2 = s.split(" "); // split by spaces

    for (int i = 0; i < s2.length; i++){
      System.out.println(s2[i]);
        }

}
 
    public static void main(String[] args) {
     ReadFile r = new ReadFile();
     r.open();
     r.read();



     }   
    }
    

