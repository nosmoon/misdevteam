/***************************************************************************************************
* 파일명 : SS_A_MIG_BILLUPDM.java
* 기능 : 관리자-작업-마이그레이션-전환을 위한 DM
* 작성일자 : 2004-03-15
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import java.util.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-작업-마이그레이션-전환을 위한 DM
 *
 * [조선IS MS-SQL 서버의 table 목록]
 *  0.bankdatas          (은행신청분)
 *  1.billa              지로자동이체
 *  2.billb              a.c,h 의 Master  ( 이체 청구내역)  지국불변코드 존재
 *  3.billc              일반카드
 *  4.billh              신한카드
 *  5.cancelmember       해지신청자
 *  6.changemember       변경신청자
 *  7.dokjikukchange     지국변경자
 *  8.dokmasterb         독자정보 (body)
 *  9.dokmasterh         독자정보 (header) 회원ID 로 조인
 *  10.logmember         변경된 이력
 *  11.newmember         신규신청자
 *  12.logbankinfo       납부자변경 로그
 *  #### 테이블 순서대로 마이그레이션 되므로 위의 순서는 지켜져야 한다. ####
 *
 * [마이그레이션 주의사항]
 *  0.모든 테이블은 "temp_"가 앞에 붙여진 임시 테이블로 마이그레이션된다.
 *  1.모든 임시 테이블의 layout은 지국지사코드(지국불변코드)가 추가된 것을 제외하고는 원본 테이블과 같다.
 *  2.납부자번호1, 납부자번호2 중 앞 5자리중 현재 requesting 된 지국의 것과 일치하는 정보들만 Migration 하도록 한다.
 *  3.billa,billb,billc,billh table 중 billa에는 지국지사코드가 없기 때문에 해당 지국지사코드는 billb 와 join하여 다음과 같이 구하도록한다.
 *        <billa 를 마이그레이션 할 경우 where 절>
 *                   billa.id = billb.bborderid
 *                   and billb.bbbillcode = '3'
 *                   and billb.bbjicode = '지국불변코드'
 *  4.DokJikukChange 테이블에서는 변경후 지국코드(jcJiCodeAfter) 항목으로 지국지사코드와 비교하여 해당정보들만 Migration 하도록 한다.
 *  4.라인 구분자 : String({20})     또는 '\u0014'
 *  5.컬럼 구분자 : String({7})      또는 '\u0007'
 */

public class SS_A_MIG_BILLUPDM extends somo.framework.db.BaseDM implements java.io.Serializable{
    public String incmgpers;    //입력자 혹은 수정자 아이디
    public String bocd;         //지국지사코드
    public String workclsf;     //작업구분코드 ( '97', '992' ) (1:지국DBUP, 2:지국DB전환, 3:빌링DBUP, 4:빌링DB전환)

    public ArrayList tables  = new ArrayList(); //마이그레이션 대상 테이블
    public ArrayList columns = new ArrayList(); //마이그레이션 대상 테이블의 컬럼명, 컬럼타입(String의 이차원 배열)

    String[][] column0 =
        {
             {"TEMP_BANKDATAS"		,"ID" 				,"NUMBER(8,0)"	}		//ID
            ,{"TEMP_BANKDATAS"		,"GUBUN" 			,"CHAR(2)"	  	}       //구분
            ,{"TEMP_BANKDATAS"		,"SEQ_NUM" 			,"VARCHAR2(7)"	}       //일련번호
            ,{"TEMP_BANKDATAS"		,"APPL_DATE" 		,"VARCHAR2(8)"	}       //신청일자
            ,{"TEMP_BANKDATAS"		,"APPL_GB" 			,"CHAR(2)"		}       //신청구분
            ,{"TEMP_BANKDATAS"		,"PAY_NUM1" 		,"VARCHAR2(20)"	}       //납부자번호1
            ,{"TEMP_BANKDATAS"		,"PAY_NUM2" 		,"VARCHAR2(20)"	}       //납부자번호2
            ,{"TEMP_BANKDATAS"		,"PAY_DAY" 			,"VARCHAR2(2)"	}       //납부희망일
            ,{"TEMP_BANKDATAS"		,"FEE_TYPE" 		,"VARCHAR2(2)"	}       //요금종류
            ,{"TEMP_BANKDATAS"		,"ACCT_BR" 			,"VARCHAR2(6)"	}       //납부자계좌개설점
            ,{"TEMP_BANKDATAS"		,"PAY_ACCT" 		,"VARCHAR2(15)"	}       //출금계좌번호
            ,{"TEMP_BANKDATAS"		,"JUMIN_NUM" 		,"VARCHAR2(13)"	}       //주민번호
            ,{"TEMP_BANKDATAS"		,"PAY_TEL" 			,"VARCHAR2(11)"	}       //납부자전화번호
            ,{"TEMP_BANKDATAS"		,"APPL_BR" 			,"VARCHAR2(6)"	}       //신청서접수점
            ,{"TEMP_BANKDATAS"		,"APPL_RS" 			,"VARCHAR2(2)"	}       //신청결과
            ,{"TEMP_BANKDATAS"		,"OPEN_MM" 			,"VARCHAR2(4)"	}       //최초개시월
            ,{"TEMP_BANKDATAS"		,"ACCT_GB" 			,"CHAR(1)"		}       //접수처구분
            ,{"TEMP_BANKDATAS"		,"CB_ACCT_NUM" 		,"VARCHAR2(9)"	}       //전자접수번호
            ,{"TEMP_BANKDATAS"		,"ACCT_OWNER" 		,"VARCHAR2(16)"	}       //예금주명
            ,{"TEMP_BANKDATAS"		,"TR_DATE" 			,"VARCHAR2(8)"	}       //처리일자
            ,{"TEMP_BANKDATAS"		,"TR_CODE" 			,"CHAR(2)"		}       //처리코드
            ,{"TEMP_BANKDATAS"		,"BOCD" 			,"VARCHAR2(5)"	}       //지국불변코드
        };


    String[][] column1 =
        {
             {"TEMP_BILLA"			,"ID"          		,"NUMBER(6,0)" 	}		//ID
            ,{"TEMP_BILLA"			,"GUBUN"       		,"CHAR(2)"     	}       //GUBUN
            ,{"TEMP_BILLA"			,"SEQ_NUM"     		,"VARCHAR2(7)" 	}       //SEQ_NUM
            ,{"TEMP_BILLA"			,"PAY_NUM"     		,"VARCHAR2(20)"	}       //PAY_NUM
            ,{"TEMP_BILLA"			,"ACCT_BR"     		,"VARCHAR2(2)" 	}       //ACCT_BR
            ,{"TEMP_BILLA"			,"PAY_ACCT"    		,"VARCHAR2(15)"	}       //PAY_ACCT
            ,{"TEMP_BILLA"			,"JUMIN_NUM"   		,"VARCHAR2(13)"	}       //JUMIN_NUM
            ,{"TEMP_BILLA"			,"PAY_HIST"    		,"VARCHAR2(20)"	}       //PAY_HIST
            ,{"TEMP_BILLA"			,"AMT"         		,"NUMBER(8,0)" 	}       //AMT
            ,{"TEMP_BILLA"			,"REQ_RS"      		,"VARCHAR2(2)" 	}       //REQ_RS
            ,{"TEMP_BILLA"			,"APPL_GBCODE" 		,"VARCHAR2(2)" 	}       //APPL_GBCODE
            ,{"TEMP_BILLA"			,"PART_AMT"    		,"NUMBER(8,0)" 	}       //PART_AMT
            ,{"TEMP_BILLA"			,"RN_GBCODE"   		,"CHAR(1)"     	}       //RN_GBCODE
            ,{"TEMP_BILLA"			,"MG_DATE"     		,"DATE"        	}       //MG_DATE
            ,{"TEMP_BILLA"			,"RS_DATE"     		,"DATE"        	}       //RS_DATE
            ,{"TEMP_BILLA"			,"BOCD"        		,"VARCHAR2(5)" 	}       //BOCD
        };

