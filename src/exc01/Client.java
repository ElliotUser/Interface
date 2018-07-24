package exc01;

public class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Метод callback(), вызывакемый со значением "+p);
    }

    public void nonIfaceMeth(){
        System.out.println("В классах, реализующих интерфейсы, "+"могут определяться и другие члены.");
    }
}
