import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.events.TreeListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class TreeListner {

	private static int shellWidth = 1000;
	private static int shellHeight = 700;
	
	private static void addWidgetsToShell(Display display, Shell shell)
	{
		Tree tree = new Tree(shell, SWT.MULTI | SWT.BORDER);
		
		tree.setSize(150, 150);
		tree.setLocation(5, 5);
		
		TreeItem child1 = new TreeItem(tree, SWT.NONE);
		child1.setText("Drive A");
		
		TreeItem child2 = new TreeItem(tree, SWT.NONE, 1);
		child2.setText("Drive B");
		
		TreeItem child3 = new TreeItem(tree, SWT.NONE);
		child3.setText("Drive C");
		
		TreeItem child2_1 = new TreeItem(child2, SWT.NONE);
		child2_1.setText("Drive A_1");
		
		TreeItem child2_2 = new TreeItem(child2, SWT.NONE);
		child2_2.setText("Drive A_2");
		
		
		tree.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				TreeItem[] selectedItem = tree.getSelection();
				System.out.println("Selected Items:");
				
				for(int i = 0; i < selectedItem.length; i++)
				{
					System.out.println(selectedItem[i].getText() + ", ");
				}
				
				System.out.println();
			}
			
		});
		
		
		tree.addTreeListener(new TreeListener() {
			
			@Override
			public void treeExpanded(TreeEvent arg0) {
				System.out.println("Tree Expanded");
			}
			
			@Override
			public void treeCollapsed(TreeEvent arg0) {
				System.out.println("Tree Collapsed");
				
			}
		});
		
	}
	public static void main(String[] args) {

		Display display = new Display();
		
		Shell shell = new Shell(display);
		
		shell.setSize(shellWidth, shellHeight);
		shell.setText("Tree   ");
		
		shell.open();
		addWidgetsToShell(display, shell);
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}		
		
	}

}
