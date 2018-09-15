package pl.akademiakodu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.model.Gif;

@Controller
public class GifController {



    @RequestMapping("/")
    //@ResponseBody

    public String listGifs(){
        //return "Hello world"; // --> jak to odkomentuje, to tez @ResponseBody
        return "/home";

    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("compiler", "michalos", true);
        modelMap.put("gif", gif);
        return "gif-details";

    }

}
