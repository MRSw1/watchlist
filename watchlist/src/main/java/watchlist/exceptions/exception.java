package watchlist.exceptions;
//Currently never thrown will be added soon
class ShowNotFoundException extends RuntimeException {

	  ShowNotFoundException(int id) {
	    super("Could not find employee " + id);
	  }
	}