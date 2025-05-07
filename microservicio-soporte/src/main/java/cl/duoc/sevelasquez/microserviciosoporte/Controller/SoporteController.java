package cl.duoc.sevelasquez.microserviciosoporte.Controller;

import cl.duoc.sevelasquez.microserviciosoporte.Model.Incidencia;
import cl.duoc.sevelasquez.microserviciosoporte.Service.SoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/incidencias")
public class SoporteController {

    @Autowired
    private SoporteService soporteService;

    @GetMapping
    public List<Incidencia> obtenerTodas() {
        return soporteService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Optional<Incidencia> obtenerPorId(@PathVariable Long id) {
        return soporteService.obtenerPorId(id);
    }

    @PostMapping
    public Incidencia crear(@RequestBody Incidencia incidencia) {
        return soporteService.crear(incidencia);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        soporteService.eliminar(id);
    }
}
