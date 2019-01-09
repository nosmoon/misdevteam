/***************************************************************************************************
* ���ϸ� : SS_A_MIG_BILLUPDM.java
* ��� : ������-�۾�-���̱׷��̼�-��ȯ�� ���� DM
* �ۼ����� : 2004-03-15
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
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
 * ������-�۾�-���̱׷��̼�-��ȯ�� ���� DM
 *
 * [����IS MS-SQL ������ table ���]
 *  0.bankdatas          (�����û��)
 *  1.billa              �����ڵ���ü
 *  2.billb              a.c,h �� Master  ( ��ü û������)  �����Һ��ڵ� ����
 *  3.billc              �Ϲ�ī��
 *  4.billh              ����ī��
 *  5.cancelmember       ������û��
 *  6.changemember       �����û��
 *  7.dokjikukchange     ����������
 *  8.dokmasterb         �������� (body)
 *  9.dokmasterh         �������� (header) ȸ��ID �� ����
 *  10.logmember         ����� �̷�
 *  11.newmember         �űԽ�û��
 *  12.logbankinfo       �����ں��� �α�
 *  #### ���̺� ������� ���̱׷��̼� �ǹǷ� ���� ������ �������� �Ѵ�. ####
 *
 * [���̱׷��̼� ���ǻ���]
 *  0.��� ���̺��� "temp_"�� �տ� �ٿ��� �ӽ� ���̺�� ���̱׷��̼ǵȴ�.
 *  1.��� �ӽ� ���̺��� layout�� ���������ڵ�(�����Һ��ڵ�)�� �߰��� ���� �����ϰ�� ���� ���̺�� ����.
 *  2.�����ڹ�ȣ1, �����ڹ�ȣ2 �� �� 5�ڸ��� ���� requesting �� ������ �Ͱ� ��ġ�ϴ� �����鸸 Migration �ϵ��� �Ѵ�.
 *  3.billa,billb,billc,billh table �� billa���� ���������ڵ尡 ���� ������ �ش� ���������ڵ�� billb �� join�Ͽ� ������ ���� ���ϵ����Ѵ�.
 *        <billa �� ���̱׷��̼� �� ��� where ��>
 *                   billa.id = billb.bborderid
 *                   and billb.bbbillcode = '3'
 *                   and billb.bbjicode = '�����Һ��ڵ�'
 *  4.DokJikukChange ���̺����� ������ �����ڵ�(jcJiCodeAfter) �׸����� ���������ڵ�� ���Ͽ� �ش������鸸 Migration �ϵ��� �Ѵ�.
 *  4.���� ������ : String({20})     �Ǵ� '\u0014'
 *  5.�÷� ������ : String({7})      �Ǵ� '\u0007'
 */

public class SS_A_MIG_BILLUPDM extends somo.framework.db.BaseDM implements java.io.Serializable{
    public String incmgpers;    //�Է��� Ȥ�� ������ ���̵�
    public String bocd;         //���������ڵ�
    public String workclsf;     //�۾������ڵ� ( '97', '992' ) (1:����DBUP, 2:����DB��ȯ, 3:����DBUP, 4:����DB��ȯ)

    public ArrayList tables  = new ArrayList(); //���̱׷��̼� ��� ���̺�
    public ArrayList columns = new ArrayList(); //���̱׷��̼� ��� ���̺��� �÷���, �÷�Ÿ��(String�� ������ �迭)

    String[][] column0 =
        {
             {"TEMP_BANKDATAS"		,"ID" 				,"NUMBER(8,0)"	}		//ID
            ,{"TEMP_BANKDATAS"		,"GUBUN" 			,"CHAR(2)"	  	}       //����
            ,{"TEMP_BANKDATAS"		,"SEQ_NUM" 			,"VARCHAR2(7)"	}       //�Ϸù�ȣ
            ,{"TEMP_BANKDATAS"		,"APPL_DATE" 		,"VARCHAR2(8)"	}       //��û����
            ,{"TEMP_BANKDATAS"		,"APPL_GB" 			,"CHAR(2)"		}       //��û����
            ,{"TEMP_BANKDATAS"		,"PAY_NUM1" 		,"VARCHAR2(20)"	}       //�����ڹ�ȣ1
            ,{"TEMP_BANKDATAS"		,"PAY_NUM2" 		,"VARCHAR2(20)"	}       //�����ڹ�ȣ2
            ,{"TEMP_BANKDATAS"		,"PAY_DAY" 			,"VARCHAR2(2)"	}       //���������
            ,{"TEMP_BANKDATAS"		,"FEE_TYPE" 		,"VARCHAR2(2)"	}       //�������
            ,{"TEMP_BANKDATAS"		,"ACCT_BR" 			,"VARCHAR2(6)"	}       //�����ڰ��°�����
            ,{"TEMP_BANKDATAS"		,"PAY_ACCT" 		,"VARCHAR2(15)"	}       //��ݰ��¹�ȣ
            ,{"TEMP_BANKDATAS"		,"JUMIN_NUM" 		,"VARCHAR2(13)"	}       //�ֹι�ȣ
            ,{"TEMP_BANKDATAS"		,"PAY_TEL" 			,"VARCHAR2(11)"	}       //��������ȭ��ȣ
            ,{"TEMP_BANKDATAS"		,"APPL_BR" 			,"VARCHAR2(6)"	}       //��û��������
            ,{"TEMP_BANKDATAS"		,"APPL_RS" 			,"VARCHAR2(2)"	}       //��û���
            ,{"TEMP_BANKDATAS"		,"OPEN_MM" 			,"VARCHAR2(4)"	}       //���ʰ��ÿ�
            ,{"TEMP_BANKDATAS"		,"ACCT_GB" 			,"CHAR(1)"		}       //����ó����
            ,{"TEMP_BANKDATAS"		,"CB_ACCT_NUM" 		,"VARCHAR2(9)"	}       //����������ȣ
            ,{"TEMP_BANKDATAS"		,"ACCT_OWNER" 		,"VARCHAR2(16)"	}       //�����ָ�
            ,{"TEMP_BANKDATAS"		,"TR_DATE" 			,"VARCHAR2(8)"	}       //ó������
            ,{"TEMP_BANKDATAS"		,"TR_CODE" 			,"CHAR(2)"		}       //ó���ڵ�
            ,{"TEMP_BANKDATAS"		,"BOCD" 			,"VARCHAR2(5)"	}       //�����Һ��ڵ�
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
             {"TEMP_BILLB"			,"BBBILLID"    		,"NUMBER(8,0)"	}		//�Ϸù�ȣ
            ,{"TEMP_BILLB"			,"BBJIJONGID"  		,"NUMBER(8,0)"	}       //������������ID
            ,{"TEMP_BILLB"			,"BBBILLMONTH" 		,"VARCHAR2(6)"	}       //û������
            ,{"TEMP_BILLB"			,"BBPAYMONTH"  		,"VARCHAR2(6)"	}       //������
            ,{"TEMP_BILLB"			,"BBMEMBID"    		,"NUMBER(8,0)"	}       //������ID
            ,{"TEMP_BILLB"			,"BBJIMEMBID"  		,"VARCHAR2(5)"	}       //���ڰ�����ȣ
            ,{"TEMP_BILLB"			,"BBJICODE"    		,"VARCHAR2(7)"	}       //�����ڵ�
            ,{"TEMP_BILLB"			,"BBJIJONG"    		,"CHAR(2)"    	}       //����
            ,{"TEMP_BILLB"			,"BBCOPY"      		,"NUMBER(5,0)"	}       //�μ�
            ,{"TEMP_BILLB"			,"BBDAN"       		,"NUMBER(8,0)"	}       //�ܰ�
            ,{"TEMP_BILLB"			,"BBBILLCODE"  		,"CHAR(2)"    	}       //��ü����(2,3)
            ,{"TEMP_BILLB"			,"BBTRDATE"    		,"DATE"       	}       //��������������
            ,{"TEMP_BILLB"			,"BBMAGAM"     		,"VARCHAR2(2)"	}       //û������
            ,{"TEMP_BILLB"			,"BBORDERID"   		,"NUMBER(6,0)"	}       //û������ID
            ,{"TEMP_BILLB"			,"BOCD"        		,"VARCHAR2(5)"	}       //�����Һ��ڵ�
        };

