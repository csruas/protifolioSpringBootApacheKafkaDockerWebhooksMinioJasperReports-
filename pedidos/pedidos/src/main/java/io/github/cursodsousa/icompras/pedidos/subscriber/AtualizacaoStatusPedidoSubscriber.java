package io.github.cursodsousa.icompras.pedidos.subscriber;

import io.github.cursodsousa.icompras.pedidos.model.enums.StatusPedido;

public record AtualizacaoStatusPedidoSbscriber (
        Long codigo,
        StatusPedido status,
        String UrlNotaFiscal,
        String codigoRastreio
) {
}