    String[][] column2 =
        {
             {"TEMP_BILLB"			,"BBBILLID"    		,"NUMBER(8,0)"	}		//일련번호
            ,{"TEMP_BILLB"			,"BBJIJONGID"  		,"NUMBER(8,0)"	}       //독자지종관리ID
            ,{"TEMP_BILLB"			,"BBBILLMONTH" 		,"VARCHAR2(6)"	}       //청구월분
            ,{"TEMP_BILLB"			,"BBPAYMONTH"  		,"VARCHAR2(6)"	}       //수납월
            ,{"TEMP_BILLB"			,"BBMEMBID"    		,"NUMBER(8,0)"	}       //예금주ID
            ,{"TEMP_BILLB"			,"BBJIMEMBID"  		,"VARCHAR2(5)"	}       //독자고유번호
            ,{"TEMP_BILLB"			,"BBJICODE"    		,"VARCHAR2(7)"	}       //지국코드
            ,{"TEMP_BILLB"			,"BBJIJONG"    		,"CHAR(2)"    	}       //지종
            ,{"TEMP_BILLB"			,"BBCOPY"      		,"NUMBER(5,0)"	}       //부수
            ,{"TEMP_BILLB"			,"BBDAN"       		,"NUMBER(8,0)"	}       //단가
            ,{"TEMP_BILLB"			,"BBBILLCODE"  		,"CHAR(2)"    	}       //이체구분(2,3)
            ,{"TEMP_BILLB"			,"BBTRDATE"    		,"DATE"       	}       //결제원전송일자
            ,{"TEMP_BILLB"			,"BBMAGAM"     		,"VARCHAR2(2)"	}       //청구구분
            ,{"TEMP_BILLB"			,"BBORDERID"   		,"NUMBER(6,0)"	}       //청구관리ID
            ,{"TEMP_BILLB"			,"BOCD"        		,"VARCHAR2(5)"	}       //지국불변코드
        };

    String[][] column3 =
        {
             {"TEMP_BILLC"			,"BCBILLID"	 		,"NUMBER(8, 0)"		}	    //ID(BILLB.bbOrderID 와 연결)
            ,{"TEMP_BILLC"			,"BCMEMBID"	 		,"NUMBER(8, 0)"		}       //MembID(예금주 MembID)
            ,{"TEMP_BILLC"			,"BCJICODE"	 		,"VARCHAR2(10)"    	}       //지국코드
            ,{"TEMP_BILLC"			,"BCCNO"        	,"VARCHAR2(10)"    	}       //KS_NET 단말기번호
            ,{"TEMP_BILLC"			,"BCBILLYM"     	,"VARCHAR2(6)"     	}       //거래년월(YYYYMM)
            ,{"TEMP_BILLC"			,"BCITEMNO"     	,"VARCHAR2(2)"     	}       //항목코드
            ,{"TEMP_BILLC"			,"BCSHOPNO"     	,"VARCHAR2(2)"     	}       //점코드
            ,{"TEMP_BILLC"			,"BCPOSNO"      	,"NUMBER(8, 0)"    	}       //POS번호
            ,{"TEMP_BILLC"			,"BCSEQNO"      	,"NUMBER(8, 0)"    	}       //일련번호
            ,{"TEMP_BILLC"			,"BCEMPNO"      	,"VARCHAR2(15)"    	}       //사원번호
            ,{"TEMP_BILLC"			,"BCDGUBUN "    	,"VARCHAR2(2)"     	}       //데이터rnqns
            ,{"TEMP_BILLC"			,"BCKEYIN"      	,"CHAR(1)"         	}       //Keyln 구분(@')
            ,{"TEMP_BILLC"			,"BCTRACKLEN"   	,"VARCHAR2(2)"     	}       //Track길이(38')
            ,{"TEMP_BILLC"			,"BCTRACK"      	,"VARCHAR2(38)"    	}       //Track(카드번호 + '=' + 유효기간(YYMM)
            ,{"TEMP_BILLC"			,"BCDIVMONTH"   	,"VARCHAR2(2)"     	}       //할부개월수
            ,{"TEMP_BILLC"          ,"BCPRICE"          ,"NUMBER(8, 0)"     }       //거래금액
            ,{"TEMP_BILLC"          ,"BCHELPPRICE"      ,"NUMBER(8, 0)"     }       //봉사료
            ,{"TEMP_BILLC"          ,"BCOKNO"           ,"VARCHAR2(8)"      }       //승인번호
            ,{"TEMP_BILLC"          ,"BCOKDATE"         ,"VARCHAR2(8)"      }       //승인일자
            ,{"TEMP_BILLC"          ,"BCOKTIME"         ,"VARCHAR2(6)"      }       //승인시각
            ,{"TEMP_BILLC"          ,"BCRESULTCD"       ,"VARCHAR2(4)"      }       //결과코드
            ,{"TEMP_BILLC"          ,"BCEXPORTNO"       ,"VARCHAR2(2)"      }       //발급사코드(발급 카드사코드)
            ,{"TEMP_BILLC"          ,"BCIMPORTNO"       ,"VARCHAR2(2)"      }       //매입사코드(매입 카드사코드)
            ,{"TEMP_BILLC"          ,"BCJOINNO"         ,"VARCHAR2(15)"     }       //가맹점번호
            ,{"TEMP_BILLC"          ,"BCTRDATE"         ,"DATE"             }       //KS_NET  전송일자
            ,{"TEMP_BILLC"          ,"BCPSDATE"         ,"DATE"             }       //청구결과처리일자
            ,{"TEMP_BILLC"          ,"BOCD"	            ,"VARCHAR2(5)"	    }       //지국불변코드
        };

    String[][] column4 =
        {
             {"TEMP_BILLH"			,"BMBILLID"      	,"NUMBER(5,0)"	}		//일련번호
            ,{"TEMP_BILLH"			,"BMBILLMONTH"   	,"VARCHAR2(6)" 	}       //청구월분
            ,{"TEMP_BILLH"			,"BMMEMBID"      	,"NUMBER(6,0)" 	}       //예금주ID
            ,{"TEMP_BILLH"			,"BMJICODE"      	,"VARCHAR2(7)" 	}       //지국코드
            ,{"TEMP_BILLH"			,"BMORDERDATE"   	,"DATE"        	}       //청구일자
            ,{"TEMP_BILLH"			,"BMPAYDATE"     	,"DATE"        	}       //수납일자
            ,{"TEMP_BILLH"			,"BMBILLRSLTCODE"	,"VARCHAR2(5)" 	}       //청구결과
            ,{"TEMP_BILLH"			,"BMBILLSTATE"   	,"CHAR(1)"     	}       //청구상태(별의미없음)
            ,{"TEMP_BILLH"			,"BMORDERMONTH"  	,"VARCHAR2(50)"	}       //청구자료생성월
            ,{"TEMP_BILLH"			,"BMORDERMONEY"  	,"NUMBER(6,0)" 	}       //청구금액
            ,{"TEMP_BILLH"			,"BMCREATEDATE"  	,"DATE"        	}       //청구자료생성월
            ,{"TEMP_BILLH"			,"BMBANKCODE"    	,"VARCHAR2(6)" 	}       //은행코드(NULL)
            ,{"TEMP_BILLH"			,"BMBANKNO"      	,"VARCHAR2(50)"	}       //계좌번호(NULL)
            ,{"TEMP_BILLH"			,"BMBANKOWNER"   	,"VARCHAR2(20)"	}       //예금주ID(NULL)
            ,{"TEMP_BILLH"			,"BOCD"          	,"VARCHAR2(5)"	}       //지국불변코드
        };


