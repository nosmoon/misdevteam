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


public class PR_PRTCNSG_1401_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String cd;
	public String prt_fee;

	public PR_PRTCNSG_1401_LCURLIST1Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setPrt_fee(String prt_fee){
		this.prt_fee = prt_fee;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCd(){
		return this.cd;
	}

	public String getPrt_fee(){
		return this.prt_fee;
	}
}

/* �ۼ��ð� : Tue Jul 14 19:45:43 KST 2009 */