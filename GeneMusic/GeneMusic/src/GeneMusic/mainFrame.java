package GeneMusic;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
 

public class mainFrame extends JFrame implements ActionListener {
    // ������Ҫ�����
	
	
	
	setMatchFrame matchframe = new setMatchFrame();//�������ý���
	paintFrame paint = new paintFrame();//���������׽���
	Midi midi = new Midi();//���岥����
	
	GridLayout grid = new GridLayout(1,2);//���ֲ���
	FlowLayout flow = new FlowLayout();
	BorderLayout border = new BorderLayout();
	
	
	
	JMenuBar jmbar = new JMenuBar();//����˵���
	JMenu jmstart=new JMenu("��ʼ(S)");
	JMenuItem jmiconversion=new JMenuItem("��ʼת��(C)",KeyEvent.VK_C);
	JMenuItem jmisetmatch=new JMenuItem("���ö�Ӧ��ϵ(N)",KeyEvent.VK_N);
	JMenuItem jmiclear=new JMenuItem("���(R)",KeyEvent.VK_R);
	JMenuItem jmiexit=new JMenuItem("�˳�(E)",KeyEvent.VK_E);
	
   
	JPanel background = new JPanel(border);//���屳��panel
	
	ScrollPane leftscroll =new ScrollPane();//��ߵİ����ᰴť��������
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
	
