<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                version='2.0' 
                xmlns:dat="http://pe.com.claro/bean/estudianteWS" >
    
    <xsl:output method="xml" omit-xml-declaration="yes" indent="no" encoding="UTF-8" />
    
    <!-- Evalua el TAG 'GENERICO' -->  
	<xsl:template match='/' >
 
		<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" 
		                  xmlns:soa="http://pe.com.soaint/bean/estudianteWS" >
		   <soapenv:Header/>
		   <soapenv:Body> 
		      <soa:infoEstudianteRequest>
		      
		            <!-- Evalua el TAG 'dat:transaccionBean' --> 
		            <soa:transaccion>
		               <xsl:if test="*/*/*/*/dat:transaccionBean/dat:idTransacion" >
			               <soa:idTransacion> 
			                   <xsl:apply-templates select="*/*/*/*/dat:transaccionBean/dat:idTransacion/text()" /> 
			               </soa:idTransacion>
		               </xsl:if>
		               
		               <xsl:if test="*/*/*/*/dat:transaccionBean/dat:usuarioApp" >
			               <soa:usuarioApp> 
			                   <xsl:apply-templates select="*/*/*/*/dat:transaccionBean/dat:usuarioApp/text()" /> 
			               </soa:usuarioApp>
		               </xsl:if>
		               
		               <xsl:if test="*/*/*/*/dat:transaccionBean/dat:usuarioApp" >
			               <soa:ipApp>
			                   <xsl:apply-templates select="*/*/*/*/dat:transaccionBean/dat:ipApp/text()" /> 		               
			               </soa:ipApp>
		               </xsl:if>
		            </soa:transaccion>
		            
		             <!-- Evalua el TAG 'dat:estudiante' --> 
		            <soa:estudiante> 		                 
		                <xsl:attribute name="nombre" >   <xsl:apply-templates select='*/*/*/*/dat:estudiante/dat:nombre/text()'   /> </xsl:attribute>		                
		                <xsl:attribute name="apellido" > <xsl:apply-templates select='*/*/*/*/dat:estudiante/dat:apellido/text()' /> </xsl:attribute>
		                <xsl:attribute name="dni" >      <xsl:apply-templates select='*/*/*/*/dat:estudiante/dat:dni/text()'      /> </xsl:attribute>
		            </soa:estudiante> 
		            
		            <!-- Evalua el TAG 'dat:listaLenguajes' --> 
		            <soa:listaLenguajes>
		                <xsl:for-each select="*/*/*/*/dat:listaLenguajes/dat:lenguaje" >
							<soa:lenguaje>
								<soa:tipo> <xsl:value-of select="@tipo" /> </soa:tipo> 
								<soa:url>  <xsl:value-of select="@url"  /> </soa:url>
							</soa:lenguaje> 
						</xsl:for-each>
		            </soa:listaLenguajes>
		      </soa:infoEstudianteRequest> 
		   </soapenv:Body>
		</soapenv:Envelope> 
 
	</xsl:template>
 
</xsl:stylesheet>

