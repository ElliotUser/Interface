package exc02;

import exc01.Callback;
import exc01.Client;

public class TestIface {
    public static void main(String[] args) {
        Callback cb = new Client();
        cb.callback(42);
    }
}
