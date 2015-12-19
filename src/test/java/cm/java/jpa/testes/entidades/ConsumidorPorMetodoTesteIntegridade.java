package cm.java.jpa.testes.entidades;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import cm.java.jpa.entidades.ConsumidorPorMetodos;
import cm.java.jpa.testes.TestePersistenciaAbstrato;


public class ConsumidorPorMetodoTesteIntegridade extends TestePersistenciaAbstrato {

  // ======================================
  // =           Testes Unitários         =
  // ======================================

  @Test
  public void deveriaCriarUmConsumidor() throws Exception {

    ConsumidorPorMetodos consumidor = new ConsumidorPorMetodos("Joana", "Oliveira", "joliveira@empresa.com", "1234565");
    tx.begin();
    em.persist(consumidor);
    tx.commit();
    assertNotNull("O ID não deveria ser nulo", consumidor.getId());
  }
}