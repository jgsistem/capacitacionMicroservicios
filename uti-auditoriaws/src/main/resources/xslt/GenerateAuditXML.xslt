<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                version='2.0' 
                xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" 
		        xmlns:typ="http://visanet.com.pe/ws/soap/util/auditoria/types" >
    
    <xsl:output method="xml" omit-xml-declaration="yes" indent="no" encoding="UTF-8" />
 
   
    <!-- Evalua el TAG 'GENERICO' -->  
	<xsl:template match='/' >
      
		 <soapenv:Envelope> 
		   <soapenv:Header> 
		   </soapenv:Header>
		   
		   <soapenv:Body>
		      <typ:RegistroAuditoriaBodyRequest> 
		           
		          <xsl:for-each select="/*/typ:RegistroAuditoriaBodyRequest/typ:listAudit" >
		            
		          <!-- [SI], DEBE SER REGISTRADO --> 
		          <typ:listAudit> 
		            <xsl:variable name="vConcatenacion" select="concat(typ:serviceName/text(), '.', typ:serviceOperation/text())" />
		 
		                  <xsl:variable name="vIdTransaccion"    select="typ:idTransaccion/text()"    />
		                  <xsl:variable name="vServiceName"      select="typ:serviceName/text()"      />
		                  <xsl:variable name="vServiceOperation" select="typ:serviceOperation/text()" />
		                  <xsl:variable name="vMessageType"      select="typ:messageType/text()"    />
		                  <xsl:variable name="vTaxonomicLayer"   select="typ:taxonomicLayer/text()" />
		                  <xsl:variable name="vDate"             select="typ:date/text()"   />
		                  <xsl:variable name="vHeader"           select="typ:header/text()" />
		                  <xsl:variable name="vBody"             select="typ:body/text()"   />
		                  <xsl:variable name="vFault"            select="typ:fault/text()"  />
		                  <xsl:variable name="vAux"              select="typ:aux/text()"    />
		                  <xsl:variable name="vNumMonth"         select="typ:numMonth/text()" />
		                   
		                  <xsl:for-each select="/*/newRoot/auditoriaServiceFilter/service/e" >
		                      
						    <xsl:choose>				 
						        <xsl:when test="identificador/text() = $vConcatenacion" >		
						        
								    <xsl:choose>				 
								        <xsl:when test="estado/text() = 'true'" >	
				 
							            <typ:idTransaccion>    <xsl:value-of select="$vIdTransaccion" />  </typ:idTransaccion>
							            <typ:serviceName>      <xsl:value-of select="$vServiceName" />    </typ:serviceName>
							            <typ:serviceOperation> <xsl:apply-templates select="$vServiceOperation" />  </typ:serviceOperation>
							            <typ:messageType>      <xsl:apply-templates select="$vMessageType" />    </typ:messageType>
							            <typ:taxonomicLayer>   <xsl:apply-templates select="$vTaxonomicLayer" /> </typ:taxonomicLayer>
							            <typ:date>             <xsl:apply-templates select="$vDate" />     </typ:date> 
							            <typ:header>           <xsl:apply-templates select="$vHeader" />   </typ:header> 
							            <typ:body>             <xsl:apply-templates select="$vBody" />     </typ:body> 
							            <typ:fault>            <xsl:apply-templates select="$vFault" />    </typ:fault> 
							            <typ:aux>              <xsl:apply-templates select="$vAux" />      </typ:aux>
							            <typ:numMonth>         <xsl:apply-templates select="$vNumMonth" /> </typ:numMonth> 	
							          
						                </xsl:when>
						             </xsl:choose>
						            					  	
						        </xsl:when>				
						        <xsl:otherwise> 	             
						        </xsl:otherwise>				
						    </xsl:choose>  
		                  
		                  </xsl:for-each>
		                    
		          </typ:listAudit>
                  
                 </xsl:for-each>
                 
			      </typ:RegistroAuditoriaBodyRequest>
			   </soapenv:Body>
			</soapenv:Envelope> 
        
	</xsl:template>
 
</xsl:stylesheet>

