/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;

/**
 *
 * @author 84866
 */
public class Draw_A_Closed_Belt_Region extends JPanel {

    //TẠO CÁC BIẾN ĐỂ LƯU DỮ LIỆU
    public int width;
    public int heigh;
    public int radius;

    public Draw_A_Closed_Belt_Region(int width, int heigh, int radius) {
        
        //TẠO CONTRUCTOR ĐỂ TRUYỀN BIẾN
        this.width = width;
        this.heigh = heigh;
        this.radius = radius;
    }

    public void paint(Graphics g) {
        int red, green, blue;
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color c = new Color(red, green, blue);

        
        // SET SIZE
        setSize(1000, 800);
        
        //TẠO BIẾN ĐẾM SỐ LƯỢNG SENSOR
        int count = 0;
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN ĐẦU TIÊN
        g.drawRect(101, 101, width + 200, heigh + 200);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN
        g.drawOval(200, 200, width, heigh);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN
        g.drawOval(100, 100, width + 200, heigh + 200);
        
        //CÀI ĐẶT GIÁ TRỊ TÂM VÀ BÁN KÍNH
        int tamx = 200 + width / 2 - radius / 2;
        int tamy = 200 + heigh / 2 - radius / 2;
        
        
        //TÍNH CHIỀU CAO VÀ RỘNG
        int a = (int) (width / 2 + radius * 0.8);
        int b = (int) (heigh / 2 + radius * 0.8);
        int x = 0;
        int y = b;
        //THIẾT LẬP CÔNG THỨC VẼ HÌNH TRÒN TIẾP THEO
        float x0 = (float) (a * a / Math.sqrt(a * a + b * b));
        float P = b * b - a * a * b + a * a / 4;
        //VẼ HÌNH TRÒN
        g.drawOval(tamx + x, tamy + y, radius, radius);
        
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        g.drawOval(tamx - x, -y + tamy, radius, radius);
        
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        g.drawOval(tamx + x, -y + tamy, radius, radius);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        g.drawOval(-x + tamx, +y + tamy, radius, radius);
        count = count + 4;
        int k = 0;
        
        
        //VẼ CÁC HÌNH TRÒN KẾ TIẾP
        while (x <= x0) {
            if (P < 0) {
                P += (b * b) * (2 * x + 3);
            } else {

                P += (b * b) * (2 * x + 3) - 2 * a * a * (y - 1);
                y--;
            }
            k++;
            x++;
            if (k == radius / 2) {
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                g.drawOval(tamx + x, tamy + y, radius, radius);
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                g.drawOval(tamx - x, -y + tamy, radius, radius);
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                g.drawOval(tamx + x, -y + tamy, radius, radius);
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                g.drawOval(-x + tamx, +y + tamy, radius, radius);
                count = count + 4;
                k = 0;
            }
        }
        k = 0;
        x = a;
        y = 0;
        // TÍNH P ÁP VÀO CT ĐỂ TÌM HÌNH TRÒN KẾ TIẾP
        
        
        P = a * a - b * b * a + b * b / 4;
        g.drawOval(tamx + x, tamy + y, radius, radius);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //ĐẾM SỐ LƯỢNG CẢM BIẾN
        count = count + 4;
        
        //VẼ HÌNH TRÒN
        g.drawOval(tamx - x, -y + tamy, radius, radius);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN
        g.drawOval(tamx + x, -y + tamy, radius, radius);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN
        g.drawOval(-x + tamx, +y + tamy, radius, radius);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        while (x > x0) {
            if (P < 0) {
                
                //TÍNH ĐỂ ÁP DỤNG VÀO CÔNG THỨC
                P += (a * a) * (2 * y + 3);
            } else {
                P += (a * a) * (2 * y + 3) - 2 * b * b * (x - 1);

                x--;
            }
            y++;
            k++;
            if (k == radius / 2) {
                g.drawOval(tamx + x, tamy + y, radius, radius);
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                //VẼ HÌNH TRÒN TIẾP THEO
                g.drawOval(tamx - x, -y + tamy, radius, radius);
                
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                //VẼ HÌNH TRÒN TIẾP THEO
                g.drawOval(tamx + x, -y + tamy, radius, radius);
                
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                //VẼ HÌNH TRÒN TIẾP THEO
                g.drawOval(-x + tamx, +y + tamy, radius, radius);
                
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                //ĐẾM BIẾN COUNT +4
                count = count + 4;
                k = 0;
            }
        }
        
        //VẼ VÒNG HÌNH TRÒN THỨ 2
        
        //THIẾT LẬP CHIỀU DÀI CHIỀU RỘNG CỦA HÌNH ELIPSE
        a = (int) (width / 2 + radius * 1.25);
        b = (int) (heigh / 2 + radius * 1.25);
        x = 0;
        y = b;
        
        
        //THIẾT LẬP ĐỂ VẼ HÌNH TRÒN TIẾP THEO
        x0 = (float) (a * a / Math.sqrt(a * a + b * b));
        P = b * b - a * a * b + a * a / 4;
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN TIẾP THEO
        g.drawOval(tamx + x, tamy + y, radius, radius);
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN TIẾP THEO
        g.drawOval(tamx - x, -y + tamy, radius, radius);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN TIẾP THEO
        g.drawOval(tamx + x, -y + tamy, radius, radius);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN TIẾP THEO
        g.drawOval(-x + tamx, +y + tamy, radius, radius);
        
        //ĐẾM BIẾN SỐ LƯỢNG CẢM BIẾN
        count = count + 4;
        k = 0;
        while (x <= x0) {
            
            //THIẾT LẬP ĐỂ VẼ HÌNH TRÒN TIẾP THEO
            if (P < 0) {
                P += (b * b) * (2 * x + 3);
            } else {

                P += (b * b) * (2 * x + 3) - 2 * a * a * (y - 1);
                y--;
            }
            k++;
            x++;
            if (k == radius / 2) {
                g.drawOval(tamx + x, tamy + y, radius, radius);
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                
                //VẼ HÌNH TRÒN TIẾP THEO
                g.drawOval(tamx - x, -y + tamy, radius, radius);
                
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                
                //VẼ HÌNH TRÒN TIẾP THEO
                g.drawOval(tamx + x, -y + tamy, radius, radius);
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                
                //VẼ HÌNH TRÒN TIẾP THEO
                g.drawOval(-x + tamx, +y + tamy, radius, radius);
                count = count + 4;
                k = 0;
            }
        }
        k = 0;
        x = a;
        y = 0;
        //THIẾT LẬP ĐỂ VẼ HÌNH TRÒN TIẾP THEO
        P = a * a - b * b * a + b * b / 4;
        
        //VẼ HÌNH TRÒN
        g.drawOval(tamx + x, tamy + y, radius, radius);
        
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN TIẾP THEO
        g.drawOval(tamx - x, -y + tamy, radius, radius);
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        //VẼ HÌNH TRÒN TIẾP THEO
        g.drawOval(tamx + x, -y + tamy, radius, radius);
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        
        
        //VẼ HÌNH TRÒN TIẾP THEO
        g.drawOval(-x + tamx, +y + tamy, radius, radius);
        //RANDOM MÀU
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        c = new Color(red, green, blue);
        g.setColor(c);
        count = count + 4;
        while (x > x0) {
            if (P < 0) {
                //THIẾT LẬP ĐỂ VẼ HÌNH TRÒN TIẾP THEO
                P += (a * a) * (2 * y + 3);
            } else {
                P += (a * a) * (2 * y + 3) - 2 * b * b * (x - 1);

                x--;
            }
            y++;
            k++;
            if (k == radius / 2) {
                g.drawOval(tamx + x, tamy + y, radius, radius);
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                
                //VẼ HÌNH TRÒN TIẾP THEO
                g.drawOval(tamx - x, -y + tamy, radius, radius);
                //RANDOM MÀU
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                
                //VẼ HÌNH TRÒN TIẾP THEO
                g.drawOval(tamx + x, -y + tamy, radius, radius);
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                c = new Color(red, green, blue);
                g.setColor(c);
                
                //VẼ HÌNH TRÒN TIẾP THEO
                g.drawOval(-x + tamx, +y + tamy, radius, radius);
                count = count + 4;
                k = 0;
            }
        }
        // SET MÀU
        g.setColor(Color.BLACK);
        
        //TẠO FONT CHỮ
        Font myFont = new Font("Times New Roman ", 3, 14);
        g.setFont(myFont);
        //VIẾT CHỮ
        g.drawString("Khu vực được bao phủ bởi các cảm biến \n", radius / 3, 80);
        g.drawString("với số lượng cảm biến lên tới: " + count, radius / 3, 100);

    }

}
