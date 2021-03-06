package org.gaewicketblog.wicket.page;

import org.apache.wicket.markup.html.WebPage;

/**
 * Wicket seems to lookup, and redirect to, the alphabetically last mounted url
 * to ListPage.class, if ListPage is returned from getHomePage. Since ListPage
 * currently handles the URL decoding the default selection doesn't work unless
 * getRequest().getURL() is /. 
 * FIXME Replace this class, and ListPage url decoding, with a url coding strategy?
 */
public class HomePage extends WebPage {

	public HomePage() {
		setResponsePage(ListPage.class);
	}

}
