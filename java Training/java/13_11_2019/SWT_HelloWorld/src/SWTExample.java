import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class SWTExample {

	public static void main(String[] args) {
		
		Display display = new Display();
		
		/* Define shell, it represents a window, You can add more than one shell to display*/
		Shell shell = new Shell(display);
		//Shell  shell1 = new Shell(display);
		
		
			
		/* DEefine widget to add to the shell*/
		Label label = new Label(shell, SWT.CENTER);
		label.setText("Hello World");
		label.setBounds(shell.getClientArea());
		
		
		//shell1.open();
		shell.open();
		
		/*
		 *Run the event dispatching loop until an exit condition occurs, which 
		 *is  typically when the main shell window is closed by the user
		 */
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
		
		/*while(!shell1.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}*/
		
		display.dispose();
	}

}
