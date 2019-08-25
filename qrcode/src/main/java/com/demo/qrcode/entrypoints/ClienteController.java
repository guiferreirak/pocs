package com.demo.qrcode.entrypoints;

import com.demo.qrcode.entrypoints.converter.ClienteHttpConverter;
import com.demo.qrcode.entrypoints.data.request.ClienteContractRequest;
import com.demo.qrcode.usecase.ClienteUseCase;
import com.demo.qrcode.usecase.data.input.ClienteBusinessInput;
import com.demo.qrcode.usecase.data.output.ClienteBusinessOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteUseCase clienteUseCase;
    private final ClienteHttpConverter clienteConverter;

    @GetMapping
    public String viewCliente(Model model){
        model.addAttribute("cliente", new ClienteContractRequest());
        return "cliente/cadastrar";
    }

    @PostMapping("cadastrar")
    public String cadastrarCliente(ClienteContractRequest cliente, Model model) throws Exception {

        model.addAttribute("cliente", new ClienteContractRequest());

        ClienteBusinessInput clienteBusinessInput = clienteConverter.toUsecase(cliente);
        clienteUseCase.cadastrarCliente(clienteBusinessInput);

        System.out.println(cliente.getNome());

        return "cliente/cadastrar";
    }
}
