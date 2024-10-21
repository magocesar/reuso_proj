package com.example.demo.service;

import com.example.demo.entity.Fabricante;
import com.example.demo.entity.Lote;
import com.example.demo.entity.Produto;
import com.example.demo.entityInterface.cadastroProdutoIn;
import com.example.demo.entityInterface.cadastroProdutoOut;
import com.example.demo.exceptions.AlreadExistsException;
import com.example.demo.exceptions.BadRequestException;
import com.example.demo.repository.FabricanteRepository;
import com.example.demo.repository.LoteRepository;
import com.example.demo.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class cadastroProdutoService {

    @Autowired
    private FabricanteRepository fabricanteRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private LoteRepository loteRepository;


    @Transactional
    public ResponseEntity<cadastroProdutoOut> cadastrarProduto(cadastroProdutoIn cadastroProdutoIn) {

        if (cadastroProdutoIn.tipoTransacao() == com.example.demo.entityInterface.cadastroProdutoIn.tipoTransacao.fabricanteExistente) {
            return cadastroProdutoComFabricanteExistente(cadastroProdutoIn);
        } else {
            return cadastroProdutoComFabricanteNovo(cadastroProdutoIn);
        }
    }


    private ResponseEntity<cadastroProdutoOut> cadastroProdutoComFabricanteNovo(cadastroProdutoIn cadastroProdutoIn) {

        if(cadastroProdutoIn.numeroCep() == null || cadastroProdutoIn.cepFabricante() == null ||
                cadastroProdutoIn.cnpjFabricante() == null || cadastroProdutoIn.nomeFabricante() == null
            ){
            throw new BadRequestException("Campos obrigatórios não preenchidos");
        }

        Fabricante buscaFabricante = fabricanteRepository.findByCnpj(cadastroProdutoIn.cnpjFabricante());

        if(buscaFabricante != null){
            throw new AlreadExistsException("Fabricante já cadastrado");
        }

        Fabricante fabricante = new Fabricante(cadastroProdutoIn);

        Lote lote = new Lote(cadastroProdutoIn);

        Produto produto = new Produto(cadastroProdutoIn, fabricante, lote);

        loteRepository.save(lote);
        fabricanteRepository.save(fabricante);
        produtoRepository.save(produto);

        return ResponseEntity.ok(new cadastroProdutoOut(produto, fabricante, lote));
    }

    private ResponseEntity<cadastroProdutoOut> cadastroProdutoComFabricanteExistente(cadastroProdutoIn cadastroProdutoIn) {

        Fabricante fabricante = fabricanteRepository.findByCnpj(cadastroProdutoIn.cnpjFabricante());

        if(fabricante == null){
            throw new BadRequestException("Fabricante não encontrado");
        }

        Lote lote = new Lote(cadastroProdutoIn);

        loteRepository.save(lote);

        Produto produto = new Produto(cadastroProdutoIn, fabricante, lote);

        produtoRepository.save(produto);

        return ResponseEntity.ok(new cadastroProdutoOut(produto, fabricante, lote));
    }
}
