package com.example.demo;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-22 16:46
 * @Description:
 */
public class Fuck {
    private String _id;
    private Integer x;
    private String y;
    private List<Integer> z;
    private Fuck a;
    private List<Fuck> b;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public List<Fuck> getB() {
        return b;
    }

    public void setB(List<Fuck> b) {
        this.b = b;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public List<Integer> getZ() {
        return z;
    }

    public void setZ(List<Integer> z) {
        this.z = z;
    }

    public Fuck getA() {
        return a;
    }

    public void setA(Fuck a) {
        this.a = a;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Fuck{" +
                "_id='" + _id + '\'' +
                ", x=" + x +
                ", y='" + y + '\'' +
                ", z=" + z +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
