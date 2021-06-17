public class ProjectTest {
	public static void main(String[] args){
        Project project1 = new Project(); // Testing constructor with no arguments
        Project project2 = new Project("Cool project"); //Testing constructor with one argument (name)
        Project project3 = new Project("Cool proj 3", "sososososososo cool"); 
        //testing constructor with both arguments (name and description)

		System.out.println(project1.elevatorPitch());
		System.out.println(project2.elevatorPitch());
		System.out.println(project3.elevatorPitch());
		
	}
}


//need help to test
