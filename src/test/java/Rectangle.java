public class Rectangle extends Shape {

    private double longEdge;
    private double shortEdge;

    public Rectangle(double longEdge, double shortEdge) {// full parametreli constructor
        this.longEdge = longEdge;
        this.shortEdge = shortEdge;
    }

    @Override
    public double areaCalculate() {
        return this.longEdge*this.shortEdge;
    }

    @Override
    public double environmentCalculate() {
        return (this.longEdge+this.shortEdge)*2;
    }
}


