import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ButtonExample {

	public ButtonExample(Display display)
	{
		//initUI(display);
		initUI1(display);
	}
	
	private void initUI(Display display) {

		Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.CENTER);
		
		FormLayout layout = new FormLayout();
		shell.setLayout(layout);
		
		Button okBtn = new Button(shell, SWT.PUSH);
		okBtn.setText("Ok");
		
		Button cancBtn = new Button(shell, SWT.PUSH);
		cancBtn.setText("Cancel");
		
		FormData cancelData = new FormData(80, 30);
		cancelData.right = new FormAttachment(98);
		cancelData.bottom = new FormAttachment(95);
		cancBtn.setLayoutData(cancelData);
		
		FormData okData = new FormData(80, 30);
		okData.right = new FormAttachment(cancBtn, -5, SWT.LEFT);
		okData.bottom = new FormAttachment(cancBtn, 0, SWT.BOTTOM);
		okBtn.setLayoutData(okData);
		
		shell.setText("Buttons");
		shell.setSize(350, 200);
		shell.open();
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}	
		
	}

	private void initUI1(Display display) {

		Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.CENTER);
		
		FormLayout layout = new FormLayout();
		shell.setLayout(layout);
		
		Button okBtn = new Button(shell, SWT.PUSH);
		okBtn.setText("Ok");
		
		Button cancBtn = new Button(shell, SWT.PUSH);
		cancBtn.setText("Cancel");
		
		FormData okdata1 = new FormData(80, 30);
		okdata1.left = new FormAttachment(2);
		okdata1.bottom = new FormAttachment(95);
		okBtn.setLayoutData(okdata1);
		
		FormData cancel = new FormData(80, 30);
		cancel.left = new FormAttachment(okBtn, 15, SWT.RIGHT);
		cancel.bottom = new FormAttachment(okBtn, 0, SWT.BOTTOM);
		cancBtn.setLayoutData(cancel);
		
		/*
		 * FormData cancelData = new FormData(80, 30); cancelData.left = new
		 * FormAttachment(2); cancelData.bottom = new FormAttachment(95);
		 * cancBtn.setLayoutData(cancelData);
		 * 
		 * FormData okData = new FormData(80, 30); okData.left = new
		 * FormAttachment(cancBtn, 15, SWT.LEFT); okData.bottom = new
		 * FormAttachment(cancBtn, 0, SWT.BOTTOM); okBtn.setLayoutData(okData);
		 */
		
		shell.setText("Buttons");
		shell.setSize(350, 200);
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
		ButtonExample btn = new ButtonExample(display);
		display.dispose();
	}

}
