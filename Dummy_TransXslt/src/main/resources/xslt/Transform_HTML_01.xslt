<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                version='2.0' >

    <xsl:output method="xml" omit-xml-declaration="yes" indent="no" encoding="UTF-8" />
    
    <!-- Evalua el TAG 'GENERICO' --> 
	<xsl:template match='/' >
		<HTML>
			<HEAD>
				<TITLE>..:: LENGUAJES DE PROGRAMACION ::..</TITLE>
			</HEAD>
			<BODY>
				<TABLE border='1' >
					<TR>
						<TD> 
						   <!-- Evalua el TAG 'PERSONA/TITULO' [En el XML/Input] --> 
						   <xsl:apply-templates select="PERSONA/TITULO" /> 
						</TD>
						<TD>URL</TD>
					</TR>
					
					<!-- Evalua el TAG 'PERSONA/LISTA_LENGUAJES/LENGUAJE' [En el XML/Input] --> 
					<xsl:for-each select='PERSONA/LISTA_LENGUAJES/LENGUAJE' >
						<TR>
							<TD>
								<xsl:value-of select="TIPO" />
							</TD>
							<TD>
								<xsl:value-of select="URL" />
							</TD>
						</TR>
					</xsl:for-each>
				</TABLE>
			</BODY>
		</HTML>
	</xsl:template>
    
    <!-- Evalua el TAG 'PERSONA/TITULO' [En el XML/Input] -->  
	<xsl:template match="PERSONA/TITULO" >
		 <H1> <xsl:value-of select="text()" /> </H1>
	</xsl:template> 

</xsl:stylesheet>