    String[][] column5 =
        {
             {"TEMP_CANCELMEMBER"	,"ID"          		,"NUMBER(8,0)"	}		//ID
            ,{"TEMP_CANCELMEMBER"	,"GUBUN"       		,"CHAR(2)"      }       //구분
            ,{"TEMP_CANCELMEMBER"	,"SEQ_NUM"     		,"VARCHAR2(7)"  }       //일련번호
            ,{"TEMP_CANCELMEMBER"	,"CN_APPL_DATE"		,"VARCHAR2(8)"  }       //해지신청일자
            ,{"TEMP_CANCELMEMBER"	,"APPL_GB"     		,"CHAR(2)"      }       //신청구분
            ,{"TEMP_CANCELMEMBER"	,"PAY_NUM1"    		,"VARCHAR2(20)" }       //납부자번호1
            ,{"TEMP_CANCELMEMBER"	,"PAY_NUM2"    		,"VARCHAR2(20)" }       //납부자번호2
            ,{"TEMP_CANCELMEMBER"	,"PAY_DAY"     		,"VARCHAR2(2)"  }       //납부희망일
            ,{"TEMP_CANCELMEMBER"	,"FEE_TYPE"    		,"VARCHAR2(2)"  }       //요금종류
            ,{"TEMP_CANCELMEMBER"	,"ACCT_BR"     		,"VARCHAR2(6)"  }       //납부자계좌개설점
            ,{"TEMP_CANCELMEMBER"	,"PAY_ACCT"    		,"VARCHAR2(20)" }       //출금계좌번호
            ,{"TEMP_CANCELMEMBER"	,"JUMIN_NUM"   		,"VARCHAR2(20)" }       //주민번호
            ,{"TEMP_CANCELMEMBER"	,"PAY_TEL"     		,"VARCHAR2(20)" }       //납부자전화번호
            ,{"TEMP_CANCELMEMBER"	,"APPL_BR"     		,"VARCHAR2(6)"  }       //신청서접수점
            ,{"TEMP_CANCELMEMBER"	,"CN_APPL_RS"  		,"VARCHAR2(2)"  }       //해지결과
            ,{"TEMP_CANCELMEMBER"	,"OPEN_MM"     		,"VARCHAR2(4)"  }       //최초개시월
            ,{"TEMP_CANCELMEMBER"	,"ACCT_GB"     		,"CHAR(1)"      }       //접수처구분
            ,{"TEMP_CANCELMEMBER"	,"CB_ACCT_NUM" 		,"VARCHAR2(9)"  }       //전자접수번호
            ,{"TEMP_CANCELMEMBER"	,"ACCT_OWNER"  		,"VARCHAR2(20)" }       //예금주명
            ,{"TEMP_CANCELMEMBER"	,"CR_DATE"     		,"DATE"         }       //생성일자
            ,{"TEMP_CANCELMEMBER"	,"TR_DATE"     		,"DATE"         }       //처리일자
            ,{"TEMP_CANCELMEMBER"	,"TR_CODE"     		,"CHAR(2)"      }       //처리코드
            ,{"TEMP_CANCELMEMBER"	,"CCMEMBID"    		,"NUMBER(8,0)"  }       //ccMembID
            ,{"TEMP_CANCELMEMBER"	,"CCJIJONGID"  		,"NUMBER(8,0)"  }       //ccJiJongID
            ,{"TEMP_CANCELMEMBER"	,"CN_POINTIP"  		,"VARCHAR2(20)" }       //해지자IP
            ,{"TEMP_CANCELMEMBER"	,"CN_PERSID"   		,"VARCHAR2(20)" }       //해지자ID
            ,{"TEMP_CANCELMEMBER"	,"BOCD"        		,"VARCHAR2(5)"  }       //지국불변코드
         };

    String[][] column6 =
        {
             {"TEMP_CHANGEMEMBER"	,"ID"          		,"NUMBER(8,0)"	}       //ID
            ,{"TEMP_CHANGEMEMBER"	,"GUBUN"       		,"CHAR(2)"      }       //구분
            ,{"TEMP_CHANGEMEMBER"	,"SEQ_NUM"     		,"VARCHAR2(7)"  }       //일련번호
            ,{"TEMP_CHANGEMEMBER"	,"CH_APPL_DATE"		,"VARCHAR2(8)"  }       //변경신청일자
            ,{"TEMP_CHANGEMEMBER"	,"APPL_GB"     		,"CHAR(2)"      }       //신청구분
            ,{"TEMP_CHANGEMEMBER"	,"PAY_NUM1"    		,"VARCHAR2(20)" }       //납부자번호
            ,{"TEMP_CHANGEMEMBER"	,"PAY_NUM2"    		,"VARCHAR2(20)" }       //납부자번호2
            ,{"TEMP_CHANGEMEMBER"	,"PAY_DAY"     		,"VARCHAR2(2)"  }       //납부희망일
            ,{"TEMP_CHANGEMEMBER"	,"FEE_TYPE"    		,"VARCHAR2(2)"  }       //요금종류
            ,{"TEMP_CHANGEMEMBER"	,"ACCT_BR"     		,"VARCHAR2(6)"  }       //납부자계좌개설점
            ,{"TEMP_CHANGEMEMBER"	,"PAY_ACCT"    		,"VARCHAR2(20)" }       //출금계좌번호
            ,{"TEMP_CHANGEMEMBER"	,"JUMIN_NUM"   		,"VARCHAR2(20)" }       //주민번호
            ,{"TEMP_CHANGEMEMBER"	,"PAY_TEL"     		,"VARCHAR2(20)" }       //납부자전화번호
            ,{"TEMP_CHANGEMEMBER"	,"APPL_BR"     		,"VARCHAR2(6)"  }       //신청서접수점
            ,{"TEMP_CHANGEMEMBER"	,"CH_APPL_RS"  		,"VARCHAR2(2)"  }       //변경결과
            ,{"TEMP_CHANGEMEMBER"	,"OPEN_MM"     		,"VARCHAR2(4)"  }       //최초개시월
            ,{"TEMP_CHANGEMEMBER"	,"ACCT_GB"     		,"CHAR(1)"      }       //접수처구분
            ,{"TEMP_CHANGEMEMBER"	,"CB_ACCT_NUM" 		,"VARCHAR2(9)"  }       //전자접수번호
            ,{"TEMP_CHANGEMEMBER"	,"ACCT_OWNER"  		,"VARCHAR2(20)" }       //예금주명
            ,{"TEMP_CHANGEMEMBER"	,"CR_DATE"     		,"DATE"         }       //생성일자
            ,{"TEMP_CHANGEMEMBER"	,"TR_DATE"     		,"DATE"         }       //처리일자
            ,{"TEMP_CHANGEMEMBER"	,"TR_CODE"     		,"CHAR(2)"      }       //처리코드
            ,{"TEMP_CHANGEMEMBER"	,"CHMEMBID"    		,"NUMBER(8,0)"  }       //chMembID
            ,{"TEMP_CHANGEMEMBER"	,"CHJIJONGID"  		,"NUMBER(8,0)"	}       //chJiJongID
            ,{"TEMP_CHANGEMEMBER"	,"CH_POINTIP"  		,"VARCHAR2(20)" }       //변경지IP
            ,{"TEMP_CHANGEMEMBER"	,"CH_PERSID"   		,"VARCHAR2(20)" }       //변경자ID
            ,{"TEMP_CHANGEMEMBER"	,"BOCD"        		,"VARCHAR2(5)"  }       //지국불변코드
        };

    String[][] column7 =
        {
             {"TEMP_DOKJIKUKCHANGE"	,"ID"          		,"NUMBER(8,0)"	}		//일련번호
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJICODEAFTER"    ,"VARCHAR2(7)"  }       //변경후 지국코드
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJICODEBEFORE"   ,"VARCHAR2(7)"  }       //변경전 지국코드
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCMEMBID"         ,"NUMBER(8,0)"  }       //예금주ID
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIJONGID"       ,"NUMBER(8,0)"  }       //지종관리ID
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIKUKCHANGEDT"  ,"DATE"         }       //지국변경일자
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIKUKCHECKDT"   ,"DATE"         }       //지국확인일자
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIKUKCHECK"     ,"CHAR(1)"      }       //지국확인여부
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCSENDCHECK"      ,"CHAR(1)"      }       //변경신청여부
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCUSERIP"         ,"VARCHAR2(20)" }       //변경지IP
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIMEMBIDBEFORE" ,"VARCHAR2(5)"  }       //변경전 고유번호
            ,{"TEMP_DOKJIKUKCHANGE"	,"BOCD"          	,"VARCHAR2(5)"  }       //지국불변코드
        };