	Box rightBox = new Box(BoxLayout.Y_AXIS);//�ұߵĹ���box
	JButton  start = new JButton();
	JButton  clear = new JButton();
	JButton  setmatch = new JButton();
	JPanel combobox = new JPanel();
	JLabel label1 = new JLabel("���� ");
	JComboBox	instruments = new JComboBox();
	JPanel volume = new JPanel();
	JLabel volumeLabel = new JLabel("����");
	JSlider volumeslider = new JSlider(0,100,50);
	JTextArea  jta = new JTextArea("����������");
	
	
 

 
    public mainFrame() {
        // �������Ե�����
        setTitle("��������");// ���ڱ���
        setSize(900,500);// ���ڴ�С
        setLocationRelativeTo(null);// ���ھ���
        setDefaultCloseOperation(EXIT_ON_CLOSE);// �رմ������˳������
       
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);//�������������õ����
        
        
        	//���ò˵���
        jmstart.setMnemonic(KeyEvent.VK_S);    //���ÿ��ٷ��ʷ�
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
        
        
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));//�趨��ɫ��Ե
        
        
//        ����20�������ᰴť
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
        
		int bw =10 ,bh=90;//��ť��СӦΪ��boxlayout ���ֵ��Ч
		
		
			//start.setText("��ʼת��          ");
			start.setPreferredSize(new Dimension(bw,bh));//���ô�С
			start.addActionListener(this);
			start.setText("     ��ʼת��           ");
			clear.setText("     �������           ");
			clear.setPreferredSize(new Dimension(bw,bh));
			clear.addActionListener(this);
			
			setmatch.setText("���û����Ӧ��ʽ");
			setmatch.setPreferredSize(new Dimension(bw,bh));
			setmatch.addActionListener(this);


	
			for(int i = 0;i<4;i++) {
				instruments.addItem(Start.ins[i]);
			}
			combobox.add(label1);
			combobox.add(instruments);
			
			
			
			volumeslider.setMajorTickSpacing(10);//���û��������
			volumeslider.setMinorTickSpacing(5);
			volumeslider.setPaintLabels(true);
			volumeslider.setPaintTicks(true);
			volume.add(volumeLabel);
			volume.add(volumeslider);
			
			rightBox.add(start);//���齨��ӵ�rightbox��
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
		
		
		 
		jta.setLineWrap(true);    //�����ı����е��ı�Ϊ�Զ�����
        jta.setForeground(Color.BLACK);    //��������ı���ɫ
        jta.setWrapStyleWord(true);
        jta.setFont(new Font("����",Font.BOLD,16)); //�޸�����
        
        JScrollPane jsp=new JScrollPane(jta);  
        background.add(jsp,border.CENTER); 
        
        
        setJMenuBar(jmbar);
        add(background);
        
 
    }
 
    // ������Ӧ
    public void actionPerformed(ActionEvent e) {//������������ļ�����
        if(e.getSource().equals(c0)) {//�ж����
        	if(jta.getText().equals("����������")) {//�ж��Ƿ������
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[0]+',');
        	Start.anjisuanlist.add(0);
        }
        else if(e.getSource().equals(c1)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[1]+',');
        	Start.anjisuanlist.add(1);
        }
        else if(e.getSource().equals(c2)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[2]+',');
        	Start.anjisuanlist.add(2);
        }
        else if(e.getSource().equals(c3)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[3]+',');
        	Start.anjisuanlist.add(3);
        }
        else if(e.getSource().equals(c4)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[4]+',');
        	Start.anjisuanlist.add(4);
        }
        else if(e.getSource().equals(c5)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[5]+',');
        	Start.anjisuanlist.add(5);
        }
        else if(e.getSource().equals(c6)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[6]+',');
        	Start.anjisuanlist.add(6);
        }
        else if(e.getSource().equals(c7)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        		
        	}
        	jta.append(Start.anjisuan[7]+',');
        	Start.anjisuanlist.add(7);
        }
        else if(e.getSource().equals(c8)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[8]+',');
        	Start.anjisuanlist.add(8);

        }
        else if(e.getSource().equals(c9)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[9]+',');
        	Start.anjisuanlist.add(9);
        }
        else if(e.getSource().equals(c10)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[10]+',');
        	Start.anjisuanlist.add(10);
        }
        else if(e.getSource().equals(c11)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[11]+',');
        	Start.anjisuanlist.add(11);
        }
        else if(e.getSource().equals(c12)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[12]+',');
        	Start.anjisuanlist.add(12);
        }
        else if(e.getSource().equals(c13)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[13]+',');
        	Start.anjisuanlist.add(13);
        	
        }
        else if(e.getSource().equals(c14)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[14]+',');
        	Start.anjisuanlist.add(14);
        }else if(e.getSource().equals(c15)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[15]+',');
        	Start.anjisuanlist.add(15);
        }
        else if(e.getSource().equals(c16)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[16]+',');
        	Start.anjisuanlist.add(16);
        }
        else if(e.getSource().equals(c17)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[17]+',');
        	Start.anjisuanlist.add(17);
        }
        else if(e.getSource().equals(c18)) {
        	if(jta.getText().equals("����������")) {
        		jta.setText("");
        	}
        	jta.append(Start.anjisuan[18]+',');
        	Start.anjisuanlist.add(18);
        }
        else if(e.getSource().equals(c19)) {
        	if(jta.getText().equals("����������")) {
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
        	if(s.equals("��˹")) {
        		Start.chan = 33;
        	}
        	else if(s.equals("����")) {
        		Start.chan = 0;
        	}
        	else if(s.equals("����")) {
        		Start.chan = 24;
        		
        	}
        	else if(s.equals("С����")) {
        		Start.chan = 42;
        	}
        	paint.setVisible(true);
        	paint.start();
        	midi.start();

        	
        }
        else if(e.getSource().equals(jmiconversion))
        	{

        	String s =instruments.getSelectedItem().toString();
        	if(s.equals("��˹")) {
        		Start.chan = 34;
        	}
        	else if(s.equals("����")) {
        		Start.chan = 0;
        	}
        	else if(s.equals("����")) {
        		Start.chan = 24;
        		
        	}
        	else if(s.equals("С����")) {
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
        	if(s.equals("��˹")) {
        		Start.chan = 34;
        	}
        	else if(s.equals("����")) {
        		Start.chan = 0;
        	}
        	else if(s.equals("����")) {
        		Start.chan = 24;
        		
        	}
        	else if(s.equals("С����")) {
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
				System.out.println("�˳�");
				System.exit(0);

			}
       
    }

    
     
    //main����, ��������
//    public static void main(String[] args) {
//        new mainFrame().setVisible(true);//������¼����,���ɼ�
//    }
 
}