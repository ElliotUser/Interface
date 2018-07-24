package exc04;

import exc01.Callback;

abstract public class Incomplete implements Callback {
    int a, b;

    void show(){
        System.out.println(a + " " + b);
    }
}
