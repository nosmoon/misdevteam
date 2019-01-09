/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_1004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String saly_pay_mm;
	public String sum_saly1;
	public String sum_alon1;
	public String dty_acty_fee1;
	public String sum_saly2;
	public String sum_alon2;
	public String dty_acty_fee2;

	public HD_LVCMPY_1004_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSaly_pay_mm(String saly_pay_mm){
		this.saly_pay_mm = saly_pay_mm;
	}

	public void setSum_saly1(String sum_saly1){
		this.sum_saly1 = sum_saly1;
	}

	public void setSum_alon1(String sum_alon1){
		this.sum_alon1 = sum_alon1;
	}

	public void setDty_acty_fee1(String dty_acty_fee1){
		this.dty_acty_fee1 = dty_acty_fee1;
	}

	public void setSum_saly2(String sum_saly2){
		this.sum_saly2 = sum_saly2;
	}

	public void setSum_alon2(String sum_alon2){
		this.sum_alon2 = sum_alon2;
	}

	public void setDty_acty_fee2(String dty_acty_fee2){
		this.dty_acty_fee2 = dty_acty_fee2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSaly_pay_mm(){
		return this.saly_pay_mm;
	}

	public String getSum_saly1(){
		return this.sum_saly1;
	}

	public String getSum_alon1(){
		return this.sum_alon1;
	}

	public String getDty_acty_fee1(){
		return this.dty_acty_fee1;
	}

	public String getSum_saly2(){
		return this.sum_saly2;
	}

	public String getSum_alon2(){
		return this.sum_alon2;
	}

	public String getDty_acty_fee2(){
		return this.dty_acty_fee2;
	}
}

/* 작성시간 : Thu Mar 30 17:18:23 KST 2017 */