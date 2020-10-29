package dubboconsumer.dubbo_consumer;
//调用远程服务；
/**
 * Hello world!
 *
 */
import dubbo_api.dubboapi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");  // new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
        System.out.println(demoService.messg("hello dubbo"));
    }
}