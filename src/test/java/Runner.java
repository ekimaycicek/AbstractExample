public class Runner {
        public static void main(String[] args) {
            Rectangle dd=new Rectangle(24,7);
            dd.setName("rectangle");
            dd.environmentCalculate();
            dd.areaCalculate();
            System.out.println(dd.draw());
            System.out.println(dd);

            Circle cc=new Circle(39);

            cc.setName("Rose lace in my pocket ");
            System.out.println("cc = " + cc);



        }}
