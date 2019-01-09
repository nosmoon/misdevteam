/*****************************************************************
    SYSTEM          : UNIX
    FILE-NAME       : main.c
    DESCRIPTION     : 자재 데몬 
    PROGRAMMER      : 서준우
    PROGRAM DATE    : 2009.07
    UPDATE HISTORY  :
*****************************************************************/
#include "main.h"

int g_socketfd;   /* 서버 생성 소켓 */
int g_newsock;

void initStruct_1(RQ_PROTOCOL *rq_str);
void initStruct_2(RS_PROTOCOL *rs_str);

int main() 
{

    WRITE_LOG("데몬 START...!!");

    g_socketfd = InitServerSocket();

    if( g_socketfd == -1 ) exit(-1);

    server(g_socketfd);
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

     /* 최초 socket을 얻는다 */
    if ( (sockfd = socket(AF_INET, SOCK_STREAM, 0)) < 0)
    {
         WRITE_LOG("서버 소켓 생성 에러...");
         return -1;
    }

    /* 소켓 옵션 설정 */
    /* STEP 1 : socket 재사용 지정 */
    value = 1;
    rc = setsockopt( sockfd, SOL_SOCKET, SO_REUSEADDR, (char *)&value, sizeof( value));
    if ( rc == -1 ) {
         WRITE_LOG("소켓 옵션 설정 에러...(1)");
         return -1;
    }
    /* STEP 2 : 라인의 상태를 비 통신중에도 주기적으로 점검한다 */
    rc = setsockopt( sockfd, SOL_SOCKET, SO_KEEPALIVE, (char *)&value, sizeof(value) );
    if ( rc == -1 ) {
         WRITE_LOG("소켓 옵션 설정 에러...(2)");
         return -1;
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

    /*   BIND   */
    if( bind(sockfd, (struct sockaddr *)&serv_addr, sizeof(serv_addr)) < 0){
        close(sockfd);
        return -1;
    }
    if( listen( sockfd, 10 ) < 0 ){
       close(sockfd);
       return -1;
    }
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
    int     l_sockfd;
    char    clientaddr[30];

    /* Child process가 종료될때 zombi상태를 없애기 위한 셋팅 */
    memset( &act, 0, sizeof(act) );
    act.sa_handler = SIG_IGN;
    act.sa_flags   = SA_NOCLDWAIT;
    sigaction( SIGCHLD, &act, NULL );

    while(1)
    {
          client_addr_size = sizeof( client_addr);
          clientSockfd = accept(sockfd, (struct scokaddr*)&client_addr, &client_addr_size);
          if( clientSockfd  < 0 ){
                 if( clientSockfd != EBADF ) close( l_sockfd);

                 l_sockfd = InitServerSocket();
                 g_socketfd = l_sockfd;

                 sleep(1);
                 
                 continue;
          }

          memset(clientaddr, 0x00, sizeof( clientaddr ));
          strcpy(clientaddr, inet_ntoa( client_addr.sin_addr));
          WRITE_LOG("CLIENT 접속 : %s" , clientaddr);

          childpid = fork();

          if( childpid < 0 ){
                       close( clientSockfd );
                       continue;
          }
          else if ( childpid == 0 ){
                       close(l_sockfd);
                       trans_data( clientSockfd );
                       exit(0); 
          }
          else{
                       close(clientSockfd);
          }
    }
    
}

void trans_data( int clientSockfd)
{
   int       sockfd = clientSockfd ;
   struct    sockaddr_in server;
   int       clientfd;
   char      ip  [20];
   char      port[10];
   int       timeout = 30;   /* 5분 */
   int       value;
   char      reqdate[8 + 1];

   /* 통신 프로토콜 */
   RQ_PROTOCOL   rq_protocol;
   RS_PROTOCOL   rs_protocol;

   int           rc = 0;

    /* STEP 1 : socket 재사용 지정 */
    value = 1;
    rc = setsockopt( sockfd, SOL_SOCKET, SO_REUSEADDR, (char *)&value, sizeof( value));
    if ( rc == -1 ) {
         WRITE_LOG("소켓 옵션 설정 에러...(1)");
         return ;
    }
    /* STEP 2 : 라인의 상태를 비 통신중에도 주기적으로 점검한다 */
    rc = setsockopt( sockfd, SOL_SOCKET, SO_KEEPALIVE, (char *)&value, sizeof(value) );
    if ( rc == -1 ) {
         WRITE_LOG("소켓 옵션 설정 에러...(2)");
         return ;
    }
    g_socketfd = sockfd;

    while(1)
    {
            memset( reqdate, 0x00, sizeof( reqdate));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);

            g_newsock = sockfd;

            signal(SIGALRM, TimeOutExit);
            alarm(timeout);

            rc = read(sockfd, &reqdate, sizeof(reqdate));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);  

            if( rc <= 0 || rc < sizeof(reqdate)) { 
	         TimeOutExit();
            }
            if( rc > 0 )  break;
    }

  printf("rc : %d\n", rc); 

  initStruct_1( &rq_protocol ); 

  rq_protocol.pad = PAD;
  rq_protocol.stx = STX;
  rq_protocol.reqtype = REQ_TYPE;
  strcpy(rq_protocol.cprdate,reqdate ); 
  rq_protocol.etx = ETX;

  printf("pad : %c , stx : %c, cprDate : %s - %c\n", rq_protocol.pad , rq_protocol.stx , rq_protocol.cprdate, rq_protocol.etx );

  WRITE_LOG("요청 일자 : %s", rq_protocol.cprdate);

   memset(ip, 0x00, sizeof(ip));
   memset(port, 0x00, sizeof( port)); 
   memset( &rs_protocol , 0x00, sizeof( RS_PROTOCOL ));

   rc = GetProfileString(INIFILE, "IP", &ip);
   if( rc == -1 ) {
         /* 실패 전송 처리 */
         rs_protocol.status = 1;
         rs_protocol.errcode = 0x0120;

         if(( rc = write(  sockfd, &rs_protocol, sizeof( RS_PROTOCOL )))  <= 0 ) 
         {
               WRITE_LOG("INIFILE DATA GET ERROR...\n");
               close(sockfd);
               return;
         }
   }

   rc = GetProfileString(INIFILE, "PORT", &port);
   if( rc == -1 ) {
         /* 실패 전송 처리 */
         rs_protocol.status = 1;
         rs_protocol.errcode = 0x0120;

         if(( rc = write(  sockfd, &rs_protocol, sizeof( RS_PROTOCOL ))) <= 0 ) 
         {
               WRITE_LOG("INIFILE DATA GET ERROR...\n");
               close(sockfd);
               return;
         }
   }
