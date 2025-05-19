// File: C.java
package cpack;

import apack.A;

public class C {
    public void display() {
        A a = new A();
        // System.out.println("Default Var: " + a.defaultVar); // ❌ Not accessible (different package)
        // System.out.println("Protected Var: " + a.protectedVar); // ❌ Not accessible (not subclass)
        // System.out.println("Private Var: " + a.privateVar);   // ❌ Not accessible (private)
        System.out.println("Public Var: " + a.publicVar);       // ✅ Accessible (public)
    }
}