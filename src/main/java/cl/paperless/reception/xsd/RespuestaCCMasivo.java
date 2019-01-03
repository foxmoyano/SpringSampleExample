/**
 * RespuestaCCMasivo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.paperless.reception.xsd;

public class RespuestaCCMasivo  implements java.io.Serializable {
    private java.lang.Integer aprobados;

    private java.lang.Integer codigo;

    private java.lang.Integer conError;

    private java.lang.String descripcion;

    private java.lang.Integer ley19983;

    private java.lang.Integer rechazados;

    private java.lang.Integer reclamados;

    private java.lang.Integer total;

    public RespuestaCCMasivo() {
    }

    public RespuestaCCMasivo(
           java.lang.Integer aprobados,
           java.lang.Integer codigo,
           java.lang.Integer conError,
           java.lang.String descripcion,
           java.lang.Integer ley19983,
           java.lang.Integer rechazados,
           java.lang.Integer reclamados,
           java.lang.Integer total) {
           this.aprobados = aprobados;
           this.codigo = codigo;
           this.conError = conError;
           this.descripcion = descripcion;
           this.ley19983 = ley19983;
           this.rechazados = rechazados;
           this.reclamados = reclamados;
           this.total = total;
    }


    /**
     * Gets the aprobados value for this RespuestaCCMasivo.
     * 
     * @return aprobados
     */
    public java.lang.Integer getAprobados() {
        return aprobados;
    }


    /**
     * Sets the aprobados value for this RespuestaCCMasivo.
     * 
     * @param aprobados
     */
    public void setAprobados(java.lang.Integer aprobados) {
        this.aprobados = aprobados;
    }


    /**
     * Gets the codigo value for this RespuestaCCMasivo.
     * 
     * @return codigo
     */
    public java.lang.Integer getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this RespuestaCCMasivo.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Integer codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the conError value for this RespuestaCCMasivo.
     * 
     * @return conError
     */
    public java.lang.Integer getConError() {
        return conError;
    }


    /**
     * Sets the conError value for this RespuestaCCMasivo.
     * 
     * @param conError
     */
    public void setConError(java.lang.Integer conError) {
        this.conError = conError;
    }


    /**
     * Gets the descripcion value for this RespuestaCCMasivo.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this RespuestaCCMasivo.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the ley19983 value for this RespuestaCCMasivo.
     * 
     * @return ley19983
     */
    public java.lang.Integer getLey19983() {
        return ley19983;
    }


    /**
     * Sets the ley19983 value for this RespuestaCCMasivo.
     * 
     * @param ley19983
     */
    public void setLey19983(java.lang.Integer ley19983) {
        this.ley19983 = ley19983;
    }


    /**
     * Gets the rechazados value for this RespuestaCCMasivo.
     * 
     * @return rechazados
     */
    public java.lang.Integer getRechazados() {
        return rechazados;
    }


    /**
     * Sets the rechazados value for this RespuestaCCMasivo.
     * 
     * @param rechazados
     */
    public void setRechazados(java.lang.Integer rechazados) {
        this.rechazados = rechazados;
    }


    /**
     * Gets the reclamados value for this RespuestaCCMasivo.
     * 
     * @return reclamados
     */
    public java.lang.Integer getReclamados() {
        return reclamados;
    }


    /**
     * Sets the reclamados value for this RespuestaCCMasivo.
     * 
     * @param reclamados
     */
    public void setReclamados(java.lang.Integer reclamados) {
        this.reclamados = reclamados;
    }


    /**
     * Gets the total value for this RespuestaCCMasivo.
     * 
     * @return total
     */
    public java.lang.Integer getTotal() {
        return total;
    }


    /**
     * Sets the total value for this RespuestaCCMasivo.
     * 
     * @param total
     */
    public void setTotal(java.lang.Integer total) {
        this.total = total;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaCCMasivo)) return false;
        RespuestaCCMasivo other = (RespuestaCCMasivo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aprobados==null && other.getAprobados()==null) || 
             (this.aprobados!=null &&
              this.aprobados.equals(other.getAprobados()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.conError==null && other.getConError()==null) || 
             (this.conError!=null &&
              this.conError.equals(other.getConError()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.ley19983==null && other.getLey19983()==null) || 
             (this.ley19983!=null &&
              this.ley19983.equals(other.getLey19983()))) &&
            ((this.rechazados==null && other.getRechazados()==null) || 
             (this.rechazados!=null &&
              this.rechazados.equals(other.getRechazados()))) &&
            ((this.reclamados==null && other.getReclamados()==null) || 
             (this.reclamados!=null &&
              this.reclamados.equals(other.getReclamados()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal())));
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
        if (getAprobados() != null) {
            _hashCode += getAprobados().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getConError() != null) {
            _hashCode += getConError().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getLey19983() != null) {
            _hashCode += getLey19983().hashCode();
        }
        if (getRechazados() != null) {
            _hashCode += getRechazados().hashCode();
        }
        if (getReclamados() != null) {
            _hashCode += getReclamados().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaCCMasivo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "RespuestaCCMasivo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprobados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "aprobados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("ley19983");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "ley19983"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechazados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "rechazados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reclamados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "reclamados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://reception.paperless.cl/xsd", "total"));
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
