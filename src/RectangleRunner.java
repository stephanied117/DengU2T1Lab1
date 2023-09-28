public class RectangleRunner {
    public static void main(String [] args) {
        Rectangle plot1 = new Rectangle(150, 200);
        int getLength = plot1.getLength();
        System.out.println("Plot 1 Length: " + getLength);
        int getWidth = plot1.getWidth();
        System.out.println("Plot 1 Width: " + getWidth);
        int calcArea1 = plot1.calculateArea();
        System.out.println("Plot 1 Area: " + calcArea1);


        Rectangle plot2 = new Rectangle(125);
        getLength = plot2.getLength();
        System.out.println("Plot 2 Length: " + getLength);
        getWidth = plot2.getWidth();
        System.out.println("Plot 2 Width: " + getWidth);
        int calcArea2 = plot2.calculateArea();
        System.out.println("Plot 2 Area: " + calcArea2);


        Rectangle plot3 = new Rectangle();
        getLength = plot3.getLength();
        System.out.println("Plot 3 Length: " + getLength);
        getWidth = plot3.getWidth();
        System.out.println("Plot 3 Width: " + getWidth);
        int calcArea3 = plot3.calculateArea();
        System.out.println("Plot 3 Area: " + calcArea3);


        plot1.setWidth(75);
        plot2.setLength(75);
        plot2.setWidth(75);
        plot3.setWidth(75);


        getLength = plot1.getLength();
        System.out.println("Plot 1 Length: " + getLength);
        getWidth = plot1.getWidth();
        System.out.println("Plot 1 Width: " + getWidth);
        calcArea1 = plot1.calculateArea();
        System.out.println("Plot 1 Area: " + calcArea1);


        getLength = plot2.getLength();
        System.out.println("Plot 2 Length: " + getLength);
        getWidth = plot2.getWidth();
        System.out.println("Plot 2 Width: " + getWidth);
        calcArea2 = plot2.calculateArea();
        System.out.println("Plot 2 Area: " + calcArea2);


        getLength = plot3.getLength();
        System.out.println("Plot 3 Length: " + getLength);
        getWidth = plot3.getWidth();
        System.out.println("Plot 3 Width: " + getWidth);
        calcArea3 = plot3.calculateArea();
        System.out.println("Plot 3 Area: " + calcArea3);

        System.out.println("These three plots require " + (calcArea1 + calcArea2 + calcArea3) + " square feet of seed.");
    }
}

