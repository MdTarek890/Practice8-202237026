
public class Application {

	public static void main(String args [] ) {
		// TODO Auto-generated method stub

		Pillar pillar ;
		Geometry bottom =null;
		pillar =new Pillar(bottom,100); //A pillar with a null base
		
		System.out.println("voIume"+pillar.getVolume());
		
		bottom=new Rectangle (12,22);
		 pillar =new Pillar (bottom ,58);//A pillar  with a rectangular.
		
	
	System.out.println ("volume"+pillar.getVolume());
		
		bottom=new Circle(10);
	
		pillar=new Pillar(bottom,58); //A pillar  with a circular base
		
		
		
	System.out.println ("volume"+pillar.getVolume());
	}

}
