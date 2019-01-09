
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


package chosun.ciis.hd.dalon.rec;

import java.sql.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;

/**
 * 
 */


public class HD_DALON_1301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_basi_dt;
	public String seq;
	public String cnfr_fee_clsf;
	public String cnfr_fee_clsf_nm;
	public String pay_amt;
	public String remk;

	public HD_DALON_1301_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCnfr_fee_clsf(String cnfr_fee_clsf){
		this.cnfr_fee_clsf = cnfr_fee_clsf;
	}

	public void setCnfr_fee_clsf_nm(String cnfr_fee_clsf_nm){
		this.cnfr_fee_clsf_nm = cnfr_fee_clsf_nm;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCnfr_fee_clsf(){
		return this.cnfr_fee_clsf;
	}

	public String getCnfr_fee_clsf_nm(){
		return this.cnfr_fee_clsf_nm;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri May 22 10:31:05 KST 2009 */