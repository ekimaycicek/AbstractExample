

    public abstract class Shape {
        private String name;

        public Shape() { // p'siz parent cons
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Shape(String name) {// parametreli parent cons
            setName(name);
        }

        public abstract double areaCalculate();
        public abstract double environmentCalculate();
        public String draw(){

            return this.name + " drawn";
        }

        @Override
        public String toString() {// obj value' ları print eder
            return
                    "shapeName='" + this.name + '\'' +
                            "\n shape area : " + this.areaCalculate() +
                            "\n shape environment : " + this.environmentCalculate()+
                            "\n shape : " + this.draw();// ciz methodu call edildi

        }
    }


