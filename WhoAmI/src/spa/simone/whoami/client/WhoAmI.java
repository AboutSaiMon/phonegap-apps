package spa.simone.whoami.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Timer;
import com.gwtmobile.ui.client.page.Page;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WhoAmI implements EntryPoint {

    MainPage mainPage;

    @Override
    public void onModuleLoad() {
	new Timer() {

	    @Override
	    public void run() {
		if(mainPage == null) {
		    mainPage = new MainPage();
		    Page.load(mainPage);
		} else {
		    this.cancel();
		}
	    }
	    
	}.scheduleRepeating(50);
    }

}
