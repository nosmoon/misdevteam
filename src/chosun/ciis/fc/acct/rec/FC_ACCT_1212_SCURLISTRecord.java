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


public class FC_ACCT_1212_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_clsf_nm;

	public FC_ACCT_1212_SCURLISTRecord(){}

	public void setSlip_clsf_nm(String slip_clsf_nm){
		this.slip_clsf_nm = slip_clsf_nm;
	}

	public String getSlip_clsf_nm(){
		return this.slip_clsf_nm;
	}
}

/* 작성시간 : Mon Mar 02 17:29:37 KST 2009 */