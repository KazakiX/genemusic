package GeneMusic;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
 

public class mainFrame extends JFrame implements ActionListener {
    // 申明需要的组件
	
	
	
	setMatchFrame matchframe = new setMatchFrame();//定义配置界面
	paintFrame paint = new paintFrame();//定义五线谱界面
	Midi midi = new Midi();//定义播放类
	
	GridLayout grid = new GridLayout(1,2);//三种布局
	FlowLayout flow = new FlowLayout();
	BorderLayout border = new BorderLayout();
	
	
	
	JMenuBar jmbar = new JMenuBar();//定义菜单栏
	JMenu jmstart=new JMenu("开始(S)");
	JMenuItem jmiconversion=new JMenuItem("开始转换(C)",KeyEvent.VK_C);
	JMenuItem jmisetmatch=new JMenuItem("设置对应关系(N)",KeyEvent.VK_N);
	JMenuItem jmiclear=new JMenuItem("清除(R)",KeyEvent.VK_R);
	JMenuItem jmiexit=new JMenuItem("退出(E)",KeyEvent.VK_E);
	
   
	JPanel background = new JPanel(border);//定义背景panel
	
	ScrollPane leftscroll =new ScrollPane();//左边的氨基酸按钮滚动画布
	Box leftBox = new Box(BoxLayout.Y_AXIS);
	JButton c0 = new JButton("c0");
	JButton c1 = new JButton();
	JButton c2 = new JButton();
	JButton c3 = new JButton();
	JButton c4 = new JButton();
	JButton c5 = new JButton();
	JButton c6 = new JButton();
	JButton c7 = new JButton();
	JButton c8 = new JButton();
	JButton c9 = new JButton();
	JButton c10 = new JButton();
	JButton c11 = new JButton();
	JButton c12 = new JButton();
	JButton c13 = new JButton();
	JButton c14 = new JButton();
	JButton c15 = new JButton();
	JButton c16 = new JButton();
	JButton c17 = new JButton();
	JButton c18 = new JButton();
	JButton c19 = new JButton();
	
