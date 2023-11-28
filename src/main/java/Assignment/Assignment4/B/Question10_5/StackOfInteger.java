package Assignment.Assignment4.B.Question10_5;
public class StackOfInteger {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfInteger(int capasity) {
        this.elements = new int[capasity];
    }
    public StackOfInteger(){
        this(DEFAULT_CAPACITY);
    }
    public void push(int value){
        if(size>=elements.length){
            int[] tmp=new int[elements.length*2];
            System.arraycopy(elements, 0, tmp, 0, elements.length);
            elements=tmp;

        }
        elements[size++]=value;
    }
    public int pop(){
        return elements[--size];
    }
    public int peek(){
        return elements[size-1];
    }
    public boolean empty(){
        return size==0;
    }

    public int getSize() {
        return size;
    }
}
