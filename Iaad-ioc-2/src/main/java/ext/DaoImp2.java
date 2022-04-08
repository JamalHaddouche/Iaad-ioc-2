package ext;

import dao.IDao;

public class  DaoImp2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur");
        double capteur=56;
        return capteur;
    }
}
