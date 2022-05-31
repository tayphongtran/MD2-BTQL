import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<QLSP> qlsps = new ArrayList<>();
        wirteToFile("Qlsp.txt", qlsps);
        List<QLSP> readDataFromFile = readDataFromFile("Qlsp.txt");

    }
    public static void wirteToFile(String path, List<QLSP> qlsps) {
        try {
            FileOutputStream fo = new FileOutputStream(path);
            ObjectOutputStream ost = new ObjectOutputStream(fo);
            ost.writeObject(qlsps);
            ost.close();
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<QLSP> readDataFromFile(String path) {
        List<QLSP> qlsps = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream obs = new ObjectInputStream(fis);
            qlsps = (List<QLSP>) obs.readObject();
            obs.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return qlsps;
    }
}
