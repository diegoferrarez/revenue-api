package br.com.scto.revenue.application.services.tarifas;

import br.com.scto.revenue.interfaces.web.dto.TarifaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TarifasService {

    public List<TarifaDTO> buscarTarifasPeriodo() {
        log.info("Buscando tarifas no período informado");
        return List.of();
    }

    public List<TarifaDTO> cadastrarTarifas(TarifaDTO tarifaDTO) {
        log.info("Cadastrando nova tarifa: {}", tarifaDTO);
        return List.of();
    }
}
