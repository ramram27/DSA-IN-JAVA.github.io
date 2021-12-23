
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		Stack ob = new Stack();
		
// 		ob.push(10);
// 		ob.push(12);
// 		ob.push(13);
// 		ob.push(3);
// 		ob.push(1);
// 		ob.push(2);

        for(int i=0;i<ob.n;i++) {
            
            int m=scn.nextInt();
            ob.push(m);
        }
		System.out.println( "pop = " + ob.pop());
		ob.print();
	}
}

class Stack {
    
    int n=5;
    
    int arr[] = new int[n];
    int top = -1;
    
    void push(int data) {
        
        if(top == n-1) {
            
        System.out.println("stack overflower");
        return;
         
        }
        
        top++;
        arr[top] = data;
    }
    
    int pop() {
        
        if(top == -1) {
            System.out.println("stack underfow");
            return -1;
        }
        int data=arr[top];
        arr[top] = 0;
        top = top - 1;
        return data;
    }
    
    void print() {
        for(int i=0;i<n;i++) {
            
            if(arr[i] != 0) {
                          
            System.out.println("Stack = " + arr[i]);  
            }

        }
    }
}
