/*****************************************************************
    SYSTEM          : UNIX
    FILE-NAME       : main.c
    DESCRIPTION     : 자재 데몬 
    PROGRAMMER      : 서준우
    PROGRAM DATE    : 2009.07
    UPDATE HISTORY  :
*****************************************************************/
#include "main.h"


int g_OriCliSock; 
int g_newSubSock;
int g_servSock  ;

void initStruct_1(RQ_PROTOCOL *rq_str);
void initStruct_2(RS_PROTOCOL *rs_str);

int main() 
{
    int   sv_socket = 0;

printf("DEMON Process Start!!----\n");

    sv_socket = InitServerSocket();

printf("Server Socket NO : (%d)\n", sv_socket);

    if( sv_socket == -1 ){
      exit(-1);
    }

    g_servSock = sv_socket;

printf("======================================================================\n");
printf("SERVER START         [%d]     \n", g_servSock);
printf("======================================================================\n");
fflush(stdout);

    server(sv_socket);
}

int InitServerSocket() 
{
    int     rc , sockfd;
    struct  sockaddr_in     serv_addr;
    char    host[80],       port[80];
    char    tlocalHost[ 120 ] ;
    struct  hostent         *ehost;
    int     value;

    memset(host , 0x00, sizeof( host));
    memset(port , 0x00, sizeof( port));

     /* 
      *  최초 socket을 얻는다 
      */
    if ( (sockfd = socket(AF_INET, SOCK_STREAM, 0)) < 0)
    {
         printf("Server Socket Error.....\n");
         return FAIL;
    }

     /*
      *  소켓 옵션 설정 
      *  STEP 1 : socket 재사용 지정 
      *  STEP 2 : 라인의 상태를 비 통신중에도 주기적으로 점검한다 */
    value = 1;
    rc = setsockopt( sockfd, SOL_SOCKET, SO_REUSEADDR, (char *)&value, sizeof( value));
    if ( rc == FAIL ) {
         printf("Set Socket Opt Error....(1)\n");
         return -1;
    }
    rc = setsockopt( sockfd, SOL_SOCKET, SO_KEEPALIVE, (char *)&value, sizeof(value) );
    if ( rc == FAIL ) {
         printf("set Socket  Opt Error...\n");
         return FAIL;
    }

    memset( &serv_addr , 0x00 , sizeof( struct  sockaddr_in) );
    serv_addr.sin_family = AF_INET;

    memset(tlocalHost, 0x00 ,sizeof( tlocalHost ));
    gethostname( tlocalHost, sizeof( tlocalHost));

    ehost = gethostbyname( tlocalHost );
    memcpy(&serv_addr.sin_addr , ehost->h_addr_list[0] , ehost->h_length);

    strcpy( port , PORT);
    serv_addr.sin_port = htons(atoi( port ));

    memset(serv_addr.sin_zero , 0x00, sizeof( serv_addr.sin_zero));

printf("---------------- BIND-------------------------.....");
    if( bind(sockfd, (struct sockaddr *)&serv_addr, sizeof(serv_addr)) < 0){
        perror("Error : ");
        close(sockfd);
        return FAIL;
    }
printf("OK\n");
     
printf("--------------- LISTEN-----------------------....");
    if( listen( sockfd, 10 ) < 0 ){
       perror("Error :");
       close(sockfd);
       return FAIL;
    }
printf("OK\n");
     /* Ctrl+c, Kill의 처리를 수행하기 위해 시그날 함수 등록 */

     Signal( SIGTERM, SignalRtn );
     Signal( SIGINT,  SignalRtn );
    
     return sockfd;
}


