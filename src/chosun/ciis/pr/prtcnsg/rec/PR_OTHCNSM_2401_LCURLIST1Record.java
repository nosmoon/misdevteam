/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_OTHCNSM_2401_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String sect_cd;
	public String tt;
	public String amt;

	public PR_OTHCNSM_2401_LCURLIST1Record(){}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setTt(String tt){
		this.tt = tt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getTt(){
		return this.tt;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* �ۼ��ð� : Wed Oct 28 11:07:25 KST 2009 */