package sec4;

import java.util.StringTokenizer;
//문자열 쪼갤 때 방법 3가지
public class StringEx2 {
    public static void main(String[] args) {
        String mem1 = "이슬비/박나연/최상민/황교진/김이호";

        //String[] m1
        String[] m1 = mem1.split("/");
        for(String name:m1){
            System.out.println(name);
        }
        System.out.println("------------------------");
        String mem2 = "신승원&오세훈,백준철,구예진-김기태";
        String[] m2 = mem2.split("&|,|-");
        for(String name:m2){
            System.out.println(name);
        }

        System.out.println("------------------------");
        String mem3 = "오태훈/신예은/박진권/김현경/김보경";
        StringTokenizer em3 = new StringTokenizer(mem3,"/");
        int cnt = em3.countTokens(); //토큰에 의해 분리된 요소수
        for(int i=0;i<cnt;i++) {
            String token = em3.nextToken();
            System.out.println(token);
        }
    }
}