    String[][] column8 =
        {
             {"TEMP_DOKMASTERB"		,"PLJIJONGID"   	,"NUMBER(8,0)"	}		//지종관리ID
            ,{"TEMP_DOKMASTERB"		,"PLMEMBID"     	,"NUMBER(8,0)" 	}       //회원ID
            ,{"TEMP_DOKMASTERB"		,"PLJICODE"     	,"VARCHAR2(5)" 	}       //지국불변코드
            ,{"TEMP_DOKMASTERB"		,"PLJIMEMBID"   	,"VARCHAR2(5)" 	}       //지국관리독자번호
            ,{"TEMP_DOKMASTERB"		,"PLSUBCNAME"   	,"VARCHAR2(50)"	}       //구독자명
            ,{"TEMP_DOKMASTERB"		,"PLJIJONG"     	,"VARCHAR2(2)" 	}       //지종코드
            ,{"TEMP_DOKMASTERB"		,"PLCOPY"       	,"NUMBER(5,0)" 	}       //부수
            ,{"TEMP_DOKMASTERB"		,"PLJIJONGDAN"  	,"NUMBER(8,0)" 	}       //지종기초단가
            ,{"TEMP_DOKMASTERB"		,"PLJIPOST"     	,"NUMBER(5,0)" 	}       //우편번호ID
            ,{"TEMP_DOKMASTERB"		,"PLJIADDR"     	,"VARCHAR2(50)"	}       //주소
            ,{"TEMP_DOKMASTERB"		,"PLPAYMETHOD"  	,"CHAR(2)"     	}       //이체상태
            ,{"TEMP_DOKMASTERB"		,"PLJIKUKCHECK" 	,"CHAR(1)"     	}       //지국확인코드
            ,{"TEMP_DOKMASTERB"		,"PLGIROSTART"  	,"VARCHAR2(6)" 	}       //이체시작년월
            ,{"TEMP_DOKMASTERB"		,"PLSTOPCODE"   	,"CHAR(2)"     	}       //중지코드
            ,{"TEMP_DOKMASTERB"		,"PLSTOPDATE"   	,"DATE"        	}       //중지신청일
            ,{"TEMP_DOKMASTERB"		,"PLSTOPAPPDATE"	,"DATE"        	}       //중지적용일
            ,{"TEMP_DOKMASTERB"		,"PLYEARBILL"   	,"VARCHAR2(12)"	}       //1년간 납부현황
            ,{"TEMP_DOKMASTERB"		,"PLCREATED"    	,"DATE"        	}       //생성일
            ,{"TEMP_DOKMASTERB"		,"PLCREATOR"    	,"VARCHAR2(50)"	}       //생성자(시스템,지국)
            ,{"TEMP_DOKMASTERB"		,"PLMEMBPHONE"  	,"VARCHAR2(20)"	}       //독자전화번호
            ,{"TEMP_DOKMASTERB"		,"PLMEMBIP"     	,"VARCHAR2(20)"	}       //접수지IP
            ,{"TEMP_DOKMASTERB"		,"PLSENDCHECK"  	,"CHAR(1)"     	}       //
            ,{"TEMP_DOKMASTERB"		,"PLAPPDATE"    	,"DATE"        	}       //
            ,{"TEMP_DOKMASTERB"		,"PLAPPUSER"    	,"VARCHAR2(50)"	}       //
            ,{"TEMP_DOKMASTERB"		,"PLAPPIP"      	,"VARCHAR2(20)"	}       //
            ,{"TEMP_DOKMASTERB"		,"PLPOINT"      	,"VARCHAR2(50)"	}       //
            ,{"TEMP_DOKMASTERB"		,"PLGDTYPE"     	,"CHAR(1)"     	}       //
            ,{"TEMP_DOKMASTERB"		,"PLHOPEDATE"   	,"CHAR(10)"    	}       //
            ,{"TEMP_DOKMASTERB"		,"PLINPUTAREA"  	,"VARCHAR2(2)" 	}       //
            ,{"TEMP_DOKMASTERB"		,"BOCD"         	,"VARCHAR2(5)" 	}		//지국불변코드
        };
    String[][] column9 =
        {
             {"TEMP_DOKMASTERH"		,"GMMEMBID"     	,"NUMBER(8,0)"	}		//회원ID
            ,{"TEMP_DOKMASTERH"		,"GMMEMBNAME"   	,"VARCHAR2(20)" }       //회원명
            ,{"TEMP_DOKMASTERH"		,"GMEMAIL"      	,"VARCHAR2(50)" }       //이메일
            ,{"TEMP_DOKMASTERH"		,"GMJUMINID"    	,"VARCHAR2(13)" }       //주민(사업자)번호
            ,{"TEMP_DOKMASTERH"		,"GMPHONENUM"   	,"VARCHAR2(20)" }       //전화번호
            ,{"TEMP_DOKMASTERH"		,"GMBANKOWNER"  	,"VARCHAR2(20)" }       //예금주
            ,{"TEMP_DOKMASTERH"		,"GMBANKCODE"   	,"VARCHAR2(6)"  }       //은행코드
            ,{"TEMP_DOKMASTERH"		,"GMCARDNO"     	,"VARCHAR2(20)" }       //카드번호
            ,{"TEMP_DOKMASTERH"		,"GMBANKNO"     	,"VARCHAR2(20)" }       //계좌번호
            ,{"TEMP_DOKMASTERH"		,"GMSTATE"      	,"CHAR(2)"      }       //이체상태구분
            ,{"TEMP_DOKMASTERH"		,"GMSTATDESC"   	,"VARCHAR2(2)"  }       //이체상태사유
            ,{"TEMP_DOKMASTERH"		,"GMSTATEDATE"  	,"DATE"         }       //이체상태적용일
            ,{"TEMP_DOKMASTERH"		,"GMGIROSTART"  	,"VARCHAR2(6)"  }       //이체시작년월
            ,{"TEMP_DOKMASTERH"		,"GMGIROGUBUN"  	,"CHAR(1)"      }       //이체구분
            ,{"TEMP_DOKMASTERH"		,"GMFIRSTAPPLY" 	,"DATE"         }       //신청일
            ,{"TEMP_DOKMASTERH"		,"GMCREATED"    	,"DATE"         }       //생성일
            ,{"TEMP_DOKMASTERH"		,"GMCARDCODE"   	,"VARCHAR2(6)"  }       //
            ,{"TEMP_DOKMASTERH"		,"GMUNTILYM"    	,"CHAR(4)"      }		//
            ,{"TEMP_DOKMASTERH"		,"BOCD"         	,"VARCHAR2(5)"  }		//지국불변코드
        };

