/**
 * Online.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.paperless.webapp.online.webservices;

public interface Online extends javax.xml.rpc.Service {
    public java.lang.String getOnlineHttpSoap11EndpointAddress();

    public cl.paperless.webapp.online.webservices.OnlinePortType getOnlineHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public cl.paperless.webapp.online.webservices.OnlinePortType getOnlineHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getOnlineHttpsSoap11EndpointAddress();

    public cl.paperless.webapp.online.webservices.OnlinePortType getOnlineHttpsSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public cl.paperless.webapp.online.webservices.OnlinePortType getOnlineHttpsSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
