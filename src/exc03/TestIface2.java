package exc03;

import exc01.Callback;
import exc01.Client;

public class TestIface2 {
    public static void main(String[] args) {
        Callback cb = new Client();
        AnotherClient ob = new AnotherClient();

        cb.callback(42);

        cb = ob;
        cb.callback(42);
    }
}
