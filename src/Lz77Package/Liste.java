package Lz77Package;

public class Liste {
	 private int p;
	    private int t;
	    private String c;

	    Liste(){

	    }

	    Liste(int p,int t, String c){
	        this.p = p;
	        this.c=c;
	        this.t=t;
	    }

	    public int getP() {
	        return p;
	    }

	    public void setP(int p) {
	        this.p = p;
	    }

	    public int getT() {
	        return t;
	    }

	    public void setT(int t) {
	        this.t = t;
	    }

	    public String getC() {
	        return c;
	    }

	    public void setC(String c) {
	        this.c = c;
	    }
}