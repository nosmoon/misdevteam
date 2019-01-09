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


public class FC_FUNC_1421_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String total_note_amt;

	public FC_FUNC_1421_LCURLIST1Record(){}

	public void setTotal_note_amt(String total_note_amt){
		this.total_note_amt = total_note_amt;
	}

	public String getTotal_note_amt(){
		return this.total_note_amt;
	}
}

/* 작성시간 : Thu Mar 05 15:44:06 KST 2009 */