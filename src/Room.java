

public class Room {
	double l;
	double w;
	double h;

	public Room(double l, double w, double h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	public Room() {
		// TODO Auto-generated constructor stub
	}

	public double getLenght() {
		return l;
	}

	public void setLength(double l) {
		this.l = l;
	}

	public double getWidth() {
		return w;
	}

	public void setWidth(double w) {
		this.w = w;
	}

	public double getHeight() {
		return h;
	}

	public void setHeigtht(double h) {
		this.h = h;
	}

	double getArea() {
		return l*w;
	}

	double getPaint() {
		return getArea()/10;
	}

	double getVolume() {
		return h*l*w;
	}

	public void printRoom() {
		System.out.println("Area in m2:"+this.getArea());
		System.out.println("Volume in m3:"+this.getVolume());
		System.out.println("Paint required in litres:"+this.getPaint());
	}
}
