package src.designpatterns.decoratorpattern.GUIexample;

public class ScrollabelWindow extends DecoratedWindow {

	private Object scrollBarObjectRepresentation=null;
	
	public ScrollabelWindow(Window windowReference) {
		super(windowReference);
	}
	
	@Override
	public void renderWindow() {
		
		renderScrollBarObject();
		
		super.renderWindow();
	}
	
	private void renderScrollBarObject() {
		
		scrollBarObjectRepresentation= new Object();
		
	}
	
}
