package Model;

import org.apache.log4j.Logger;
import org.hibernate.Session;

public class Operations
{
    static Session session;

    public final static Logger logger = Logger.getLogger(Main.class);

    public static void create()
    {
        int count = 0;
        session = HibernateUtil.getSessionFactory()
                .openSession();
        session.beginTransaction();
        Customer customer = new Customer();
        customer.setFirstName("pedał");
        customer.setLastName("kowalski");
        session.save(customer);
        session.getTransaction().commit();
        session.close();
    }
}
