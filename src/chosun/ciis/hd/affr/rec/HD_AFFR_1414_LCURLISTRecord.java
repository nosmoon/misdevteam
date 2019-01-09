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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_1414_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String obcl_child_sply_amt;

	public HD_AFFR_1414_LCURLISTRecord(){}

	public void setObcl_child_sply_amt(String obcl_child_sply_amt){
		this.obcl_child_sply_amt = obcl_child_sply_amt;
	}

	public String getObcl_child_sply_amt(){
		return this.obcl_child_sply_amt;
	}
}

/* 작성시간 : Fri Apr 03 11:21:18 KST 2009 */