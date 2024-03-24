/*PROGRAM 9_4 :4.Write a java program to create an abstract class named Shape
 that contains an empty method named numberOfSides(). Provide three classes named Rectangle,
  Triangle and Hexagon such that each one of the classes extends the class Shape.
   Each one of the classes contains only the method numberOfSides( ) that
 shows the number of sides in the given geometrical structures.   */

 import java.util.Scanner;

 abstract class Shape {
     abstract void numberOfSides();
 }
 
 class Rectangle extends Shape {
     @Override
     void numberOfSides() {
         System.out.println("A rectangle has 4 sides.");
     }
 }
 
 class Triangle extends Shape {
     @Override
     void numberOfSides() {
         System.out.println("A triangle has 3 sides.");
     }
 }
 
 class Hexagon extends Shape {
     @Override
     void numberOfSides() {
         System.out.println("A hexagon has 6 sides.");
     }
 }
 
 public class P9_4_abstract_class {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.println("Enter the name of the shape (Rectangle, Triangle, or Hexagon):");
         String shapeName = scanner.nextLine().toLowerCase();
 
         Shape shape = null;
         switch (shapeName) {
             case "rectangle":
                 shape = new Rectangle();
                 break;
             case "triangle":
                 shape = new Triangle();
                 break;
             case "hexagon":
                 shape = new Hexagon();
                 break;
             default:
                 System.out.println("Invalid shape name!");
         }
 
         if (shape != null) {
             System.out.println("Details of " + shapeName + ":");
             shape.numberOfSides();
         }
 
         scanner.close();
     }
 }
 