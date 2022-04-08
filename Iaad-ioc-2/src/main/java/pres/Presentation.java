package pres;
import ext.DaoImp2;
import metier.IMetierImp;

public class Presentation {
    public static void main(String[] args) {
        /*
        Injection des dépendances par instanciation  statique => new
         */
        DaoImp2 dao=new DaoImp2();
        IMetierImp metier=new IMetierImp(dao);
        metier.setDao(dao);
        System.out.println("le calcul donne le résultat suivant "+metier.calcul());
    }
}