    String[][] column3 =
        {
             {"TEMP_BILLC"			,"BCBILLID"	 		,"NUMBER(8, 0)"		}	    //ID(BILLB.bbOrderID �� ����)
            ,{"TEMP_BILLC"			,"BCMEMBID"	 		,"NUMBER(8, 0)"		}       //MembID(������ MembID)
            ,{"TEMP_BILLC"			,"BCJICODE"	 		,"VARCHAR2(10)"    	}       //�����ڵ�
            ,{"TEMP_BILLC"			,"BCCNO"        	,"VARCHAR2(10)"    	}       //KS_NET �ܸ����ȣ
            ,{"TEMP_BILLC"			,"BCBILLYM"     	,"VARCHAR2(6)"     	}       //�ŷ����(YYYYMM)
            ,{"TEMP_BILLC"			,"BCITEMNO"     	,"VARCHAR2(2)"     	}       //�׸��ڵ�
            ,{"TEMP_BILLC"			,"BCSHOPNO"     	,"VARCHAR2(2)"     	}       //���ڵ�
            ,{"TEMP_BILLC"			,"BCPOSNO"      	,"NUMBER(8, 0)"    	}       //POS��ȣ
            ,{"TEMP_BILLC"			,"BCSEQNO"      	,"NUMBER(8, 0)"    	}       //�Ϸù�ȣ
            ,{"TEMP_BILLC"			,"BCEMPNO"      	,"VARCHAR2(15)"    	}       //�����ȣ
            ,{"TEMP_BILLC"			,"BCDGUBUN "    	,"VARCHAR2(2)"     	}       //������rnqns
            ,{"TEMP_BILLC"			,"BCKEYIN"      	,"CHAR(1)"         	}       //Keyln ����(@')
            ,{"TEMP_BILLC"			,"BCTRACKLEN"   	,"VARCHAR2(2)"     	}       //Track����(38')
            ,{"TEMP_BILLC"			,"BCTRACK"      	,"VARCHAR2(38)"    	}       //Track(ī���ȣ + '=' + ��ȿ�Ⱓ(YYMM)
            ,{"TEMP_BILLC"			,"BCDIVMONTH"   	,"VARCHAR2(2)"     	}       //�Һΰ�����
            ,{"TEMP_BILLC"          ,"BCPRICE"          ,"NUMBER(8, 0)"     }       //�ŷ��ݾ�
            ,{"TEMP_BILLC"          ,"BCHELPPRICE"      ,"NUMBER(8, 0)"     }       //�����
            ,{"TEMP_BILLC"          ,"BCOKNO"           ,"VARCHAR2(8)"      }       //���ι�ȣ
            ,{"TEMP_BILLC"          ,"BCOKDATE"         ,"VARCHAR2(8)"      }       //��������
            ,{"TEMP_BILLC"          ,"BCOKTIME"         ,"VARCHAR2(6)"      }       //���νð�
            ,{"TEMP_BILLC"          ,"BCRESULTCD"       ,"VARCHAR2(4)"      }       //����ڵ�
            ,{"TEMP_BILLC"          ,"BCEXPORTNO"       ,"VARCHAR2(2)"      }       //�߱޻��ڵ�(�߱� ī����ڵ�)
            ,{"TEMP_BILLC"          ,"BCIMPORTNO"       ,"VARCHAR2(2)"      }       //���Ի��ڵ�(���� ī����ڵ�)
            ,{"TEMP_BILLC"          ,"BCJOINNO"         ,"VARCHAR2(15)"     }       //��������ȣ
            ,{"TEMP_BILLC"          ,"BCTRDATE"         ,"DATE"             }       //KS_NET  ��������
            ,{"TEMP_BILLC"          ,"BCPSDATE"         ,"DATE"             }       //û�����ó������
            ,{"TEMP_BILLC"          ,"BOCD"	            ,"VARCHAR2(5)"	    }       //�����Һ��ڵ�
        };

    String[][] column4 =
        {
             {"TEMP_BILLH"			,"BMBILLID"      	,"NUMBER(5,0)"	}		//�Ϸù�ȣ
            ,{"TEMP_BILLH"			,"BMBILLMONTH"   	,"VARCHAR2(6)" 	}       //û������
            ,{"TEMP_BILLH"			,"BMMEMBID"      	,"NUMBER(6,0)" 	}       //������ID
            ,{"TEMP_BILLH"			,"BMJICODE"      	,"VARCHAR2(7)" 	}       //�����ڵ�
            ,{"TEMP_BILLH"			,"BMORDERDATE"   	,"DATE"        	}       //û������
            ,{"TEMP_BILLH"			,"BMPAYDATE"     	,"DATE"        	}       //��������
            ,{"TEMP_BILLH"			,"BMBILLRSLTCODE"	,"VARCHAR2(5)" 	}       //û�����
            ,{"TEMP_BILLH"			,"BMBILLSTATE"   	,"CHAR(1)"     	}       //û������(���ǹ̾���)
            ,{"TEMP_BILLH"			,"BMORDERMONTH"  	,"VARCHAR2(50)"	}       //û���ڷ������
            ,{"TEMP_BILLH"			,"BMORDERMONEY"  	,"NUMBER(6,0)" 	}       //û���ݾ�
            ,{"TEMP_BILLH"			,"BMCREATEDATE"  	,"DATE"        	}       //û���ڷ������
            ,{"TEMP_BILLH"			,"BMBANKCODE"    	,"VARCHAR2(6)" 	}       //�����ڵ�(NULL)
            ,{"TEMP_BILLH"			,"BMBANKNO"      	,"VARCHAR2(50)"	}       //���¹�ȣ(NULL)
            ,{"TEMP_BILLH"			,"BMBANKOWNER"   	,"VARCHAR2(20)"	}       //������ID(NULL)
            ,{"TEMP_BILLH"			,"BOCD"          	,"VARCHAR2(5)"	}       //�����Һ��ڵ�
        };


