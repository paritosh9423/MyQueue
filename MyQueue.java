public class MyQueue{

class Node {
   int value;
   Node next ;
   public Node(int value){
     this.value = value;
   }
 }

 Node first = null;
 Node last = null;
 int length = 0;


 public Node peek(){
   if(this.length>0){
     System.out.println("peek : "+this.first.value);
     return this.first;
   }
   return null;

 }

 public void enqueue(int value){
   if(this.length == 0){
     System.out.println("enqueue : "+value);
     Node newNode = new Node(value);
     this.last = newNode;
     this.first = newNode;
     this.length++;
   }
   else{
      System.out.println("enqueue : "+value);
     //Node temp = this.last;
     Node newNode = new Node(value);
    newNode.next = this.last;
    //this.last.next = newNode;
    this.last = newNode;
     this.length++;
   

   }
 }

 public Node dequeue(){
   Node temp = null;
   if(this.length==0)
      return null;
    if(this.first == this.last){
      
      this.last = null;
    }
    int tempLength = this.length;

    temp = this.first;
    this.first = this.first.next;
    this.length--;
   return temp;
 }

 public void print(){
   if(this.length>0){
     Node temp = this.last;
     int tempLength = length;
     while(tempLength>0){
       System.out.println("print : "+temp.value);
       //System.out.println(temp.value);
       temp=temp.next;
        tempLength--;
     }
   }
 }

}