package sec1;

public class Child extends Man{
    //추상화된 클래스를 상속받아 구현하는 경우 추상메서드를 모두 구현내용을 기술할 수 있도록
    //오버라이딩을 해야한다.
    @Override
    public void method1() {
        System.out.println("메소드1");

    }

    @Override
    public int method2() {
        return 2;
    }

    @Override
    public void method3(int no) {
        System.out.println(no);
    }

    @Override
    public int method4(int no) {
        return no+1;
    }

    @Override
    public void method5() {
        super.method5();
    }
}
