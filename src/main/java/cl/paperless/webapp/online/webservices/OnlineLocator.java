/**
 * OnlineLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.paperless.webapp.online.webservices;

public class OnlineLocator extends org.apache.axis.client.Service implements cl.paperless.webapp.online.webservices.Online {

    public OnlineLocator() {
    }


    public OnlineLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OnlineLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OnlineHttpSoap11Endpoint
    private java.lang.String OnlineHttpSoap11Endpoint_address = "http://localhost:8080/axis2/services/Online.OnlineHttpSoap11Endpoint/";

    public java.lang.String getOnlineHttpSoap11EndpointAddress() {
        return OnlineHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OnlineHttpSoap11EndpointWSDDServiceName = "OnlineHttpSoap11Endpoint";

    public java.lang.String getOnlineHttpSoap11EndpointWSDDServiceName() {
        return OnlineHttpSoap11EndpointWSDDServiceName;
    }

    public void setOnlineHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        OnlineHttpSoap11EndpointWSDDServiceName = name;
    }

    public cl.paperless.webapp.online.webservices.OnlinePortType getOnlineHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OnlineHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOnlineHttpSoap11Endpoint(endpoint);
    }

    public cl.paperless.webapp.online.webservices.OnlinePortType getOnlineHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.paperless.webapp.online.webservices.OnlineSoap11BindingStub _stub = new cl.paperless.webapp.online.webservices.OnlineSoap11BindingStub(portAddress, this);
            _stub.setPortName(getOnlineHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOnlineHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        OnlineHttpSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for OnlineHttpsSoap11Endpoint
    private java.lang.String OnlineHttpsSoap11Endpoint_address = "https://localhost/axis2/services/Online.OnlineHttpsSoap11Endpoint/";

    public java.lang.String getOnlineHttpsSoap11EndpointAddress() {
        return OnlineHttpsSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OnlineHttpsSoap11EndpointWSDDServiceName = "OnlineHttpsSoap11Endpoint";

    public java.lang.String getOnlineHttpsSoap11EndpointWSDDServiceName() {
        return OnlineHttpsSoap11EndpointWSDDServiceName;
    }

    public void setOnlineHttpsSoap11EndpointWSDDServiceName(java.lang.String name) {
        OnlineHttpsSoap11EndpointWSDDServiceName = name;
    }

    public cl.paperless.webapp.online.webservices.OnlinePortType getOnlineHttpsSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OnlineHttpsSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOnlineHttpsSoap11Endpoint(endpoint);
    }

    public cl.paperless.webapp.online.webservices.OnlinePortType getOnlineHttpsSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.paperless.webapp.online.webservices.OnlineSoap11BindingStub _stub = new cl.paperless.webapp.online.webservices.OnlineSoap11BindingStub(portAddress, this);
            _stub.setPortName(getOnlineHttpsSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOnlineHttpsSoap11EndpointEndpointAddress(java.lang.String address) {
        OnlineHttpsSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.paperless.webapp.online.webservices.OnlinePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.paperless.webapp.online.webservices.OnlineSoap11BindingStub _stub = new cl.paperless.webapp.online.webservices.OnlineSoap11BindingStub(new java.net.URL(OnlineHttpSoap11Endpoint_address), this);
                _stub.setPortName(getOnlineHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (cl.paperless.webapp.online.webservices.OnlinePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.paperless.webapp.online.webservices.OnlineSoap11BindingStub _stub = new cl.paperless.webapp.online.webservices.OnlineSoap11BindingStub(new java.net.URL(OnlineHttpsSoap11Endpoint_address), this);
                _stub.setPortName(getOnlineHttpsSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OnlineHttpSoap11Endpoint".equals(inputPortName)) {
            return getOnlineHttpSoap11Endpoint();
        }
        else if ("OnlineHttpsSoap11Endpoint".equals(inputPortName)) {
            return getOnlineHttpsSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.online.webapp.paperless.cl", "Online");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.online.webapp.paperless.cl", "OnlineHttpSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://webservices.online.webapp.paperless.cl", "OnlineHttpsSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OnlineHttpSoap11Endpoint".equals(portName)) {
            setOnlineHttpSoap11EndpointEndpointAddress(address);
        }
        else 
if ("OnlineHttpsSoap11Endpoint".equals(portName)) {
            setOnlineHttpsSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
