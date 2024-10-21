package br.com.alura.TabelaFipeAlura.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
