package uts;

public class Rute {

    private int total_penumpang;
    private int p_max;
    private int penunggu;

    public Rute(int jumlah_penumpang, int penumpang_max, int penunggu_bis) {
        this.total_penumpang = jumlah_penumpang;
        this.p_max = penumpang_max;
        this.penunggu = penunggu_bis;
    }

    public Rute(int jumlah_penumpang, int penumpang_max) {
        this (jumlah_penumpang, penumpang_max, 2);
    }

    public int get_passangers () {
        return total_penumpang;
    }

    public void set_passangers (int penumpang) {
        this.total_penumpang = penumpang;
    }

    public int get_maximal () {
        return p_max;
    }

    public void set_Maximal (int max_penumpang) {
        this.p_max = max_penumpang;
    }

    public int get_Wait () {
        return penunggu;
    }

    public void set_Wait (int tunggu) {
        this.penunggu = tunggu;
    }

}
