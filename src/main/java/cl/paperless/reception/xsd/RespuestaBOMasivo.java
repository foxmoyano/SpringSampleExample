/**
 * RespuestaBOMasivo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.paperless.reception.xsd;

public class RespuestaBOMasivo  implements java.io.Serializable {
    private java.lang.Integer codigo;

    private java.lang.Integer conError;

    private java.lang.String descripcion;

    private java.lang.Integer ok;

    public RespuestaBOMasivo() {
    }

    public RespuestaBOMasivo(
           java.lang.Integer codigo,
           java.lang.Integer conError,
           java.lang.String descripcion,
           java.lang.Integer ok) {
           this.codigo = codigo;
           this.conError = conError;
           this.descripcion = descripcion;
           this.ok = ok;
    }


    /**
     * Gets the codigo value for this RespuestaBOMasivo.
     * 
     * @return codigo
     */
    public java.lang.Integer getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this RespuestaBOMasivo.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Integer codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the conError value for this RespuestaBOMasivo.
     * 
     * @return conError
     */
    public java.lang.Integer getConError() {
        return conError;
    }


    /**
     * Sets the conError value for this RespuestaBOMasivo.
     * 
     * @param conError
     */
    public void setConError(java.lang.Integer conError) {
        this.conError = conError;
    }


    /**
     * Gets the descripcion value for this RespuestaBOMasivo.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this RespuestaBOMasivo.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the ok value for this RespuestaBOMasivo.
     * 
     * @return ok
     */
    public java.lang.Integer getOk() {
        return ok;
    }


    /**
     * Sets the ok value for this RespuestaBOMasivo.
     * 
     * @param ok
     */
    public void setOk(java.lang.Integer ok) {
        this.ok = ok;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaBOMasivo)) return false;
        RespuestaBOMasivo other = (RespuestaBOMasivo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.conError==null && other.getConError()==null) || 
             (this.conError!=null &&
              this.conError.equals(other.getConError()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.ok==null && other.getOk()==null) || 
             (this.ok!=null &&
              this.ok.equals(other.getOk())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getConError() != null) {
            _hashCode += getConError().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getOk() != null) {
            _hashCode += getOk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaBOMasivo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "RespuestaBOMasivo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "conError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ok");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "ok"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
