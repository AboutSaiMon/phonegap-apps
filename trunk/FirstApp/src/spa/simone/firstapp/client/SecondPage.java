package spa.simone.firstapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.page.Page;

public class SecondPage extends Page {

    private static SecondPageUiBinder uiBinder = GWT.create(SecondPageUiBinder.class);

    interface SecondPageUiBinder extends UiBinder<Widget, SecondPage> {
    }

    public SecondPage() {
	initWidget(uiBinder.createAndBindUi(this));
    }

}
