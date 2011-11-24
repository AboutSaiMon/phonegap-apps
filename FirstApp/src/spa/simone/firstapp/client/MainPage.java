package spa.simone.firstapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.page.Page;

public class MainPage extends Page {

    private static MainPageUiBinder uiBinder = GWT.create(MainPageUiBinder.class);

    interface MainPageUiBinder extends UiBinder<Widget, MainPage> {
    }

    public MainPage() {
	initWidget(uiBinder.createAndBindUi(this));
    }

}
