package com.demo.qrcode.usecase.converter;

import com.demo.qrcode.gateway.data.ClienteDocument;
import com.demo.qrcode.usecase.data.input.ClienteBusinessInput;
import com.demo.qrcode.usecase.data.output.ClienteBusinessOutput;

public interface ClienteUseCaseConverter {

    ClienteDocument toClienteDocument(ClienteBusinessInput clienteBusinessInput);
    ClienteBusinessOutput toBusinessOutput(ClienteDocument clienteDocument);
}
