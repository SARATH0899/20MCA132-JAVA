//Simple Calculator using AWT components

import java.awt.*;
import java.awt.event.*;

class Calc extends Frame implements ActionListener {
	TextField tinput;
	Panel panel;
	String btnString[] = {"7", "8", "9", "+",
	"4", "5", "6", "-",
	"1", "2", "3", "*",
	"c", "0", "=", "/"};
	
	Button btn[] = new Button[16];
	int num1=0, num2=0, result=0;
	char op;
	
	public Calc() {
		Font f = new Font("Arial", Font.BOLD,18);
		tinput = new TextField(10);
		tinput.setFont(f);
		panel = new Panel();
		
		add(tinput, "North");
		add(panel, "Center");
		panel.setLayout(new GridLayout(4,4));
		for(int i=0;i<16;i++){
			btn[i] = new Button(btnString[i]);
			btn[i].setFont(f);
			btn[i].addActionListener(this);
			panel.add(btn[i]);
		}
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent ae){
    String str = ae.getActionCommand();

    if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
        num1 = Integer.parseInt(tinput.getText());
        op = str.charAt(0);
        tinput.setText("");
    }
    else if(str.equals("=")) {
        num2 = Integer.parseInt(tinput.getText());
        switch(op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        tinput.setText(String.valueOf(result));
    }
    else if(str.equals("c")) {
        tinput.setText("");
    }
    else {
        tinput.setText(tinput.getText() + str);
    }
}

public static void main(String[] args) {
    Calc calculator = new Calc();
    calculator.setTitle("Calculator");
    calculator.setSize(300, 300);
    calculator.setVisible(true);
}
}


			
	

	
