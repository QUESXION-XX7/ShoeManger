package com.xx7.shoemanager;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/shoeList")
public class shoeListController {
    private ShoeListRepository shoeListRepository;

    private static final String brand = "nike";
    @Autowired
    public shoeListController(
            ShoeListRepository shoeListRepository   ){
        this.shoeListRepository = shoeListRepository;

    }
    @RequestMapping(method = RequestMethod.GET)
    public String BrandShoes(Model model){
        System.out.println("进入get");
        List<Shoe> shoeList = shoeListRepository.findByBrand(brand);
        System.out.println("完成jpa操作");
        if(shoeList !=null){
            model.addAttribute("shoes",shoeList);
            for (Shoe i : shoeList)
            {
                System.out.println(i.getName());
            }
        }

        return "shoeList";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addToShoeList(Shoe shoe)
    {
        shoe.setBrand(brand);
        shoeListRepository.save(shoe);
        return "redirect:/shoeList";
    }



}
