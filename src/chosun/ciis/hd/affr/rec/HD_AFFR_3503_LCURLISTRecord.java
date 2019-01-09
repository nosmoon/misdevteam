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


public class HD_AFFR_3503_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_type;
	public String emp_cnt;

	public HD_AFFR_3503_LCURLISTRecord(){}

	public void setSel_type(String sel_type){
		this.sel_type = sel_type;
	}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
	}

	public String getSel_type(){
		return this.sel_type;
	}

	public String getEmp_cnt(){
		return this.emp_cnt;
	}
}

/* 작성시간 : Mon Nov 02 21:31:50 KST 2009 */