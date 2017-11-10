package br.com.beirute

/**
 * Created by ricardo.gobbo on 09/11/2017.
 */
interface DataAndHeader {

    String getName()
    String getMainUrl()
    String getUrl()
    Map getData()
    Map getHeaders()

    void setPhpSession(String phpSession)
    void setToken(String token)
}