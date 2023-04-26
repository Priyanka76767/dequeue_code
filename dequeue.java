import java.util.* ;
import java.io.*; 
public class Deque 
{
    int f,r,n;
    int [] qe;
    // Initialize your data structure.
    public Deque(int n) 
    {
        this.f=-1;
        this.r=-1;
        this.n=n;
        qe=new int[n];

        // Write your code here.
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x)
    {
        // Write your code here.
        if (isFull()){
            return false;
        }
        if (f==-1){
            f=0;
     r=0;
        }
        else{
        
            if (f==0){
                this.f=this.n-1;
            }
            else{
                this.f=(this.f-1)%this.n;
            }}
            this.qe[f]=x;
        
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
     if (isFull()){
         return false;
     }
     
         this.r=(this.r+1)%this.n;
         if(this.f==-1){
             this.f=0;
         }
         this.qe[r]=x;
     
    return true;
 }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront(){
        // Write your code here.
        if(isEmpty()){
            return -1;
        }
        int rtt=qe[f];
        if(f==r){
            this.f=-1;
            this.r=-1;
        }
        else{
            this.f=(this.f+1)%this.n;
        }
       return rtt;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        // Write your code here.
        if (isEmpty()){
            return -1;
        }
        int rtt=qe[r];
        if(f==r){
            this.f=-1;
            this.r=-1;
        }else{
        if(r==0){
            r=this.n-1;
        }
        else{
            this.r=(this.r-1)%this.n;
        }}
        return rtt;

    }
    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
       if(f==-1){
           return -1;}
          else
          return this.qe[this.f]; 
       }
 // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
      if(this.r==-1){
          return -1;
     
      }
      else{
          return this.qe[this.r];
      }
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {

        if(this.f==-1){
            return true;
        }
        else{
            return false;
        }
    }
       //ns true if the deque is full. Otherwise returns false.
 public boolean isFull() 
    {
        // Write your code here.
        if ((this.r+1)%this.n==this.f){
            return true;
        }
        return false;
    }}
