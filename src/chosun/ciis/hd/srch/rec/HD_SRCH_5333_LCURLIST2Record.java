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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_5333_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String clas_clsf1_02;
	public String clas_clsf2_02;
	public String pre_emp_cnt_02;
	public String pre_servcost_02;
	public String emp_cnt_02;
	public String servcost_02;
	public String remk_02;

	public HD_SRCH_5333_LCURLIST2Record(){}

	public void setClas_clsf1_02(String clas_clsf1_02){
		this.clas_clsf1_02 = clas_clsf1_02;
	}

	public void setClas_clsf2_02(String clas_clsf2_02){
		this.clas_clsf2_02 = clas_clsf2_02;
	}

	public void setPre_emp_cnt_02(String pre_emp_cnt_02){
		this.pre_emp_cnt_02 = pre_emp_cnt_02;
	}

	public void setPre_servcost_02(String pre_servcost_02){
		this.pre_servcost_02 = pre_servcost_02;
	}

	public void setEmp_cnt_02(String emp_cnt_02){
		this.emp_cnt_02 = emp_cnt_02;
	}

	public void setServcost_02(String servcost_02){
		this.servcost_02 = servcost_02;
	}

	public void setRemk_02(String remk_02){
		this.remk_02 = remk_02;
	}

	public String getClas_clsf1_02(){
		return this.clas_clsf1_02;
	}

	public String getClas_clsf2_02(){
		return this.clas_clsf2_02;
	}

	public String getPre_emp_cnt_02(){
		return this.pre_emp_cnt_02;
	}

	public String getPre_servcost_02(){
		return this.pre_servcost_02;
	}

	public String getEmp_cnt_02(){
		return this.emp_cnt_02;
	}

	public String getServcost_02(){
		return this.servcost_02;
	}

	public String getRemk_02(){
		return this.remk_02;
	}
}

/* 작성시간 : Mon Nov 26 15:01:54 KST 2018 */