
public class StackOperations {

	LinkedListOperations obj1 = new LinkedListOperations();

	void push(int data1) {
		obj1.insertFirst(data1);

	}

	void pop() {

		while (obj1.head!=null)
		{
		obj1.removeFirst();
		}
		}

	void stackDisplay() {
		obj1.display();

	}

}

