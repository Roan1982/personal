
package com.Roan.Trabajo.controladores;

import com.Roan.Trabajo.entidades.Servicio;
import com.Roan.Trabajo.servicios.ServicioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ServicioControlador {

    private final ServicioServicio servicioServicio;

    @Autowired
    public ServicioControlador(ServicioServicio servicioServicio) {
        this.servicioServicio = servicioServicio;
    }

    @GetMapping("/servicios")
    public String listaServicios(Model model) {
        List<Servicio> servicios = servicioServicio.obtenerTodosLosServicios();
        model.addAttribute("servicios", servicios);
        return "lista-servicios";
    }

    @GetMapping("/nuevo-servicio")
    public String nuevoServicio(Model model) {
        model.addAttribute("servicio", new Servicio());
        return "nuevo-servicio";
    }

   @PostMapping("/guardarServicio")
public String guardarServicio(@ModelAttribute("servicio") Servicio servicio,
                               @RequestParam("categoriaId") Long categoriaId) {
        

    // Lógica para guardar el servicio en tu servicio de servicioServicio
    servicioServicio.guardarServicio(servicio);

    return "redirect:/servicios";
}
}
