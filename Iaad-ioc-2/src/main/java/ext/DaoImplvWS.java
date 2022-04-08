package ext;

import dao.IDao;

public class DaoImplvWS implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        return 45;
    }
}
