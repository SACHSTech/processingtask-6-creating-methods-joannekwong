import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	fill(255, 255, 255);
  rect(0, 0, 150, 50);
  fill(0, 0, 0);
  size(400, 400);
  textSize(50);
  int minute = minute();
  int hour = hour();
  text(hour + ":" + minute, 0, 40);
    
// random number generator
  randomSeed(minute());
  int randomNum =  (second()%4);
// 0,1 - nighttime, pink
// 2,3 - morning time, dark blue
    
  float flowerX = 120;
  float flowerY = 270;
  float petalSize = 50;
  float petalDistance = petalSize / 2;

  if(randomNum == 0 || randomNum == 1){
    fill(202, 110, 255);
    
  }
  if(randomNum == 2 || randomNum == 3){
    fill(3, 86, 252);
    
  }
  // upper-left petal
  ellipse(flowerX - petalDistance, flowerY - petalDistance,
          petalSize, petalSize);
  
  // upper-right petal
  ellipse(flowerX + petalDistance, flowerY - petalDistance,
          petalSize, petalSize);
  
  // lower-left petal
  ellipse(flowerX - petalDistance, flowerY + petalDistance,
          petalSize, petalSize);
  
  // lower-right petal
  ellipse(flowerX + petalDistance, flowerY + petalDistance,
          petalSize, petalSize);
    
  if(randomNum == 0 || randomNum == 1){
      fill(181, 3, 252);
    
  }
  if(randomNum == 2 || randomNum == 3){
      fill(252, 181, 3);
    
  }
  // center petal
  ellipse(flowerX, flowerY,
          petalSize, petalSize);
  
  // flower stem
  stroke(128);
  strokeWeight(3/2);
  line(120, 400, 120, 305);
    

  int houseCenterX = drawHouse(210, 170, 245, 212, 66, 200);

// grass
  fill(50, 168, 84);
  rect(0, 370, 400, 30);
  }
  
  // define other methods down here.
  public int drawHouse(int intX, int intY, int colorR, int colorG, int colorB, int size){
    // house
    fill(colorR, colorG, colorB);
    rect(intX, intY, size, size);

  // roof
    fill(252, 53, 3);
    triangle(intX*32/21, intY*9/17, intX*44/21, intY*18/17, intX*6/7, intY*18/17);

  // door
    fill(255, 152, 25);
    rect(intX*8/7, intY* 26/17, size*7 / 20, size * 11 / 20);

    // return center X;
    return (intX + size) / 2;
  }
  
}
