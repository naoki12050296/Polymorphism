package swimmypractice5;

public class Iphone extends Smartphone{

	public Iphone() {
	}

	public Iphone(String aName) {
		super(SmartphoneKind.iOS,aName);
	}

	public void music() {
		if(this.Kind == null || this.Cpu.length() == 0 || this.Ram <= 0 || this.Rom <= 0) {
			throw new IllegalArgumentException("OS,CPU,RAM,ROMいずれかに未入力があります");
		}
		System.out.println("Itunesでダウンロードしました");
	}
}
