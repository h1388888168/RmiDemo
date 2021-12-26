import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;

/**
 * @description: TODO
 * @author: invoker.lee
 * @date: 2021/12/26 11:01
 * @version: v1.0
 */
public class EvilObj implements ObjectFactory {
    static {
        System.out.println("测试一下~~");
    }

    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        return null;
    }
}
