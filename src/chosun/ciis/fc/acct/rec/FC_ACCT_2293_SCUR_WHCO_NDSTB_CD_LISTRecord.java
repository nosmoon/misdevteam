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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2293_SCUR_WHCO_NDSTB_CD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String whco_ndstb_cd;
	public String whco_comn_cost_yn;

	public FC_ACCT_2293_SCUR_WHCO_NDSTB_CD_LISTRecord(){}

	public void setWhco_ndstb_cd(String whco_ndstb_cd){
		this.whco_ndstb_cd = whco_ndstb_cd;
	}

	public void setWhco_comn_cost_yn(String whco_comn_cost_yn){
		this.whco_comn_cost_yn = whco_comn_cost_yn;
	}

	public String getWhco_ndstb_cd(){
		return this.whco_ndstb_cd;
	}

	public String getWhco_comn_cost_yn(){
		return this.whco_comn_cost_yn;
	}
}

/* 작성시간 : Thu Apr 23 11:05:59 KST 2009 */