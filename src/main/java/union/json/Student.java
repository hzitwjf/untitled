package union.json;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/12.
 */
public class Student implements Serializable{
    private String name;
    private int age;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void show(){
        System.out.println("大家好，我叫："+name+"\n今年："+age+"岁，\n"+sex);
    }
}
