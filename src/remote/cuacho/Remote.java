package remote.cuacho;

public class Remote {
    private CuaCho cua;

    public Remote(CuaCho cua) {
        this.cua = cua;
    }

    public void nhaNut() {
        if (cua.isTrangThai() == false) {
            cua.moCua();
        } else {
            cua.dongCua();
        }
    }
    public CuaCho getCua() {
        return cua;
    }

    public void setCua(CuaCho cua) {
        this.cua = cua;
    }
}
