package com.soft1851.spring.webAnnotation.controller;

import com.soft1851.spring.webAnnotation.entity.Headset;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName HomeController
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/24 &9:48
 * @Version 1.0
 **/
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("message","hello spring mvc~~~");
        Headset[] headsets = {
                new Headset(1,"Beoplay H9 3rd gen","https://images.ctfassets.net/8cd2csgvqd3m/1QUcF7buEB9vLHcsr7P2Ba/9aa16d9de3930e9d7d234750f4561baf/wireless_earbuds_beoplay_e6_black_bang_olufsen.png?q=90&fm=webp&w=480&h=480&fit=fill","$200","Supreme sound for the streets"),
                new Headset(2,"Beoplay E8 3rd Gen","https://images.ctfassets.net/8cd2csgvqd3m/3eopAX7gQ9WRnVb5winkxB/9ce865f9a2af7528367f75f88e19cb21/h9-anthracite_CMS_CT1.png?q=90&fm=webp&w=480&h=480&fit=fill","$400","Revitalizing a modern classic"),
                new Headset(3,"Beoplay H4 2nd gen","https://images.ctfassets.net/8cd2csgvqd3m/7jE3WBXZnUTNnuLtmg5d2i/f7255e73788cb8b0e69a988225122242/h9-argilla-bright-hero-1000x1000.png?q=90&fm=webp&w=480&h=480&fit=fill","$300","Pure expression.Superior sound"),
                new Headset(4,"Beoplay E8 3rd Gen","https://images.ctfassets.net/8cd2csgvqd3m/3eopAX7gQ9WRnVb5winkxB/9ce865f9a2af7528367f75f88e19cb21/h9-anthracite_CMS_CT1.png?q=90&fm=webp&w=480&h=480&fit=fill","$400","Revitalizing a modern classic"),
                new Headset(5,"Beoplay H9 3rd gen","https://images.ctfassets.net/8cd2csgvqd3m/1QUcF7buEB9vLHcsr7P2Ba/9aa16d9de3930e9d7d234750f4561baf/wireless_earbuds_beoplay_e6_black_bang_olufsen.png?q=90&fm=webp&w=480&h=480&fit=fill","$200","Supreme sound for the streets"),
                new Headset(6,"Beoplay E8 3rd Gen","https://images.ctfassets.net/8cd2csgvqd3m/3eopAX7gQ9WRnVb5winkxB/9ce865f9a2af7528367f75f88e19cb21/h9-anthracite_CMS_CT1.png?q=90&fm=webp&w=480&h=480&fit=fill","$400","Revitalizing a modern classic"),
                new Headset(7,"Beoplay H4 2nd gen","https://images.ctfassets.net/8cd2csgvqd3m/7jE3WBXZnUTNnuLtmg5d2i/f7255e73788cb8b0e69a988225122242/h9-argilla-bright-hero-1000x1000.png?q=90&fm=webp&w=480&h=480&fit=fill","$300","Pure expression.Superior sound"),
                new Headset(8,"Beoplay E8 3rd Gen","https://images.ctfassets.net/8cd2csgvqd3m/3eopAX7gQ9WRnVb5winkxB/9ce865f9a2af7528367f75f88e19cb21/h9-anthracite_CMS_CT1.png?q=90&fm=webp&w=480&h=480&fit=fill","$400","Revitalizing a modern classic"),
                new Headset(9,"Beoplay H9 3rd gen","https://images.ctfassets.net/8cd2csgvqd3m/1QUcF7buEB9vLHcsr7P2Ba/9aa16d9de3930e9d7d234750f4561baf/wireless_earbuds_beoplay_e6_black_bang_olufsen.png?q=90&fm=webp&w=480&h=480&fit=fill","$200","Supreme sound for the streets"),
                new Headset(10,"Beoplay E8 3rd Gen","https://images.ctfassets.net/8cd2csgvqd3m/3eopAX7gQ9WRnVb5winkxB/9ce865f9a2af7528367f75f88e19cb21/h9-anthracite_CMS_CT1.png?q=90&fm=webp&w=480&h=480&fit=fill","$400","Revitalizing a modern classic"),
                new Headset(11,"Beoplay H4 2nd gen","https://images.ctfassets.net/8cd2csgvqd3m/7jE3WBXZnUTNnuLtmg5d2i/f7255e73788cb8b0e69a988225122242/h9-argilla-bright-hero-1000x1000.png?q=90&fm=webp&w=480&h=480&fit=fill","$300","Pure expression.Superior sound"),
                new Headset(12,"Beoplay E8 3rd Gen","https://images.ctfassets.net/8cd2csgvqd3m/3eopAX7gQ9WRnVb5winkxB/9ce865f9a2af7528367f75f88e19cb21/h9-anthracite_CMS_CT1.png?q=90&fm=webp&w=480&h=480&fit=fill","$400","Revitalizing a modern classic"),
                new Headset(13,"Beoplay H9 3rd gen","https://images.ctfassets.net/8cd2csgvqd3m/1QUcF7buEB9vLHcsr7P2Ba/9aa16d9de3930e9d7d234750f4561baf/wireless_earbuds_beoplay_e6_black_bang_olufsen.png?q=90&fm=webp&w=480&h=480&fit=fill","$200","Supreme sound for the streets"),
                new Headset(14,"Beoplay E8 3rd Gen","https://images.ctfassets.net/8cd2csgvqd3m/3eopAX7gQ9WRnVb5winkxB/9ce865f9a2af7528367f75f88e19cb21/h9-anthracite_CMS_CT1.png?q=90&fm=webp&w=480&h=480&fit=fill","$400","Revitalizing a modern classic"),
                new Headset(15,"Beoplay H4 2nd gen","https://images.ctfassets.net/8cd2csgvqd3m/7jE3WBXZnUTNnuLtmg5d2i/f7255e73788cb8b0e69a988225122242/h9-argilla-bright-hero-1000x1000.png?q=90&fm=webp&w=480&h=480&fit=fill","$300","Pure expression.Superior sound"),
                new Headset(16,"Beoplay E8 3rd Gen","https://images.ctfassets.net/8cd2csgvqd3m/3eopAX7gQ9WRnVb5winkxB/9ce865f9a2af7528367f75f88e19cb21/h9-anthracite_CMS_CT1.png?q=90&fm=webp&w=480&h=480&fit=fill","$400","Revitalizing a modern classic")


        };
        List<Headset> headsetList = Arrays.asList(headsets);
        model.addAttribute("headsetList",headsetList);

        return "home";
    }
}
