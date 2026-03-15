package io.github.cursodsousa.icompras.faturamento.publisher.representantion;

public record AtualizacaoStatusPagamento (Long codigo, StatusPedido pedido, String urlNotaFiscal) {
}
