/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 
 */


public class SS_L_VACT_STATCURPRINTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String subsmappli;
	public String bocd;
	public String bonm;
	public String bank_cd;
	public String bank_nm;
	public String totcnt;
	public String totamt;

	public SS_L_VACT_STATCURPRINTLISTRecord(){}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setTotcnt(String totcnt){
		this.totcnt = totcnt;
	}

	public void setTotamt(String totamt){
		this.totamt = totamt;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getTotcnt(){
		return this.totcnt;
	}

	public String getTotamt(){
		return this.totamt;
	}
}

/* �ۼ��ð� : Wed Nov 04 12:47:42 KST 2015 */