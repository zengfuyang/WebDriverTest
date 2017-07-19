package Configure;


public enum Browsers 
{
	
	CHROME ("chrome"), FIREFOX ("firefox"), IE ("ie"), SAFARI ("safari"), PHANTOMJS ("phantomjs");

	private String commonName;

	Browsers(String name) {
		this.commonName = name;
	}

	public String getName() {
		return this.commonName;
	}
}

