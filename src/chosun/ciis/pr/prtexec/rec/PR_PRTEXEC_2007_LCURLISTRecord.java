/***************************************************************************************************
* 파일명 : PR_PRTEXEC_2007_LCURLISTRecord.java
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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;

import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_2007_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_yy;
	public String seq;

	public PR_PRTEXEC_2007_LCURLISTRecord(){}

	public void setOccr_yy(String occr_yy){
		this.occr_yy = occr_yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getOccr_yy(){
		return this.occr_yy;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Sat Apr 18 14:25:28 KST 2009 */