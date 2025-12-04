package edu.iaun.exceptions;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class Demo1 {
    public static void main(String[] args) {
        try{
            System.out.println(2/0); // ArithmeticException
        }catch (ArithmeticException e){

        }catch (NullPointerException e){

        }catch (Exception e){

        }
    }

    public static void myMethod(){
        try {
            FileReader fr = new FileReader("sdsd");
        }catch (Exception e){

        }

        try {
            Connection c = DriverManager.getConnection("");
        }catch (Exception e){

        }
    }
}
