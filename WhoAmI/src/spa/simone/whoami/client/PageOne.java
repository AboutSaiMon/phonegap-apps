package spa.simone.whoami.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.page.Page;

public class PageOne extends Page {

    private static PageOneUiBinder uiBinder = GWT.create(PageOneUiBinder.class);

    interface PageOneUiBinder extends UiBinder<Widget, PageOne> {
    }

    public PageOne() {
	initWidget(uiBinder.createAndBindUi(this));
    }

}
