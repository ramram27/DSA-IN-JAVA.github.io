
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	   
	   Queue ob = new Queue();
	   ob.insert(2);
	   ob.insert(6);
	   ob.insert(8);
	  
	   ob.print();
	    System.out.println("delete = " + ob.delete());
	    ob.print();
	}
}

class Queue {
    
    int n=5;
    int arr[] = new int[n];
    int size;
    int rear;
    int front;
    
    void insert(int data) {
        
        arr[rear] = data;
        rear++;
        size++;
    }
    
    int delete() {
        
        int data = arr[front];
        front++;
        size--;
        return data;
    }
    
    void print() {
        
        for(int i=0;i<size;i++) {
            System.out.println(i + " " + arr[i]);
        }
    }
   
}
