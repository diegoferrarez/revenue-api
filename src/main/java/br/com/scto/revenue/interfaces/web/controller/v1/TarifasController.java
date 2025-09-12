package br.com.scto.revenue.interfaces.web.controller.v1;

import br.com.scto.revenue.application.services.tarifas.TarifasService;
import br.com.scto.revenue.interfaces.web.TarifasAPI;
import br.com.scto.revenue.interfaces.web.dto.TarifaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TarifasController implements TarifasAPI {

    private final TarifasService tarifasService;

    @Override
    public List<TarifaDTO> buscarTarifasPeriodo(LocalDate dataInicio, LocalDate dataFim) {
        var tarifas = tarifasService.buscarTarifasPeriodo();
        return tarifas;
    }

    @Override
    public List<TarifaDTO> cadastrarTarifas(TarifaDTO tarifaDTO) {
        var tarifas = tarifasService.cadastrarTarifas(tarifaDTO);
        return tarifas;
    }
}
