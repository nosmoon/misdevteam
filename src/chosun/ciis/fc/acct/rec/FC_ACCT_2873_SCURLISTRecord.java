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


public class FC_ACCT_2873_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_shet_kind_nm;

	public FC_ACCT_2873_SCURLISTRecord(){}

	public void setRcpm_shet_kind_nm(String rcpm_shet_kind_nm){
		this.rcpm_shet_kind_nm = rcpm_shet_kind_nm;
	}

	public String getRcpm_shet_kind_nm(){
		return this.rcpm_shet_kind_nm;
	}
}

/* 작성시간 : Mon Aug 03 17:11:07 KST 2009 */