    String[][] column5 =
        {
             {"TEMP_CANCELMEMBER"	,"ID"          		,"NUMBER(8,0)"	}		//ID
            ,{"TEMP_CANCELMEMBER"	,"GUBUN"       		,"CHAR(2)"      }       //����
            ,{"TEMP_CANCELMEMBER"	,"SEQ_NUM"     		,"VARCHAR2(7)"  }       //�Ϸù�ȣ
            ,{"TEMP_CANCELMEMBER"	,"CN_APPL_DATE"		,"VARCHAR2(8)"  }       //������û����
            ,{"TEMP_CANCELMEMBER"	,"APPL_GB"     		,"CHAR(2)"      }       //��û����
            ,{"TEMP_CANCELMEMBER"	,"PAY_NUM1"    		,"VARCHAR2(20)" }       //�����ڹ�ȣ1
            ,{"TEMP_CANCELMEMBER"	,"PAY_NUM2"    		,"VARCHAR2(20)" }       //�����ڹ�ȣ2
            ,{"TEMP_CANCELMEMBER"	,"PAY_DAY"     		,"VARCHAR2(2)"  }       //���������
            ,{"TEMP_CANCELMEMBER"	,"FEE_TYPE"    		,"VARCHAR2(2)"  }       //�������
            ,{"TEMP_CANCELMEMBER"	,"ACCT_BR"     		,"VARCHAR2(6)"  }       //�����ڰ��°�����
            ,{"TEMP_CANCELMEMBER"	,"PAY_ACCT"    		,"VARCHAR2(20)" }       //��ݰ��¹�ȣ
            ,{"TEMP_CANCELMEMBER"	,"JUMIN_NUM"   		,"VARCHAR2(20)" }       //�ֹι�ȣ
            ,{"TEMP_CANCELMEMBER"	,"PAY_TEL"     		,"VARCHAR2(20)" }       //��������ȭ��ȣ
            ,{"TEMP_CANCELMEMBER"	,"APPL_BR"     		,"VARCHAR2(6)"  }       //��û��������
            ,{"TEMP_CANCELMEMBER"	,"CN_APPL_RS"  		,"VARCHAR2(2)"  }       //�������
            ,{"TEMP_CANCELMEMBER"	,"OPEN_MM"     		,"VARCHAR2(4)"  }       //���ʰ��ÿ�
            ,{"TEMP_CANCELMEMBER"	,"ACCT_GB"     		,"CHAR(1)"      }       //����ó����
            ,{"TEMP_CANCELMEMBER"	,"CB_ACCT_NUM" 		,"VARCHAR2(9)"  }       //����������ȣ
            ,{"TEMP_CANCELMEMBER"	,"ACCT_OWNER"  		,"VARCHAR2(20)" }       //�����ָ�
            ,{"TEMP_CANCELMEMBER"	,"CR_DATE"     		,"DATE"         }       //��������
            ,{"TEMP_CANCELMEMBER"	,"TR_DATE"     		,"DATE"         }       //ó������
            ,{"TEMP_CANCELMEMBER"	,"TR_CODE"     		,"CHAR(2)"      }       //ó���ڵ�
            ,{"TEMP_CANCELMEMBER"	,"CCMEMBID"    		,"NUMBER(8,0)"  }       //ccMembID
            ,{"TEMP_CANCELMEMBER"	,"CCJIJONGID"  		,"NUMBER(8,0)"  }       //ccJiJongID
            ,{"TEMP_CANCELMEMBER"	,"CN_POINTIP"  		,"VARCHAR2(20)" }       //������IP
            ,{"TEMP_CANCELMEMBER"	,"CN_PERSID"   		,"VARCHAR2(20)" }       //������ID
            ,{"TEMP_CANCELMEMBER"	,"BOCD"        		,"VARCHAR2(5)"  }       //�����Һ��ڵ�
         };

    String[][] column6 =
        {
             {"TEMP_CHANGEMEMBER"	,"ID"          		,"NUMBER(8,0)"	}       //ID
            ,{"TEMP_CHANGEMEMBER"	,"GUBUN"       		,"CHAR(2)"      }       //����
            ,{"TEMP_CHANGEMEMBER"	,"SEQ_NUM"     		,"VARCHAR2(7)"  }       //�Ϸù�ȣ
            ,{"TEMP_CHANGEMEMBER"	,"CH_APPL_DATE"		,"VARCHAR2(8)"  }       //�����û����
            ,{"TEMP_CHANGEMEMBER"	,"APPL_GB"     		,"CHAR(2)"      }       //��û����
            ,{"TEMP_CHANGEMEMBER"	,"PAY_NUM1"    		,"VARCHAR2(20)" }       //�����ڹ�ȣ
            ,{"TEMP_CHANGEMEMBER"	,"PAY_NUM2"    		,"VARCHAR2(20)" }       //�����ڹ�ȣ2
            ,{"TEMP_CHANGEMEMBER"	,"PAY_DAY"     		,"VARCHAR2(2)"  }       //���������
            ,{"TEMP_CHANGEMEMBER"	,"FEE_TYPE"    		,"VARCHAR2(2)"  }       //�������
            ,{"TEMP_CHANGEMEMBER"	,"ACCT_BR"     		,"VARCHAR2(6)"  }       //�����ڰ��°�����
            ,{"TEMP_CHANGEMEMBER"	,"PAY_ACCT"    		,"VARCHAR2(20)" }       //��ݰ��¹�ȣ
            ,{"TEMP_CHANGEMEMBER"	,"JUMIN_NUM"   		,"VARCHAR2(20)" }       //�ֹι�ȣ
            ,{"TEMP_CHANGEMEMBER"	,"PAY_TEL"     		,"VARCHAR2(20)" }       //��������ȭ��ȣ
            ,{"TEMP_CHANGEMEMBER"	,"APPL_BR"     		,"VARCHAR2(6)"  }       //��û��������
            ,{"TEMP_CHANGEMEMBER"	,"CH_APPL_RS"  		,"VARCHAR2(2)"  }       //������
            ,{"TEMP_CHANGEMEMBER"	,"OPEN_MM"     		,"VARCHAR2(4)"  }       //���ʰ��ÿ�
            ,{"TEMP_CHANGEMEMBER"	,"ACCT_GB"     		,"CHAR(1)"      }       //����ó����
            ,{"TEMP_CHANGEMEMBER"	,"CB_ACCT_NUM" 		,"VARCHAR2(9)"  }       //����������ȣ
            ,{"TEMP_CHANGEMEMBER"	,"ACCT_OWNER"  		,"VARCHAR2(20)" }       //�����ָ�
            ,{"TEMP_CHANGEMEMBER"	,"CR_DATE"     		,"DATE"         }       //��������
            ,{"TEMP_CHANGEMEMBER"	,"TR_DATE"     		,"DATE"         }       //ó������
            ,{"TEMP_CHANGEMEMBER"	,"TR_CODE"     		,"CHAR(2)"      }       //ó���ڵ�
            ,{"TEMP_CHANGEMEMBER"	,"CHMEMBID"    		,"NUMBER(8,0)"  }       //chMembID
            ,{"TEMP_CHANGEMEMBER"	,"CHJIJONGID"  		,"NUMBER(8,0)"	}       //chJiJongID
            ,{"TEMP_CHANGEMEMBER"	,"CH_POINTIP"  		,"VARCHAR2(20)" }       //������IP
            ,{"TEMP_CHANGEMEMBER"	,"CH_PERSID"   		,"VARCHAR2(20)" }       //������ID
            ,{"TEMP_CHANGEMEMBER"	,"BOCD"        		,"VARCHAR2(5)"  }       //�����Һ��ڵ�
        };

