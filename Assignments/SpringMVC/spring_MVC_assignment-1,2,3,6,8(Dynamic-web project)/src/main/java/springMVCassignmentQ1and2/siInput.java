package springMVCassignmentQ1and2;

public class siInput {
	private int principalamount;
	private int noofyears;
	private int rateofinterest;
	private int output;

	public int getOutput() {
		output = ((principalamount * noofyears * rateofinterest) / 100);
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}

	public int getPrincipalamount() {
		return principalamount;
	}

	public void setPrincipalamount(int principalamount) {
		this.principalamount = principalamount;
	}

	public int getNoofyears() {
		return noofyears;
	}

	public void setNoofyears(int noofyears) {
		this.noofyears = noofyears;
	}

	public int getRateofinterest() {
		return rateofinterest;
	}

	public void setRateofinterest(int rateofinterest) {
		this.rateofinterest = rateofinterest;
	}

}
