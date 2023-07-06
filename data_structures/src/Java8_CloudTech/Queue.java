package Java8_CloudTech;

public class Queue {

	private int []arr;
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	public Queue(int size){
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	
public void enqueue(int item) {
	if(isFull()) {
		System.out.println("overflow");
		System.exit(-1);
	}
	System.out.println("inserting "+ item);
	
	rear = (rear +1) % capacity;
	arr[rear] =item;
	count++;
}

	public int dequeue(){
		if(isEmpty()) {
			System.out.println("underflow..");
			System.exit(-1);
		}
		
		int x = arr[front];
		System.out.println("Removing "+x);
		front = (front +1) % capacity;
		count--;
		return x;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Underflow..");
			System.exit(-1);
		}
		return arr[front];
	}
private boolean isEmpty() {
	// TODO Auto-generated method stub
	return count == 0;
}

private boolean isFull() {
	// TODO Auto-generated method stub
	return count == capacity;
}

public int size() {
	// TODO Auto-generated method stub
	return count;
}
}
