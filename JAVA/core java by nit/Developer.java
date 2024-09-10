class Developer
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		//app.previlege();
		Lead Dev = new Lead(); //  object creation of class Lead
		Dev.app.previlege(); // "Dev object is non static type"
		/*
		Dev is non static object
		app is also non static object

		should maintain connection between classes througth objects 
		*/
	}
}
class Lead
{
	 Project app = new Project(); // object for Project
	 /*
	 in the program we create non static object so the object "app" is working in the "Lead class only because it act as local to lead class". so we want acessing previlege method in "main method" than create 
	 Lead class object in Developer class
	 */
}
class Project
{
	void previlege()
	{
		System.out.println("Ececution of a Process");
	}
}