void server(int sockfd)
{
    int     clientSockfd, client_addr_size;
    int     childpid;
    struct  sockaddr_in  client_addr; 
    struct  sigaction act;
    char    clientaddr[30];
    int     locSocket = sockfd;

    /* Child process가 종료될때 zombi상태를 없애기 위한 셋팅 */
    memset( &act, 0, sizeof(act) );
    act.sa_handler = SIG_IGN;
    act.sa_flags   = SA_NOCLDWAIT;
    sigaction( SIGCHLD, &act, NULL );

    while(1)
    {

          g_servSock = locSocket;

          client_addr_size = sizeof( client_addr);
          clientSockfd = accept(locSocket, (struct scokaddr*)&client_addr, &client_addr_size);

printf("Client Socket ACCEPT........... (%d)-(IP :", clientSockfd);
fflush(stdout);

          if( clientSockfd  < 0 ){
                 if( clientSockfd != EBADF ) close( locSocket );


printf("===============================================================================================\n");
printf("Server Socket Change................[%d]---->" , locSocket);

                 locSocket = InitServerSocket();
printf("[%d]\n", locSocket );
printf("===============================================================================================\n");
fflush(stdout);

                 sleep(1);
                 
                 continue;
          }

          memset(clientaddr, 0x00, sizeof( clientaddr ));
          strcpy(clientaddr, inet_ntoa( client_addr.sin_addr));
printf("CONNECT CLIENT : [%s]\n" , clientaddr);

          childpid = fork();

          if( childpid < 0 ){
                       perror("Error : ");
                       SendResult(sockfd, 1, "서버 처리 오류입니다.");
                       close( clientSockfd );
                       continue;
          }
          else if ( childpid == 0 ){
                       close(locSocket);
                       trans_data( clientSockfd );
		       fflush(stdout);
                       exit(0); 
          }
          else{
                       close(clientSockfd);
		       fflush(stdout);
          }
    }
    
}

void trans_data( int clientSockfd)
{
   int       sockfd = clientSockfd ;
   int       timeout = 120;  
   int       value;
   char      reqdate[8 + 1];
   RS_PROTOCOL   rs_protocol;     /*  요청 결과 Struct */
   TRANS_PROTOCOL    res_proto;
   char      cErrMsg [ 100 ];

   int           rc = 0;

    /* 
     *  STEP 1 : socket 재사용 지정 
     *  STEP 2 : 라인의 상태를 비 통신중에도 주기적으로 점검한다 
     */
    value = 1;

    rc = setsockopt( sockfd, SOL_SOCKET, SO_REUSEADDR, (char *)&value, sizeof( value));
    if ( rc == FAIL ) {
         SendResult(sockfd, 1, "서버 설정 오류입니다.");
         close(sockfd);
         return ;
    }

    rc = setsockopt( sockfd, SOL_SOCKET, SO_KEEPALIVE, (char *)&value, sizeof(value) );
    if ( rc == FAIL ) {
         perror("Error.. : ");
         SendResult(sockfd, 1, "서버 설정 오류입니다.");
         close(sockfd);
         return ;
    }

    g_OriCliSock = clientSockfd;
    g_newSubSock = 0;

    while(1)
    {
            memset( reqdate, 0x00, sizeof( reqdate ));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);

            signal(SIGALRM, TimeOutExit);
            alarm(timeout);

            rc = read(sockfd, &reqdate, sizeof(reqdate));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);  

            if( rc <= 0 || rc < sizeof(reqdate) ) {
                   TimeOutExit();
                   return;
            }

            if( rc > 0 )  break;
    }


printf("******************** 데이터 요청 (1)******************************\n");
   memset(&rs_protocol, 0x00,    sizeof( RS_PROTOCOL ));
   memset(cErrMsg     , 0x00,    sizeof( cErrMsg     ));

   rc = Trans_Step1_date( reqdate,  &rs_protocol);
   if(rc == FAIL){
            SendResult(sockfd, 1 , "서버간의 통신중 에러가 발생하였습니다.");
            close(sockfd);
            return;
   }

