<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                version='2.0' >

    <xsl:output method="xml" omit-xml-declaration="yes" indent="no" encoding="UTF-8" />
 
	<xsl:template match='/' >
	
<xsl:value-of select="/PERSONA/TITULO/text()" />,<xsl:if test="/PERSONA/LISTA_LENGUAJES/LENGUAJE" >
<xsl:for-each select="/PERSONA/LISTA_LENGUAJES/LENGUAJE" >	
 <xsl:variable name="vPosicion" select="position()" />
   		         
 <xsl:value-of select="TIPO" />-<xsl:value-of select="URL" />  
    			 
 <xsl:choose>				 
   <xsl:when test="count(/PERSONA/LISTA_LENGUAJES/LENGUAJE) = $vPosicion" >							  	
   </xsl:when>			
   <xsl:otherwise>|</xsl:otherwise>				
 </xsl:choose> 			           
   			         
</xsl:for-each> 
</xsl:if>
 
	</xsl:template>
 
</xsl:stylesheet>

