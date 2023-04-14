package com.example.empreses.controller;

import com.example.empreses.entitats.Alumne;
import com.example.empreses.repo.ReposAlumne;
import com.example.empreses.repo.ReposEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AlumneControlador {
    @Autowired
    private ReposAlumne alumneRepository;

    @Autowired
    private ReposEmpresa empresaRepository;

    @GetMapping("/alumnes")
    public String llistarAlumnes(Model model) {
        List<Alumne> alumnes = alumneRepository.findAll();
        model.addAttribute("alumnes", alumnes);
        model.addAttribute("empresas", empresaRepository.findAll());
        return "listadoAlumnes";
    }

    @GetMapping("/formAlumne")
    public String formulariAlumne(Model model) {
        model.addAttribute("alumne", new Alumne());
        model.addAttribute("empresas", empresaRepository.findAll());
        return "formularioAlumne";
    }

    @PostMapping("/formAlumne")
    public String afegirAlumne(@ModelAttribute("alumne") Alumne alumne) {
        alumneRepository.save(alumne);
        return "redirect:/alumnes";
    }
}