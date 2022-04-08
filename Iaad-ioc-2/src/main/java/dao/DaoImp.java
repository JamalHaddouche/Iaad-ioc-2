package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp  implements IDao{
    @Override
    public double getData() {
        /*
        récuperer la température à partir de la base de données
         */
        System.out.println("version de la base de données");
        double tmp=Math.random()*40;
        return tmp;
    }
}
