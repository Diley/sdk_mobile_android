package br.com.ioasys.dito_sdk.exceptions;

/**
 * Exce��o personalizada que dever� ser tratada em todos os m�todos do SDK
 * 
 * @author iOasys
 * @since 14-04-14
 * @version 1.0
 * 
 */
public class DitoSDKException extends Exception {
    private static final long serialVersionUID = 1793624580803862687L;

    public DitoSDKException() {
        super();
    }

    public DitoSDKException(String message) {
        super(message);
    }
}