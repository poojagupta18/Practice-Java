import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class AbsoluteLayoutExample {

	
	public AbsoluteLayoutExample(Display display)
	{
		initUI(display);
	}
	
	private void initUI(Display display)
	{
		Shell shell = new Shell(display);
		
		Button b1 = new Button(shell, SWT.CENTER);
		b1.setText("Button1");
		
		b1.setBounds(20,  30, 70, 70);
		
		Button b2 = new Button(shell, SWT.PUSH);
		b2.setText("Button2");
		b2.setSize(80, 30);
		b2.setLocation(50, 100);
		
		shell.setText("Absolute Layout");
		
		shell.open();
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
		
	}
	
	public static void main(String[] args) {

		Display display = new Display();
		AbsoluteLayoutExample obj = new AbsoluteLayoutExample(display);
	}

}
