public class stringbuilder {
    public static void main(String [] args){
        StringBuilder sb=new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);
        sb.insert(5,",");
        System.out.println(sb);
        sb.replace(0,5,"HI");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println("length: "+sb.length());
    }
}
