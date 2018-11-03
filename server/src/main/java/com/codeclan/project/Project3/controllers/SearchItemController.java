package com.codeclan.project.Project3.controllers;


import com.codeclan.project.Project3.models.Country;
import com.codeclan.project.Project3.repositories.SearchItemRepository.SearchItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/searchitems")
public class SearchItemController {

    @Autowired
    SearchItemRepository searchItemRepository;

    @GetMapping(value = "countries/{itemid}")
    public List<Country> getCountriesForItem(@PathVariable Long itemid){
        return searchItemRepository.getAllCountriesForItem(itemid);
    }
}
