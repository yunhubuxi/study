package provider;

import api.DemoService;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        name = "aaa";
        return "Hello " + name;
    }

    @Override
    public Map sayHello(Map map) {
        System.out.println(map.toString());
        System.out.println(JSONObject.toJSONString(map));
        map.put("111", "sdfsdf");
        map.put("222", "sdfsdfsdfsdsdf");
        map.put("fsdf", "fsdf");
        return new HashMap();
    }
}