    String[][] column10 =
        {
             {"TEMP_LOGMEMBER"		,"LOGSEQ"         	,"NUMBER(8,0)"	}		//일련번호
            ,{"TEMP_LOGMEMBER"		,"LOGCODE"        	,"VARCHAR2(2)" 	}       //로그코드
            ,{"TEMP_LOGMEMBER"		,"LOGDATE"        	,"DATE"        	}       //로그일자
            ,{"TEMP_LOGMEMBER"		,"LOGAPPIP"       	,"CHAR(20)"    	}       //적용일자
            ,{"TEMP_LOGMEMBER"		,"LOGAPPUSER"     	,"VARCHAR2(20)"	}       //적용자
            ,{"TEMP_LOGMEMBER"		,"LOGJIJONGID"    	,"NUMBER(8,0)" 	}       //독자지종관리ID
            ,{"TEMP_LOGMEMBER"		,"LOGMEMBID"      	,"NUMBER(8,0)" 	}       //예금주ID
            ,{"TEMP_LOGMEMBER"		,"LOGJICODE"      	,"VARCHAR2(5)" 	}       //지국코드
            ,{"TEMP_LOGMEMBER"		,"LOGJIMEMBID"    	,"VARCHAR2(5)" 	}       //독자고유번호
            ,{"TEMP_LOGMEMBER"		,"LOGSUBCNAME"    	,"VARCHAR2(20)"	}       //독자명
            ,{"TEMP_LOGMEMBER"		,"LOGMEMBPHONE"   	,"VARCHAR2(20)"	}       //독자전화번호
            ,{"TEMP_LOGMEMBER"		,"LOGJIPOST"      	,"NUMBER(5,0)" 	}       //우편번호ID
            ,{"TEMP_LOGMEMBER"		,"LOGJIADDR"      	,"VARCHAR2(50)"	}       //독자주소
            ,{"TEMP_LOGMEMBER"		,"LOGJIJONG"      	,"VARCHAR2(2)" 	}       //지종
            ,{"TEMP_LOGMEMBER"		,"LOGCOPY"        	,"NUMBER(5,0)" 	}       //부수
            ,{"TEMP_LOGMEMBER"		,"LOGDAN"         	,"NUMBER(6,0)" 	}       //단가
            ,{"TEMP_LOGMEMBER"		,"LOGJIKUKCHECK"  	,"CHAR(1)"     	}       //지국확인여부
            ,{"TEMP_LOGMEMBER"		,"LOGPAYMETHOD"   	,"CHAR(2)"     	}       //이체구분
            ,{"TEMP_LOGMEMBER"		,"LOGGIROSTART"   	,"VARCHAR2(6)" 	}       //이체시작월
            ,{"TEMP_LOGMEMBER"		,"LOGSTOPCODE"    	,"CHAR(2)"     	}       //해지여부
            ,{"TEMP_LOGMEMBER"		,"LOGSTOPDATE"    	,"VARCHAR2(50)"	}       //해지일자
            ,{"TEMP_LOGMEMBER"		,"LOGSTOPAPPDATE" 	,"VARCHAR2(50)"	}       //해지적용일자
            ,{"TEMP_LOGMEMBER"		,"LOGCREATED"     	,"VARCHAR2(50)"	}       //자동이체신청일자
            ,{"TEMP_LOGMEMBER"		,"LOGCREATOR"     	,"VARCHAR2(20)"	}       //자동이체신청자
            ,{"TEMP_LOGMEMBER"		,"LOGMEMBIP"      	,"VARCHAR2(15)"	}       //자동이체신청지IP
            ,{"TEMP_LOGMEMBER"		,"LOGSENDCHECK"   	,"CHAR(1)"     	}       //결제원전송여부
            ,{"TEMP_LOGMEMBER"		,"LOGJUMINID"     	,"VARCHAR2(13)"	}       //예금주주민번호
            ,{"TEMP_LOGMEMBER"		,"LOGOWNERPHONE"  	,"VARCHAR2(20)"	}       //예금주전화번호
            ,{"TEMP_LOGMEMBER"		,"LOGBANKOWNER"   	,"VARCHAR2(20)"	}       //예금주명
            ,{"TEMP_LOGMEMBER"		,"LOGBANKCODE"    	,"VARCHAR2(6)" 	}       //은행코드
            ,{"TEMP_LOGMEMBER"		,"LOGBANKNO"      	,"VARCHAR2(20)"	}       //계좌번호
            ,{"TEMP_LOGMEMBER"		,"LOGCARDNO"      	,"VARCHAR2(20)"	}       //카드번호
            ,{"TEMP_LOGMEMBER"		,"LOGDESC"        	,"VARCHAR2(200)"}       //기타내용
            ,{"TEMP_LOGMEMBER"		,"LOGAPPJUMINID"  	,"VARCHAR2(13)" }       //신청자주민등록번호
            ,{"TEMP_LOGMEMBER"		,"BOCD"          	,"VARCHAR2(5)"	}       //지국불변코드
        };

    String[][] column11 =
        {
             {"TEMP_NEWMEMBER"		,"ID"         		,"NUMBER(8,0)"	}		//ID
            ,{"TEMP_NEWMEMBER"		,"GUBUN"      		,"CHAR(2)"     	}       //구분
            ,{"TEMP_NEWMEMBER"		,"SEQ_NUM"    		,"VARCHAR2(7)" 	}       //일련번호
            ,{"TEMP_NEWMEMBER"		,"APPL_DATE"  		,"VARCHAR2(8)" 	}       //신청일자
            ,{"TEMP_NEWMEMBER"		,"APPL_GB"    		,"CHAR(2)"     	}       //신청구분
            ,{"TEMP_NEWMEMBER"		,"PAY_NUM1"   		,"VARCHAR2(20)"	}       //납부자번호1
            ,{"TEMP_NEWMEMBER"		,"PAY_NUM2"   		,"VARCHAR2(20)"	}       //납부자번호2
            ,{"TEMP_NEWMEMBER"		,"PAY_DAY"    		,"VARCHAR2(2)" 	}       //납부희망일
            ,{"TEMP_NEWMEMBER"		,"FEE_TYPE"   		,"VARCHAR2(2)" 	}       //요금종류
            ,{"TEMP_NEWMEMBER"		,"ACCT_BR"    		,"VARCHAR2(6)" 	}       //납부자계좌개설점
            ,{"TEMP_NEWMEMBER"		,"PAY_ACCT"   		,"VARCHAR2(20)"	}       //출금계좌번호
            ,{"TEMP_NEWMEMBER"		,"JUMIN_NUM"  		,"VARCHAR2(20)"	}       //주민번호
            ,{"TEMP_NEWMEMBER"		,"PAY_TEL"    		,"VARCHAR2(20)"	}       //납부자전화번호
            ,{"TEMP_NEWMEMBER"		,"APPL_BR"    		,"VARCHAR2(6)" 	}       //신청서접수점
            ,{"TEMP_NEWMEMBER"		,"APPL_RS"    		,"VARCHAR2(2)" 	}       //신청결과
            ,{"TEMP_NEWMEMBER"		,"OPEN_MM"    		,"VARCHAR2(4)" 	}       //최초개시월
            ,{"TEMP_NEWMEMBER"		,"ACCT_GB"    		,"CHAR(1)"     	}       //접수처구분
            ,{"TEMP_NEWMEMBER"		,"CB_ACCT_NUM"		,"VARCHAR2(9)" 	}       //전자접수번호
            ,{"TEMP_NEWMEMBER"		,"ACCT_OWNER" 		,"VARCHAR2(20)"	}       //예금주명
            ,{"TEMP_NEWMEMBER"		,"CR_DATE"    		,"DATE"        	}       //생성일자
            ,{"TEMP_NEWMEMBER"		,"TR_DATE"    		,"DATE"        	}       //처리일자
            ,{"TEMP_NEWMEMBER"		,"TR_CODE"    		,"CHAR(2)"     	}       //처리코드
            ,{"TEMP_NEWMEMBER"		,"NMMEMBID"   		,"NUMBER(8,0)" 	}       //nmMembID
            ,{"TEMP_NEWMEMBER"		,"NMJIJONGID" 		,"NUMBER(8,0)" 	}       //nmJiJongID
            ,{"TEMP_NEWMEMBER"		,"BOCD"       		,"VARCHAR2(5)" 	}       //지국불변코드
        };

    String[][] column12 =
        {
             {"TEMP_LOGBANKINFO"	,"LOGSEQ"  	  		,"NUMBER(8, 0)"		}	    //ID
            ,{"TEMP_LOGBANKINFO"	,"LOGJICODE"	  	,"VARCHAR2(10)"    	}       //지국코드
            ,{"TEMP_LOGBANKINFO"	,"LOGAPPNAME"   	,"VARCHAR2(20)"    	}       //변경자 이름
            ,{"TEMP_LOGBANKINFO"	,"LOGAPPJUMINID"	,"VARCHAR2(13)"    	}       //변경자 주민번호
            ,{"TEMP_LOGBANKINFO"	,"LOGAPPID"     	,"VARCHAR2(20)"    	}       //변경자 IP
            ,{"TEMP_LOGBANKINFO"	,"LOGAPPDATE"   	,"DATE"            	}       //변경일자
            ,{"TEMP_LOGBANKINFO"	,"LOGMEMBID"    	,"NUMBER(8, 0)"    	}       //예금주MembID
            ,{"TEMP_LOGBANKINFO"	,"LOGBANKOWNER" 	,"VARCHAR2(20)"    	}       //예금주명
            ,{"TEMP_LOGBANKINFO"	,"LOGBANKCODE"  	,"VARCHAR2(6)"     	}       //은행코드
            ,{"TEMP_LOGBANKINFO"	,"LOGBANKNAME"  	,"VARCHAR2(20)"    	}       //은행명
            ,{"TEMP_LOGBANKINFO"	,"LOGBANKNO"    	,"VARCHAR2(20)"    	}       //계좌번호
            ,{"TEMP_LOGBANKINFO"	,"LOGJUMINID"   	,"VARCHAR2(13)"    	}       //주민번호
            ,{"TEMP_LOGBANKINFO"	,"BOCD"	      		,"VARCHAR2(5)"	    }       //지국불변코드
        };


