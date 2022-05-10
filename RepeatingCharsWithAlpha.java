public class RepeatingCharsWithAlpha {
    public static void main(String[] args) {

//        String input = "aaabbccda";
//        int count = 1;
//        char temp = input.charAt(0);
//        for(int i=1;i<input.length();i++)
//        {
//            if(input.charAt(i)==temp)
//                count++;
//            else
//            {
//                System.out.print(temp+""+count);
//                count = 1;
//                temp = input.charAt(i);
//            }
//        }
//        System.out.print(temp+""+count);

        String s = "aabcddeebbb";

        int count = 1;

        char temp = s.charAt(0);

        for(int i = 1; i < s.length(); i ++){
            if(s.charAt(i) == temp) {
                count++;
            } else {
                System.out.print(temp + "" + count);
                count = 1;
                temp = s.charAt(i);
            }
        }
        System.out.print(temp+ "" +count);
    }
}
