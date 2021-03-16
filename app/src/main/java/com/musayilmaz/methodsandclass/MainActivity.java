package com.musayilmaz.methodsandclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String userName;
    String userName1;
    String userName2;
    String userName3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("application started");
        test();
        makeFamilyGuy();
        System.out.println(math(3,4));

    }

    public void test() {

        int x=4+4;
        System.out.println("value of x:" + x);
        userName="James";

    }

    public int math(int a, int b) {
    userName="Lars";
    return a+b;


    }

    public void makeMusicians() {

       Musican james = new Musican("James Hotfield", "Guitar", 50);

    }

    public void makeFamilyGuy() {

        FamilyGuy Peter = new FamilyGuy("Peter Griffin", 45, "Secretary in Beer Factory");

        System.out.println(Peter.getName());
        Peter.setName("Peter Justin Griffin");
        System.out.println(Peter.getName());

    }



}

