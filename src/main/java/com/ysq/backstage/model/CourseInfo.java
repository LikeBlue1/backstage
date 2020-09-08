package com.ysq.backstage.model;

import java.util.Date;

/**
 * @ClassName CourseInfo
 * @Description TODO
 * @Author yangshaoqi
 * @Date 2020/9/8 21:13
 * @Version 1.0
 **/
public class CourseInfo {
    private String uuid;
    private String order_id;
    private String name;
    private String wechat_no;
    private String wechat_mark;
    private String qq_no;
    private String tel;
    private String course_name;
    private String course_price;
    private String order_date;
    private Date update_datetime;
    private String remark;

    public CourseInfo() {
    }

    public CourseInfo(String uuid, String order_id, String name, String wechat_no, String wechat_mark, String qq_no, String tel, String course_name, String course_price, String order_date, Date update_datetime, String remark) {
        this.uuid = uuid;
        this.order_id = order_id;
        this.name = name;
        this.wechat_no = wechat_no;
        this.wechat_mark = wechat_mark;
        this.qq_no = qq_no;
        this.tel = tel;
        this.course_name = course_name;
        this.course_price = course_price;
        this.order_date = order_date;
        this.update_datetime = update_datetime;
        this.remark = remark;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWechat_no() {
        return wechat_no;
    }

    public void setWechat_no(String wechat_no) {
        this.wechat_no = wechat_no;
    }

    public String getWechat_mark() {
        return wechat_mark;
    }

    public void setWechat_mark(String wechat_mark) {
        this.wechat_mark = wechat_mark;
    }

    public String getQq_no() {
        return qq_no;
    }

    public void setQq_no(String qq_no) {
        this.qq_no = qq_no;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_price() {
        return course_price;
    }

    public void setCourse_price(String course_price) {
        this.course_price = course_price;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public Date getUpdate_datetime() {
        return update_datetime;
    }

    public void setUpdate_datetime(Date update_datetime) {
        this.update_datetime = update_datetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CourseInfo{" +
                "uuid='" + uuid + '\'' +
                ", order_id='" + order_id + '\'' +
                ", name='" + name + '\'' +
                ", wechat_no='" + wechat_no + '\'' +
                ", wechat_mark='" + wechat_mark + '\'' +
                ", qq_no='" + qq_no + '\'' +
                ", tel='" + tel + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_price='" + course_price + '\'' +
                ", order_date='" + order_date + '\'' +
                ", update_datetime=" + update_datetime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
