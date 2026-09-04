package questao;

public class Empregado {
    private String pn;
    private String sn;
    private double sm;

    public Empregado(String pn, String sn, double sm) {
        this.pn=pn;
        this.sn=sn;

        setSm(sm);
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public double getSm() {
        return sm;
    }

    public void setSm(double sm) {
        if (sm > 0.0) {
            this.sm = sm;
        } else {
            this.sm = 0.0;
        }
    }

    public double getSalarioAnual() {
        return this.sm * 12;
    }
}