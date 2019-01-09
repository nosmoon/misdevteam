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

typedef unsigned short USHORT;


void  server(int sockfd);
void  trans_data( int clientSockfd);
int   GetProfileString( char *iniFile, char *item, char *buff );
int   Signal(int SigNo, void (*Sig_Handler)(int));
void  SignalRtn( int signal );
void  TimeOutExit();
void  WRITE_LOG( const  char *fmt, ...);


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
