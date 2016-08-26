package union.json;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


/**
 * Created by Administrator on 2016/8/12.
 *练习JSON里的方法
 */
public class TestJson {
    public static void main(String[] args) {

        System.out.println("========将字符串转换成json========");

        String a ="{\"name\":\"李四\",\"sex\":\"男\"}";
        JSONObject obj=(JSONObject)JSON.parse(a);
        System.out.println(obj);

        System.out.println("========只拿JSON里面name的值========");
        System.out.println(obj.get("name"));

        Student s=new Student();
        s.setName("李思");
        s.setAge(25);
        s.setSex("女");

        //将对象转换成json字符串
        System.out.println("========将对象转换成json字符串========");
        String stu=JSON.toJSONString(s);
        System.out.println(stu);

        //将字符串转换成JSONObject
        System.out.println("========将字符串转换成JSONObject========");
        JSONObject o=JSON.parseObject(stu);
        System.out.println(o);

        //将字符串转换成Student对象
        System.out.println("========将字符串转换成Student对象========");
        String b ="{\"name\":\"张三\",\"sex\":\"男\",\"age\":\"30\"}";
        Student student=JSON.parseObject(b,Student.class);
        student.show();

        System.out.println("========用JSONObject写json========");
        JSONObject json=new JSONObject();
        json.put("name","王五");
        json.put("age",35);
        json.put("sex","男");
        System.out.println(json);

        System.out.println("========用JSONArray写json========");
        JSONArray j=new JSONArray();

       /* String c ="\"student\":\"[\"" +
                "{\"name\":\"张三\",\"sex\":\"男\",\"age\":\"30\"}" +
                "{\"name\":\"拉克丝\",\"sex\":\"女\",\"age\":\"24\"}";*/
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();
        s1.setName("张三");
        s1.setSex("男");
        s1.setAge(30);
        s2.setName("拉克丝");
        s2.setSex("女");
        s2.setAge(20);
        s3.setName("盖伦");
        s3.setSex("男");
        s3.setAge(23);
        s4.setName("赵信");
        s4.setSex("男");
        s4.setAge(22);
        s5.setName("嘉文");
        s5.setSex("男");
        s5.setAge(24);
        j.add(s1);
        j.add(s2);
        j.add(s3);
        j.add(s4);
        j.add(s5);
        System.out.println(j);


    }
}
