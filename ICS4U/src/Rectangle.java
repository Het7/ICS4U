// Name: Het Parikh 
// Date: July 16, 2019
// Description: Makes use of overload constructors and client code to print 
// 				the area and perimeter of rectangles. 

public class Rectangle {
      private int length;
      private int width;

      Rectangle(){
        this.length=2; // assuming default length=2
        this.width=1; // assuming default width=1
      }

      Rectangle(int length, int width){
        this.length=length; 
        this.width=width; 
      }

    int area(){
       return length*width;
    }

    int perimeter(){
      return 2*(length+width);
    }

        public static void main(String args[]){
            Rectangle r1= new Rectangle();
            System.out.println("Area of rectangle 1: "+ r1.area());
            System.out.println("Area of rectangle 1: "+ r1.perimeter());

            Rectangle r2= new Rectangle(3,4);
            System.out.println("\nPerimetr of rectangle 2: "+ r2.perimeter());
            System.out.println("Area of rectangle 2: "+ r2.area());
        }
    }