    String[][] column7 =
        {
             {"TEMP_DOKJIKUKCHANGE"	,"ID"          		,"NUMBER(8,0)"	}		//�Ϸù�ȣ
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJICODEAFTER"    ,"VARCHAR2(7)"  }       //������ �����ڵ�
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJICODEBEFORE"   ,"VARCHAR2(7)"  }       //������ �����ڵ�
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCMEMBID"         ,"NUMBER(8,0)"  }       //������ID
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIJONGID"       ,"NUMBER(8,0)"  }       //��������ID
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIKUKCHANGEDT"  ,"DATE"         }       //������������
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIKUKCHECKDT"   ,"DATE"         }       //����Ȯ������
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIKUKCHECK"     ,"CHAR(1)"      }       //����Ȯ�ο���
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCSENDCHECK"      ,"CHAR(1)"      }       //�����û����
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCUSERIP"         ,"VARCHAR2(20)" }       //������IP
            ,{"TEMP_DOKJIKUKCHANGE"	,"JCJIMEMBIDBEFORE" ,"VARCHAR2(5)"  }       //������ ������ȣ
            ,{"TEMP_DOKJIKUKCHANGE"	,"BOCD"          	,"VARCHAR2(5)"  }       //�����Һ��ڵ�
        };

    String[][] column8 =
        {
             {"TEMP_DOKMASTERB"		,"PLJIJONGID"   	,"NUMBER(8,0)"	}		//��������ID
            ,{"TEMP_DOKMASTERB"		,"PLMEMBID"     	,"NUMBER(8,0)" 	}       //ȸ��ID
            ,{"TEMP_DOKMASTERB"		,"PLJICODE"     	,"VARCHAR2(5)" 	}       //�����Һ��ڵ�
            ,{"TEMP_DOKMASTERB"		,"PLJIMEMBID"   	,"VARCHAR2(5)" 	}       //�����������ڹ�ȣ
            ,{"TEMP_DOKMASTERB"		,"PLSUBCNAME"   	,"VARCHAR2(50)"	}       //�����ڸ�
            ,{"TEMP_DOKMASTERB"		,"PLJIJONG"     	,"VARCHAR2(2)" 	}       //�����ڵ�
            ,{"TEMP_DOKMASTERB"		,"PLCOPY"       	,"NUMBER(5,0)" 	}       //�μ�
            ,{"TEMP_DOKMASTERB"		,"PLJIJONGDAN"  	,"NUMBER(8,0)" 	}       //�������ʴܰ�
            ,{"TEMP_DOKMASTERB"		,"PLJIPOST"     	,"NUMBER(5,0)" 	}       //�����ȣID
            ,{"TEMP_DOKMASTERB"		,"PLJIADDR"     	,"VARCHAR2(50)"	}       //�ּ�
            ,{"TEMP_DOKMASTERB"		,"PLPAYMETHOD"  	,"CHAR(2)"     	}       //��ü����
            ,{"TEMP_DOKMASTERB"		,"PLJIKUKCHECK" 	,"CHAR(1)"     	}       //����Ȯ���ڵ�
            ,{"TEMP_DOKMASTERB"		,"PLGIROSTART"  	,"VARCHAR2(6)" 	}       //��ü���۳��
            ,{"TEMP_DOKMASTERB"		,"PLSTOPCODE"   	,"CHAR(2)"     	}       //�����ڵ�
            ,{"TEMP_DOKMASTERB"		,"PLSTOPDATE"   	,"DATE"        	}       //������û��
            ,{"TEMP_DOKMASTERB"		,"PLSTOPAPPDATE"	,"DATE"        	}       //����������
            ,{"TEMP_DOKMASTERB"		,"PLYEARBILL"   	,"VARCHAR2(12)"	}       //1�Ⱓ ������Ȳ
            ,{"TEMP_DOKMASTERB"		,"PLCREATED"    	,"DATE"        	}       //������
            ,{"TEMP_DOKMASTERB"		,"PLCREATOR"    	,"VARCHAR2(50)"	}       //������(�ý���,����)
            ,{"TEMP_DOKMASTERB"		,"PLMEMBPHONE"  	,"VARCHAR2(20)"	}       //������ȭ��ȣ
            ,{"TEMP_DOKMASTERB"		,"PLMEMBIP"     	,"VARCHAR2(20)"	}       //������IP
            ,{"TEMP_DOKMASTERB"		,"PLSENDCHECK"  	,"CHAR(1)"     	}       //
            ,{"TEMP_DOKMASTERB"		,"PLAPPDATE"    	,"DATE"        	}       //
            ,{"TEMP_DOKMASTERB"		,"PLAPPUSER"    	,"VARCHAR2(50)"	}       //
            ,{"TEMP_DOKMASTERB"		,"PLAPPIP"      	,"VARCHAR2(20)"	}       //
            ,{"TEMP_DOKMASTERB"		,"PLPOINT"      	,"VARCHAR2(50)"	}       //
            ,{"TEMP_DOKMASTERB"		,"PLGDTYPE"     	,"CHAR(1)"     	}       //
            ,{"TEMP_DOKMASTERB"		,"PLHOPEDATE"   	,"CHAR(10)"    	}       //
            ,{"TEMP_DOKMASTERB"		,"PLINPUTAREA"  	,"VARCHAR2(2)" 	}       //
            ,{"TEMP_DOKMASTERB"		,"BOCD"         	,"VARCHAR2(5)" 	}		//�����Һ��ڵ�
        };
    String[][] column9 =
        {
             {"TEMP_DOKMASTERH"		,"GMMEMBID"     	,"NUMBER(8,0)"	}		//ȸ��ID
            ,{"TEMP_DOKMASTERH"		,"GMMEMBNAME"   	,"VARCHAR2(20)" }       //ȸ����
            ,{"TEMP_DOKMASTERH"		,"GMEMAIL"      	,"VARCHAR2(50)" }       //�̸���
            ,{"TEMP_DOKMASTERH"		,"GMJUMINID"    	,"VARCHAR2(13)" }       //�ֹ�(�����)��ȣ
            ,{"TEMP_DOKMASTERH"		,"GMPHONENUM"   	,"VARCHAR2(20)" }       //��ȭ��ȣ
            ,{"TEMP_DOKMASTERH"		,"GMBANKOWNER"  	,"VARCHAR2(20)" }       //������
            ,{"TEMP_DOKMASTERH"		,"GMBANKCODE"   	,"VARCHAR2(6)"  }       //�����ڵ�
            ,{"TEMP_DOKMASTERH"		,"GMCARDNO"     	,"VARCHAR2(20)" }       //ī���ȣ
            ,{"TEMP_DOKMASTERH"		,"GMBANKNO"     	,"VARCHAR2(20)" }       //���¹�ȣ
            ,{"TEMP_DOKMASTERH"		,"GMSTATE"      	,"CHAR(2)"      }       //��ü���±���
            ,{"TEMP_DOKMASTERH"		,"GMSTATDESC"   	,"VARCHAR2(2)"  }       //��ü���»���
            ,{"TEMP_DOKMASTERH"		,"GMSTATEDATE"  	,"DATE"         }       //��ü����������
            ,{"TEMP_DOKMASTERH"		,"GMGIROSTART"  	,"VARCHAR2(6)"  }       //��ü���۳��
            ,{"TEMP_DOKMASTERH"		,"GMGIROGUBUN"  	,"CHAR(1)"      }       //��ü����
            ,{"TEMP_DOKMASTERH"		,"GMFIRSTAPPLY" 	,"DATE"         }       //��û��
            ,{"TEMP_DOKMASTERH"		,"GMCREATED"    	,"DATE"         }       //������
            ,{"TEMP_DOKMASTERH"		,"GMCARDCODE"   	,"VARCHAR2(6)"  }       //
            ,{"TEMP_DOKMASTERH"		,"GMUNTILYM"    	,"CHAR(4)"      }		//
            ,{"TEMP_DOKMASTERH"		,"BOCD"         	,"VARCHAR2(5)"  }		//�����Һ��ڵ�
        };

