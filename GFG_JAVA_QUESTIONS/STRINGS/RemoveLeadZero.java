//Remove Leading Zeros From String in Java
package GFG_JAVA_QUESTIONS.STRINGS;

public class RemoveLeadZero
{
    public static String removeZero(String str){

        int n =str.length() -  1;
        int i=0;
        while(i < str.length() && str.charAt(i) == '0')
        {
            i++;
        }
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, i, "");
        

        //returning string after returning zero .
        return sb.toString();

    }
    public static void main(String [] args)
    {

        String str = "0000012345";
        String str1 = removeZero(str);

        System.out.println(str1);

    }
}
