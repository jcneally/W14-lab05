package edu.ucsb.cs56.w14.lab05.ashedden;

public class TvShow {

    private String title; // Title: name of the television program, e.g. Sherlock
    private String network; // network where the television program is shown, e.g. BBC

    /**
       Two-arg constructor
       @param title  name of the television program, e.g. Sherlock
       @param network name of network where the the television program is shown, e.g. BBC
    */

    public TvShow(String title, String network) {
	this.title = title;
	this.network = network;
    }

    /** 
	Getter for title
	@return title, name of the television program, e.g. Sherlock
    */

    public String getTitle () { return title; }

    /** 
	Getter for network
	@return network, where the television program is shown, e.g. BBC
    */
    public String getNetwork () {return network; }

    /**
       convert to String representation in format [title, network]
       e.g. <code>["Sherlock","BBC"]</code>

       @return formatted string, [title,network]
    */

    @Override
    public String toString() {
	return("[" + title + "," + network + "]");     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the title value.
     */

    @Override
    public int hashCode() {
        int hash = 7;
	hash = 117 * hash + this.title.hashCode();
	return hash;
    }

    /** compare for equality based on title
	@return true if parameter is a TvShow with same title, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if(o == null) {return false;}
	if(o == this) {return true;}
	if(!(o instanceof TvShow)) {return false;}
	TvShow other = (TvShow) o;

	if(this.title == other.title){return true;}
	return false;
    }
    
    public static void main(String [] args){
	TvShow t = new TvShow("How I Met Your Mother", "CBS");
	System.out.println(t);
	    }
}