printf("%s - %s\n", ip, port);

   if( (clientfd = socket(AF_INET, SOCK_STREAM, 0)) < 0  ){
        /* 실패 전송 처리 */
         rs_protocol.status = 1;
         rs_protocol.errcode = 0x0120;

         if(( rc = write(  sockfd, &rs_protocol, sizeof( RS_PROTOCOL ))) <= 0 ) 
         {
               WRITE_LOG("CMS 서버 소켓 생성 오류 ...\n");
               close(sockfd);
               return;
         }
   }

printf("socket Creat Succ\n");

   server.sin_addr.s_addr = inet_addr(ip);
   server.sin_family=AF_INET;
   server.sin_port = htons(atoi(port));

   if(connect( clientfd, (struct sockaddr*)&server, sizeof(server)) < 0 ){ 
         /* 실패 전송 처리 */
         rs_protocol.status = 1;
         rs_protocol.errcode = 0x0120;

         if(( rc = write(  sockfd, &rs_protocol, sizeof( RS_PROTOCOL ))) <= 0 ) 
         {
               WRITE_LOG("CMS 서버  CONNECTION ERROR ...");
               close(clientfd);
               close(sockfd);
               return;
         }
   }

printf("connect Succ\n");

   if( (rc = write( clientfd, &rq_protocol, sizeof( RQ_PROTOCOL )) ) <= 0 ){
        /* 실패 전송 처리 */
         rs_protocol.status = 1;
         rs_protocol.errcode = 0x0120;

         if(( rc = write(  sockfd, &rs_protocol, sizeof( RS_PROTOCOL ))) <= 0 ) 
         {
               WRITE_LOG("CMS 서버  데이터 전송 에러  ERROR ...\n");
               close(clientfd);
               close(sockfd);
               return;
         }
   } 

printf("write_succ\n");

   while(1)
   {
            memset(&rs_protocol, 0x00,    sizeof( RS_PROTOCOL ));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);

            g_newsock = clientfd;

            signal(SIGALRM, TimeOutExit);
            alarm(timeout);

            rc = read(clientfd, &rs_protocol, sizeof( RS_PROTOCOL));

            signal(SIGALRM, SIG_IGN); /* 기 설정 ALARM 무시 */
            alarm(0);

            if ( rc <= 0 || rc < sizeof( RS_PROTOCOL)){
		 TimeOutExit();
            }
            if( rc > 0 )  break;
   }

   close(clientfd);
   
   if( (rc = write( sockfd, &rs_protocol, sizeof( RS_PROTOCOL  )) ) <= 0 ){
        /* 실패 전송 처리 */
         rs_protocol.status = 1;
         rs_protocol.errcode = 0x0120;

         if(( rc = write(  sockfd, &rs_protocol, sizeof( RS_PROTOCOL ))) <= 0 )
         {
               WRITE_LOG("CMS 서버  데이터 전송 에러  ERROR ...\n");
               close(clientfd);
               close(sockfd);
               return;
         }
   }

   close(sockfd); 

   return;
   
}

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


    rc = GetProfileString(INIFILE, "LOG_PATH", &LogPath);

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
         return -1;
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
                        return 0;
               }

   }
    
   fclose(fp);
   return -1;
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
                        WRITE_LOG("[F][SIGINT ctrl+c receive]");
                        close( g_socketfd );
                        break;

                case SIGTERM:
                        WRITE_LOG("[F][SIGTERM kill receive]");
                        close( g_socketfd );
                        break;
                default :
                        WRITE_LOG("[F][Unknown Signal receive SIG#=%d", signal);
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

        WRITE_LOG("[F][TimeOut happened client]");

        memset( &rs_protocol, 0x00, sizeof( RS_PROTOCOL ));

        rs_protocol.status = 1;
        rs_protocol.errcode = 0x0120;

        write( g_socketfd, &rs_protocol, sizeof( RS_PROTOCOL ));

        close(g_newsock);
        close(g_socketfd);
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
