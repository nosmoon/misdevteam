/***************************************************************************************************
 * ���ϸ�   : SP_SS_L_RDR_JM_EXTN_INIT
 * ���     : Ȯ����Ȳ-����Ȯ�� ��û��Ȳ
 * �ۼ����� : 2007/11/17
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
**  SP_SS_L_RDR_JM_EXTN_INIT
**/

public class SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String ciymgbcd;
	public String cicdgb;
	public String cicdynm;

	public SS_L_RDR_JM_EXTN_INITCURCAMPCDRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}
}

/* �ۼ��ð� : Fri Nov 16 14:26:43 KST 2007 */