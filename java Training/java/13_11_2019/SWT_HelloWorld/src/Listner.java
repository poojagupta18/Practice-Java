import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Listner {

	Listner(Display display)
	{
		init(display);
	}
	
	private void init(Display display)
	{
		Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.CENTER);
	
		Button b1 = new Button(shell, SWT.PUSH);
		b1.setText("Ok");
		b1.setBounds(50, 50, 50, 50);
		
	
		b1.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				System.out.println("Submit button was clicked");
			}
		});
		
		
		Text text1 = new Text(shell, SWT.BORDER);
		text1.setText("You cant's edit me" );
		text1.setBounds(200, 100, 100, 100);
		text1.setEditable(false);
		
		Text text2 = new Text(shell, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		text2.setText("Border scrollew text box");
		text2.setBounds(70, 80, 500, 350);
		
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
		Listner ls = new Listner(display);
	}

}
