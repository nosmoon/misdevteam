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
#define  ERROR_UNKNOWN_REQ         0x0100    // request type ����
#define  ERROR_CONN_DATABASE       0x0110    // DB ���� ����
#define  ERROR_SERVER_SOCKET       0x0120    // �������� ���� (���α׷� ����)
#define  ERROR_CONN_FACT           0x0130    // ���� ��� ���� (+1: ����, +2: ����, +4: ����, +8: ����)
#define  ERROR_CONN_FACT10         0x0131 
#define  ERROR_CONN_FACT20         0x0132 
#define  ERROR_CONN_FACT22         0x0134 
#define  ERROR_CONN_FACT25         0x0138 

typedef unsigned short USHORT;

/* ���������� ���� ��û*/
typedef struct {
	 char pad;              /* PAD */
	 char stx;              /* STX */
	 USHORT reqtype;        /* Request Type : ������ ���� ��û (0x0022) */
         char cprdate[8 + 1];       /* �������� (YYYYMMDD) */
	 char etx;              /* ETX */
} RQ_PROTOCOL;

typedef struct {
	 char   pad;              /* PAD */
	 char   stx;              /* STX */
	 USHORT reqtype;          /* Request Type : ������ ���� ��û (0x0022) */
	 USHORT status;           /* ������ ���� ���� 0, ���� 1 */
	 USHORT errcode;          /* ���н� Error Code */
	 char   etx;              /* ETX */
} RS_PROTOCOL;

typedef struct {
  int    magic_num   ;   /* 0x43434343  */
  int    req_type    ;   /* 0x0011   ��û  0x1011 ���  */
  int    status      ;   /* ���� 0 ���� 1 */
} TRANS_PROTOCOL ;

typedef struct {
  int    res        ;       /*  ���� 0 ���� 1 */
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
int   InitServerSocket();                                     /* ���� ���� �ʱ�ȭ �� �ɼ� ���� */