printf("발송정보 획득 ......");

   if(rc == SUCC){
        if( rs_protocol.status != 0 ){
printf("ERROR [%c]\n" , rs_protocol.stx);
              switch(rs_protocol.errcode){
                      case ERROR_UNKNOWN_REQ: 
                                                GetProfileString(INIFILE, "ERROR_UNKNOWN_REQ", cErrMsg);
                                                break;
                      case ERROR_CONN_DATABASE : 
                                                GetProfileString(INIFILE, "ERROR_CONN_DATABASE", cErrMsg);
                                                break;
                      case ERROR_SERVER_SOCKET : 
                                                GetProfileString(INIFILE, "ERROR_SERVER_SOCKET", cErrMsg);
                                                break;
                      case ERROR_CONN_FACT : 
                                                GetProfileString(INIFILE, "ERROR_CONN_FACT", cErrMsg);
                                                break;
                      case ERROR_CONN_FACT10:
                                                GetProfileString(INIFILE, "ERROR_CONN_FACT10", cErrMsg);
                                                break;
                      case ERROR_CONN_FACT20 : 
                                                GetProfileString(INIFILE, "ERROR_CONN_FACT20", cErrMsg);
                                                break;
                      case ERROR_CONN_FACT22 : 
                                                GetProfileString(INIFILE, "ERROR_CONN_FACT22", cErrMsg);
                                                break;
                      case ERROR_CONN_FACT25: 
                                                GetProfileString(INIFILE, "ERROR_CONN_FACT25", cErrMsg);
                                                break;
                      default                  :
                                                strcpy(cErrMsg , "알수없는 에러 발생!");
                                                break;
              }

              SendResult(sockfd, 1 , cErrMsg);
              close(sockfd);
              return;
        }
        else {
printf("OK\n");
        }
   }
   fflush(stdout);

printf("******************** 데이터 요청 (2)*******************************\n");
   memset(&res_proto, 0x00, sizeof( TRANS_PROTOCOL ));
   
   rc = Trans_Step2_date(&res_proto);

   if(rc == FAIL){
            SendResult(sockfd, 1 , "서버간의 통신중 에러가 발생하였습니다.");
            close(sockfd);
            return;
   }
printf("발송정보 획득 ......");

   if(rc = SUCC) {
printf("[%d]" , res_proto.status );
             if ( res_proto.status != 0 ){
printf("ERROR.....\n");
                      SendResult(sockfd, 1 , "발송정보(2)의 수신시 오류가 발생 하였습니다.");
                      close(sockfd);
                      return;
             }
printf("OK!!...\n");
   }

   SendResult(sockfd, 0 , "정상적으로 처리 되었습니다.");
   fflush(stdout);

   close(sockfd); 

   return;
   
}

/************************************************************************************************************************/
/* Function Name : Trans_Step2_date                                                                                     */
/* 인자값        :                                                                                                      *
 *                 reqDate    [요청 일자                 ]                                                              *
 *                 rs         [요청 결과 클라이언트 전송 데이터]                                                        *
 * return Value  : SUCC(1)                                                                                              *
 *                 FAIL(-1)                                                                                             */