	Box rightBox = new Box(BoxLayout.Y_AXIS);//右边的功能box
	JButton  start = new JButton();
	JButton  clear = new JButton();
	JButton  setmatch = new JButton();
	JPanel combobox = new JPanel();
	JLabel label1 = new JLabel("乐器 ");
	JComboBox	instruments = new JComboBox();
	JPanel volume = new JPanel();
	JLabel volumeLabel = new JLabel("音量");
	JSlider volumeslider = new JSlider(0,100,50);
	JTextArea  jta = new JTextArea("请输入内容");
	
	
 

 
    public mainFrame() {
        // 窗口属性的设置
        setTitle("基因音乐");// 窗口标题
        setSize(900,500);// 窗口大小
        setLocationRelativeTo(null);// 窗口居中
        setDefaultCloseOperation(EXIT_ON_CLOSE);// 关闭窗口则退出虚拟机
       
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);//将弹出窗口设置到最顶层
        
        
        	//设置菜单栏
        jmstart.setMnemonic(KeyEvent.VK_S);    //设置快速访问符
        jmiconversion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        jmiconversion.addActionListener(this);
        jmstart.add(jmiconversion);
        jmisetmatch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        jmisetmatch.addActionListener(this);
        jmstart.add(jmisetmatch);
        jmiclear.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        jmiclear.addActionListener(this);
        jmstart.add(jmiclear);
        jmstart.addSeparator();
        jmiexit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
        jmiexit.addActionListener(this);
        jmstart.add(jmiexit);
        jmbar.add(jmstart);
        setJMenuBar(jmbar);
        
        
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));//设定白色边缘
        
        
//        设置20个氨基酸按钮
        c0.setName("c0");
        leftBox.add(c0);
        c0.setText(Start.anjisuan[0]);
        c0.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c1);
        c1.setText(Start.anjisuan[1]);
        c1.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c2);
        c2.setText(Start.anjisuan[2]);
        c2.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c3);
        c3.setText(Start.anjisuan[3]);
        c3.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c4);
        c4.setText(Start.anjisuan[4]);
        c4.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c5);
        c5.setText(Start.anjisuan[5]);
        c5.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c6);
        c6.setText(Start.anjisuan[6]);
        c6.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c7);
        c7.setText(Start.anjisuan[7]);
        c7.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c8);
        c8.setText(Start.anjisuan[8]);
        c8.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c9);
        c9.setText(Start.anjisuan[9]);
        c9.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c10);
        c10.setText(Start.anjisuan[10]);
        c10.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c11);
        c11.setText(Start.anjisuan[11]);
        c11.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c12);
        c12.setText(Start.anjisuan[12]);
        c12.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c13);
        c13.setText(Start.anjisuan[13]);
        c13.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c14);
        c14.setText(Start.anjisuan[14]);
        c14.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c15);
        c15.setText(Start.anjisuan[15]);
        c15.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c16);
        c16.setText(Start.anjisuan[16]);
        c16.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c17);
        c17.setText(Start.anjisuan[17]);
        c17.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c18);
        c18.setText(Start.anjisuan[18]);
        c18.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(c19);
        c19.setText(Start.anjisuan[19]);
        c19.addActionListener(this);
        leftscroll.add(leftBox);
        leftscroll.setPreferredSize(new Dimension(110,0));
		background.add(leftscroll,border.WEST);
        
		int bw =10 ,bh=90;//按钮大小应为是boxlayout 宽度值无效
		
		
			//start.setText("开始转换          ");
			start.setPreferredSize(new Dimension(bw,bh));//设置大小
			start.addActionListener(this);
			start.setText("     开始转换           ");
			clear.setText("     清除输入           ");
			clear.setPreferredSize(new Dimension(bw,bh));
			clear.addActionListener(this);
			
			setmatch.setText("设置基因对应方式");
			setmatch.setPreferredSize(new Dimension(bw,bh));
			setmatch.addActionListener(this);


	
			for(int i = 0;i<4;i++) {
				instruments.addItem(Start.ins[i]);
			}
			combobox.add(label1);
			combobox.add(instruments);
			
			
			
			volumeslider.setMajorTickSpacing(10);//设置滑块的属性
			volumeslider.setMinorTickSpacing(5);
			volumeslider.setPaintLabels(true);
			volumeslider.setPaintTicks(true);
			volume.add(volumeLabel);
			volume.add(volumeslider);
			
			rightBox.add(start);//将组建添加到rightbox里
			rightBox.add(Box.createVerticalStrut(10));
			rightBox.add(clear);
			rightBox.add(Box.createVerticalStrut(10));
			rightBox.add(setmatch);
			rightBox.add(Box.createVerticalStrut(10));
			rightBox.add(combobox);
			rightBox.add(Box.createVerticalStrut(10));
			rightBox.add(volume);
			rightBox.add(Box.createVerticalStrut(10));
			
			
			rightBox.createVerticalGlue();
			rightBox.setPreferredSize(new Dimension(250,0));
		background.add(rightBox, border.EAST);
		
		
		 
		jta.setLineWrap(true);    //设置文本域中的文本为自动换行
        jta.setForeground(Color.BLACK);    //设置组件的背景色
        jta.setWrapStyleWord(true);
        jta.setFont(new Font("楷体",Font.BOLD,16)); //修改字体
        
        JScrollPane jsp=new JScrollPane(jta);  
        background.add(jsp,border.CENTER); 
        
        
        setJMenuBar(jmbar);
        add(background);
        
 
    }
 
    // 动作响应
    public void actionPerformed(ActionEvent e) {//设置整个界面的监听器
        if(e.getSource().equals(c0)) {//判断组件
        	if(jta.getText().equals("请输入内容")) {//判断是否输入过
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[0]+',');
        	Start.anjisuanlist.add(0);
        }
        else if(e.getSource().equals(c1)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[1]+',');
        	Start.anjisuanlist.add(1);
        }
        else if(e.getSource().equals(c2)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[2]+',');
        	Start.anjisuanlist.add(2);
        }
        else if(e.getSource().equals(c3)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[3]+',');
        	Start.anjisuanlist.add(3);
        }
        else if(e.getSource().equals(c4)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[4]+',');
        	Start.anjisuanlist.add(4);
        }
        else if(e.getSource().equals(c5)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[5]+',');
        	Start.anjisuanlist.add(5);
        }
        else if(e.getSource().equals(c6)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[6]+',');
        	Start.anjisuanlist.add(6);
        }
        else if(e.getSource().equals(c7)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        		
        	}
        	jta.append(Start.anjisuan[7]+',');
        	Start.anjisuanlist.add(7);
        }
        else if(e.getSource().equals(c8)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[8]+',');
        	Start.anjisuanlist.add(8);

        }
        else if(e.getSource().equals(c9)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[9]+',');
        	Start.anjisuanlist.add(9);
        }
        else if(e.getSource().equals(c10)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[10]+',');
        	Start.anjisuanlist.add(10);
        }
        else if(e.getSource().equals(c11)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[11]+',');
        	Start.anjisuanlist.add(11);
        }
        else if(e.getSource().equals(c12)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[12]+',');
        	Start.anjisuanlist.add(12);
        }
        else if(e.getSource().equals(c13)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[13]+',');
        	Start.anjisuanlist.add(13);
        	
        }
        else if(e.getSource().equals(c14)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[14]+',');
        	Start.anjisuanlist.add(14);
        }else if(e.getSource().equals(c15)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[15]+',');
        	Start.anjisuanlist.add(15);
        }
        else if(e.getSource().equals(c16)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[16]+',');
        	Start.anjisuanlist.add(16);
        }
        else if(e.getSource().equals(c17)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[17]+',');
        	Start.anjisuanlist.add(17);
        }
        else if(e.getSource().equals(c18)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[18]+',');
        	Start.anjisuanlist.add(18);
        }
        else if(e.getSource().equals(c19)) {
        	if(jta.getText().equals("请输入内容")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[19]+',');
        	Start.anjisuanlist.add(19);
        }
        else if (e.getSource().equals(clear)) {
        	jta.setText("");
        	Start.anjisuanlist.clear();
        }
        else if (e.getSource().equals(setmatch)) {
        	matchframe.setVisible(true);
        }
        else if (e.getSource().equals(start)) {
        	Start.high = volumeslider.getValue();
//        	System.out.println(Start.high);
        	
        	
        	String s =instruments.getSelectedItem().toString();
        	if(s.equals("贝斯")) {
        		Start.chan = 33;
        	}
        	else if(s.equals("钢琴")) {
        		Start.chan = 0;
        	}
        	else if(s.equals("吉他")) {
        		Start.chan = 24;
        		
        	}
        	else if(s.equals("小提琴")) {
        		Start.chan = 42;
        	}
        	paint.setVisible(true);
        	paint.start();
        	midi.start();

        	
        }
        else if(e.getSource().equals(jmiconversion))
        	{

        	String s =instruments.getSelectedItem().toString();
        	if(s.equals("贝斯")) {
        		Start.chan = 34;
        	}
        	else if(s.equals("钢琴")) {
        		Start.chan = 0;
        	}
        	else if(s.equals("吉他")) {
        		Start.chan = 24;
        		
        	}
        	else if(s.equals("小提琴")) {
        		Start.chan = 42;
        	}
        	paint.setVisible(true);
        	paint.start();
        	midi.start();
        	
        	}
        else if(e.getSource().equals(jmiconversion))
		{
			
        	Start.high = volumeslider.getValue();
//        	System.out.println(Start.high);

        	String s =instruments.getSelectedItem().toString();
        	if(s.equals("贝斯")) {
        		Start.chan = 34;
        	}
        	else if(s.equals("钢琴")) {
        		Start.chan = 0;
        	}
        	else if(s.equals("吉他")) {
        		Start.chan = 24;
        		
        	}
        	else if(s.equals("小提琴")) {
        		Start.chan = 42;
        	}
        	paint.setVisible(true);
        	paint.start();
        	midi.start();
		}
		else if(e.getSource().equals(jmisetmatch))
			{
				
				matchframe.setVisible(true);

			}
		else if(e.getSource().equals(jmiclear))
			{
				jta.setText("");
	        	Start.anjisuanlist.clear();

			}
		else if(e.getSource().equals(jmiexit))
			{
				System.out.println("退出");
				System.exit(0);

			}
       
    }

    
     
    //main方法, 程序的入口
//    public static void main(String[] args) {
//        new mainFrame().setVisible(true);//创建登录窗口,并可见
//    }
 
}