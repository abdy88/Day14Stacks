
public class Main {
	
	
	
	public static void main(String[] args) {
	
		StackOperations obj2 = new StackOperations();
		
//		UC1 Ability to create a Stack of
//		56->30->70
		
		obj2.push(70);

		obj2.push(30);

		obj2.push(56);
		
		obj2.stackDisplay();
		
//		UC2
		
		obj2.pop();
		
		obj2.stackDisplay();
		
	
	}
	
	

}
