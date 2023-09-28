public class RectangleRunner {
    public static void main(String [] args) {
        Rectangle plot1 = new Rectangle(150, 200);
        int getLength = plot1.getLength();
        System.out.println("Plot 1 Length: " + getLength);
        int getWidth = plot1.getWidth();
        System.out.println("Plot 1 Width: " + getWidth);
        int calcArea = plot1.calculateArea();
        System.out.println("Plot 1 Area: " + calcArea);


        Rectangle plot2 = new Rectangle(125);
        getLength = plot2.getLength();
        System.out.println("Plot 2 Length: " + getLength);
        getWidth = plot2.getWidth();
        System.out.println("Plot 2 Width: " + getWidth);
        calcArea = plot2.calculateArea();
        System.out.println("Plot 2 Area: " + calcArea);


        Rectangle plot3 = new Rectangle();
        getLength = plot3.getLength();
        System.out.println("Plot 3 Length: " + getLength);
        getWidth = plot3.getWidth();
        System.out.println("Plot 3 Width: " + getWidth);
        calcArea = plot3.calculateArea();
        System.out.println("Plot 3 Area: " + calcArea);


        plot1.setWidth(75);
        plot2.setLength(75);
        plot2.setWidth(75);
        plot3.setWidth(75);


        getLength = plot1.getLength();
        System.out.println("Plot 1 Length: " + getLength);
        getWidth = plot1.getWidth();
        System.out.println("Plot 1 Width: " + getWidth);
        calcArea = plot1.calculateArea();
        System.out.println("Plot 1 Area: " + calcArea);


        getLength = plot2.getLength();
        System.out.println("Plot 2 Length: " + getLength);
        getWidth = plot2.getWidth();
        System.out.println("Plot 2 Width: " + getWidth);
        calcArea = plot2.calculateArea();
        System.out.println("Plot 2 Area: " + calcArea);


        getLength = plot3.getLength();
        System.out.println("Plot 3 Length: " + getLength);
        getWidth = plot3.getWidth();
        System.out.println("Plot 3 Width: " + getWidth);
        calcArea = plot3.calculateArea();
        System.out.println("Plot 3 Area: " + calcArea);
    }
}

