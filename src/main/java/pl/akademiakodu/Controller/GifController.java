package pl.akademiakodu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.data.GitRepository;
import pl.akademiakodu.model.Gif;

import java.util.List;


@Controller
public class GifController {

    //ponizsze powiazanie jest bardzo wazne !!
    @Autowired
    private GitRepository gifRepository;


    @RequestMapping("/")
    //@ResponseBody
    public String listGifs(ModelMap modelMap){
        //return "Hello world"; // --> jak to odkomentuje, to tez @ResponseBody
        List<Gif> gifs = gifRepository.getAllGifs();
        modelMap.put("gifs", gifs);
        return "/home";

    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){

        //Gif gif = new Gif("compiler", "michalos", true); //zakomentowane, bo jest ponizsza linia

        Gif gif = gifRepository.findByName(name);

        modelMap.put("gif", gif);
        return "gif-details";

    }

}

