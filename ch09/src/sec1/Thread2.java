package sec1;


class SMThread extends Thread {
    @Override
    public synchronized void start() { //쓰레드 생성
        this.method1(); //동기화 블록에 기재된 쓰레드들은 병행 수행된다.
        super.start();
    }

    @Override
    public void run() {                //쓰레드 실행할 내용을 기술
        int[] arr = {95,60,85,70,90,80};

        for(int i=0; i<arr.length; i++) {
            System.out.println("점수 : "+arr[i]); //전체 Single 쓰레드 6개
            try {
                Thread.sleep(1000);
                //대기 시간 부여하고, 지정한 밀리초 만큼 Wait되며 그 시간이 지나면 자동으로 Wake Up
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void method1() {
        for(int i=1; i<7; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}



public class Thread2{
    public static void main(String[] args) {

        Thread th1 = new SMThread();
        th1.start();    //쓰레드 생성 후 자동 실행
        th1.run();



    }






}
