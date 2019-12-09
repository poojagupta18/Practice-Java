import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FillLayoutExample {

	public static void main(String[] args) {

		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
	
	
		Composite parent = new Composite(shell, SWT.NONE);
		
		FillLayout fillLayout = new FillLayout();
		fillLayout.type = SWT.VERTICAL;
		
		
		parent.setLayout(fillLayout);
		
		Button b1 = new Button(parent, SWT.NONE);
		b1.setText("B1");
		
		Button b2 = new Button(parent, SWT.NONE);
		b2.setText("B2");
		
		Button b3 = new Button(parent, SWT.NONE);
		b3.setText("B3");
		
		shell.pack();
		
		shell.open();
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
	
	}

}
