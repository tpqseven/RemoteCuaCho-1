package remote.cuacho;

public class BarkRecognizer {
    public ManageBark manga;
    private CuaCho cua;

    public BarkRecognizer(CuaCho cua) {
        this.cua = cua;
        manga = new ManageBark();
    }

    public void recognizer(String bark) {
        for (int i = 0; i < manga.arr.size(); i++) {
            if (bark.equals(manga.arr.get(i))) {
                System.out.println("thiet bi nhan dang tieng sua nghe thay tieng sua: " + bark);
                System.out.println("thiet bi nhan dang tieng sua gui yeu cau mo cua");
                cua.moCua();
            }
        }
    }
}
