package exc09.exc09B;

public interface IntStack {
    void push(int item);
    int pop();

    default void clear(){
        System.out.println("Метот clear() не реализован.");
    }

}
