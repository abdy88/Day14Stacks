
public class StackOperations {

	LinkedListOperations obj1 = new LinkedListOperations();

	void push(int data1) {
		obj1.insertFirst(data1);

	}

	void pop() {

		obj1.removeFirst();
	}

	void stackDisplay() {
		obj1.display();

	}

}

//	
//	int SIZE = 5;
//	int[] myStack = new int[SIZE];
//	int top = -1;
//
//	public boolean isFull() {
//		return (top >= SIZE - 1) ? true : false;
//	}
//
//	public void push(int ele) {
//		if (isFull()) {
//			System.out.println("Stack Full!!");
//		} else {
//			top++;
//			myStack[top] = ele;
//		}
//	}
//
//	public boolean isEmpty() {
//		if (top == -1)
//			return true;
//		return false;
//	}
//
//	public void pop() {
//		if (isEmpty()) {
//			System.out.println("Stack Empty!!");
//		} else {
//			System.out.println(myStack[top]);
//			myStack[top] = 0;
//			top--;
//		}
//	}
//
//	public void peek() {
//		if (isEmpty()) {
//			System.out.println("Stack Empty!!");
//		} else {
//			System.out.println(myStack[top]);
//		}
//	}
//
//		public void display() {
//			if (isEmpty()) {
//				System.out.println("Stack Empty!!");
//			} else {
//				for (int i = myStack.length - 1; i >= 0; i--) {
//					System.out.println(myStack[i] + " ");
//				}
//			}
//		}
//
//	}