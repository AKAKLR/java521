public class Testdome {
    public static void func(String str){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //如果这个当中不包含这个字母
            if (!sb.toString().contains(ch+"")){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {


    }
}
