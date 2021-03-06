import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class RowLayoutExample {

	public RowLayoutExample(Display display) {
		initUI(display);
	
	}

	private void initUI(Display display)
	{
	
		Shell shell = new Shell(display,SWT.SHELL_TRIM | SWT.CENTER);
		
		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.marginTop = 100;
		rowLayout.marginBottom = 10;
		rowLayout.marginLeft = 20;
		rowLayout.marginRight = 5;
		rowLayout.spacing = 10;
		shell.setLayout(rowLayout);
		
		Button b1 = new Button(shell, SWT.PUSH);
		b1.setText("Button");
		b1.setLayoutData(new RowData(80, 30));
		
		Button b2 = new Button(shell, SWT.PUSH);
		b2.setText("Button");
		b2.setLayoutData(new RowData(80, 30));
		
		Button b3 = new Button(shell, SWT.PUSH);
		b3.setText("Button");
		b3.setLayoutData(new RowData(50, 20));
		
		shell.setText("RowLayout");
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
		RowLayoutExample rowLayoutExample = new RowLayoutExample(display);
		display.dispose();
	}

}
