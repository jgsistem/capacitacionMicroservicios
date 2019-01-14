
create table TB_SERV_LLAM(
  SLL_ID         INTEGER not null,
  SLL_TELEFONO   VARCHAR2(20),
  SLL_TECNOLOGIA VARCHAR2(25),
  SLL_CODIGO     VARCHAR2(10),
  SLL_MENSAJE    VARCHAR2(100),
  SLL_PAQUETE    VARCHAR2(25),
  SLL_PLAN       VARCHAR2(25),
  SLL_SALDO      VARCHAR2(10)
); 



CREATE OR REPLACE PACKAGE PKG_SERVICIO_LLAMADAS AS

    TYPE CURSOR_TYPE IS REF CURSOR; 

    --SP_LISTAR_SERV_LLAM:
    PROCEDURE SP_LISTAR_SERV_LLAM( SLL_COD_IN       IN  INTEGER,

                                   ERR_OUT          OUT VARCHAR2,
                                   MESSAGE_OUT      OUT VARCHAR2,
                                   CURSOR_SERV_LLAN OUT CGUERRA.PKG_SERVICIO_LLAMADAS.CURSOR_TYPE
                                 );
                                 
    --SP_LISTAR_SERV_LLAM2:
    PROCEDURE SP_LISTAR_SERV_LLAM2( SLL_COD_IN       IN  INTEGER,

                                    ERR_OUT          OUT VARCHAR2,
                                    MESSAGE_OUT      OUT VARCHAR2 
                                  );
END PKG_SERVICIO_LLAMADAS;

 
 
 
CREATE OR REPLACE PACKAGE BODY PKG_SERVICIO_LLAMADAS AS

    TYPE CURSOR_TYPE IS REF CURSOR;
 
    --SP_LISTAR_SERV_LLAM:
    PROCEDURE SP_LISTAR_SERV_LLAM( SLL_COD_IN       IN  INTEGER,
                                   ERR_OUT          OUT VARCHAR2,
                                   MESSAGE_OUT      OUT VARCHAR2,
                                   CURSOR_SERV_LLAN OUT CGUERRA.PKG_SERVICIO_LLAMADAS.CURSOR_TYPE
                                 ) AS
      BEGIN
          IF( SLL_COD_IN IS NOT NULL ) THEN

               OPEN CURSOR_SERV_LLAN
                  FOR
                     SELECT X.SLL_ID,
                            X.SLL_TELEFONO,
                            X.SLL_TECNOLOGIA,
                            X.SLL_CODIGO,
                            X.SLL_MENSAJE,
                            X.SLL_PAQUETE,
                            X.SLL_PLAN,
                            X.SLL_SALDO
                      FROM  CGUERRA.TB_SERV_LLAM X
                      WHERE X.SLL_ID = SLL_COD_IN
                      ORDER BY 1;

               ERR_OUT     := '1';
               MESSAGE_OUT := 'PROCESO EXITOSO [OBJETO]';
          ELSE
              OPEN CURSOR_SERV_LLAN
                  FOR
                    SELECT X.SLL_ID,
                           X.SLL_TELEFONO,
                           X.SLL_TECNOLOGIA,
                           X.SLL_CODIGO,
                           X.SLL_MENSAJE,
                           X.SLL_PAQUETE,
                           X.SLL_PLAN,
                           X.SLL_SALDO
                      FROM CGUERRA.TB_SERV_LLAM X
                      ORDER BY 1;

               ERR_OUT     := '2';
               MESSAGE_OUT := 'PROCESO EXITOSO [LISTA]';
          END IF;

      EXCEPTION

        WHEN OTHERS THEN
             ERR_OUT     := TO_CHAR( SQLCODE );
             --MESSAGE_OUT := SUBSTR( UPPER( SQLERRM ), 1, 100 );
             MESSAGE_OUT := SUBSTR( UPPER( DBMS_UTILITY.FORMAT_ERROR_STACK || '@' || DBMS_UTILITY.FORMAT_CALL_STACK ), 1, 100 ); --(MEJOR)

    END SP_LISTAR_SERV_LLAM;


    --SP_LISTAR_SERV_LLAM2:
    PROCEDURE SP_LISTAR_SERV_LLAM2( SLL_COD_IN       IN  INTEGER,
                                    ERR_OUT          OUT VARCHAR2,
                                    MESSAGE_OUT      OUT VARCHAR2 
                                 ) AS
      BEGIN
          IF( SLL_COD_IN IS NOT NULL ) THEN
 
               ERR_OUT     := '1';
               MESSAGE_OUT := 'PROCESO EXITOSO [OBJETO]';
          ELSE
 
               ERR_OUT     := '2';
               MESSAGE_OUT := 'PROCESO EXITOSO [LISTA]';
          END IF;

      EXCEPTION

        WHEN OTHERS THEN
             ERR_OUT     := TO_CHAR( SQLCODE );
             --MESSAGE_OUT := SUBSTR( UPPER( SQLERRM ), 1, 100 );
             MESSAGE_OUT := SUBSTR( UPPER( DBMS_UTILITY.FORMAT_ERROR_STACK || '@' || DBMS_UTILITY.FORMAT_CALL_STACK ), 1, 100 ); --(MEJOR)

    END SP_LISTAR_SERV_LLAM2;
    

 END PKG_SERVICIO_LLAMADAS;
 
 
 