package Java8_CloudTech;

class Stake {

	private int arr[] = {};
	private int top;
	private int capacity;
	
	
	public Stake(int size) {
		super();
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int i) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("stack overflow");
		} System.out.println("inserting "+ i);
		arr[++top]=i;
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return top == capacity-1;
	}

	public int peek() {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			return arr[top];
		}else 
			System.out.println("stack is empty");
		return -1;
	}

	public void pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("stack underflow..");
		}else {
		System.out.println("popping..."+arr[top]);
		arr[top]=0;
		top--;
		}
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing stack..");
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	

}
