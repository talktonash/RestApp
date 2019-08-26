package com.home.service.controller;

import com.home.service.dao.AlienRepo;
import com.home.service.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {
    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }


    @PostMapping(path="/alien", consumes = {"application/json"})
    public Alien addAlien(Alien alien){
        repo.save(alien);
        return alien;
    }

    @PutMapping(path="/alien", consumes = {"application/json"})
    public String putAlien(@RequestBody Alien alien){

        repo.save(alien);
        return "Updated";
    }

    @DeleteMapping("/alien/{aid}")
    public String deleteAlien(@PathVariable int aid){
        Alien a = repo.getOne(aid);

        repo.delete(a);
        return "deleted";
    }
    /*@RequestMapping("/addAlien")
    public String addAlien(Alien alien){
    repo.save(alien);
        return "home.jsp";
    }
    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid){
        ModelAndView mv = new ModelAndView("show.jsp");
        Alien alien = repo.findById(aid).orElse(new Alien());
        System.out.println(repo.findByTech("Java"));
        System.out.println(repo.findByAidGreaterThan(102));
        System.out.println(repo.findByTechSorted("Java"));
        mv.addObject(alien);
        return mv;
    }*/

    @RequestMapping(path="/aliens")
    @ResponseBody
    public List<Alien> getAlien(){
        return repo.findAll();
    }

    @RequestMapping("/aliens/{aid}")
    @ResponseBody
    public Optional<Alien> getAlien(@PathVariable("aid") int aid){
        return repo.findById(aid);
    }
}
