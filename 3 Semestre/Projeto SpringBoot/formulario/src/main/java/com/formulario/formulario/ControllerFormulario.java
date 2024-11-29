package com.formulario.formulario;

import com.formulario.formulario.model.Formulario;
import com.formulario.formulario.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ControllerFormulario {

    @Autowired
    private FormularioRepository formularioRepository;

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @PostMapping("/salvar")
    public String salvarFormulario(@ModelAttribute Formulario formulario) {
        formularioRepository.save(formulario);
        return "redirect:/home";
    }
}
