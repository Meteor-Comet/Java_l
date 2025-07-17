package 字符串练习;

public class VerificationCode {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        char[] ch = new char[52];
        for(int i=0;i<26;i++){
            ch[i] = (char)('a'+i);
        }
        for(int i=26;i<52;i++){
            ch[i] = (char)('A'+i-26);
        }

        for(int i=0;i<5;i++){
            sb.append(ch[(int)(Math.random()*52)]);
        }
        sb.setCharAt((int)(Math.random()*5), (char)(Math.random()*10+'0'));
        System.out.println(sb);
    }
}