/************************************************************************************************************************/
int Trans_Step2_date(TRANS_PROTOCOL *rs)
{
    TRANS_PROTOCOL    trans_proto;
    TRANS_PROTOCOL    res_proto;
    char              ip[20];
    char              port[20];
    int               clientfd;
    int               rc = 0;
    int       timeout = 120;

    memset(&trans_proto, 0x00, sizeof( TRANS_PROTOCOL ));

    struct    sockaddr_in server;

    trans_proto.magic_num = MAGIC_NUM;
    trans_proto.req_type  = REQ_TYPE2;
    trans_proto.status    = 0;


printf("REQUEST2 DATA FOMAT : ");
printf("MagicNum : [%d] , ReqType : [%d]\n", trans_proto.magic_num , trans_proto.req_type);

    memset(ip , 0x00, sizeof( ip ));
    memset(port, 0x00, sizeof( port));

    rc = GetSerVerInfo( ip , port , 2 );
    if( rc == FAIL ) {
printf("Fail Trance Client....");
       return FAIL ;
    }

printf("===================================================> 데이터 요청 시작 STEP 1 [%s : %s]\n", ip, port);
printf("1. Socket Create.....");

   if( (clientfd = socket(AF_INET, SOCK_STREAM, 0)) < 0  ){
        /* 실패 전송 처리 */
         perror("FAIL.... :");
         return FAIL;
   }

   server.sin_addr.s_addr = inet_addr(ip);
   server.sin_family=AF_INET;
   server.sin_port = htons(atoi(port));

   if(connect( clientfd, (struct sockaddr*)&server, sizeof(server)) < 0 ){
         /* 실패 전송 처리 */
         perror("FAIL....:");
         close(clientfd);
         return FAIL;
   }

printf("OK\n3. SEND Data.....");

   if( (rc = write( clientfd, &trans_proto, sizeof( TRANS_PROTOCOL )) ) <= 0 ){
         perror("FAIL....:");
         close(clientfd);
         return FAIL;
   }

printf("OK\n4. Receive Data.........");

   g_newSubSock = clientfd;

   while(1)
   {
            memset(&res_proto, 0x00,    sizeof( TRANS_PROTOCOL ));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);

            signal(SIGALRM, TimeOutExit);
            alarm(timeout);

            rc = read(clientfd, &res_proto, sizeof( TRANS_PROTOCOL));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);

            if( rc <= 0 || rc < sizeof(TRANS_PROTOCOL)) {
printf("Error....\n");
                   TimeOutExit();
                   return;
            }

            if( rc > 0 )  break;
   }

printf("Size [%d] SUCC\n", rc);
    
   rs->magic_num = res_proto.magic_num;
   rs->req_type  = res_proto.req_type;
   rs->status    = res_proto.status;
 
   close(clientfd);
   g_newSubSock = 0;

   return SUCC;
 
    
}

/************************************************************************************************************************/
/* Function Name : Trans_Step1_date                                                                                     */
/* 인자값        :    
 *                 reqDate    [요청 일자                 ]                                                              *
 *                 rs         [요청 결과 클라이언트 전송 데이터]                                                        *           
 * return Value  : SUCC(1)                                                                                              *
 *                 FAIL(-1)                                                                                             */
/************************************************************************************************************************/
int Trans_Step1_date(char *reqData, RS_PROTOCOL *rs)
{

    /* 통신 프로토콜 */
   RQ_PROTOCOL   rq_protocol;     /*  요청 Struct   */
   RS_PROTOCOL   rs_protocol;     /*  요청 결과 Struct */
   struct        sockaddr_in server;
   int           clientfd;
   char          ip  [20];
   char          port[10];
   char          date[ 8  + 1];
   int           rc   = 0;
   int       timeout = 120;

   memset(date , 0x00, sizeof( date));
   strcpy( date , reqData );

   initStruct_1( &rq_protocol );

   rq_protocol.pad = PAD;
   rq_protocol.stx = STX;
   rq_protocol.reqtype = REQ_TYPE;
   strcpy(rq_protocol.cprdate,        date  );
   rq_protocol.etx = ETX;

printf("REQUEST DATA FOMAT : ");
printf("pad : %c , stx : %c, cprDate : %s - %c\n", rq_protocol.pad , rq_protocol.stx , rq_protocol.cprdate, rq_protocol.etx );

   memset(ip, 0x00, sizeof(ip));
   memset(port, 0x00, sizeof( port));
   memset( &rs_protocol , 0x00, sizeof( RS_PROTOCOL ));

   rc = GetSerVerInfo( ip , port , 1 );

   if( rc == FAIL ) {
printf("Fail Trance Client....");
       return FAIL ;
   }

printf("===================================================> 데이터 요청 시작 STEP 1 [%s : %s]\n", ip, port);
printf("1. Socket Create.....");

   if( (clientfd = socket(AF_INET, SOCK_STREAM, 0)) < 0  ){
        /* 실패 전송 처리 */
         perror("FAIL.... :");
         return FAIL;
   }
printf("OK\n2. Server Connect....");

   server.sin_addr.s_addr = inet_addr(ip);
   server.sin_family=AF_INET;
   server.sin_port = htons(atoi(port));

   if(connect( clientfd, (struct sockaddr*)&server, sizeof(server)) < 0 ){
         /* 실패 전송 처리 */
         perror("FAIL....:");
         close(clientfd);
         return FAIL;
   }

printf("OK\n3. SEND Data.....");

   if( (rc = write( clientfd, &rq_protocol, sizeof( RQ_PROTOCOL )) ) <= 0 ){
         perror("FAIL....:");
         close(clientfd);
         return FAIL;
   }

printf("OK\n4. Receive Data.........");

   g_newSubSock = clientfd;

   while(1)
   {
            memset(&rs_protocol, 0x00,    sizeof( RS_PROTOCOL ));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);

            signal(SIGALRM, TimeOutExit);
            alarm(timeout);

            rc = read(clientfd, &rs_protocol, sizeof( RS_PROTOCOL));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);

            if( rc <= 0 || rc < sizeof(RS_PROTOCOL)) {
printf("Error....\n");
                   TimeOutExit();
                   return;
            }

            if( rc > 0 )  break;
   }

