package Reflection.useConstructors;

import java.awt.Color;

public class Rectangle   {
  private String name;
  private int length;
  private int width;
  private Color color;
  public Rectangle() {
    this("undefined", 10, 10, Color.white);
  }
  @Override
  public String toString() {
    return " Name: " + name+" width: " + width + " length: " + length + " color: " + color;
  }
  public Rectangle(String name, int width, int length, Color color) {
    this.name=name;
    this.length = length;
    this.width = width;
    this.color = color;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getLength() {
    return length;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public int getWidth() {
    return width;
  }
  public void setWidth(int width) {
    this.width = width;
  }
  public Color getColor() {
    return color;
  }
  public void setColor(Color color) {
    this.color = color;
  }
}
