package com.demo.qrcode.entrypoints.converter;

import com.demo.qrcode.entrypoints.data.request.ClienteContractRequest;
import com.demo.qrcode.usecase.data.input.ClienteBusinessInput;

public interface ClienteHttpConverter {

    ClienteBusinessInput toUsecase(ClienteContractRequest request);
}
