<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet 
     version="2.0"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
     xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" >
    
     <xsl:output method="text" omit-xml-declaration="yes" indent="no" encoding="UTF-8" />
    
     <xsl:variable name="vFechaFormatDate" select="/root/fecha/text()" />
    
	 <xsl:template match="/" > 
- RESULTADO 'FECHA#1  (Original)':          <xsl:value-of select="$vFechaFormatDate" />  
- RESULTADO 'FECHA#2' (DD/MM/YYYY):         <xsl:value-of select="format-dateTime( $vFechaFormatDate,'[D01]/[M01]/[Y0001]')" /> 
- RESULTADO 'FECHA#3' (H:M:S):              <xsl:value-of select="format-dateTime( $vFechaFormatDate,'[H01]:[m01]:[s01]')" /> 
- RESULTADO 'FECHA#4' (DD/MM/YYYY - H:M:S): <xsl:value-of select="format-dateTime( $vFechaFormatDate,'[D01]/[M01]/[Y0001] - [H01]:[m01]:[s01]')" /> 
- RESULTADO 'FECHA#5' (YYYY/MM/DD - H:M:S): <xsl:value-of select="format-dateTime( $vFechaFormatDate,'[Y0001]/[M01]/[D01] - [H01]:[m01]:[s01]')" /> 
- RESULTADO 'FECHA#6' (DDMMYYYY):           <xsl:value-of select="format-dateTime( $vFechaFormatDate,'[D01][M01][Y0001]')" /> 
- RESULTADO 'FECHA#7' (DDMMYYYYHMS)):       <xsl:value-of select="format-dateTime( $vFechaFormatDate,'[D01][M01][Y0001][H01][m01][s01]')" /> 
	 </xsl:template>
	
</xsl:stylesheet>
