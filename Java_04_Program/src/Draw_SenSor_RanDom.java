/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author 84866
 */
public class Draw_SenSor_RanDom extends JPanel {

    public int width;
    public int heigh;
    public int radius;

    public Draw_SenSor_RanDom(int width, int heigh, int radius) {
        this.width = width;
        this.heigh = heigh;
        this.radius = radius;
    }

    public void paint(Graphics g) {
        // SET SIZE
        setSize(width + 100, heigh + 100);
        //VẼ VÙNG BÊN
        g.drawRect(radius / 3, radius / 3, width, heigh);
        
        //KHAI BÁO BIẾN RANDOM
        Random random = new Random();
        // TÍNH MỘT NỬA BÁN KÍNH ĐỂ VẼ CHỮ
        int vechu = radius / 2;
        
        
        //THIẾT LẬP TỈ LỆ RANDOM
        int solanrandom = (int) (heigh * width) / (vechu * radius);
        //CHỌN MỘT SỐ RANDOM
        
        int z = random.nextInt(radius) + solanrandom;
        for (int i = 0; i < z; i++) {
            
            int x = random.nextInt(width);
            int y = random.nextInt(heigh);
            g.setColor(Color.BLUE);
            g.drawOval(x, y, radius, radius);
            g.setColor(Color.BLACK);
            g.drawString("" + (i + 1), x + vechu, y + vechu);
            

        }
        g.setColor(Color.red);
        Font myFont = new Font("Times New Roman ", 3, 14);
        g.setFont(myFont);
        g.drawString("Khu vực được bao phủ bởi các cảm biến \n", radius / 3, heigh + radius+radius/3);
        g.drawString("với số lượng cảm biến lên tới: " + z, radius / 3, heigh + radius+radius/3+20);
    }

}
