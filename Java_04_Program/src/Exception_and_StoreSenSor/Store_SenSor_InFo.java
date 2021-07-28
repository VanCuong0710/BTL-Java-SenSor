/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_and_StoreSenSor;

/**
 *
 * @author 84866
 */
public class Store_SenSor_InFo {

    private int x, y, radius;

    // KHAI BÁO 3 BIẾN DÀI CAO BÁN KÍNH
    public Store_SenSor_InFo(int x, int y, int radius) {
        //CONSTRUCTOR LƯU TRỮ SENSOR
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Store_SenSor_InFo() {
        //CONSTRUCTOR HÀM TẠO
    }
// LẤY RA CHIỀU RỘNG

    public int getX() {
        return x;
    }
// CÀI ĐẶT CHIỀU RỘNG

    public void setX(int x) {
        this.x = x;
    }
// LẤY RA CHIỀU CAO

    public int getY() {
        return y;
    }
// SET UP CHIỀU CAO

    public void setY(int y) {
        this.y = y;
    }
//LẤY RA BÁN KÍNH

    public int getRadius() {
        return radius;
    }
//CÀI ĐẶT BÁN KÍNH

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // LẤY RA DIỆN TÍCH
    public int getArea() {
        return x * y;
    }

    @Override
    public String toString() {
        // TRẢ LẠI THÔNG TIN CỦA DIỆN TÍCH S
        return "----------------------------\n"
                + "| Diện tích  :  " + getArea() + " m2 \n"
                + "| Chiều dài :  " + getX() + " m \n"
                + "| Chiều rộng:  " + getY() + " m \n"
                + "| Bán kính   : " + getRadius() + " m\n";

    }
}
