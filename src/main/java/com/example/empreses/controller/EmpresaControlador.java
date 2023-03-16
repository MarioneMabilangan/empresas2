package com.example.empreses.controller;

import com.example.empreses.entitats.Empresa;
import com.example.empreses.repo.ReposEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmpresaControlador {
    @Autowired
    private ReposEmpresa empresaRepository;

    @GetMapping("/empresas")
    public String listarEmpresas(Model model) {
        List<Empresa> empresas = empresaRepository.findAll();
        model.addAttribute("empresas", empresas);
        return "listadoEmpresas";
    }

    @GetMapping("/empresas/nueva")
    public String mostrarFormularioNuevaEmpresa(Model model) {
        model.addAttribute("empresa", new Empresa());
        return "formularioNuevaEmpresa";
    }

    @PostMapping("/empresas/nueva")
    public String guardarNuevaEmpresa(@ModelAttribute("empresa") Empresa empresa) {
        empresaRepository.save(empresa);
        return "redirect:/empresas";
    }
}


