package remote.cuacho;
public class CuaCho {
    private boolean trangThai = false;

    public void dongCua() {
        System.out.println("dong cua");
        trangThai = false;
    }

    public void moCua() {
        System.out.println("mo cua");
        trangThai = true;
        System.out.println("Cua tu dong sau 5s");
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        trangThai = false;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
