/***************************************************************************************************
 * ���ϸ�   : SP_SS_L_CAMP_EXTN_INIT.java
 * ���     : ķ����Ȯ��
 * �ۼ����� : 2005/05/26
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.camp.rec;

import java.sql.*;
import chosun.ciis.ss.sls.camp.dm.*;
import chosun.ciis.ss.sls.camp.ds.*;

/**
 * ķ����Ȯ��
 */

public class SS_L_CAMP_EXTN_INITCURCAMPEVENTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String ciymgbcd;
	public String cicdgb;
	public String cicdynm;

	public SS_L_CAMP_EXTN_INITCURCAMPEVENTCDRecord(){}

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

/* �ۼ��ð� : Fri May 27 15:53:51 KST 2005 */