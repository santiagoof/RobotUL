package co.santiagoflorez.RobotUnilatina;

public class Main {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		String NewName = "RoboCop";
		byte RobotCreationDay = 20;
		byte RobotCreationMonth = 8;
		int RobotCreationYear = 2018 ;
		
		Robot robot = new Robot(NewName, RobotCreationDay, RobotCreationMonth, RobotCreationYear);
		
		robot.TellMyName();
		robot.BirthDay();
		
		robot.Sum(20, 40);
		robot.Substrat(20, 40);
		robot.Multiplication(40, 40);
		robot.Division(40, 20);
	}

}
