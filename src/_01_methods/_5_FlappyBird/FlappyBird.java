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
    float birdY=200f;
    float birdYVelocity = -15f;
    float gravity = 0.5f;
    int pipeX = 800;
    int upperPipeHeight = (int) random(100, 300);
    int pipeWidth = 60;
    int birdX = 200;
    int lowerPipeTop = (int) random(300,500);
    int first = 255;
    int second = 243;
    int third = 74;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	noStroke();
    }

    @Override
    public void draw() {
    	background(103, 157, 245);
    	fill(first,second,third);
    	birdY=birdY+birdYVelocity;
    	pipeX-=3;
    	if(pipeX==2) {
    		pipeX=800;
    		upperPipeHeight = (int) random(100, 300);
    		lowerPipeTop = (int) random(300, 500);
    	}
    	ellipse(birdX, birdY, 50,50);
    	birdYVelocity+=gravity;
    	fill(12, 122, 10);
    	rect(pipeX, 0, pipeWidth, upperPipeHeight);
    	rect(pipeX, 450, pipeWidth, lowerPipeTop);
    	if(intersectsPipes() == true) {
    		first = 103;
     		second = 157;
     		third = 245;
    	}
    }
    
    public void mousePressed() {
    	if(mousePressed) {
    		birdYVelocity=-10;
    	}
    }
    boolean intersectsPipes() { 
        if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
           return true; }
       else if (birdY>lowerPipeTop && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
           return true; }
       else { return false; }
}


    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
