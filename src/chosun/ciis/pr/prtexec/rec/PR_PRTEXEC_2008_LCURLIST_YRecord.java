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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_2008_LCURLIST_YRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String occr_yy;
	public String seq;

	public PR_PRTEXEC_2008_LCURLIST_YRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setOccr_yy(String occr_yy){
		this.occr_yy = occr_yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getOccr_yy(){
		return this.occr_yy;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* �ۼ��ð� : Tue Apr 28 14:35:08 KST 2009 */