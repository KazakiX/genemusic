package GeneMusic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class setMatchFrame extends JFrame implements ActionListener{
	GridLayout grid = new GridLayout(4,5);
	BorderLayout border = new BorderLayout();
	
	JPanel background = new JPanel(border);
	Box  bottombox = new Box(BoxLayout.X_AXIS);
	JButton  save = new JButton();
	JButton  returnmain = new JButton();
	
	JTextField[] jtf = new JTextField[20];
	JComboBox[] jcb = new JComboBox[20];
	
	JPanel mymatchbg = new JPanel(grid);//中间对应关系界面设计
	
//	String anjisuan[] ={"甘氨酸","丙氨酸","缬氨酸","亮氨酸","异亮氨酸","苯丙氨酸","脯氨酸","色氨酸",
//			"丝氨酸","酪氨酸","半胱氨酸","蛋氨酸","天冬酰胺","谷氨酰胺","苏氨酸",
//			"天冬氨酸","谷氨酸","赖氨酸","精氨酸","组氨酸"};
//	int genelist[]= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};//存放氨基酸对应的音符

	
	setMatchFrame(){
		
		setTitle("设置配对关系");// 窗口标题
        setSize(900,500);// 窗口大小
        setLocationRelativeTo(null);// 窗口居中
//        setDefaultCloseOperation(EXIT_ON_CLOSE);// 关闭窗口则退出虚拟机
		
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));//设定白色边缘
        save.setText("      保存             ");
        save.addActionListener(this);
        returnmain.setText("      返回             ");
        returnmain.addActionListener(this);
        bottombox.add(Box.createHorizontalStrut (100));
		bottombox.add(save);
		bottombox.add(Box.createHorizontalGlue ());
		bottombox.add(returnmain);
		bottombox.add(Box.createHorizontalStrut (100));
				for(int i=0; i<20; i++) {
				Box mymatchbox = new Box(BoxLayout.Y_AXIS);
				JPanel mymatch = new JPanel();
				JPanel length  = new JPanel();
				JLabel label1= new JLabel(Start.anjisuan[i]+"音调");
				JLabel label2= new JLabel(Start.anjisuan[i]+"音长");
				jtf[i] = new JTextField("jtf"+i,6);
				jcb[i] = new JComboBox();
				for(int j = 0;j<4;j++) {
					jcb[i].addItem(j+1);
				}
				jtf[i].addFocusListener(new JTextFieldHintListener("1-127", jtf[i]));
				jtf[i].setForeground(Color.GRAY);
				jtf[i].setText("1-127");
				mymatch.add(label1);
				mymatch.add(jtf[i]);
				length.add(label2);
				length.add(jcb[i]);
				mymatchbox.add(length);
				mymatchbox.add(mymatch);
				mymatchbg.add(mymatchbox);
        }
        //mymatch.add(Box.createVerticalStrut(10));	
		background.add(bottombox,BorderLayout.SOUTH);
		background.add(mymatchbg,BorderLayout.CENTER);
		
		add(background);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(returnmain)) {
			this.setVisible(false);
			//System.out.println("return");
		}
		if(e.getSource().equals(save)) {
			
			for(int i = 0;i<20;i++) {
				
				Start.ticklist[i]=(int) jcb[i].getSelectedItem();

			}
			
			
			for(int i = 0;i<20;i++) {
				if(jtf[i].getText().equals("1-127")) 
				{    
					Start.genelist[i]=i+1;
				}
				else{
				Start.genelist[i] = Integer.parseInt(jtf[i].getText());
				
				}
//				System.out.println(Start.genelist[i]);
			}
			
		}
	}
	public class JTextFieldHintListener implements FocusListener {//实现textfield提示信息
	    private String mHintText;
	    private JTextField mTextField;

	    public JTextFieldHintListener(String hintText, JTextField textField) {
	        this.mHintText = hintText;
	        this.mTextField = textField;
	        textField.setForeground(Color.GRAY);
	    }
	    @Override
	    public void focusGained(FocusEvent e) {
	        String temp = mTextField.getText();
	        if(temp.equals(mHintText)){
	            mTextField.setText("");
	            mTextField.setForeground(Color.BLACK);
	        }
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        String temp = mTextField.getText();
	        if(temp.equals("")){
	            mTextField.setForeground(Color.GRAY);
	            mTextField.setText(mHintText);
	        }
	    }
	}
	
//	public static void main(String[] args) {
//        new setMatchFrame().setVisible(true);//创建登录窗口,并可见
//    }
//	
}
