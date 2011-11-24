package spa.simone.firstapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.page.Page;

public class FirstPage extends Page {

    private static FirstPageUiBinder uiBinder = GWT.create(FirstPageUiBinder.class);

    interface FirstPageUiBinder extends UiBinder<Widget, FirstPage> {
    }

    @UiField
    Label usernameLabel;

    @UiField
    Label passwordLabel;

    public FirstPage() {
	initWidget(uiBinder.createAndBindUi(this));
    }

}
