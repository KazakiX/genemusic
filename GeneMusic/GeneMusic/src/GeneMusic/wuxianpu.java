package GeneMusic;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class wuxianpu extends JPanel{
		
		
//		int [] s= {5,23,45,56,66,3,6,7};
		public void paint(Graphics g) {
			super.paint(g);
			int x=0,y;
			for(y=30;y<1000;y=y+10,x++) {
				if(x==5) {y=y+20;x=0;};
				g.drawLine(50, y, 680, y);//����������
			}
			
			 	int x1=50,count=0,y1=0;  //x1Ϊ���������꣬countΪ����,y1Ϊ����������
			 	for(int i=0;i<Start.musiclist.size();i++){         //s[i]Ϊ�����MIDI��������
	    	    	 if(x1>=680) {x1=50;count++;};
	    	    	 int t=Start.musiclist.get(i);
	    	    	 int n= Start.longlist.get(i);
	    	    	 if(t>=0 && t<128) {
	        	     if(t==0||t%12==0) {
	    	              y1=20;
	    	              if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}

	    	              x1=x1+30;
	    	    	}
	    	     
	    	        if(t==2||(t-2)%12==0) {
	    	        	y1=14;
	    	        	  if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}
	    	        	x1=x1+30;
		    	   }
	    	     
	    	        if(t==4||(t-4)%12==0) {//s[i]����λ��
	    	        	y1=10;
	    	        	if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	       		x1=x1+30;
	    	        }
	    	     
	    	        if(t==5||(t-5)%12==0) {
	    	        	y1=5;
	    	        	if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	        	x1=x1+30;
	    	        }
	    	     
	    	        if(t==7||(t-7)%12==0) {
	    	        	y1=0;
	    	        	if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	        	x1=x1+30;
	    	        }
	    	     
	    	        if(t==9||(t-9)%12==0) {
	    	        	y1=-8;
	    	        	if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	        	x1=x1+30;
	    	        }
	    	     
	    	        if(t==11||(t-11)%12==0) {
	    	        	y1=-14;
	    	        	if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	        	x1=x1+30;
	    	        }
	    	        if(t==1||(t-1)%12==0) {
	    	        	  y1=20;
	    	        	  if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	              x1=x1+30;
	    	        }
	    	        if(t==3||(t-3)%12==0) {
	    	        	y1=14;
	    	        	if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	        	x1=x1+30;
	    	        }
	    	        if(t==6||(t-6)%12==0) {
	    	        	y1=5;
	    	        	if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	        	x1=x1+30;
	    	        }
	    	        if(t==8||(t-8)%12==0) {
	    	        	y1=0;
	    	        	if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	        	x1=x1+30;
	    	        }
	    	        if(t==10||(t-10)%12==0) {
	    	        	y1=-8;
	    	        	if(n==1) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\��������.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==2) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�ķ�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==3) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\�˷�����.png").getImage(), x1, y1+70*count, this);}
	    	              if(n==4) {g.drawImage(new ImageIcon("F:\\java\\GeneMusic\\GeneMusic\\pic\\ʮ��������.png").getImage(), x1, y1+70*count, this);}	    	        	x1=x1+30;
	    	        }
	    	    }
	    	 }
		}
}