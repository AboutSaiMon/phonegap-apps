package spa.simone.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.gwtphonegap.client.device.Device;
import com.googlecode.gwtphonegap.client.device.DeviceBrowserImpl;
import com.googlecode.gwtphonegap.client.device.DeviceMobileImpl;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.dialog.AlertDialog;
import com.googlecode.mgwt.ui.client.widget.Button;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Demo implements EntryPoint {

    @Override
    public void onModuleLoad() {
	Button button = new Button("Device Name");
	button.addTapHandler(new TapHandler() {

	    @Override
	    public void onTap(TapEvent event) {
		Device device = null;
		if (MGWT.getOsDetection().isDesktop()) {
		    device = new DeviceBrowserImpl();
		} else {
		    device = new DeviceMobileImpl();
		}
		AlertDialog dialog = new AlertDialog("Device Name", device.getName());
		dialog.show();
	    }
	});
	RootPanel.get().add(button);
    }

}