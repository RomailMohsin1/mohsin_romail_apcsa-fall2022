/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
    
   
  }
  
  
  public static void testNegate()
  {
    Picture beach = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
    
   
  }
 
  public static void testmirrorHorizontal() {
	  Picture caterpillar = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontal();
	    caterpillar.explore();
  }
  
  public static void testGull() {
	  Picture gull = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
	  Picture redBike = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\redMotorcycle.jpg");
	  redBike.explore();
	  redBike.mirrorVerticalRightToLeft();
	  redBike.explore();
  }
  
  public static void testmirrorHorizontalBotToTop() {
	  Picture redBike = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\redMotorcycle.jpg");
	  redBike.explore();
	  redBike.mirrorHorizontalBotToTop();
	  redBike.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture water = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
 // public static void testEncode() {
	//  Picture beach = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
	 // Picture apple = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\apple_icon.jpg");
	  //  beach.explore();
	   // beach.encode();
	   // beach.explore();
 // }
  
//  public static void testDecode() {
//	  Picture beach = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
//	  Picture apple = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\apple_icon.jpg");
//	    beach.explore();
//	    beach.decode();
//	    beach.explore();
//  }
  
  public static void testEncodeAndDecode() {
	  Picture beach = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
	  beach.explore();
	  Picture apple = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\apple_icon.jpg");
	  Picture message = new Picture("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-16\\src\\images\\msg (1).jpg");
	    beach.explore();
	    beach.encode(message);
	    beach.explore();
	    beach.decode().explore();
	  
	    
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//testNegate();
   // testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
	 //testmirrorHorizontal();
	  //testGull();
	  //testMyCollage();
	 // testMirrorVerticalRightToLeft();
	  //testmirrorHorizontalBotToTop();
  }
}