package sec5;

import java.util.regex.Pattern;

public class PatternEx1 {
    public static void main(String[] args) {

        //regist Expression : 등록시 갖추어져야할 데이터의 검증식
        //() : 그룹 , w : 단어 , d : 정수
        //{ 글자수 }, {최소글자수,최대글자수} , ^ : 시작문자 , $ : 끝문자 , ? : 유무 , * : 모두
        // + : 하나 이상

        String regExp = "(02|031|010)-\\d{3,4}-\\d{4}"; //검증식
        String tel1 = "(02)-1004-1234";
        String tel2 = "02-1004-1234";
        String tel3 = "010-1004-1234";
        String tel4 = "(010)-1004-1234";
        String tel5 = "(031)1231004";
        String tel6 = "031123-1234";
        String tel7 = "031-123-1004";
        //전화번호 검증
        System.out.println("형식 검증1 :"+ Pattern.matches(regExp,tel1));
        System.out.println("형식 검증2 :"+ Pattern.matches(regExp,tel2));
        System.out.println("형식 검증3 :"+ Pattern.matches(regExp,tel3));
        System.out.println("형식 검증4 :"+ Pattern.matches(regExp,tel4));
        System.out.println("형식 검증5 :"+ Pattern.matches(regExp,tel5));
        System.out.println("형식 검증6 :"+ Pattern.matches(regExp,tel6));
        System.out.println("형식 검증7 :"+ Pattern.matches(regExp,tel7));
        System.out.println();


        regExp= "\\w+@\\w+\\.\\w+(\\.\\w+)?";
//        regExp= "\\w+@\\w+.\\w*.[a-z]{2,3}$";
        String email1 = "kkt@gmail.com";
        String email2 = "kkt.naver.com";
        String email3 = "chunjae@nate.com";
        String email4 = "chunjae.hotmail.com";
        String email5 = "chunjae@hotmail";
        String email6 = "chunjaeasd@asd.co.kr";
        System.out.println("이메일 검증1 :"+ Pattern.matches(regExp,email1));
        System.out.println("이메일 검증2 :"+ Pattern.matches(regExp,email2));
        System.out.println("이메일 검증3 :"+ Pattern.matches(regExp,email3));
        System.out.println("이메일 검증4 :"+ Pattern.matches(regExp,email4));
        System.out.println("이메일 검증5 :"+ Pattern.matches(regExp,email5));
        System.out.println("이메일 검증6 :"+ Pattern.matches(regExp,email6));
    }
}