    public SS_A_MIG_BILLUPDM(){

        //테이블명설정
        this.tables.add(0, "BANKDATAS");        	//은행신청분
        this.tables.add(1, "BILLA");            	//지로자동이체
        this.tables.add(2, "BILLB");            	//BILL a.c,h 의 Master  ( 이체 청구내역)  지국불변코드 존재
        this.tables.add(3, "BILLC");            	//일반카드
        this.tables.add(4, "BILLH");            	//신한카드
        this.tables.add(5, "CANCELMEMBER");     	//해지신청자
        this.tables.add(6, "CHANGEMEMBER");     	//변경신청자
        this.tables.add(7, "DOKJIKUKCHANGE");   	//지국변경자
        this.tables.add(8, "DOKMASTERB");       	//독자정보 (body)
        this.tables.add(9, "DOKMASTERH");       	//독자정보 (header) 회원ID 로 조인
        this.tables.add(10, "LOGMEMBER");       	//변경된 이력
        this.tables.add(11, "NEWMEMBER");       	//신규신청자
        this.tables.add(12, "LOGBANKINFO");    //납부자변경로그


        //테이블별 컬럼 데이터 타입 설정
        this.columns.add(0, column0);				//은행신청분
        this.columns.add(1, column1);				//지로자동이체
        this.columns.add(2, column2);				//BILL a.c,h 의 Master  ( 이체 청구내역)  지국불변코드 존재
        this.columns.add(3, column3);				//일반카드
        this.columns.add(4, column4);				//신한카드
        this.columns.add(5, column5);				//해지신청자
        this.columns.add(6, column6);				//변경신청자
        this.columns.add(7, column7);				//지국변경자
        this.columns.add(8, column8);				//독자정보 (body)
        this.columns.add(9, column9);				//독자정보 (header) 회원ID 로 조인
        this.columns.add(10,column10);				//변경된 이력
        this.columns.add(11,column11);				//신규신청자
        this.columns.add(12,column12);				//납부자변경로그

    }
    public SS_A_MIG_BILLUPDM(String bocd, String plist, String mgyn){
        this.bocd = bocd;
        this.workclsf = workclsf;

        //테이블명설정
        this.tables.add(0, "BANKDATAS");       		//은행신청분
        this.tables.add(1, "BILLA");            	//지로자동이체
        this.tables.add(2, "BILLB");            	//BILL a.c,h 의 Master  ( 이체 청구내역)  지국불변코드 존재
        this.tables.add(3, "BILLC");            	//일반카드
        this.tables.add(4, "BILLH");            	//신한카드
        this.tables.add(5, "CANCELMEMBER");     	//해지신청자
        this.tables.add(6, "CHANGEMEMBER");     	//변경신청자
        this.tables.add(7, "DOKJIKUKCHANGE");  		//지국변경자
        this.tables.add(8, "DOKMASTERB");      		//독자정보 (body)
        this.tables.add(9, "DOKMASTERH");      		//독자정보 (header) 회원ID 로 조인
        this.tables.add(10, "LOGMEMBER");       	//변경된 이력
        this.tables.add(11, "NEWMEMBER");       	//신규신청자
        this.tables.add(12, "LOGBANKINFO");    //납부자변경로그

        //테이블별 컬럼 데이터 타입 설정
        this.columns.add(0, column0);				//은행신청분
        this.columns.add(1, column1);				//지로자동이체
        this.columns.add(2, column2);				//BILL a.c,h 의 Master  ( 이체 청구내역)  지국불변코드 존재
        this.columns.add(3, column3);				//일반카드
        this.columns.add(4, column4);				//신한카드
        this.columns.add(5, column5);				//해지신청자
        this.columns.add(6, column6);				//변경신청자
        this.columns.add(7, column7);				//지국변경자
        this.columns.add(8, column8);				//독자정보 (body)
        this.columns.add(9, column9);				//독자정보 (header) 회원ID 로 조인
        this.columns.add(10,column10);				//변경된 이력
        this.columns.add(11,column11);				//신규신청자
        this.columns.add(12,column12);				//납부자변경로그

    }

    public void setIncmgpers(String incmgpers){
        this.incmgpers = incmgpers;
    }

    public void setBocd(String bocd){
        this.bocd = bocd;
    }

    public void setWorkclsf(String workclsf){
        this.workclsf = workclsf;
    }

    public String getIncmgpers(){
        return this.incmgpers;
    }

    public String getBocd(){
        return this.bocd;
    }

    public String getWorkclsf(){
        return this.workclsf;
    }

