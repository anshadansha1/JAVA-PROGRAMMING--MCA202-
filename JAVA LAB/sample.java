import java.io.*;

class Number {
    float value;

    Number(float value) {
        this.value = value;
    }
}

public class sample {
    static void findSquareRoot(Number num) {
        num.value = (float) Math.sqrt(num.value);
    }

    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Enter a float number: ");
            float inputValue = Float.parseFloat(dis.readLine());
            Number num = new Number(inputValue);
            System.out.println("Before finding square root, value = " + num.value);
            findSquareRoot(num);
            System.out.println("After finding square root, value = " + num.value);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}