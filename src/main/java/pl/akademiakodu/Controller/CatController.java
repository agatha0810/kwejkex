package pl.akademiakodu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.data.CatRepository;
import pl.akademiakodu.model.Category;

import java.util.List;

@Controller
public class CatController {

    @Autowired
    CatRepository catRepository;

    @RequestMapping("/categories")
    public String listaCategories(ModelMap modelMap){
        List<Category> categories = catRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";

    }


    //TODO:
    //napisac metode taką, że do kategorii mają wchodzic odpowiednie numerki


}
