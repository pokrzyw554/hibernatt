package Model;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main
{
    public final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args)
    {
        BasicConfigurator.configure();
        logger.setLevel(Level.ERROR);
        logger.log(Level.WARN, "OJAPIERDOLE");
        logger.log(Level.DEBUG, "checking feature");
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction;
        try {
            transaction = session.beginTransaction();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
