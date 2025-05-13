package exam03;

public class Ex01 {
    public static void main(String[] args) {
        try (MyResource myResource = new MyResource()) {

            /**
             * 내부적 으로 어떤 객체 인지는 알 수 없지만
             * 알 수 있는 단 한가지, AutoCloseable 인터 페이스 의 구현 클래스 임은 알 수 있음
             * if (myResource instanceof AutoCloseable) {
             *      AutoCloseable my = my Resource;
             *      my.close()...
             * }
             */

        } catch (Exception e) {}
    }
}
