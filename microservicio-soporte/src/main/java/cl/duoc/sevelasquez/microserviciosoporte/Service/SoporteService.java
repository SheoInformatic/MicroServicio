package cl.duoc.sevelasquez.microserviciosoporte.Service;

import cl.duoc.sevelasquez.microserviciosoporte.Model.Incidencia;
import cl.duoc.sevelasquez.microserviciosoporte.Repository.IncidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoporteService {

    @Autowired
    private IncidenciaRepository incidenciaRepository;

    public List<Incidencia> obtenerTodas() {
        return incidenciaRepository.findAll();
    }

    public Optional<Incidencia> obtenerPorId(Long id) {
        return incidenciaRepository.findById(id);
    }

    public Incidencia crear(Incidencia incidencia) {
        return incidenciaRepository.save(incidencia);
    }

    public void eliminar(Long id) {
        incidenciaRepository.deleteById(id);
    }
}
