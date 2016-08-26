package union.weuinet;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/12.
 */
public class BuMen implements Serializable {
    private String name;
    private int parentId;
    private int order;
    private int id;

    public BuMen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  /*  public void show(){
        System.out.println("部门名字\t父级部门\t默认排位\t部门ID");
        System.out.println(getName()+"\t\t\t"+getParentId()+"\t\t\t"+getOrder()+"\t\t\t"+getId());
    }*/

}
