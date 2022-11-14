package assignment2;

public class Trainer_Task2 {
	
	String name;
	String department;
	String email;
	int id;
	
	public Trainer_Task2(String trainerName, String trainerDepartment,String trainerEmail, int trainerID) {
		
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
		// TODO Auto-generated method stub
         
		Trainer_Task2[] trainer = new Trainer_Task2[3];
		
		 trainer[0] = new Trainer_Task2("Mukesh","Testing","mukesh@gmail.com", 1);
		 trainer[1] = new Trainer_Task2("Hitesh","Dev","mukesh@gmail.com", 2);
		 trainer[2] = new Trainer_Task2("Mukesh","Devops","mukesh@gmail.com", 3);
		
		
		trainer[0].display();
		trainer[1].display();
		trainer[2].display();

	}

}
