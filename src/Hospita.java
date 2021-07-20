public class Hospita {
    public FieldHospital f;

    public Hospita() {
        this.f = new FieldHospital();
    }

    public Hospita(FieldHospital f) {
        this.f = new FieldHospital(100);
    }
}

class FieldHospital {
    private int numBed = 200;

    public FieldHospital() {
    }

    public FieldHospital(int numBed) {
        this.numBed = numBed;
    }

    public int getNumBed() {
        return numBed;
    }
}

    class DeployFieldHospital {
        public static void main(String[] args) {
            Hospita h1 = new Hospita(new FieldHospital(300));
            System.out.println(h1.f.getNumBed());

            Hospita h2 = new Hospita();
            System.out.println(h2.f.getNumBed());
        }
    }
