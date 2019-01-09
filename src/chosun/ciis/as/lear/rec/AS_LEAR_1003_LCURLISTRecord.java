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


package chosun.ciis.as.lear.rec;

import java.sql.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.ds.*;

/**
 * 
 */


public class AS_LEAR_1003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cntr_no;

	public AS_LEAR_1003_LCURLISTRecord(){}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}
}

/* 작성시간 : Mon Jul 13 11:42:58 KST 2009 */