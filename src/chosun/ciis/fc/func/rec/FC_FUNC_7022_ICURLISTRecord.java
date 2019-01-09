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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_7022_ICURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_no;

	public FC_FUNC_7022_ICURLISTRecord(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* 작성시간 : Thu Aug 27 18:04:29 KST 2009 */