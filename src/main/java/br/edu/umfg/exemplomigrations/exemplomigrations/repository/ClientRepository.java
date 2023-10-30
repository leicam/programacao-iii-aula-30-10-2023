package br.edu.umfg.exemplomigrations.exemplomigrations.repository;

import br.edu.umfg.exemplomigrations.exemplomigrations.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
