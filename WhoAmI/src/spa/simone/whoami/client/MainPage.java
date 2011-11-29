package spa.simone.whoami.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.event.SelectionChangedEvent;
import com.gwtmobile.ui.client.page.Page;
import com.gwtmobile.ui.client.widgets.ListPanel;

public class MainPage extends Page {

    private static MainPageUiBinder uiBinder = GWT.create(MainPageUiBinder.class);

    interface MainPageUiBinder extends UiBinder<Widget, MainPage> {
    }

    public MainPage() {
	initWidget(uiBinder.createAndBindUi(this));
	Window.addResizeHandler(new ResizeHandler() {
	    
	    @Override
	    public void onResize(ResizeEvent event) {
		StringBuilder builder = new StringBuilder();
		builder.append("width: ");
		builder.append(event.getWidth());
		builder.append(" - height: ");
		builder.append(event.getHeight());
		Window.alert(builder.toString());
	    }
	    
	});
    }

    @UiField
    ListPanel list;

    @UiHandler("list")
    void onListSelectionListener(SelectionChangedEvent event) {
	switch (event.getSelection()) {
	    case 0:
		goTo(new PageOne());
		break;
	    case 1:
		goTo(new PageTwo());
		break;
	}
    }

}
