package br.com.projetoibm.projetoibm.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.projetoibm.projetoibm.models.ClientModel;
import br.com.projetoibm.projetoibm.models.PedidoModel;
import br.com.projetoibm.projetoibm.models.ProdutoModel;
import br.com.projetoibm.projetoibm.repositories.ClientRepository;
import br.com.projetoibm.projetoibm.repositories.PedidoRepository;
import br.com.projetoibm.projetoibm.repositories.ProdutoRepository;

@Configuration

public class DevConfig implements CommandLineRunner {

    @Autowired
    private ClientRepository clienteRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {
    	 ClientModel cliente1 = new ClientModel(1, "Maria Brown", "988888888", "maria@gmail.com", "3333333");
         ClientModel cliente2 = new ClientModel(2, "Lais Brown", "988888888","lais@gmail.com", "3333333");

        PedidoModel pedido1 = new PedidoModel(null, cliente1);
        PedidoModel pedido2 = new PedidoModel(null, cliente2);

        ProdutoModel p1 = new ProdutoModel(null, "Vitamina C", 90.5, true, "Composto vitaminico",pedido1);
        ProdutoModel p2 = new ProdutoModel(null, "Vitamina C", 90.5, true, "Composto vitaminico",pedido1);
        ProdutoModel p3 = new ProdutoModel(null, "Vitamina C", 90.5, true, "Composto vitaminico",pedido1);


        clienteRepository.saveAll(Arrays.asList(cliente1, cliente2));
        pedidoRepository.saveAll(Arrays.asList(pedido1, pedido2));
        produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

    }
}
