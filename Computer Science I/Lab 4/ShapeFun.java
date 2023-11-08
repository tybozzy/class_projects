/**
 * Short, one-line description of ShapeFun class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B
 * @version 1
 */
public class ShapeFun
{
      public static void main(String[] args)
    {
        Square square = new Square();
        square.makeVisible();
        square.moveHorizontal(-100);
        square.moveVertical(100);
        square.changeSize(50);
        square.changeColor("green");
    }

}
