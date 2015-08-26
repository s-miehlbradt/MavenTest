package com.scrutinizer.ci.test;

/**
 * Hello world!
 *
 */
public class App 
{
 public String val1 = "CONSTANT";
 public String val2 = "CONSTANT";
 public String val3 = "CONSTANT";
 
 public String longval1 = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
 public String longval2 = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
 public String longval3 = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
 
    public static void main( String[] args )
    {
        //FIXME duh!
        //TODO: auch duh!
        System.out.println( "Hello World!" );
    }

    private String dupe1() {
        while(true) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            break;
        }
        return null;
    }
    
     private String dupe2() {
        while(true) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            break;
        }
         return null;
     }
}
