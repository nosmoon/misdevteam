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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String emp_no;
	public String saly_yy;
	public String saly_no;
	public String slf_burd_amt;
	public String cmpy_burd_amt;
	public String lvcmpy_swit_amt;
	public String sum;

	public HD_INSR_1000_LCURLIST2Record(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setSlf_burd_amt(String slf_burd_amt){
		this.slf_burd_amt = slf_burd_amt;
	}

	public void setCmpy_burd_amt(String cmpy_burd_amt){
		this.cmpy_burd_amt = cmpy_burd_amt;
	}

	public void setLvcmpy_swit_amt(String lvcmpy_swit_amt){
		this.lvcmpy_swit_amt = lvcmpy_swit_amt;
	}

	public void setSum(String sum){
		this.sum = sum;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getSlf_burd_amt(){
		return this.slf_burd_amt;
	}

	public String getCmpy_burd_amt(){
		return this.cmpy_burd_amt;
	}

	public String getLvcmpy_swit_amt(){
		return this.lvcmpy_swit_amt;
	}

	public String getSum(){
		return this.sum;
	}
}

/* 작성시간 : Thu Aug 20 20:54:39 KST 2009 */