printf("Size [%d] SUCC\n", rc);

   rs->pad = rs_protocol.pad;
   rs->stx = rs_protocol.stx;
   rs->reqtype = rs_protocol.reqtype;
   rs->status  = rs_protocol.status;
   rs->errcode = rs_protocol.errcode;
   rs->etx     = rs_protocol.etx;
  
   close(clientfd);
   g_newSubSock = 0;
   return SUCC;

} 



/************************************************************************************************************************/
/* Function Name : SendResult                                                                                          */
/* 인자값        :                                                                                                      *
 *                 sockfd    : [수신 받을 소켓 no ]                                                                     *
 *                 res       : [처리결과 ]                                                                              *
 *                 resMsg    : [에러 메세지]                                                                            *
 * return Value  : SUCC(1)                                                                                              *
 *                 FAIL(-1)                                                                                             */
/************************************************************************************************************************/
int   SendResult(int sockfd, int res , char *resMsg)
{
    RES_PROTOCOL    rs_proto;
    int             rc = 0;

    memset( &rs_proto, 0x00, sizeof( RES_PROTOCOL ));

    rs_proto.res = res;
    strcpy(rs_proto.errmsg , resMsg ) ;
  
    printf("RES : [%d] ERRMSG :[%s]\n", rs_proto.res, rs_proto.errmsg);

    if( (rc = write( sockfd, &rs_proto, sizeof( RES_PROTOCOL )) ) <= 0 ){
         perror("FAIL....:");
         close(sockfd);
         return FAIL;
    }

    return SUCC;
}

int GetSerVerInfo( char *ip, char *port , int gubun)
{
   char  localip   [ 20 ];
   char  localport [ 20 ];
   int   rc = 0;

   memset(localip  , 0x00, sizeof(localip));
   memset(localport, 0x00, sizeof(localport));

   if ( gubun == 1 ) {
printf("Server Info (1) : ");
         rc = GetProfileString(INIFILE, "IP", localip);
         if( rc == FAIL ) {
              printf("IP Get Error......\n");
              return FAIL;
         }     

         rc = GetProfileString(INIFILE, "PORT", localport);
         if( rc == FAIL) {
               printf("PROT Get Error..\n");
               return FAIL;
         }

printf("[IP] : %s [PORT] : %s\n", localip, localport);
   }
   if( gubun == 2) {
         rc = GetProfileString(INIFILE, "IP2", localip);
         if( rc == FAIL ) {
              printf("IP Get Error......\n");
              return FAIL;
         }

         rc = GetProfileString(INIFILE, "PORT2", localport);
         if( rc == FAIL) {
               printf("PROT Get Error..\n");
               return FAIL;
         }
printf("[IP] : %s [PORT] : %s\n", localip, localport);
   }
   
   strcpy( ip, localip);
   strcpy( port, localport);

   return SUCC;
}


