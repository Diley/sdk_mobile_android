package br.com.ioasys.dito_sdk.interfaces;

/**
 * Interface utilizada para efetuar os callbacks das requisições
 * 
 * @author iOasys
 * @since 14-04-14
 * @version 1.0
 * 
 */
public interface HttpConnectionListener {
    /**
     * 
     * @param response
     *            Retorna o json de resposta da requisição
     */
    public void onSuccess(String response);

    /**
     * 
     * @param error
     *            Retorna a mensagem de erro ocorrida durante a requisição
     */
    public void onError(String error);
}