    /**
     * 조선IS 빌링 마이그레이션을 위한 원본 테이블 조회쿼리를 리턴
     * @param tbIdx int 마이그레이션 대상 테이블 index(자세한 사항은 Class 주석 참고)
     * @return sql
     */
    public String getSelQry(int tbIdx) {
        String sql = null;
        StringBuffer sb = new StringBuffer();
        switch (tbIdx) {
            case 0:
                sb.append("	SELECT                     						");
                sb.append("	    	 [ID]              						");
                sb.append("			,[구분]            						");
                sb.append("			,[일련번호]        						");
                sb.append("			,[신청일자]        						");
                sb.append("			,[신청구분]        						");
                sb.append("			,[납부자번호1]     						");
                sb.append("			,[납부자번호2]     						");
                sb.append("			,[납부희망일]      						");
                sb.append("			,[요금종류]        						");
                sb.append("			,[납부자계좌개설점]						   ");
                sb.append("			,[출금계좌번호]    						");
                sb.append("			,[주민번호]        						");
                sb.append("			,[납부자전화번호]  						");
                sb.append("			,[신청서접수점]    						");
                sb.append("			,[신청결과]        						");
                sb.append("			,[최초개시월]      						");
                sb.append("			,[접수처구분]      						");
                sb.append("			,[전자접수번호]    						");
                sb.append("			,[예금주명]        						");
                sb.append("			,[처리일자]        						");
                sb.append("			,[처리코드]        						");
                sb.append("	FROM     [AutoGiro].[dbo].[BankDataS]           ");
                sb.append("	WHERE    SUBSTRING( [납부자번호1] , 1, 5) = ?   ");
                sb.append("	   OR    SUBSTRING( [납부자번호2] , 1, 5) = ?	");
                break;
            case 1:
                sb.append("	SELECT DISTINCT	A.[ID]                             ");
                sb.append("			,A.[구분]                                    ");
                sb.append("			,A.[일련번호]                                ");
                sb.append("			,A.[납부자번호]                              ");
                sb.append("			,A.[납부자계좌개설점코드]                    ");
                sb.append("			,A.[계좌번호]                                ");
                sb.append("			,A.[주민번호]                                ");
                sb.append("			,A.[출금내역]                                ");
                sb.append("			,A.[금액]                                    ");
                sb.append("			,A.[청구결과코드]                            ");
                sb.append("			,A.[접수처구분코드]                          ");
                sb.append("			,A.[부분출금금액]                            ");
                sb.append("			,A.[실명구분코드]                            ");
                sb.append("			,convert(varchar, A.[마감처리일자], 20)      ");
                sb.append("			,convert(varchar, A.[결과처리일자], 20)      ");
                sb.append("	FROM    [AutoGiro].[dbo].[BillA] A,[AutoGiro].[dbo].[BillB] B");
                sb.append("	WHERE   A.[ID]         = B.[BBOrderID]       ");
                //sb.append("	  AND   B.[BBBillCode] = '3'                 ");
                sb.append("	  AND   B.[BBJiCode]   = ?                   ");
                break;
            case 2:
                sb.append("	SELECT 	[bbBillID]		");
                sb.append("			,[bbJiJongID]   ");
                sb.append("			,[bbBillMonth]  ");
                sb.append("			,[bbPayMonth]   ");
                sb.append("			,[bbMembID]     ");
                sb.append("			,[bbJiMembID]   ");
                sb.append("			,[bbJiCode]     ");
                sb.append("			,[bbJiJong]     ");
                sb.append("			,[bbCopy]       ");
                sb.append("			,[bbDan]        ");
                sb.append("			,[bbBillCode]   ");
                sb.append("			,convert(varchar, [bbTRDate], 20)     ");
                sb.append("			,[bbMagam]      ");
                sb.append("			,[bbOrderID]    ");
                sb.append("	FROM 	[AutoGiro].[dbo].[BillB] ");
                sb.append("	WHERE   [bbJiCode] = ?  ");
                break;
            case 3:  //
                sb.append(" SELECT 	[bcBillID]			");
                sb.append(" 		,[bcMembID]         ");
                sb.append(" 		,[bcJiCode]         ");
                sb.append(" 		,[bcCno]            ");
                sb.append(" 		,[bcBillYM]         ");
                sb.append(" 		,[bcItemNo]         ");
                sb.append(" 		,[bcShopNo]         ");
                sb.append(" 		,[bcPosNo]          ");
                sb.append(" 		,[bcSeqNo]          ");
                sb.append(" 		,[bcEmpNo]          ");
                sb.append(" 		,[bcDGubun]         ");
                sb.append(" 		,[bcKeyIn]          ");
                sb.append(" 		,[bcTrackLen]       ");
                sb.append(" 		,[bcTrack]          ");
                sb.append(" 		,[bcDivMonth]       ");
                sb.append(" 		,[bcPrice]          ");
                sb.append(" 		,[bcHelpPrice]      ");
                sb.append(" 		,[bcOKNo]           ");
                sb.append(" 		,[bcOKDate]         ");
                sb.append(" 		,[bcOKTime]         ");
                sb.append(" 		,[bcResultCd]       ");
                sb.append(" 		,[bcExportNo]       ");
                sb.append(" 		,[bcImportNo]       ");
                sb.append(" 		,[bcJoinNo]         ");
                sb.append(" 		,convert(varchar, [bcTRDate], 20)  ");
                sb.append(" 		,[bcPSDate]         ");
                sb.append("   FROM  [AutoGiro].[dbo].[BillC] ");
                sb.append("  WHERE	[bcJiCode] = ?           ");
                break;
            case 4:
                sb.append("	SELECT 	[bmBillID]          ");
                sb.append("			,[bmBillMonth]      ");
                sb.append("			,[bmMembID]         ");
                sb.append("			,[bmJiCode]         ");
                sb.append("			,convert(varchar, [bmOrderDate], 20)      ");
                sb.append("			,convert(varchar, [bmPayDate], 20)       ");
                sb.append("			,[bmBillRsltCode]   ");
                sb.append("			,[bmBillState]      ");
                sb.append("			,[bmOrderMonth]     ");
                sb.append("			,[bmOrderMoney]     ");
                sb.append("			,convert(varchar, [bmCreateDate], 20)     ");
                sb.append("			,[bmBankCode]       ");
                sb.append("			,[bmBankNo]         ");
                sb.append("			,[bmBankOwner]      ");
                sb.append("	FROM 	[AutoGiro].[dbo].[BillH] ");
                sb.append("	WHERE   [bmJiCode] = ?		");
                break;
            case 5:
                sb.append("	SELECT 	[ID]                                    ");
                sb.append("			,[구분]                                 ");
                sb.append("			,[일련번호]                             ");
                sb.append("			,[해지신청일자]                         ");
                sb.append("			,[신청구분]                             ");
                sb.append("			,[납부자번호1]                          ");
                sb.append("			,[납부자번호2]                          ");
                sb.append("			,[납부희망일]                           ");
                sb.append("			,[요금종류]                             ");
                sb.append("			,[납부자계좌개설점]                     ");
                sb.append("			,[출금계좌번호]                         ");
                sb.append("			,[주민번호]                             ");
                sb.append("			,[납부자전화번호]                       ");
                sb.append("			,[신청서접수점]                         ");
                sb.append("			,[해지결과]                             ");
                sb.append("			,[최초개시월]                           ");
                sb.append("			,[접수처구분]                           ");
                sb.append("			,[전자접수번호]                         ");
                sb.append("			,[예금주명]                             ");
                sb.append("			,convert(varchar, [생성일자], 20)        ");
                sb.append("			,convert(varchar, [처리일자], 20)        ");
                sb.append("			,[처리코드]                             ");
                sb.append("			,[ccMembID]                             ");
                sb.append("			,[ccJiJongID]                           ");
                sb.append("			,[해지자IP]                             ");
                sb.append("			,[해지자ID]                             ");
                sb.append("	FROM 	[AutoGiro].[dbo].[CancelMember]        ");
                sb.append("	WHERE    SUBSTRING( [납부자번호1] , 1, 5) = ?   ");
                sb.append("	   OR    SUBSTRING( [납부자번호2] , 1, 5) = ?	");
                break;
            case 6:
                sb.append("	SELECT 	[ID]                                    ");
                sb.append("			,[구분]                                 ");
                sb.append("			,[일련번호]                             ");
                sb.append("			,[변경신청일자]                         ");
                sb.append("			,[신청구분]                             ");
                sb.append("			,[납부자번호]                           ");
                sb.append("			,[납부자번호2]                          ");
                sb.append("			,[납부희망일]                           ");
                sb.append("			,[요금종류]                             ");
                sb.append("			,[납부자계좌개설점]                     ");
                sb.append("			,[출금계좌번호]                         ");
                sb.append("			,[주민번호]                             ");
                sb.append("			,[납부자전화번호]                       ");
                sb.append("			,[신청서접수점]                         ");
                sb.append("			,[변경결과]                             ");
                sb.append("			,[최초개시월]                           ");
                sb.append("			,[접수처구분]                           ");
                sb.append("			,[전자접수번호]                         ");
                sb.append("			,[예금주명]                             ");
                sb.append("			,convert(varchar, [생성일자], 20)       ");
                sb.append("			,convert(varchar, [처리일자], 20)       ");
                sb.append("			,[처리코드]                             ");
                sb.append("			,[chMembID]                             ");
                sb.append("			,[chJiJongID]                           ");
                sb.append("			,[변경지IP]                             ");
                sb.append("			,[변경자ID]                             ");
                sb.append("	FROM    [AutoGiro].[dbo].[ChangeMember]        ");
                sb.append("	WHERE    SUBSTRING( [납부자번호] , 1, 5) = ?   ");
                sb.append("	   OR    SUBSTRING( [납부자번호2] , 1, 5) = ?	");
                break;
            case 7:
                sb.append("	SELECT 	[id]                ");
                sb.append("			,[jcJiCodeAfter]    ");
                sb.append("			,[jcJiCodeBefore]   ");
                sb.append("			,[jcMembID]         ");
                sb.append("			,[jcJiJongID]       ");
                sb.append("			,convert(varchar, [jcJikukChangeDt], 20)  ");
                sb.append("			,convert(varchar, [jcJikukCheckDt], 20)   ");
                sb.append("			,[jcJikukCheck]     ");
                sb.append("			,[jcSendCheck]      ");
                sb.append("			,[jcUserIP]         ");
                sb.append("			,[jcJiMembIDBefore] ");
                sb.append("	FROM 	[AutoGiro].[dbo].[DokJikukChange]    ");
                sb.append("	WHERE   [jcJiCodeAfter] = ?	");
                break;
            case 8:
                sb.append("	SELECT 	[plJiJongID]    ");
                sb.append("			,[plMembID]     ");
                sb.append("			,[plJiCode]     ");
                sb.append("			,[plJiMembID]   ");
                sb.append("			,[plSubcName]   ");
                sb.append("			,[plJiJong]     ");
                sb.append("			,[plCopy]       ");
                sb.append("			,[plJiJongDan]  ");
                sb.append("			,[plJiPost]     ");
                sb.append("			,[plJiAddr]     ");
                sb.append("			,[plPayMethod]  ");
                sb.append("			,[plJikukCheck] ");
                sb.append("			,[plGiroStart]  ");
                sb.append("			,[plStopCode]   ");
                sb.append("			,convert(varchar, [plStopDate], 20)   ");
                sb.append("			,convert(varchar, [plStopAppDate], 20)");
                sb.append("			,[plYearBill]   ");
                sb.append("			,convert(varchar, [plCreated], 20)    ");
                sb.append("			,[plCreator]    ");
                sb.append("			,[plMembPhone]  ");
                sb.append("			,[plMembIP]     ");
                sb.append("			,[plSendCheck]  ");
                sb.append("			,convert(varchar, [plAppDate], 20)    ");
                sb.append("			,[plAppUser]    ");
                sb.append("			,[plAppIP]      ");
                sb.append("			,[plPoint]      ");
                sb.append("			,[plGdType]     ");
                sb.append("			,[plHopeDate]   ");
                sb.append("			,[plInputArea]  ");
                sb.append("	FROM 	[AutoGiro].[dbo].[DokMasterB]    ");
                sb.append("	WHERE   [plJiCode] = ?	");
                break;
            case 9:
                sb.append("	SELECT 	DISTINCT [gmMembID]		");
                sb.append("			,[gmMembName]   ");
                sb.append("			,[gmEMail]      ");
                sb.append("			,[gmJuminID]    ");
                sb.append("			,[gmPhoneNum]   ");
                sb.append("			,[gmBankOwner]  ");
                sb.append("			,[gmBankCode]   ");
                sb.append("			,[gmCardNo]     ");
                sb.append("			,[gmBankNo]     ");
                sb.append("			,[gmState]      ");
                sb.append("			,[gmStatDesc]   ");
                sb.append("			,[gmStateDate]  ");
                sb.append("			,[gmGiroStart]  ");
                sb.append("			,[gmGiroGubun]  ");
                sb.append("			,convert(varchar, [gmFirstApply], 20) ");
                sb.append("			,convert(varchar, [gmCreated], 20)    ");
                sb.append("			,[gmCardCode]   ");
                sb.append("			,[gmUntilYM]    ");
                sb.append("	FROM 	[AutoGiro].[dbo].[DokMasterH] H, [AutoGiro].[dbo].[DokMasterB] B ");
                sb.append("	WHERE	B.[plMembID] = H.[gmMembID]   ");
                sb.append("	  AND   B.[plJiCode] = ?              ");
                break;
            case 10:
                sb.append("	SELECT 	[logSeq]            ");
                sb.append("			,[logCode]          ");
                sb.append("			,convert(varchar, [logDate], 20)          ");
                sb.append("			,[logAppIP]         ");
                sb.append("			,[logAppUser]       ");
                sb.append("			,[logJiJongID]      ");
                sb.append("			,[logMembID]        ");
                sb.append("			,[logJiCode]        ");
                sb.append("			,[logJiMembID]      ");
                sb.append("			,[logSubcName]      ");
                sb.append("			,[logMembPhone]     ");
                sb.append("			,[logJiPost]        ");
                sb.append("			,[logJiAddr]        ");
                sb.append("			,[logJiJong]        ");
                sb.append("			,[logCopy]          ");
                sb.append("			,[logDan]           ");
                sb.append("			,[logJikukCheck]    ");
                sb.append("			,[logPayMethod]     ");
                sb.append("			,[logGiroStart]     ");
                sb.append("			,[logStopCode]      ");
                sb.append("			,[logStopDate]      ");
                sb.append("			,[logStopAppDate]   ");
                sb.append("			,[logCreated]       ");
                sb.append("			,[logCreator]       ");
                sb.append("			,[logMembIP]        ");
                sb.append("			,[logSendCheck]     ");
                sb.append("			,[logJuminID]       ");
                sb.append("			,[logOwnerPhone]    ");
                sb.append("			,[logBankOwner]     ");
                sb.append("			,[logBankCode]      ");
                sb.append("			,[logBankNo]        ");
                sb.append("			,[logCardNo]        ");
                sb.append("			,[logDesc]          ");
                sb.append("			,[logAppJuminID]    ");
                sb.append("	FROM 	[AutoGiro].[dbo].[LogMember]         ");
                sb.append("	WHERE	[logJiCode] = ?		");
                break;
            case 11:
                sb.append("	SELECT 	[ID]                                  ");
                sb.append("			,[구분]                               ");
                sb.append("			,[일련번호]                           ");
                sb.append("			,[신청일자]                           ");
                sb.append("			,[신청구분]                           ");
                sb.append("			,[납부자번호1]                        ");
                sb.append("			,[납부자번호2]                        ");
                sb.append("			,[납부희망일]                         ");
                sb.append("			,[요금종류]                           ");
                sb.append("			,[납부자계좌개설점]                   ");
                sb.append("			,[출금계좌번호]                       ");
                sb.append("			,[주민번호]                           ");
                sb.append("			,[납부자전화번호]                     ");
                sb.append("			,[신청서접수점]                       ");
                sb.append("			,[신청결과]                           ");
                sb.append("			,[최초개시월]                         ");
                sb.append("			,[접수처구분]                         ");
                sb.append("			,[전자접수번호]                       ");
                sb.append("			,[예금주명]                           ");
                sb.append("			,convert(varchar, [생성일자], 20)     ");
                sb.append("			,convert(varchar, [처리일자], 20)     ");
                sb.append("			,[처리코드]                           ");
                sb.append("			,[nmMembID]                           ");
                sb.append("			,[nmJiJongID]                         ");
                sb.append("	FROM 	[AutoGiro].[dbo].[NewMember]          ");
                sb.append("	WHERE    SUBSTRING( [납부자번호1] , 1, 5) = ? ");
                sb.append("	   OR    SUBSTRING( [납부자번호2] , 1, 5) = ? ");
                break;
            case 12:
                sb.append(" SELECT 	 [logSeq]			");
                sb.append(" 		,[logJiCode]        ");
                sb.append(" 		,[logAppName]       ");
                sb.append(" 		,[logAppJuminID]    ");
                sb.append(" 		,[logAppIP]         ");
                sb.append(" 		,convert(varchar, [logAppDate], 20) ");
                sb.append(" 		,[logMembID]		");
                sb.append(" 		,[logBankOwner]     ");
                sb.append(" 		,[logBankCode]      ");
                sb.append(" 		,[logBankName]      ");
                sb.append(" 		,[logBankNo]        ");
                sb.append(" 		,[logJuminID]       ");
                sb.append("   FROM  [AutoGiro].[dbo].[LogBankInfo] ");
                sb.append("  WHERE  [logJiCode] = ?                ");
                break;
        }
        return sb.toString();
    }

