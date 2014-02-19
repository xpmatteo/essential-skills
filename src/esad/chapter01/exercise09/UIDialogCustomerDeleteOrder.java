package esad.chapter01.exercise09;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;

public class UIDialogCustomerDeleteOrder extends Dialog {

	public UIDialogCustomerDeleteOrder(Dialog owner, String title, boolean modal, GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		
	}

	public UIDialogCustomerDeleteOrder(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		
	}

	public UIDialogCustomerDeleteOrder(Dialog owner, String title) {
		super(owner, title);
		
	}

	public UIDialogCustomerDeleteOrder(Dialog owner) {
		super(owner);
		
	}

	public UIDialogCustomerDeleteOrder(Frame owner, boolean modal) {
		super(owner, modal);
		
	}

	public UIDialogCustomerDeleteOrder(Frame owner, String title, boolean modal, GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		
	}

	public UIDialogCustomerDeleteOrder(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		
	}

	public UIDialogCustomerDeleteOrder(Frame owner, String title) {
		super(owner, title);
		
	}

	public UIDialogCustomerDeleteOrder(Frame owner) {
		super(owner);
		
	}

}
