/**
 * OnlinePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.paperless.webapp.online.webservices;

public interface OnlinePortType extends java.rmi.Remote {
    public cl.paperless.reception.xsd.RespuestaBOMasivo reinyeccionBOMasivo(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String clave, java.lang.String entrada) throws java.rmi.RemoteException;
    public java.lang.String onlineGenerationRaw(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer docType, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public java.lang.String onlineRecoveryFolio(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Integer aFoliosNumber) throws java.rmi.RemoteException;
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public java.lang.String anulaFolioBoleta(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Long folio) throws java.rmi.RemoteException;
    public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineGenerationDteCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aGenerateDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public java.lang.String consultaEmitidosPorDia(java.lang.String rutEmisor, java.lang.String login, java.lang.String pass, java.lang.String tipoDTE, java.lang.String fecha) throws java.rmi.RemoteException;
    public java.lang.String onlineGeneration2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aXML, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType, java.lang.String sistemaEmisor) throws java.rmi.RemoteException;
    public java.lang.String anulaGuia(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Integer aFoliosNumber) throws java.rmi.RemoteException;
    public java.lang.String onlineGenerationBol(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public java.lang.String aprobRechLeyMasivo(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String clave, java.lang.String entrada) throws java.rmi.RemoteException;
    public java.lang.String listaDocRec(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.String fechaEmiIni, java.lang.String fechaEmiFin, java.lang.String fechaRecIni, java.lang.String fechaRecFin) throws java.rmi.RemoteException;
    public java.lang.String businessReply(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aEmisorRut, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aOperationType, java.lang.String aMotive) throws java.rmi.RemoteException;
    public java.lang.String gestionEmitido(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer rutReceptorDte, java.lang.Integer aDocDteType, java.lang.Long aFoliosNumber, java.lang.Integer resComercial) throws java.rmi.RemoteException;
    public java.lang.String onlineGenerationRaw2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer docType, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType, java.lang.String sistemaEmisor) throws java.rmi.RemoteException;
    public cl.paperless.webapp.online.webservices.xsd.OnlineResponse consultCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String param) throws java.rmi.RemoteException;
    public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineGenerationCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aXML, java.lang.Integer aGenerateDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public java.lang.String onlineGenerationBol2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType, java.lang.String sistemaEmisor) throws java.rmi.RemoteException;
    public java.lang.String gestionRec(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer rutEmisorDte, java.lang.Integer aDocDteType, java.lang.Long aFoliosNumber, java.lang.String valEstCom, java.lang.Integer resComercial) throws java.rmi.RemoteException;
    public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineRecoveryRecCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aEmisorRut, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public cl.paperless.reception.xsd.RespuestaCCMasivo aprobacionRechazoMasivo(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String clave, java.lang.String entrada) throws java.rmi.RemoteException;
    public java.lang.String onlineGenerationDte(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineRecoveryCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public java.lang.String onlineRecovery(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineGenerationBolCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aGenerateDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public java.lang.String onlineGenerationDte2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType, java.lang.String sistemaEmisor) throws java.rmi.RemoteException;
    public java.lang.String onlineRecoveryRec(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aEmisorRut, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public java.lang.String onlineRecoveryRecList(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aFechIni) throws java.rmi.RemoteException;
    public java.lang.String onlineRecovery2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Long aMontoTotal, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public java.lang.String onlineGeneration(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aXML, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType) throws java.rmi.RemoteException;
    public java.lang.String consult(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String param) throws java.rmi.RemoteException;
}
