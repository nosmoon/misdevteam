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


public class FC_ACCT_2352_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String busn_dd_clsf_cd;

	public FC_ACCT_2352_LCURLISTRecord(){}

	public void setBusn_dd_clsf_cd(String busn_dd_clsf_cd){
		this.busn_dd_clsf_cd = busn_dd_clsf_cd;
	}

	public String getBusn_dd_clsf_cd(){
		return this.busn_dd_clsf_cd;
	}
}

/* 작성시간 : Thu Apr 16 16:12:43 KST 2009 */