/*
LOG 처리 사용 안함 
void WRITE_LOG( const  char *fmt, ...)
{
    struct tm *tm;
    char        LogFile[ MAX_LEN ];
    char        LogBuf [ MAX_LEN ];
    char        LogStr [ MAX_LEN ];
    char        sErrBuf[ MAX_LEN ];
    char        LogPath[ MAX_LEN ];

    int         fd , rc;
    va_list     va_Ap;
    time_t      clock;
    char        *pPos;
    int         pid = 0;

    clock = time ((time_t *) 0);

    tm = localtime (&clock);
    pid = getpid();

    memset(LogFile, 0x00, sizeof( LogFile ));
    memset(LogBuf , 0x00, sizeof( LogBuf  ));
    memset(LogStr , 0x00, sizeof( LogStr  ));
    memset(LogPath, 0x00, sizeof( LogPath ));


    rc = GetProfileString(INIFILE, "LOG_PATH", LogPath);

    sprintf( LogFile, "%s/mt_demon.%4d%02d%02d", LogPath,1900+tm->tm_year, tm->tm_mon+1, tm->tm_mday );
    sprintf( LogBuf , "[%05d][%02d/%02d-%02d:%02d:%02d] >> ", (pid % 0x10000), tm->tm_mon+1, tm->tm_mday, tm->tm_hour,tm->tm_min,tm->tm_sec);

    fd = open( LogFile, O_APPEND|O_CREAT|O_WRONLY, 0666 ) ;
    lockf( fd, F_LOCK, 0 );

    va_start( va_Ap, fmt);
    vsprintf( sErrBuf, fmt, va_Ap );
    va_end( va_Ap );

    pPos = strtok( sErrBuf, "\n");

    while (pPos)
    {
          write( fd, LogBuf, strlen(LogBuf) );
          write( fd, pPos, strlen(pPos) );
          write( fd, "\n", strlen("\n") );
          memset( LogBuf, (int)' ', TIME_BUF_SIZE-1 );
          pPos = strtok( NULL, "\n" );
    }

    lockf( fd, F_ULOCK, 0 );
    close( fd );
}
*/

/***********************************************************************************/
/* FUNCTION  : GetProfileString                                                    */
/* RETURN    : int                                                                 */
/* PARAMETER :                                                                     */                            
/*              iniFile : File Path                                                */
/*              item    : 찾고자 하는 값                                           */
/*              buff    : return String                                            */
/* DESCRIPTION : 환경 파일로 부터 설정 값을 읽어 들인다 .                          */
/***********************************************************************************/
int GetProfileString( char *iniFile, char *item, char *buff )
{
    FILE *fp;
    char  line[1024];
    char  *p;

    if( (fp = fopen( iniFile , "r"))  == 0) {
         printf("ini 파일을 열수 없습니다.");
         return FAIL;
    }
    memset(line, 0x00, sizeof(line));

    while( fgets(line , sizeof( line ) , fp))
    {
              p = strtok( line, " =" );
              if ( p && !strcmp( item, p ) ){
                         p = strtok ( NULL, "\n");
                         if(p){
                                  while( *p && (*p == ' ' || *p == '=' )) p++;

                                  if ( *p ){
                                        int size;

                                        strcpy( buff, p );
                                        size = strlen( buff );

                                        /* 데이타 맨뒤의 Space를 제거한다 */
                                        if ( size ) {
                                                for( size-- ; size ; size-- ){
                                                        if ( buff[size] == ' ' )
                                                                buff[size] = 0;
                                                        else
                                                                break;
                                                }
                                        } // if
                                 } 
                                 else  { strcpy( buff, "" );  }  // if end 
                        } 
                        else {  strcpy( buff, "" );  }  // if end       

                        fclose( fp );
                        return SUCC;
               }

   }
    
   fclose(fp);
   return FAIL;
}


