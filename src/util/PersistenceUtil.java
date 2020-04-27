package util;

public class PersistenceUtil {

    private static PersistenceUtil single_instance=null; //singleton variable
    private EntityManagerFactory entityManagerFactory = null;

    private PersistenceUtil(){}//empty private constructor

    public EntityManagerFactory EntityManagerFactory()
    {
        if(entityManagerFactory == null)
        {
            //create object
        }
        return entityManagerFactory; //return, whether it's new or created previously; in a way, this acts as a singleton in its own right, somewhat
    }

    public static PersistenceUtil PersistenceUtil() //Implementation of the singleston structure using class name as function name
    {
        if(single_instance==null)
        {
            single_instance = new PersistenceUtil();
        }
        return single_instance;
    }
}
