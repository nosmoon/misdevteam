#include <stdio.h>
#include <stdlib.h>
#include <netdb.h>
#include <fcntl.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <sys/errno.h>
#include <netdb.h>
#include <netinet/tcp.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <signal.h>
#include <unistd.h>
#include <string.h>
#include <stdarg.h>

#define PORT    "12501"
#define INIFILE "main.ini"
#define MAX_LEN 1024
#define TIME_BUF_SIZE  29
#define  PAD              '0'
#define  STX              '1'
#define  ETX              '2'
#define  REQ_TYPE         0x0022
#define  REQ_TYPE2        0x0011
#define  MAGIC_NUM        0x43434343

#define  SUCC          0
#define  FAIL         -1


/* ERROR MASSAGE DEFINE */
#define  ERROR_UNKNOWN_REQ         0x0100    // request type 없음
#define  ERROR_CONN_DATABASE       0x0110    // DB 접속 에러
#define  ERROR_SERVER_SOCKET       0x0120    // 서버소켓 에러 (프로그램 종료)
#define  ERROR_CONN_FACT           0x0130    // 공장 통신 에러 (+1: 본사, +2: 부평, +4: 성남, +8: 평촌)
#define  ERROR_CONN_FACT10         0x0131 
#define  ERROR_CONN_FACT20         0x0132 
#define  ERROR_CONN_FACT22         0x0134 
#define  ERROR_CONN_FACT25         0x0138 

typedef unsigned short USHORT;

/* 실적데이터 생성 요청*/
typedef struct {
	 char pad;              /* PAD */
	 char stx;              /* STX */
	 USHORT reqtype;        /* Request Type : 데이터 생성 요청 (0x0022) */
         char cprdate[8 + 1];       /* 발행일자 (YYYYMMDD) */
	 char etx;              /* ETX */
} RQ_PROTOCOL;

typedef struct {
	 char   pad;              /* PAD */
	 char   stx;              /* STX */
	 USHORT reqtype;          /* Request Type : 데이터 생성 요청 (0x0022) */
	 USHORT status;           /* 데이터 생성 성공 0, 실패 1 */
	 USHORT errcode;          /* 실패시 Error Code */
	 char   etx;              /* ETX */
} RS_PROTOCOL;

typedef struct {
  int    magic_num   ;   /* 0x43434343  */
  int    req_type    ;   /* 0x0011   요청  0x1011 결과  */
  int    status      ;   /* 정상 0 에러 1 */
} TRANS_PROTOCOL ;

typedef struct {
  int    res        ;       /*  정상 0 에러 1 */
  char   errmsg[100];
} RES_PROTOCOL;

void  server(int sockfd);
void  trans_data( int clientSockfd);
int   Trans_Step1_date(char *reqData, RS_PROTOCOL *rs);
int   SendResult(int sockfd, int res , char *resMsg);
int   GetSerVerInfo( char *ip, char *port , int gubun);
int   Trans_Step2_date(TRANS_PROTOCOL *rs);
int   GetProfileString( char *iniFile, char *item, char *buff );
int   Signal(int SigNo, void (*Sig_Handler)(int));
void  SignalRtn( int signal );
void  TimeOutExit();
int   InitServerSocket();                                     /* 서버 소켓 초기화 및 옵션 설정 */
