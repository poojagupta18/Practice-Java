import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Login {

	public static void main(String[] args) {
		/*
		 * Display display = new Display(); Shell shell = new Shell(display);
		 * 
		 * 
		 * 
		 * Label label1 = new Label(shell, SWT.NONE);
		 * 
		 * label1.setText("Username"); label1.setBounds(350, 100, 100, 80);
		 * 
		 * Text username = new Text(shell, SWT.SINGLE | SWT.BORDER);
		 * username.setText("hhhh"); username.setTextLimit(30); username.setBounds(450,
		 * 100,100, 89);
		 * 
		 * 
		 * new Text(shell, SWT.BORDER);
		 */
		 Display display = new Display();
		  Shell shell = new Shell(display);
		  Label label1,label2;
		  
		  Label label = new Label(shell, SWT.NONE);
		  label.setText("Login Page");
		  label.setBounds(430, 50, 100, 80);
		  
		  shell.setLayout(new GridLayout());
		  shell.setText("Login form");
		  
		  label1=new Label(shell, SWT.NULL);
		  label1.setText("User Name: ");
		  
		  Text username = new Text(shell, SWT.SINGLE | SWT.BORDER);
		  username.setText("");
		  username.setTextLimit(30);
		  
		  label2=new Label(shell, SWT.NULL);
		  label2.setText("Password: ");
		  
		  Text password = new Text(shell, SWT.SINGLE | SWT.BORDER);
		  System.out.println(password.getEchoChar());
		  password.setEchoChar('*');
		  password.setTextLimit(30);

		  Button button=new Button(shell,SWT.PUSH);
		  button.setText("Login");
		  
		  
		  
		  
		  shell.open();
		
		  button.addSelectionListener(new SelectionAdapter(){
				public void widgetSelected(SelectionEvent e)
				{
					System.out.println("Login button was clicked");
				}
			});
		  
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}	
	}

}
