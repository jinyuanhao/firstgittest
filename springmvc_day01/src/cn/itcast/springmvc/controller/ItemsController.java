package cn.itcast.springmvc.controller;

import cn.itcast.springmvc.pojo.Items;
import cn.itcast.springmvc.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/itemList")
    public ModelAndView getItemsList(){
        List<Items> itemsList = itemsService.getItemsList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList",itemsList);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }

}

1234567
999999999999999999999999