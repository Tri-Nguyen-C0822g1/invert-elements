import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class Elements {
    public static void main(String[] args){

    int[] a ={12,24,36,48};



     Stack<Integer> stack = new Stack();
        System.out.println("Array before change :");
     int size = a.length;
     for (int i = 0; i < size; i++){
         System.out.print( a[i] +"\t");
         stack.push(a[i]);
        }
        System.out.println("\nArray after change : ");
    for (int j = 0; j < a.length;j++){
        a[j] = stack.pop();
        System.out.print(a[j] + "\t");
    }
    String strings = "Mai va Tung";

    Stack<String> wStack = new Stack<>();
//    for(String w : strings.split(" ", 0)){
//        wStack.push(w);
        String [] s1 = strings.split("\\s");
        System.out.println("\nString before change: ");
        for(String x: s1){
            System.out.print(x + "\t");
            wStack.push(x);
    }
        System.out.println("\nString after change:\n");
        for (int y = 0; y < s1.length; y++){
            s1[y] = wStack.pop();
            System.out.print(s1[y] + "\t");
        }


}

}

