public class Covid {
    public static Spike sp;
    private double halfLife = 0.7;
    private double vacTolerance;

    public Covid() {
    }

    public Covid(double halfLife, double vacTolerance) {
        this.halfLife = halfLife;
        this.vacTolerance = vacTolerance;
        sp = new Spike(477);
    }

    public double getHalfLife() {
        return halfLife;
    }

    public double getVacTolerance() {
        return vacTolerance;
    }

    @Override
    public String toString() {
        return Covid.sp == null ? "No spike mutation" : "Spik mutation";
    }

}


class Spike{
        private int mutationPosition;
        public Spike(int mutationPosition) {
            this.mutationPosition = mutationPosition;
        }
public int getMutationPosition() {
        return mutationPosition;
}}


class Epidemic {
        public static void main(String[] args) {
            Covid alpha = new Covid();
            System.out.println(alpha.getHalfLife());
            System.out.println(alpha.getVacTolerance());
            System.out.println(alpha);
            Covid delta = new Covid(0.8, 0.85);
            System.out.println(delta.getHalfLife());
            System.out.println(delta.getVacTolerance());
            System.out.println(delta);
        }
}