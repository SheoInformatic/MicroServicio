package cl.duoc.sevelasquez.microserviciosoporte.Controller;

import cl.duoc.sevelasquez.microserviciosoporte.Model.Consulta;
import cl.duoc.sevelasquez.microserviciosoporte.Service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<Consulta> obtenerTodas() {
        return consultaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Optional<Consulta> obtenerPorId(@PathVariable Long id) {
        return consultaService.obtenerPorId(id);
    }

    @PostMapping
    public Consulta crear(@RequestBody Consulta consulta) {
        return consultaService.crear(consulta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        consultaService.eliminar(id);
    }
}
