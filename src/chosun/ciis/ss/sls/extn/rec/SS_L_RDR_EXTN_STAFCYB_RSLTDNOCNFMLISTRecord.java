/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_STAFCYB_RSLTDNOCNFMLISTRecord.java
* 기능 : 확장현황-사이버확장-실적(요원별)-상세목록
* 작성일자 : 2004-04-08
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-사이버확장-실적(요원별)-상세목록
 *
 */

public class SS_L_RDR_EXTN_STAFCYB_RSLTDNOCNFMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcpersnm;
	public String rdr_extndt;
	public String bonm;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;

	public SS_L_RDR_EXTN_STAFCYB_RSLTDNOCNFMLISTRecord(){}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setTel_no11(String tel_no11){
		this.tel_no11 = tel_no11;
	}

	public void setTel_no12(String tel_no12){
		this.tel_no12 = tel_no12;
	}

	public void setTel_no13(String tel_no13){
		this.tel_no13 = tel_no13;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getTel_no11(){
		return this.tel_no11;
	}

	public String getTel_no12(){
		return this.tel_no12;
	}

	public String getTel_no13(){
		return this.tel_no13;
	}
}

/* 작성시간 : Thu Apr 08 17:25:44 KST 2004 */