package hello.core.singleton;

public class SingletonService {
    // 자기 자신을 내부에 private으로 가지고 있음
    private static final SingletonService instance = new SingletonService();
    // singletonService 생성한 다음 instance에 들어감

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
