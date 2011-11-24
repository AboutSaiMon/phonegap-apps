package spa.simone.firstapp.client;

public abstract class PageFactory {

    private static FirstPage firstPage;
    private static SecondPage secondPage;
    private static MainPage mainPage;

    public static FirstPage getFirstPage() {
	if (firstPage == null) {
	    firstPage = new FirstPage();
	}
	return firstPage;
    }

    public static SecondPage getSecondPage() {
	if (secondPage == null) {
	    secondPage = new SecondPage();
	}
	return secondPage;
    }

    public static MainPage getMainPage() {
	if (mainPage == null) {
	    mainPage = new MainPage();
	}
	return mainPage;
    }

}
