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


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 
 */


public class TN_RPT_1700_MFUND_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public TN_RPT_1700_MFUND_LISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* 작성시간 : Thu Dec 01 17:14:31 KST 2016 */