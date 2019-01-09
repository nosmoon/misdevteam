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


package chosun.ciis.as.redm.rec;

import java.sql.*;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.ds.*;

/**
 * 
 */


public class AS_REDM_1004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_no;
	public String slip_aprv_yn;

	public AS_REDM_1004_LCURLISTRecord(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}
}

/* 작성시간 : Mon May 25 17:53:43 KST 2009 */