//Intègre le design pattern Singleton d'une mauvaise façon
public class SimpleClass {

    private static SimpleClass instance = null;

    private SimpleClass() {
    }

    public static SimpleClass getInstance() {
        if (instance == null) {
            instance = new SimpleClass();
        }
        return instance;
    }
}