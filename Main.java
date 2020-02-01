
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

  MyQueue q = new MyQueue();

  q.enqueue(1);
  q.enqueue(2);
  q.enqueue(3);
  q.enqueue(4);
  //System.out.println(q.peek().value);
  q.print();

  System.out.println("Dequeue"+q.dequeue().value);
  // System.out.println("Dequeue"+q.dequeue().value);
    System.out.println("Dequeue"+q.dequeue().value);

  q.print();

  }
}