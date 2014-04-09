package br.com.ioasys.dito_sdk.interfaces;

/**
 * Interface utilizada para efetuar os callbacks das requisi��es
 * 
 * @version 1.0
 * @author iOasys
 * @since 14-04-14
 * 
 */
public interface HttpConnectionListener {
    /**
     * 
     * @param response
     *            Retorna o json de resposta da requisi��o
     */
    public void onSuccess(String response);

    /**
     * 
     * @param error
     *            Retorna a poss�vel mensagem de erro ocorrida durante a
     *            requisi��o
     */
    public void onError(String error);
}
