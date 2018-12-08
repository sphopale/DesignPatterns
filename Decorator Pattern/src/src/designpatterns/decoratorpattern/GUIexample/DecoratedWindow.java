package src.designpatterns.decoratorpattern.GUIexample;

public class DecoratedWindow implements Window {
	private Window privateWindowReference=null;
	
	public DecoratedWindow(Window windowReference) {
		this.privateWindowReference=windowReference;
	}
	
	@Override
	public void renderWindow() {
		// TODO Auto-generated method stub
		privateWindowReference.renderWindow();
	}

	
}
