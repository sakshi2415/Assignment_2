package assignment2;

public class Trainer {
	
	String name;
	String department;
	String email;
	int id;
	
	public Trainer(String trainerName, String trainerDepartment,String trainerEmail, int trainerID) {
		
		name=trainerName;
		department=trainerDepartment;
		email=trainerEmail;
		id =trainerID; 
		
	}
	
	void display() {
		System.out.println(name+" "+department+" "+email+" "+id);
		System.out.println("");
	}
	
	

	public static void main(String[] args) {
		
		
		 Trainer trainer1 = new Trainer("Mukesh","Testing","mukesh@gmail.com", 1);
		Trainer trainer2 = new Trainer("Hitesh","Dev","mukesh@gmail.com", 2);
		Trainer trainer3 = new Trainer("Mukesh","Devops","mukesh@gmail.com", 3);
		
		
		trainer1.display();
		trainer2.display();
		trainer3.display();

	}

}
