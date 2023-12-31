package sec2;

import java.util.Arrays;

//230713
public class Example4 {
    public static void main(String[] args) {

        String code = "801225-1278001";
        char m = code.charAt(7);    //특정 인덱스에 있는 문자 반환
        String gender = (m=='1' || m=='3') ? "남" : "여";

        System.out.println("성별코드 : "+m);
        System.out.println("성별 : "+gender);


        //80-12-25
        //특정번째(begin index)부터 특정번째(end index) 전까지 추출
        String yy= code.substring(0,2);
        String mm= code.substring(2,4);
        String dd= code.substring(4,6);


        System.out.println("생년월일 : "+yy+"-"+mm+"-"+dd);

        String nick = "KimKiTae";
        int idx = nick.indexOf('g');    //해당 문자의 인덱스를 반환

        System.out.println("g의 문자 인덱스 값 : "+idx);
        idx = nick.indexOf('i');
        System.out.println("i의 문자 인덱스 값 : "+idx);
        idx = nick.lastIndexOf('i');
        System.out.println("i의 마지막 찾을 경우의 인덱스 값 : "+idx);


        String name1 = nick + " imperial";           //문자열 결합 연산
        String name2 = nick.concat(" imperial"); //문자열 결합 연산
        System.out.println(name1);
        System.out.println(name2);

        //문자열을 문자배열로 toCharArray()
        //문자열을 바이트배열로 : getBytes()
//        char[] nArr = nick.getBytes(""); //문자열을 => 문자배열 k i m k i t a e 분리됨
        char[] nArr = nick.toCharArray(); //문자열을 => 문자배열 k i m k i t a e 분리됨
        byte[] bArr = nick.getBytes();

        System.out.println("@ 2번째 : "+nArr[2]); // m
        System.out.printf("# 2번째 : %s",bArr[2]); // 109 -> m의 아스키 값
        System.out.println();


        int age = 43;
        float ht = 173.8f;
        boolean ps = true;

        //특정 타입의 데이터를 문자열로 변환 => valueOf
        String val1 = String.valueOf(age); //정수 -> 문자열로 변환
        String val2 = String.valueOf(ht); //실수 -> 문자열로 변환
        String val3 = String.valueOf(ps); //불린 -> 문자열로 변환

        if(val1.equals("43")) System.out.println("문자열 변환 성공");

        //대문자로(toUpperCase()) / 소문자 toLowerCase()
        System.out.println("대문자로 변환 : "+nick.toUpperCase());
        System.out.println("소문자로 변환 : "+nick.toLowerCase());

        //해당 특정 문자를 찾아 바꾸기 => replace(찾는문자,바꿀문자)
        String nick2 = nick.replace('K','g');
        System.out.println("바뀐 값 : "+nick2);

        String chunjae1 = "오세훈/오태훈/이은영/서광/이소윤/신예은";
        String chunjae2 ="백준철|신승원|구예진|한선|박진권|박나연";

        //문자열배열을 특정 구분자로 요소 분리
        String[] stArr1 = chunjae1.split("/");
        String[] stArr2 = chunjae2.split("\\|");


        // 문자열배열을 출력 => Arrays.toString(문자열배열)
        System.out.println(Arrays.toString(stArr1));
        System.out.println(Arrays.toString(stArr2));

        String data1 = "         kim       ";
        String data2 = "tae     ";
        String data3 =  "    gi";

        System.out.println("글자 수1: "+data1.length());
        System.out.println("글자 수2: "+data2.length());
        System.out.println("글자 수3: "+data3.length());

        //해당 문자열의 앞뒤 공백제거 trim()
        String trans1 = data1.trim();
        String trans2 = data2.trim();
        String trans3 = data3.trim();

        System.out.println("글자 수1: "+trans1.length());
        System.out.println("글자 수2: "+trans2.length());
        System.out.println("글자 수3: "+trans3.length());


    }
}
