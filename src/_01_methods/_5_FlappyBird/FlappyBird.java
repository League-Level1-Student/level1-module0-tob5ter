package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    PImage back;
    PImage pipeBottom;
    PImage pipeTop;
    PImage bird;
    float y=200f;
    float birdYVelocity = -15f;
    float gravity = 0.5f;
    int x = 800;
    int upperPipeHeight = (int) random(100, 250);
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	background(103, 157, 245);
    	fill(255, 243, 74);
    	stroke(0,0,0);
    	y=y+birdYVelocity;
    	x-=3;
    	if(x==2) {
    		x=800;
    		 upperPipeHeight = (int) random(100, 250);
    	}
    	ellipse(200, y, 50,50);
    	birdYVelocity+=gravity;
    	fill(12, 122, 10);
    	rect(x, 0, 60, upperPipeHeight);
    }
    boolean intersectsPipes() { 
        if (y < upperPipeHeight && 200 > pipeX && 200 < (pipeX+pipeWidth)){
           return true; }
       else if (y>lowerPipeTop && 200 > pipeX && 200 < (pipeX+pipeWidth)) {
           return true; }
       else { return false; }
    }
    public void mousePressed() {
    	if(mousePressed) {
    		birdYVelocity=-10;
    	}
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
