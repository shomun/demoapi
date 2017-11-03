package demoapi.services.query;

import org.joda.time.DateTime;

public class Pagable {

	private int limit;
	
	private int page;
	
	private DateTime changeSince;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public DateTime getChangeSince() {
		return changeSince;
	}

	public void setChangeSince(DateTime changeSince) {
		this.changeSince = changeSince;
	}
	
	
}
