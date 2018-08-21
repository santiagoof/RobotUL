package co.santiagoflorez.RobotUnilatina;

public class Robot 
{
	public String Name;
	public byte CreationDay;
	public byte CreationMonth;
	public int CreationYear;
	
	public Robot (String Name, byte CreationDay, byte CreationMonth, int CreationYear)
	{
		this.Name = Name;
		this.CreationDay = CreationDay;
		this.CreationMonth = CreationMonth;
		this.CreationYear = CreationYear;
	}
	
	public void TellMyName ()
	{
		System.out.println ("Mi nombre es:  " + this.Name);
	}
	
	public void BirthDay ()
	{
		System.out.println ("Fui creado el dia " + this.CreationDay + " del mes " + this.CreationMonth + " del año " + this.CreationYear);
	}
	
	public void Sum(int a, int b)
	{
		System.out.println("Si sumo los 2 números que me dan, el resultado es: " + (a + b));
	}
	
	public void Substrat(int a, int b)
	{
		System.out.println("Si resto los 2 números que me dan, el resultado es: " + (a - b));
	}
	
	public void Multiplication(int a, int b)
	{
		System.out.println("Si multiplico los 2 números que me dan, el resultado es: " + (a * b));
	}
	
	public void Division(int a, int b)
	{
		System.out.println("Si divido los 2 números que me dan, el resultado es: " + (a / b));
	}
}
