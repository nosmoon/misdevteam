/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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

/* 작성시간 : Tue Jul 14 19:45:43 KST 2009 */