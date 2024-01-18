// Upcasting/Widening
/*
 * int a = 5
 * float f = (float)a; //here this typecasting is not required.
 */

/*
 * int a =5;
 * float f = a ;
 */

/*
 * class Person {
 * 
 * }
 * 
 * class Teacher extends Person {
 * 
 * }
 * 
 * public class P15_upcasting {
 * public static void main(String args[]) {
 * Person p = new Person();
 * Teacher t = new Teacher();
 * 
 * t = p;// Upcasting /Widening : [converting from lower object to higher
 * object]
 * p = t;// Downcasting /Narrowing
 * }
 * }
 * 
 */