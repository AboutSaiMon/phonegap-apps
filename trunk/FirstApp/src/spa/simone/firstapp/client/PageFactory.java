package spa.simone.firstapp.client;

public abstract class PageFactory {

    private static MainPage mainPage;

    public static MainPage getMainPage() {
	if (mainPage == null) {
	    mainPage = new MainPage();
	}
	return mainPage;
    }

}
