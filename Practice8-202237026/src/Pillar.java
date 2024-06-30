
public class Pillar {

	
		Geometry bottom;
		double height;
		Pillar (Geometry bottom, double height){
		this.bottom=bottom; this.height=height;
		}
		public double getVolume() {
		if(bottom==null) {
		System.out.println("No bottom,unable to calculate volume ");
		return -1;
		}
		return bottom.getArea()*height;
	}

}
