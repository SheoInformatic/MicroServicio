package cl.duoc.sevelasquez.microserviciosoporte.Service;

import cl.duoc.sevelasquez.microserviciosoporte.Model.Consulta;
import cl.duoc.sevelasquez.microserviciosoporte.Repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public List<Consulta> obtenerTodas() {
        return consultaRepository.findAll();
    }

    public Optional<Consulta> obtenerPorId(Long id) {
        return consultaRepository.findById(id);
    }

    public Consulta crear(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public void eliminar(Long id) {
        consultaRepository.deleteById(id);
    }
}
