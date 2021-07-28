
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 84866
 */
public class Draw_K_Barrier extends JPanel {
    //TẠO BIẾN
    public int width;
    public int heigh;
    public int radius;

    public Draw_K_Barrier(int width, int heigh, int radius) {
        //CONSTRUCTOR
        this.width = width;
        this.heigh = heigh;
        this.radius = radius;

    }

    public void paint(Graphics g) {
        // TẠO BIẾN DỂ ĐẾM SỐ LƯỢNG SENSOR
        int count = 1;
        //SET UP KÍCH CỠ
        setSize(width + 200, heigh + 200);
        // TẠO KHUNG VIỀN
        g.drawRect(0, 0, width-radius/3, heigh-radius/3);

        // TRƯƠNG HỢP HỆ SỐ GÓC   0<M< 1 
        
        //ĐIỂM THỨ NHẤT
        int x1 = 0;
        int y1 = 0;
        //ĐIỂM THỨ 2
        int x2 = width;
        int y2 = (int) (heigh * 0.29);
        //TẠO CÁC BIẾN LƯU TRỮ
        int x, y, dx, dy, p;
        int k = 0;
        //SET COLOR
        g.setColor(Color.red);
        dx = x2 - x1;
        dy = y2 - y1;
        p = 2 * dy - dx;
        x = x1;
        y = y1;
        //TẠO BIẾN CỐ ĐỊNH = BÁN KÍNH /2 
        int veso = Math.round(radius / 2);
        // VIẾT SỐ LƯỢNG CẢM BIẾN SENSOR
        g.drawString(count + "", x + veso, y + veso);
        //VẼ HÌNH TRÒN ĐẦU TIÊN
        g.drawOval(x, y, radius, radius);
        while (x != x2) {
            if (p < 0) {
                p += 2 * dy;
            } else {
                p += 2 * (dy - dx);
                y++;
            }
            k++;
            x++;
            {
                if (k == radius - 2) {
                    //VẼ CÁC HÌNH TRÒN TIẾP THEO
                    count++;

                    g.drawOval(x, y, radius, radius);
                    
                    g.drawString(count + "", x + veso, y + veso);
                    k = 0;

                }
            }
        }
        
        //SET UP MÀU
        g.setColor(Color.gray);
        //ĐIỂM THỨ NHẤT
        x1 = 0;
        y1 = (int) Math.round(heigh * 0.54);
        // CHỌN ĐIỂM THỨ 2
        x2 = width;
        y2 = (int) (Math.round(heigh * 0.27) + radius * 0.98);

        dx = x2 - x1;
        dy = y2 - y1;
        p = 2 * dy + dx;

        x = x1;
        y = y1;

        k = 0;

        count++;

        g.drawOval(x, y, radius, radius);

        g.drawString(count + "", x + veso, y + veso);

        while (x != x2) {
            x++;
            k++;

            if (k == radius - 2) {
                count++;//BIẾN ĐẾM SENSOR
                //VẼ CÁC ĐIỂM
                g.drawOval(x, y, radius, radius);
                //TÍNH SỐ LƯỢNG ĐIỂM
                g.drawString(count + "", x + veso, y + veso);
                k = 0;
            }

            if (p >= 0) {

                p = p + 2 * dy;

            } else {
                p = p + (2 * dy + 2 * dx);
                y--;
            }

        }

        // SET UP MÀU
        g.setColor(Color.MAGENTA);
        
        //ĐIỂM ĐẦU TIÊN
        x1 = 0;
        y1 = (int) Math.round(heigh * 0.54) + radius;
        //ĐIỂM THỨ 2
        x2 = width;
        y2 = (int) (heigh - radius * 0.9);
        //TÍNH DX DY
        dx = x2 - x1;
        dy = y2 - y1;

        p = 2 * dy - dx;
        x = x1;
        y = y1;

        // TĂNG BIẾN ĐẾM
        count++;
        //VẼ HÌNH TRÒN THỨ NHẤT
        g.drawOval(x, y, radius, radius);
        //VẼ ĐIỂM
        g.drawString(count + "", x + veso, y + veso);
        k = 0;
        while (x != x2) {
            if (p < 0) {
                p += 2 * dy;
            } else {
                p += 2 * (dy - dx);
                y++;
            }
            k++;
            x++;

            {
                if (k == radius - 2) {
                    count++;//TĂNG SỐ LƯỢNG BIẾN ĐIẾM
                    //
                    g.drawOval(x, y, radius, radius);
                    //VẼ HÌNH TRÒN TIẾP THEO
                    g.drawString(count + "", x + veso, y + veso);
                    k = 0;

                }
            }

        }
        
        //CHỌN PHÔNG CHỮ VÀ MÀU CHỮ
        g.setColor(Color.red);
        Font myFont = new Font("Times New Roman ", 3, 14);
        g.setFont(myFont);
        //SET UP TEXT
        g.drawString("Khu vực được bao phủ bởi các cảm biến \n", radius / 3, heigh + 40);
        g.drawString("số lượng cảm biến lên tới: " + count, radius / 3, heigh + 60);

    }

}
