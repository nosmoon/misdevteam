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


public class PR_PRTEXEC_2002_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String same_yn;

	public PR_PRTEXEC_2002_LCURLIST_1Record(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSame_yn(String same_yn){
		this.same_yn = same_yn;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSame_yn(){
		return this.same_yn;
	}
}

/* �ۼ��ð� : Fri Jun 19 13:18:45 KST 2009 */