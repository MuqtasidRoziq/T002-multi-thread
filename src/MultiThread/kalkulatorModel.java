package MultiThread;

public class kalkulatorModel {
    private String angka = "";
    private double hasil = 0;
    private char operasi = ' ';

    // Setter dan Getter
    public String getAngka() {
        return angka;
    }

    public void setAngka(String angka) {
        this.angka = angka;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public char getOperasi() {
        return operasi;
    }

    public void setOperasi(char operasi) {
        this.operasi = operasi;
    }

    public void reset() {
        angka = "";
        hasil = 0;
        operasi = ' ';
    }
}

