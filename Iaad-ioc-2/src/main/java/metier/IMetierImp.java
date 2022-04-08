package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
   
@Component
public class IMetierImp implements IMetier{

    //couplage faible
    private IDao dao;

    public IMetierImp(IDao dao) {
        this.dao = dao;
    }


    //injecter dans la variable dao  d'un objet d'une classe qui implémete l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*24;//n'import quel calcul just pour tester
        return res;
    }
}
