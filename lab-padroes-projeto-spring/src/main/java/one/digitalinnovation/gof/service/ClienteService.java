package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão Strategy no domínio de cliente. com
 * isso, se necessário, podemostermúltiplasimplementações dessa mesma
 * interface
 *
 * @author andreia
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id,Cliente cliente);
    void deletar(Long id);

}
