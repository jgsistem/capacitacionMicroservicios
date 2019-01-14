<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                version='2.0' >

    <xsl:output method="xml" omit-xml-declaration="yes" indent="no" encoding="UTF-8" />
 
    <!-- Evalua el TAG 'GENERICO' --> 
	<xsl:template match='/' >
{
		  "PERSONA": {
 
		    "LISTA_LENGUAJES": {
		      <xsl:if test="/PERSONA/LISTA_LENGUAJES/LENGUAJE" >		         
			      "LENGUAJE": [
			         <xsl:for-each select="/PERSONA/LISTA_LENGUAJES/LENGUAJE" >			         
				        {
			              <xsl:variable name="vPosicion" select="position()" />
			            
				          "TIPO": "<xsl:value-of select="TIPO" />",
				          "URL":  "<xsl:value-of select="URL"  />"
				        }	
				        			 
					    <xsl:choose>				 
					        <xsl:when test="count(/PERSONA/LISTA_LENGUAJES/LENGUAJE) = $vPosicion" >							  	
					        </xsl:when>				
					        <xsl:otherwise>	
					        ,			             
					        </xsl:otherwise>				
					    </xsl:choose> 			           
				        			         
				     </xsl:for-each>   
			      ]
		      </xsl:if>
		    },
		    		    
		    <xsl:if test="/PERSONA/TITULO" >
		      "TITULO": "<xsl:value-of select="/PERSONA/TITULO/text()" />"
		    </xsl:if> 
		  }
}
	</xsl:template>
 
</xsl:stylesheet>

