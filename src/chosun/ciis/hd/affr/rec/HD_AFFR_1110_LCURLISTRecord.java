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


public class HD_AFFR_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String cmpy_cnt;
	public String cmpy_use_cnt;
	public String cmpy_able_cnt;
	public String not_use;
	public String cmpy_cnt_next;
	public String cmpy_use_cnt_next;
	public String cmpy_able_cnt_next;
	public String not_use_next;

	public HD_AFFR_1110_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_cnt(String cmpy_cnt){
		this.cmpy_cnt = cmpy_cnt;
	}

	public void setCmpy_use_cnt(String cmpy_use_cnt){
		this.cmpy_use_cnt = cmpy_use_cnt;
	}

	public void setCmpy_able_cnt(String cmpy_able_cnt){
		this.cmpy_able_cnt = cmpy_able_cnt;
	}

	public void setNot_use(String not_use){
		this.not_use = not_use;
	}

	public void setCmpy_cnt_next(String cmpy_cnt_next){
		this.cmpy_cnt_next = cmpy_cnt_next;
	}

	public void setCmpy_use_cnt_next(String cmpy_use_cnt_next){
		this.cmpy_use_cnt_next = cmpy_use_cnt_next;
	}

	public void setCmpy_able_cnt_next(String cmpy_able_cnt_next){
		this.cmpy_able_cnt_next = cmpy_able_cnt_next;
	}

	public void setNot_use_next(String not_use_next){
		this.not_use_next = not_use_next;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_cnt(){
		return this.cmpy_cnt;
	}

	public String getCmpy_use_cnt(){
		return this.cmpy_use_cnt;
	}

	public String getCmpy_able_cnt(){
		return this.cmpy_able_cnt;
	}

	public String getNot_use(){
		return this.not_use;
	}

	public String getCmpy_cnt_next(){
		return this.cmpy_cnt_next;
	}

	public String getCmpy_use_cnt_next(){
		return this.cmpy_use_cnt_next;
	}

	public String getCmpy_able_cnt_next(){
		return this.cmpy_able_cnt_next;
	}

	public String getNot_use_next(){
		return this.not_use_next;
	}
}

/* 작성시간 : Wed Dec 23 14:47:14 KST 2009 */