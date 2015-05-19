package au.com.pactera.androidactivity;

import java.io.Serializable;

/**
 * Created by liny1 on 19/05/2015.
 */
public class User implements Serializable{
    private String name;
    private int age;

    public  User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