    /**
     * 마이그레이션 원본 테이블에서 조회시
     * PreparedStatement 와 DM 을 입력받아 dm에 셋팅된 지국지사코드를
     * 해당 테이블의 쿼리에 맞도록 셋팅
     * @param pstmt PreparedStatement
     * @param bdm BaseDM
     * @param tbIdx int 마이그레이션 대상 테이블 index(자세한 사항은 Class 주석 참고)
     * @throws SQLException
     */
    public void setSelQryParams(PreparedStatement pstmt, BaseDM bdm, int tbIdx) throws SQLException{
        SS_A_MIG_BILLUPDM dm = (SS_A_MIG_BILLUPDM)bdm;
        switch(tbIdx){
            case 0: //은행신청분
                pstmt.setString(1, dm.bocd);
                pstmt.setString(2, dm.bocd);
                break;
            case 1: //지로자동이체
                pstmt.setString(1, dm.bocd);
                break;
            case 2: //BILL a.c,h 의 Master  ( 이체 청구내역)  지국불변코드 존재
                pstmt.setString(1, dm.bocd);
                break;
            case 3: //일반카드
                pstmt.setString(1, dm.bocd);
                break;
            case 4: //신한카드
                pstmt.setString(1, dm.bocd);
                break;
            case 5: //해지신청자
                pstmt.setString(1, dm.bocd);
                pstmt.setString(2, dm.bocd);
                break;
            case 6: //변경신청자
                pstmt.setString(1, dm.bocd);
                pstmt.setString(2, dm.bocd);
                break;
            case 7: //지국변경자
                pstmt.setString(1, dm.bocd);
                break;
            case 8: //독자정보 (body)
                pstmt.setString(1, dm.bocd);
                break;
            case 9: //독자정보 (header) 회원ID 로 조인
                pstmt.setString(1, dm.bocd);
                break;
            case 10: //변경된 이력
                pstmt.setString(1, dm.bocd);
                break;
            case 11: //신규신청자
                pstmt.setString(1, dm.bocd);
                pstmt.setString(2, dm.bocd);
                break;
            case 12: //납부자변경로그
                pstmt.setString(1, dm.bocd);
                break;
        }
    }


    public String getSQL(){
         return "";
    }

    public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
        SS_A_MIG_BILLUPDM dm = (SS_A_MIG_BILLUPDM)bdm;
    }


    public BaseDataSet createDataSetObject(){
        return new chosun.ciis.ss.sls.admin.ds.SS_A_MIG_BILLUPDataSet();
    }
}
