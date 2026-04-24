package STRING;

public class first {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append("Programming");
        System.out.println(sb);
        sb.insert(15,"Language");
        System.out.println(sb);
        sb.replace(0,5,"Piyush");
        System.out.println(sb);
        sb.delete(0, 6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());  
        System.out.println("capacity"+sb);
        System.out.println(sb.charAt(3));

    }
}
