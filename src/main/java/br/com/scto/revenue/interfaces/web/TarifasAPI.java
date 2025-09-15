package br.com.scto.revenue.interfaces.web;

import br.com.scto.revenue.interfaces.web.dto.TarifaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/v1/tarifas")
public interface TarifasAPI {

    @GetMapping(consumes = "application/json", value = "/período")
    List<TarifaDTO> buscarTarifasPeriodo(@RequestParam LocalDate dataInicio,
                                         @RequestParam LocalDate dataFim);

    @PostMapping(consumes = "application/json", value = "/cadastrar")
    List<TarifaDTO> cadastrarTarifas(TarifaDTO tarifaDTO);
}

