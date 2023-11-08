/**
 * House.java
 * 
 */
public class House
{
    private Square wall;
    private Triangle roof;
    private Square window;
    
    public House()
    {
        wall = new Square();
        wall.makeVisible();
        wall.changeSize(100);
        wall.moveHorizontal(40);
        wall.moveVertical(150);
        
        roof = new Triangle();
        roof.makeVisible();
        roof.changeColor("black");
        roof.changeSize(50,150);
        roof.moveHorizontal(100);
        roof.moveVertical(135);
        
        window = new Square();
        window.makeVisible();
        window.changeColor("blue");
        window.changeSize(35);
        window.moveHorizontal(50);
        window.moveVertical(160);
        
        
    }
    
    public void changeRoofColor(String color)
    {
        roof.changeColor(color);
    }
    
    public void changeWallColor(String color)
    {
        wall.changeColor(color);
    }
    
    public void changeWindowColor(String color)
    {
        window.changeColor(color);
    }
    
    public void moveHorizontal(int x)
    {
       roof.moveHorizontal(x);
       window.moveHorizontal(x);
       wall.moveHorizontal(x);
    }
    
    public void moveVertical(int x)
    {
       roof.moveVertical(x);
       window.moveVertical(x);
       wall.moveVertical(x);
    }
    
    public void makeInvisible()
    {
        roof.makeInvisible();
        wall.makeInvisible();
        window.makeInvisible();
    }
    
    public void makeVisible()
    {
        roof.makeVisible();
        wall.makeVisible();
        window.makeVisible();
    }
    
    public static void main(String[] args)
    {
        House house = new House();
    }
}