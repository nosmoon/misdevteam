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


public class FC_ACCT_2121_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String rcpm_slip_no;

	public FC_ACCT_2121_LCURLIST1Record(){}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}
}

/* 작성시간 : Fri Dec 19 14:30:10 KST 2014 */