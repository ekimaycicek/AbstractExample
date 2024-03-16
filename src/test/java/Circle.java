public class Circle extends Shape {
    private double halfDiameter;
    private final double Pi=3.14;

    public double getHalfDiameter() {
        return halfDiameter;
    }

    public void setHalfDiameter(double halfDiameter) {
        this.halfDiameter = halfDiameter;
    }

    public double getPi() {
        return Pi;
    }

    public Circle(double halfDiameter) {
        this.halfDiameter = halfDiameter;

    }


    @Override
    public double areaCalculate() {
        return this.halfDiameter*Pi*this.halfDiameter;
    }

    @Override
    public double environmentCalculate() {
        return 2*Pi*this.halfDiameter;
    }
}


