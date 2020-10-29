package dubbo_api.dubboapi;

import java.util.List;
// 存放公共接口
public interface DemoService {
    List<String> getPermissions(Long id);
    String messg(String s);
}