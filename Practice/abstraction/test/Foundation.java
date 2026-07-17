package test;

public class Foundation {
    private int var1 = 10;
    int var2 = 20;
    protected int var3 = 30;
    public int var4 = 40;

    public void display() {
        System.out.println("Inside package:");
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}