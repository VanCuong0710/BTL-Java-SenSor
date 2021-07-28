
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
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
public class Draw_Coverage_The_Points  extends JPanel {
    // CẤU HÌNH DỮ LIỆU
    public  int width;
    public  int heigh;
    public  int radius;
    public  int sodiem;

    public Draw_Coverage_The_Points(int width, int heigh, int radius, int sodiem) {
        //CONSTRUCTOR CHO DỮ LIỆU
        
        this.width = width;
        this.heigh = heigh;
        this.radius = radius;
        this.sodiem = sodiem;
    }
    public void paint(Graphics g) {
        Random random= new Random();
        //SET SIZE CHO HÌNH
        setSize(width+100,heigh+100);
        // VẼ VIỀN BAO QUANH
        g.drawRect(radius/3, radius/3, width, heigh);
        
        
        // CHO CHẠY SỐ ĐIỂM 
        for(int i=1;i<=sodiem;i++)
        {
            
            // VẼ TỌA TARGET
            int tamx=(int)random.nextInt(width-radius/3)+radius/3;
            int tamy=(int)random.nextInt(heigh-radius/3)+radius/3;
            
           
            // VẼ MÀU TÂM X + Y
            g.setColor(Color.red);
            g.fillOval(tamx-radius/5, tamy-radius/5, 8, 8);
            
            
            
            //VẼ VIỀN BAO QUANH TÂM ĐÓ
            int x=tamx-(int)random.nextInt(radius-radius/2+radius/6);//SET TOẠ ĐỘ
            int y=+tamy-(int)random.nextInt(radius-radius/2+radius/6);// SET TỌA ĐỘ
            g.setColor(Color.GREEN);
            // VẼ HÌNH TRÒN
            g.drawOval(x-radius/4, y-radius/4, radius, radius);
        }
        //TÍNH SỐ ĐIỂM THỪA ĐỄ VẼ THÊM VÀO HÌNH
        
        int sodiemthua=width*heigh/(radius*radius*2);
        int count =sodiem;
        int sodiemthuarandom=(int)random.nextInt(sodiemthua)+radius/5;
        for(int i=1;i<=sodiemthuarandom;i++)
        {
            int tamx=(int)random.nextInt(width);
            int tamy=(int)random.nextInt(heigh);
            g.drawOval(tamx, tamy, radius, radius);
            count++;
        }
        
        //SET FONT HIỆN THÔNG BÁO
        g.setColor(Color.black);
        Font myFont = new Font ("Times New Roman ",3, 14);
        g.setFont (myFont);
        g.drawString("Khu vực được bao phủ bởi các cảm biến \n",radius/3, heigh+40);
        g.drawString("với số lượng cảm biến lên tới: "+count,radius/3, heigh+60);
    }

  
}