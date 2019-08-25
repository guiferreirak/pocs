package com.demo.qrcode.usecase;

import com.demo.qrcode.usecase.data.input.ClienteBusinessInput;
import com.demo.qrcode.usecase.data.output.ClienteBusinessOutput;

public interface ClienteUseCase {

    ClienteBusinessOutput cadastrarCliente(ClienteBusinessInput clienteBusinessInput) throws Exception;
}