    String[][] column10 =
        {
             {"TEMP_LOGMEMBER"		,"LOGSEQ"         	,"NUMBER(8,0)"	}		//�Ϸù�ȣ
            ,{"TEMP_LOGMEMBER"		,"LOGCODE"        	,"VARCHAR2(2)" 	}       //�α��ڵ�
            ,{"TEMP_LOGMEMBER"		,"LOGDATE"        	,"DATE"        	}       //�α�����
            ,{"TEMP_LOGMEMBER"		,"LOGAPPIP"       	,"CHAR(20)"    	}       //��������
            ,{"TEMP_LOGMEMBER"		,"LOGAPPUSER"     	,"VARCHAR2(20)"	}       //������
            ,{"TEMP_LOGMEMBER"		,"LOGJIJONGID"    	,"NUMBER(8,0)" 	}       //������������ID
            ,{"TEMP_LOGMEMBER"		,"LOGMEMBID"      	,"NUMBER(8,0)" 	}       //������ID
            ,{"TEMP_LOGMEMBER"		,"LOGJICODE"      	,"VARCHAR2(5)" 	}       //�����ڵ�
            ,{"TEMP_LOGMEMBER"		,"LOGJIMEMBID"    	,"VARCHAR2(5)" 	}       //���ڰ�����ȣ
            ,{"TEMP_LOGMEMBER"		,"LOGSUBCNAME"    	,"VARCHAR2(20)"	}       //���ڸ�
            ,{"TEMP_LOGMEMBER"		,"LOGMEMBPHONE"   	,"VARCHAR2(20)"	}       //������ȭ��ȣ
            ,{"TEMP_LOGMEMBER"		,"LOGJIPOST"      	,"NUMBER(5,0)" 	}       //�����ȣID
            ,{"TEMP_LOGMEMBER"		,"LOGJIADDR"      	,"VARCHAR2(50)"	}       //�����ּ�
            ,{"TEMP_LOGMEMBER"		,"LOGJIJONG"      	,"VARCHAR2(2)" 	}       //����
            ,{"TEMP_LOGMEMBER"		,"LOGCOPY"        	,"NUMBER(5,0)" 	}       //�μ�
            ,{"TEMP_LOGMEMBER"		,"LOGDAN"         	,"NUMBER(6,0)" 	}       //�ܰ�
            ,{"TEMP_LOGMEMBER"		,"LOGJIKUKCHECK"  	,"CHAR(1)"     	}       //����Ȯ�ο���
            ,{"TEMP_LOGMEMBER"		,"LOGPAYMETHOD"   	,"CHAR(2)"     	}       //��ü����
            ,{"TEMP_LOGMEMBER"		,"LOGGIROSTART"   	,"VARCHAR2(6)" 	}       //��ü���ۿ�
            ,{"TEMP_LOGMEMBER"		,"LOGSTOPCODE"    	,"CHAR(2)"     	}       //��������
            ,{"TEMP_LOGMEMBER"		,"LOGSTOPDATE"    	,"VARCHAR2(50)"	}       //��������
            ,{"TEMP_LOGMEMBER"		,"LOGSTOPAPPDATE" 	,"VARCHAR2(50)"	}       //������������
            ,{"TEMP_LOGMEMBER"		,"LOGCREATED"     	,"VARCHAR2(50)"	}       //�ڵ���ü��û����
            ,{"TEMP_LOGMEMBER"		,"LOGCREATOR"     	,"VARCHAR2(20)"	}       //�ڵ���ü��û��
            ,{"TEMP_LOGMEMBER"		,"LOGMEMBIP"      	,"VARCHAR2(15)"	}       //�ڵ���ü��û��IP
            ,{"TEMP_LOGMEMBER"		,"LOGSENDCHECK"   	,"CHAR(1)"     	}       //���������ۿ���
            ,{"TEMP_LOGMEMBER"		,"LOGJUMINID"     	,"VARCHAR2(13)"	}       //�������ֹι�ȣ
            ,{"TEMP_LOGMEMBER"		,"LOGOWNERPHONE"  	,"VARCHAR2(20)"	}       //��������ȭ��ȣ
            ,{"TEMP_LOGMEMBER"		,"LOGBANKOWNER"   	,"VARCHAR2(20)"	}       //�����ָ�
            ,{"TEMP_LOGMEMBER"		,"LOGBANKCODE"    	,"VARCHAR2(6)" 	}       //�����ڵ�
            ,{"TEMP_LOGMEMBER"		,"LOGBANKNO"      	,"VARCHAR2(20)"	}       //���¹�ȣ
            ,{"TEMP_LOGMEMBER"		,"LOGCARDNO"      	,"VARCHAR2(20)"	}       //ī���ȣ
            ,{"TEMP_LOGMEMBER"		,"LOGDESC"        	,"VARCHAR2(200)"}       //��Ÿ����
            ,{"TEMP_LOGMEMBER"		,"LOGAPPJUMINID"  	,"VARCHAR2(13)" }       //��û���ֹε�Ϲ�ȣ
            ,{"TEMP_LOGMEMBER"		,"BOCD"          	,"VARCHAR2(5)"	}       //�����Һ��ڵ�
        };

