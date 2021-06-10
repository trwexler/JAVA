public class StringManipulatorTest {
	public static void main(String[] args){

		StringManipulator manipulator = new StringManipulator();

		//1
		String str = manipulator.trimAndConcat("    Hello     ","     World    ");
		System.out.println(str); // HelloWorld 

		//2
		char letter = 'o';
		Integer a = manipulator.getIndexOrNull("Coding", letter);
		Integer b = manipulator.getIndexOrNull("Hello World", letter);
		Integer c = manipulator.getIndexOrNull("Hi", letter);
		System.out.println(a); // 1
		System.out.println(b); // 4
		System.out.println(c); // null

		//3
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer a = manipulator.getIndexOrNull2(word, subString);
		Integer b = manipulator.getIndexOrNull2(word, notSubString);
		System.out.println(a); // 2
		System.out.println(b); // null

		//4
		String word = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(word); // eworld


	}
}
