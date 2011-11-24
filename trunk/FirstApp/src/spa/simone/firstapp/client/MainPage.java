package spa.simone.firstapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.event.SelectionChangedEvent;
import com.gwtmobile.ui.client.page.Page;
import com.gwtmobile.ui.client.page.Transition;
import com.gwtmobile.ui.client.widgets.PasswordTextBox;
import com.gwtmobile.ui.client.widgets.TextBox;

public class MainPage extends Page {

    interface MainPageUiBinder extends UiBinder<Widget, MainPage> {
    }

    private static MainPageUiBinder uiBinder = GWT.create(MainPageUiBinder.class);

    @UiField
    TextBox usernameTextBox;
    
    @UiField
    PasswordTextBox passwordTextBox;
    
    @UiHandler("list")
    void onListSelectionChanged(SelectionChangedEvent event) {
	switch (event.getSelection()) {
	    case 0:
		PageFactory.getFirstPage().usernameLabel.setText(usernameTextBox.getText());
		PageFactory.getFirstPage().passwordLabel.setText(passwordTextBox.getText());
		goTo(PageFactory.getFirstPage(), Transition.SLIDE);
		break;
	    case 1:
		goTo(PageFactory.getSecondPage(), Transition.SLIDE);
		break;

	}
    }

    public MainPage() {
	initWidget(uiBinder.createAndBindUi(this));
    }

}
