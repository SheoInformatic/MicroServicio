package cl.duoc.sevelasquez.microserviciosoporte.Repository;

import cl.duoc.sevelasquez.microserviciosoporte.Model.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepository extends JpaRepository<Incidencia, Long> {
}
