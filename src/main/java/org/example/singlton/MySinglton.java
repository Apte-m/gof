package org.example.singlton;

public class MySinglton {
    private static MySinglton mySinglton;

    private MySinglton() {
    }

    public static MySinglton getInstance() {
        if (mySinglton == null) {
            mySinglton = new MySinglton();
        }
        return mySinglton;
    }
}
