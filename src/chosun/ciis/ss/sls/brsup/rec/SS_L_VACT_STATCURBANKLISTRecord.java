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


public class SS_L_VACT_STATCURBANKLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String banknm;
	public String bankcd;
	public int totcnt;
	public int totamt;
	public int normlcnt;
	public int normlamt;
	public int errcnt;
	public int erramt;

	public SS_L_VACT_STATCURBANKLISTRecord(){}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setTotcnt(int totcnt){
		this.totcnt = totcnt;
	}

	public void setTotamt(int totamt){
		this.totamt = totamt;
	}

	public void setNormlcnt(int normlcnt){
		this.normlcnt = normlcnt;
	}

	public void setNormlamt(int normlamt){
		this.normlamt = normlamt;
	}

	public void setErrcnt(int errcnt){
		this.errcnt = errcnt;
	}

	public void setErramt(int erramt){
		this.erramt = erramt;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public int getTotcnt(){
		return this.totcnt;
	}

	public int getTotamt(){
		return this.totamt;
	}

	public int getNormlcnt(){
		return this.normlcnt;
	}

	public int getNormlamt(){
		return this.normlamt;
	}

	public int getErrcnt(){
		return this.errcnt;
	}

	public int getErramt(){
		return this.erramt;
	}
}

/* �ۼ��ð� : Wed Sep 30 16:59:03 KST 2015 */