/*********************************************************************************   
    FUNC_NAME   : SignalRtn
    DESCRIPTION : Ctrl+C 또는 Kill을 수신한 경우 처리하는 함수 socket을 close한다
    ARGUMENT    : int   signal
    RETURN      : None
**************************************************************/
void SignalRtn( int signal )
{
        switch( signal )
        {
                case SIGINT:
                        printf("[F][SIGINT ctrl+c receive]");
                    
                        if( g_OriCliSock != 0 ) { close(g_OriCliSock); }  // 현재 통신 중인 Client 존재 한다면 Close Socket

                        if( g_newSubSock != 0 ) { close(g_newSubSock); }  // 현재 데이터 요청 중이면  Close Socket
 
                        close(g_servSock);                                // 서버 소켓 Close

                        break;

                case SIGTERM:
                        printf("[F][SIGTERM kill receive]");
                        if( g_OriCliSock != 0 ) { close(g_OriCliSock); }  // 현재 통신 중인 Client 존재 한다면 Close Socket

                        if( g_newSubSock != 0 ) { close(g_newSubSock); }  // 현재 데이터 요청 중이면  Close Socket

                        close(g_servSock);
                        break;
                default :
                        printf("[F][Unknown Signal receive SIG#=%d", signal);
                        break;

        }
}


/**************************************************************
    FUNC_NAME   : TimeOutExit
    DESCRIPTION : timeout 발생시 종료
    ARGUMENT    : None
    RETURN      : None
**************************************************************/
void  TimeOutExit()
{
        RS_PROTOCOL   rs_protocol;

        printf("[F][TimeOut happened client]");

        SendResult(g_OriCliSock, 1 , "서버 처리 중 에러가 발생 하였습니다.");
        
        if( g_newSubSock != 0 ) close ( g_newSubSock );

        close(g_OriCliSock);

        exit(0);
}


/*-----------------------------------------------------
 * signal
 * This signal function tries to prevent any interrupted system calls
 * from being restarted.
 *-----------------------------------------------------*/
int Signal(int SigNo, void (*Sig_Handler)(int))
{
   struct sigaction act, oact;

   act.sa_handler = Sig_Handler;
   sigemptyset(&act.sa_mask);
   act.sa_flags = 0;

   if ( SigNo == SIGALRM ) {
#ifdef SA_INTERRUPT
   act.sa_flags |= SA_INTERRUPT;        /* SunOS */
#endif
   } else {
#ifdef SA_RESTART
   act.sa_flags |= SA_RESTART;          /* SVR4, 4.3+BSD */
#endif
    }

   return sigaction( SigNo, &act, &oact );
}



void initStruct_1(RQ_PROTOCOL *rq_str)
{
      memset( rq_str, 0x00, sizeof(RQ_PROTOCOL));

      rq_str->pad = '\n';
      rq_str->stx = '\n';
      rq_str->reqtype = 0;
      memset(rq_str->cprdate, 0x00, sizeof(8) );
      rq_str->etx = '\n';
}
void initStruct_2(RS_PROTOCOL *rs_str){

          memset( rs_str, 0x00, sizeof(RS_PROTOCOL));

          rs_str->pad = '\n';              /* PAD */
          rs_str->stx = '\n';              /* STX */
          rs_str->reqtype = 0 ;          /* Request Type : 데이터 생성 요청 (0x0022) */
          rs_str->status  = 0 ;           /* 데이터 생성 성공 0, 실패 1 */
          rs_str->errcode = 0 ;          /* 실패시 Error Code */
          rs_str->etx     = '\n';              /* ETX */
}


