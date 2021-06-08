public class StringManipulatorTest {
    
    public static void main(String[] args) {
        
        StringManipulator manipulator = new StringManipulator();
        
        //Trim and concat
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 

        // Get Index or null (string, char)
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        // Get Indeux or Null (string, string)
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull2(word, subString);
        Integer e = manipulator.getIndexOrNull2(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        // Get a substring using a starting and ending index then concate the 2nd string
        String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2);
    }
}