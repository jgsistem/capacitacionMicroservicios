
var vLogger     = org.slf4j.LoggerFactory.getLogger( exchange.getFromRouteId() ); 
var vBody       = request.getBody().toString().toUpperCase();
var vMensajeOUT = "";
var vValidacion = "CAMEL";

if( vBody.indexOf( vValidacion ) !== -1 ){
	vMensajeOUT = ( "Lo sabemos '" + vValidacion + "' es muy poderoso !!!" ).toUpperCase();
	request.setHeader( "uppercase", "true" );
} 
else{
	 vMensajeOUT = ( "Se nota que no conoces: " + vValidacion ).toUpperCase(); 
	 request.setHeader( "uppercase", "false" );
}

//IMPRESION: [FORMA #1]:
java.lang.System.out.println( "- IMPRIMIENDO (System-Out) ==>: " + vMensajeOUT ); 

//IMPRESION: [FORMA #2]:
vLogger.info( "- IMPRIMIENDO (Logger) ==>: " + vMensajeOUT );  


//ENVIANDO A 'CAMEL CONTEXT': 
request.setBody( vMensajeOUT );

