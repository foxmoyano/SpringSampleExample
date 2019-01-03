package cl.paperless.webapp.online.webservices;

public class OnlinePortTypeProxy implements cl.paperless.webapp.online.webservices.OnlinePortType {
  private String _endpoint = null;
  private cl.paperless.webapp.online.webservices.OnlinePortType onlinePortType = null;
  
  public OnlinePortTypeProxy() {
    _initOnlinePortTypeProxy();
  }
  
  public OnlinePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initOnlinePortTypeProxy();
  }
  
  private void _initOnlinePortTypeProxy() {
    try {
      onlinePortType = (new cl.paperless.webapp.online.webservices.OnlineLocator()).getOnlineHttpSoap11Endpoint();
      if (onlinePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)onlinePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)onlinePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (onlinePortType != null)
      ((javax.xml.rpc.Stub)onlinePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.paperless.webapp.online.webservices.OnlinePortType getOnlinePortType() {
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType;
  }
  
  public cl.paperless.reception.xsd.RespuestaBOMasivo reinyeccionBOMasivo(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String clave, java.lang.String entrada) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.reinyeccionBOMasivo(aRutCompany, login, clave, entrada);
  }
  
  public java.lang.String onlineGenerationRaw(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer docType, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGenerationRaw(aRutCompany, login, pass, aUnitRaw, docType, aFoliacionType, aReturnType);
  }
  
  public java.lang.String onlineRecoveryFolio(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Integer aFoliosNumber) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineRecoveryFolio(aRutCompany, login, pass, aDocDteType, aFoliosNumber);
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    onlinePortType.main(args);
  }
  
  public java.lang.String anulaFolioBoleta(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Long folio) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.anulaFolioBoleta(aRutCompany, login, pass, aDocDteType, folio);
  }
  
  public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineGenerationDteCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aGenerateDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGenerationDteCT(aRutCompany, login, pass, aUnitRaw, aGenerateDocNumber, aReturnType);
  }
  
  public java.lang.String consultaEmitidosPorDia(java.lang.String rutEmisor, java.lang.String login, java.lang.String pass, java.lang.String tipoDTE, java.lang.String fecha) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.consultaEmitidosPorDia(rutEmisor, login, pass, tipoDTE, fecha);
  }
  
  public java.lang.String onlineGeneration2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aXML, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType, java.lang.String sistemaEmisor) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGeneration2(aRutCompany, login, pass, aXML, aFoliacionType, aReturnType, sistemaEmisor);
  }
  
  public java.lang.String anulaGuia(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Integer aFoliosNumber) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.anulaGuia(aRutCompany, login, pass, aDocDteType, aFoliosNumber);
  }
  
  public java.lang.String onlineGenerationBol(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGenerationBol(aRutCompany, login, pass, aUnitRaw, aFoliacionType, aReturnType);
  }
  
  public java.lang.String aprobRechLeyMasivo(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String clave, java.lang.String entrada) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.aprobRechLeyMasivo(aRutCompany, login, clave, entrada);
  }
  
  public java.lang.String listaDocRec(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.String fechaEmiIni, java.lang.String fechaEmiFin, java.lang.String fechaRecIni, java.lang.String fechaRecFin) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.listaDocRec(aRutCompany, login, pass, aDocDteType, fechaEmiIni, fechaEmiFin, fechaRecIni, fechaRecFin);
  }
  
  public java.lang.String businessReply(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aEmisorRut, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aOperationType, java.lang.String aMotive) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.businessReply(aRutCompany, login, pass, aEmisorRut, aDocDteType, aDocNumber, aOperationType, aMotive);
  }
  
  public java.lang.String gestionEmitido(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer rutReceptorDte, java.lang.Integer aDocDteType, java.lang.Long aFoliosNumber, java.lang.Integer resComercial) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.gestionEmitido(aRutCompany, login, pass, rutReceptorDte, aDocDteType, aFoliosNumber, resComercial);
  }
  
  public java.lang.String onlineGenerationRaw2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer docType, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType, java.lang.String sistemaEmisor) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGenerationRaw2(aRutCompany, login, pass, aUnitRaw, docType, aFoliacionType, aReturnType, sistemaEmisor);
  }
  
  public cl.paperless.webapp.online.webservices.xsd.OnlineResponse consultCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String param) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.consultCT(aRutCompany, login, pass, param);
  }
  
  public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineGenerationCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aXML, java.lang.Integer aGenerateDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGenerationCT(aRutCompany, login, pass, aXML, aGenerateDocNumber, aReturnType);
  }
  
  public java.lang.String onlineGenerationBol2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType, java.lang.String sistemaEmisor) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGenerationBol2(aRutCompany, login, pass, aUnitRaw, aFoliacionType, aReturnType, sistemaEmisor);
  }
  
  public java.lang.String gestionRec(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer rutEmisorDte, java.lang.Integer aDocDteType, java.lang.Long aFoliosNumber, java.lang.String valEstCom, java.lang.Integer resComercial) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.gestionRec(aRutCompany, login, pass, rutEmisorDte, aDocDteType, aFoliosNumber, valEstCom, resComercial);
  }
  
  public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineRecoveryRecCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aEmisorRut, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineRecoveryRecCT(aRutCompany, login, pass, aEmisorRut, aDocDteType, aDocNumber, aReturnType);
  }
  
  public cl.paperless.reception.xsd.RespuestaCCMasivo aprobacionRechazoMasivo(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String clave, java.lang.String entrada) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.aprobacionRechazoMasivo(aRutCompany, login, clave, entrada);
  }
  
  public java.lang.String onlineGenerationDte(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGenerationDte(aRutCompany, login, pass, aUnitRaw, aFoliacionType, aReturnType);
  }
  
  public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineRecoveryCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineRecoveryCT(aRutCompany, login, pass, aDocDteType, aDocNumber, aReturnType);
  }
  
  public java.lang.String onlineRecovery(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineRecovery(aRutCompany, login, pass, aDocDteType, aDocNumber, aReturnType);
  }
  
  public cl.paperless.webapp.online.webservices.xsd.OnlineResponse onlineGenerationBolCT(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aGenerateDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGenerationBolCT(aRutCompany, login, pass, aUnitRaw, aGenerateDocNumber, aReturnType);
  }
  
  public java.lang.String onlineGenerationDte2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aUnitRaw, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType, java.lang.String sistemaEmisor) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGenerationDte2(aRutCompany, login, pass, aUnitRaw, aFoliacionType, aReturnType, sistemaEmisor);
  }
  
  public java.lang.String onlineRecoveryRec(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aEmisorRut, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineRecoveryRec(aRutCompany, login, pass, aEmisorRut, aDocDteType, aDocNumber, aReturnType);
  }
  
  public java.lang.String onlineRecoveryRecList(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aFechIni) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineRecoveryRecList(aRutCompany, login, pass, aFechIni);
  }
  
  public java.lang.String onlineRecovery2(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.Integer aDocDteType, java.lang.Long aDocNumber, java.lang.Long aMontoTotal, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineRecovery2(aRutCompany, login, pass, aDocDteType, aDocNumber, aMontoTotal, aReturnType);
  }
  
  public java.lang.String onlineGeneration(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String aXML, java.lang.Integer aFoliacionType, java.lang.Integer aReturnType) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.onlineGeneration(aRutCompany, login, pass, aXML, aFoliacionType, aReturnType);
  }
  
  public java.lang.String consult(java.lang.Integer aRutCompany, java.lang.String login, java.lang.String pass, java.lang.String param) throws java.rmi.RemoteException{
    if (onlinePortType == null)
      _initOnlinePortTypeProxy();
    return onlinePortType.consult(aRutCompany, login, pass, param);
  }
  
  
}