package com.tnsif.dayeight;

//Demo on constructor overloading
public class Coordinates {
private float x;
private float y;

public Coordinates()
{
	 x=0.0f;
	 y=0.0f;
}

public Coordinates(float x)
{
	 this.x=x;
	 this.y=x;
}

public Coordinates(float x, float y) {
	super();
	this.x = x;
	this.y = y;
}

@Override
public String toString() {
	return "Coordinates [x=" + x + ", y=" + y +  "]";
}


}
