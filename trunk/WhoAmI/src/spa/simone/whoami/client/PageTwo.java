package spa.simone.whoami.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.page.Page;

public class PageTwo extends Page {

    private static PageTwoUiBinder uiBinder = GWT.create(PageTwoUiBinder.class);

    interface PageTwoUiBinder extends UiBinder<Widget, PageTwo> {
    }

    public PageTwo() {
	initWidget(uiBinder.createAndBindUi(this));
    }

}
