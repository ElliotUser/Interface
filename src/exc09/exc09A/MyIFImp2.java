package exc09.exc09A;

import exc09.MyIF;

public class MyIFImp2 implements MyIF {

    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "Это другая символьная строка.";
    }
}
