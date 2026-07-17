package demo;

import test.Foundation;

public class TestAccess {
    public static void main(String[] args) {
        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // ❌ private (not accessible)
        // System.out.println(obj.var2); // ❌ default (not accessible outside package)
        // System.out.println(obj.var3); // ❌ protected (not accessible without inheritance)
        System.out.println(obj.var4);   // ✅ public (accessible)
    }
}