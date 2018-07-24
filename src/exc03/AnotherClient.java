package exc03;

import exc01.Callback;

public class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Еще один вариант метола callback()");
        System.out.println("p в квадрате равно "+ (p*p));
    }
}
