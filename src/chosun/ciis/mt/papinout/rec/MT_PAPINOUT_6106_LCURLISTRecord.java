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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_6106_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stmt_seq;

	public MT_PAPINOUT_6106_LCURLISTRecord(){}

	public void setStmt_seq(String stmt_seq){
		this.stmt_seq = stmt_seq;
	}

	public String getStmt_seq(){
		return this.stmt_seq;
	}
}

/* 작성시간 : Thu May 21 20:03:42 KST 2009 */