    String[][] column11 =
        {
             {"TEMP_NEWMEMBER"		,"ID"         		,"NUMBER(8,0)"	}		//ID
            ,{"TEMP_NEWMEMBER"		,"GUBUN"      		,"CHAR(2)"     	}       //����
            ,{"TEMP_NEWMEMBER"		,"SEQ_NUM"    		,"VARCHAR2(7)" 	}       //�Ϸù�ȣ
            ,{"TEMP_NEWMEMBER"		,"APPL_DATE"  		,"VARCHAR2(8)" 	}       //��û����
            ,{"TEMP_NEWMEMBER"		,"APPL_GB"    		,"CHAR(2)"     	}       //��û����
            ,{"TEMP_NEWMEMBER"		,"PAY_NUM1"   		,"VARCHAR2(20)"	}       //�����ڹ�ȣ1
            ,{"TEMP_NEWMEMBER"		,"PAY_NUM2"   		,"VARCHAR2(20)"	}       //�����ڹ�ȣ2
            ,{"TEMP_NEWMEMBER"		,"PAY_DAY"    		,"VARCHAR2(2)" 	}       //���������
            ,{"TEMP_NEWMEMBER"		,"FEE_TYPE"   		,"VARCHAR2(2)" 	}       //�������
            ,{"TEMP_NEWMEMBER"		,"ACCT_BR"    		,"VARCHAR2(6)" 	}       //�����ڰ��°�����
            ,{"TEMP_NEWMEMBER"		,"PAY_ACCT"   		,"VARCHAR2(20)"	}       //��ݰ��¹�ȣ
            ,{"TEMP_NEWMEMBER"		,"JUMIN_NUM"  		,"VARCHAR2(20)"	}       //�ֹι�ȣ
            ,{"TEMP_NEWMEMBER"		,"PAY_TEL"    		,"VARCHAR2(20)"	}       //��������ȭ��ȣ
            ,{"TEMP_NEWMEMBER"		,"APPL_BR"    		,"VARCHAR2(6)" 	}       //��û��������
            ,{"TEMP_NEWMEMBER"		,"APPL_RS"    		,"VARCHAR2(2)" 	}       //��û���
            ,{"TEMP_NEWMEMBER"		,"OPEN_MM"    		,"VARCHAR2(4)" 	}       //���ʰ��ÿ�
            ,{"TEMP_NEWMEMBER"		,"ACCT_GB"    		,"CHAR(1)"     	}       //����ó����
            ,{"TEMP_NEWMEMBER"		,"CB_ACCT_NUM"		,"VARCHAR2(9)" 	}       //����������ȣ
            ,{"TEMP_NEWMEMBER"		,"ACCT_OWNER" 		,"VARCHAR2(20)"	}       //�����ָ�
            ,{"TEMP_NEWMEMBER"		,"CR_DATE"    		,"DATE"        	}       //��������
            ,{"TEMP_NEWMEMBER"		,"TR_DATE"    		,"DATE"        	}       //ó������
            ,{"TEMP_NEWMEMBER"		,"TR_CODE"    		,"CHAR(2)"     	}       //ó���ڵ�
            ,{"TEMP_NEWMEMBER"		,"NMMEMBID"   		,"NUMBER(8,0)" 	}       //nmMembID
            ,{"TEMP_NEWMEMBER"		,"NMJIJONGID" 		,"NUMBER(8,0)" 	}       //nmJiJongID
            ,{"TEMP_NEWMEMBER"		,"BOCD"       		,"VARCHAR2(5)" 	}       //�����Һ��ڵ�
        };

    String[][] column12 =
        {
             {"TEMP_LOGBANKINFO"	,"LOGSEQ"  	  		,"NUMBER(8, 0)"		}	    //ID
            ,{"TEMP_LOGBANKINFO"	,"LOGJICODE"	  	,"VARCHAR2(10)"    	}       //�����ڵ�
            ,{"TEMP_LOGBANKINFO"	,"LOGAPPNAME"   	,"VARCHAR2(20)"    	}       //������ �̸�
            ,{"TEMP_LOGBANKINFO"	,"LOGAPPJUMINID"	,"VARCHAR2(13)"    	}       //������ �ֹι�ȣ
            ,{"TEMP_LOGBANKINFO"	,"LOGAPPID"     	,"VARCHAR2(20)"    	}       //������ IP
            ,{"TEMP_LOGBANKINFO"	,"LOGAPPDATE"   	,"DATE"            	}       //��������
            ,{"TEMP_LOGBANKINFO"	,"LOGMEMBID"    	,"NUMBER(8, 0)"    	}       //������MembID
            ,{"TEMP_LOGBANKINFO"	,"LOGBANKOWNER" 	,"VARCHAR2(20)"    	}       //�����ָ�
            ,{"TEMP_LOGBANKINFO"	,"LOGBANKCODE"  	,"VARCHAR2(6)"     	}       //�����ڵ�
            ,{"TEMP_LOGBANKINFO"	,"LOGBANKNAME"  	,"VARCHAR2(20)"    	}       //�����
            ,{"TEMP_LOGBANKINFO"	,"LOGBANKNO"    	,"VARCHAR2(20)"    	}       //���¹�ȣ
            ,{"TEMP_LOGBANKINFO"	,"LOGJUMINID"   	,"VARCHAR2(13)"    	}       //�ֹι�ȣ
            ,{"TEMP_LOGBANKINFO"	,"BOCD"	      		,"VARCHAR2(5)"	    }       //�����Һ��ڵ�
        };


    public SS_A_MIG_BILLUPDM(){

        //���̺����
        this.tables.add(0, "BANKDATAS");        	//�����û��
        this.tables.add(1, "BILLA");            	//�����ڵ���ü
        this.tables.add(2, "BILLB");            	//BILL a.c,h �� Master  ( ��ü û������)  �����Һ��ڵ� ����
        this.tables.add(3, "BILLC");            	//�Ϲ�ī��
        this.tables.add(4, "BILLH");            	//����ī��
        this.tables.add(5, "CANCELMEMBER");     	//������û��
        this.tables.add(6, "CHANGEMEMBER");     	//�����û��
        this.tables.add(7, "DOKJIKUKCHANGE");   	//����������
        this.tables.add(8, "DOKMASTERB");       	//�������� (body)
        this.tables.add(9, "DOKMASTERH");       	//�������� (header) ȸ��ID �� ����
        this.tables.add(10, "LOGMEMBER");       	//����� �̷�
        this.tables.add(11, "NEWMEMBER");       	//�űԽ�û��
        this.tables.add(12, "LOGBANKINFO");    //�����ں���α�


        //���̺� �÷� ������ Ÿ�� ����
        this.columns.add(0, column0);				//�����û��
        this.columns.add(1, column1);				//�����ڵ���ü
        this.columns.add(2, column2);				//BILL a.c,h �� Master  ( ��ü û������)  �����Һ��ڵ� ����
        this.columns.add(3, column3);				//�Ϲ�ī��
        this.columns.add(4, column4);				//����ī��
        this.columns.add(5, column5);				//������û��
        this.columns.add(6, column6);				//�����û��
        this.columns.add(7, column7);				//����������
        this.columns.add(8, column8);				//�������� (body)
        this.columns.add(9, column9);				//�������� (header) ȸ��ID �� ����
        this.columns.add(10,column10);				//����� �̷�
        this.columns.add(11,column11);				//�űԽ�û��
        this.columns.add(12,column12);				//�����ں���α�

    }
    public SS_A_MIG_BILLUPDM(String bocd, String plist, String mgyn){
        this.bocd = bocd;
        this.workclsf = workclsf;

        //���̺����
        this.tables.add(0, "BANKDATAS");       		//�����û��
        this.tables.add(1, "BILLA");            	//�����ڵ���ü
        this.tables.add(2, "BILLB");            	//BILL a.c,h �� Master  ( ��ü û������)  �����Һ��ڵ� ����
        this.tables.add(3, "BILLC");            	//�Ϲ�ī��
        this.tables.add(4, "BILLH");            	//����ī��
        this.tables.add(5, "CANCELMEMBER");     	//������û��
        this.tables.add(6, "CHANGEMEMBER");     	//�����û��
        this.tables.add(7, "DOKJIKUKCHANGE");  		//����������
        this.tables.add(8, "DOKMASTERB");      		//�������� (body)
        this.tables.add(9, "DOKMASTERH");      		//�������� (header) ȸ��ID �� ����
        this.tables.add(10, "LOGMEMBER");       	//����� �̷�
        this.tables.add(11, "NEWMEMBER");       	//�űԽ�û��
        this.tables.add(12, "LOGBANKINFO");    //�����ں���α�

        //���̺� �÷� ������ Ÿ�� ����
        this.columns.add(0, column0);				//�����û��
        this.columns.add(1, column1);				//�����ڵ���ü
        this.columns.add(2, column2);				//BILL a.c,h �� Master  ( ��ü û������)  �����Һ��ڵ� ����
        this.columns.add(3, column3);				//�Ϲ�ī��
        this.columns.add(4, column4);				//����ī��
        this.columns.add(5, column5);				//������û��
        this.columns.add(6, column6);				//�����û��
        this.columns.add(7, column7);				//����������
        this.columns.add(8, column8);				//�������� (body)
        this.columns.add(9, column9);				//�������� (header) ȸ��ID �� ����
        this.columns.add(10,column10);				//����� �̷�
        this.columns.add(11,column11);				//�űԽ�û��
        this.columns.add(12,column12);				//�����ں���α�

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
     * ����IS ���� ���̱׷��̼��� ���� ���� ���̺� ��ȸ������ ����
     * @param tbIdx int ���̱׷��̼� ��� ���̺� index(�ڼ��� ������ Class �ּ� ����)
     * @return sql
     */
    public String getSelQry(int tbIdx) {
        String sql = null;
        StringBuffer sb = new StringBuffer();
        switch (tbIdx) {
            case 0:
                sb.append("	SELECT                     						");
                sb.append("	    	 [ID]              						");
                sb.append("			,[����]            						");
                sb.append("			,[�Ϸù�ȣ]        						");
                sb.append("			,[��û����]        						");
                sb.append("			,[��û����]        						");
                sb.append("			,[�����ڹ�ȣ1]     						");
                sb.append("			,[�����ڹ�ȣ2]     						");
                sb.append("			,[���������]      						");
                sb.append("			,[�������]        						");
                sb.append("			,[�����ڰ��°�����]						   ");
                sb.append("			,[��ݰ��¹�ȣ]    						");
                sb.append("			,[�ֹι�ȣ]        						");
                sb.append("			,[��������ȭ��ȣ]  						");
                sb.append("			,[��û��������]    						");
                sb.append("			,[��û���]        						");
                sb.append("			,[���ʰ��ÿ�]      						");
                sb.append("			,[����ó����]      						");
                sb.append("			,[����������ȣ]    						");
                sb.append("			,[�����ָ�]        						");
                sb.append("			,[ó������]        						");
                sb.append("			,[ó���ڵ�]        						");
                sb.append("	FROM     [AutoGiro].[dbo].[BankDataS]           ");
                sb.append("	WHERE    SUBSTRING( [�����ڹ�ȣ1] , 1, 5) = ?   ");
                sb.append("	   OR    SUBSTRING( [�����ڹ�ȣ2] , 1, 5) = ?	");
                break;
            case 1:
                sb.append("	SELECT DISTINCT	A.[ID]                             ");
                sb.append("			,A.[����]                                    ");
                sb.append("			,A.[�Ϸù�ȣ]                                ");
                sb.append("			,A.[�����ڹ�ȣ]                              ");
                sb.append("			,A.[�����ڰ��°������ڵ�]                    ");
                sb.append("			,A.[���¹�ȣ]                                ");
                sb.append("			,A.[�ֹι�ȣ]                                ");
                sb.append("			,A.[��ݳ���]                                ");
                sb.append("			,A.[�ݾ�]                                    ");
                sb.append("			,A.[û������ڵ�]                            ");
                sb.append("			,A.[����ó�����ڵ�]                          ");
                sb.append("			,A.[�κ���ݱݾ�]                            ");
                sb.append("			,A.[�Ǹ����ڵ�]                            ");
                sb.append("			,convert(varchar, A.[����ó������], 20)      ");
                sb.append("			,convert(varchar, A.[���ó������], 20)      ");
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
                sb.append("			,[����]                                 ");
                sb.append("			,[�Ϸù�ȣ]                             ");
                sb.append("			,[������û����]                         ");
                sb.append("			,[��û����]                             ");
                sb.append("			,[�����ڹ�ȣ1]                          ");
                sb.append("			,[�����ڹ�ȣ2]                          ");
                sb.append("			,[���������]                           ");
                sb.append("			,[�������]                             ");
                sb.append("			,[�����ڰ��°�����]                     ");
                sb.append("			,[��ݰ��¹�ȣ]                         ");
                sb.append("			,[�ֹι�ȣ]                             ");
                sb.append("			,[��������ȭ��ȣ]                       ");
                sb.append("			,[��û��������]                         ");
                sb.append("			,[�������]                             ");
                sb.append("			,[���ʰ��ÿ�]                           ");
                sb.append("			,[����ó����]                           ");
                sb.append("			,[����������ȣ]                         ");
                sb.append("			,[�����ָ�]                             ");
                sb.append("			,convert(varchar, [��������], 20)        ");
                sb.append("			,convert(varchar, [ó������], 20)        ");
                sb.append("			,[ó���ڵ�]                             ");
                sb.append("			,[ccMembID]                             ");
                sb.append("			,[ccJiJongID]                           ");
                sb.append("			,[������IP]                             ");
                sb.append("			,[������ID]                             ");
                sb.append("	FROM 	[AutoGiro].[dbo].[CancelMember]        ");
                sb.append("	WHERE    SUBSTRING( [�����ڹ�ȣ1] , 1, 5) = ?   ");
                sb.append("	   OR    SUBSTRING( [�����ڹ�ȣ2] , 1, 5) = ?	");
                break;
            case 6:
                sb.append("	SELECT 	[ID]                                    ");
                sb.append("			,[����]                                 ");
                sb.append("			,[�Ϸù�ȣ]                             ");
                sb.append("			,[�����û����]                         ");
                sb.append("			,[��û����]                             ");
                sb.append("			,[�����ڹ�ȣ]                           ");
                sb.append("			,[�����ڹ�ȣ2]                          ");
                sb.append("			,[���������]                           ");
                sb.append("			,[�������]                             ");
                sb.append("			,[�����ڰ��°�����]                     ");
                sb.append("			,[��ݰ��¹�ȣ]                         ");
                sb.append("			,[�ֹι�ȣ]                             ");
                sb.append("			,[��������ȭ��ȣ]                       ");
                sb.append("			,[��û��������]                         ");
                sb.append("			,[������]                             ");
                sb.append("			,[���ʰ��ÿ�]                           ");
                sb.append("			,[����ó����]                           ");
                sb.append("			,[����������ȣ]                         ");
                sb.append("			,[�����ָ�]                             ");
                sb.append("			,convert(varchar, [��������], 20)       ");
                sb.append("			,convert(varchar, [ó������], 20)       ");
                sb.append("			,[ó���ڵ�]                             ");
                sb.append("			,[chMembID]                             ");
                sb.append("			,[chJiJongID]                           ");
                sb.append("			,[������IP]                             ");
                sb.append("			,[������ID]                             ");
                sb.append("	FROM    [AutoGiro].[dbo].[ChangeMember]        ");
                sb.append("	WHERE    SUBSTRING( [�����ڹ�ȣ] , 1, 5) = ?   ");
                sb.append("	   OR    SUBSTRING( [�����ڹ�ȣ2] , 1, 5) = ?	");
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
                sb.append("			,[����]                               ");
                sb.append("			,[�Ϸù�ȣ]                           ");
                sb.append("			,[��û����]                           ");
                sb.append("			,[��û����]                           ");
                sb.append("			,[�����ڹ�ȣ1]                        ");
                sb.append("			,[�����ڹ�ȣ2]                        ");
                sb.append("			,[���������]                         ");
                sb.append("			,[�������]                           ");
                sb.append("			,[�����ڰ��°�����]                   ");
                sb.append("			,[��ݰ��¹�ȣ]                       ");
                sb.append("			,[�ֹι�ȣ]                           ");
                sb.append("			,[��������ȭ��ȣ]                     ");
                sb.append("			,[��û��������]                       ");
                sb.append("			,[��û���]                           ");
                sb.append("			,[���ʰ��ÿ�]                         ");
                sb.append("			,[����ó����]                         ");
                sb.append("			,[����������ȣ]                       ");
                sb.append("			,[�����ָ�]                           ");
                sb.append("			,convert(varchar, [��������], 20)     ");
                sb.append("			,convert(varchar, [ó������], 20)     ");
                sb.append("			,[ó���ڵ�]                           ");
                sb.append("			,[nmMembID]                           ");
                sb.append("			,[nmJiJongID]                         ");
                sb.append("	FROM 	[AutoGiro].[dbo].[NewMember]          ");
                sb.append("	WHERE    SUBSTRING( [�����ڹ�ȣ1] , 1, 5) = ? ");
                sb.append("	   OR    SUBSTRING( [�����ڹ�ȣ2] , 1, 5) = ? ");
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
     * ���̱׷��̼� ���� ���̺��� ��ȸ��
     * PreparedStatement �� DM �� �Է¹޾� dm�� ���õ� ���������ڵ带
     * �ش� ���̺��� ������ �µ��� ����
     * @param pstmt PreparedStatement
     * @param bdm BaseDM
     * @param tbIdx int ���̱׷��̼� ��� ���̺� index(�ڼ��� ������ Class �ּ� ����)
     * @throws SQLException
     */
    public void setSelQryParams(PreparedStatement pstmt, BaseDM bdm, int tbIdx) throws SQLException{
        SS_A_MIG_BILLUPDM dm = (SS_A_MIG_BILLUPDM)bdm;
        switch(tbIdx){
            case 0: //�����û��
                pstmt.setString(1, dm.bocd);
                pstmt.setString(2, dm.bocd);
                break;
            case 1: //�����ڵ���ü
                pstmt.setString(1, dm.bocd);
                break;
            case 2: //BILL a.c,h �� Master  ( ��ü û������)  �����Һ��ڵ� ����
                pstmt.setString(1, dm.bocd);
                break;
            case 3: //�Ϲ�ī��
                pstmt.setString(1, dm.bocd);
                break;
            case 4: //����ī��
                pstmt.setString(1, dm.bocd);
                break;
            case 5: //������û��
                pstmt.setString(1, dm.bocd);
                pstmt.setString(2, dm.bocd);
                break;
            case 6: //�����û��
                pstmt.setString(1, dm.bocd);
                pstmt.setString(2, dm.bocd);
                break;
            case 7: //����������
                pstmt.setString(1, dm.bocd);
                break;
            case 8: //�������� (body)
                pstmt.setString(1, dm.bocd);
                break;
            case 9: //�������� (header) ȸ��ID �� ����
                pstmt.setString(1, dm.bocd);
                break;
            case 10: //����� �̷�
                pstmt.setString(1, dm.bocd);
                break;
            case 11: //�űԽ�û��
                pstmt.setString(1, dm.bocd);
                pstmt.setString(2, dm.bocd);
                break;
            case 12: //�����ں���α�
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
