
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


public class HD_DALON_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_basi_dt;
	public String seq;
	public String posi_clsf;
	public String prsnt_tm_aft;
	public String prsnt_tm_prv;
	public String finish_tm_aft;
	public String finish_tm_prv;
	public String pay_amt;

	public HD_DALON_1100_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPosi_clsf(String posi_clsf){
		this.posi_clsf = posi_clsf;
	}

	public void setPrsnt_tm_aft(String prsnt_tm_aft){
		this.prsnt_tm_aft = prsnt_tm_aft;
	}

	public void setPrsnt_tm_prv(String prsnt_tm_prv){
		this.prsnt_tm_prv = prsnt_tm_prv;
	}

	public void setFinish_tm_aft(String finish_tm_aft){
		this.finish_tm_aft = finish_tm_aft;
	}

	public void setFinish_tm_prv(String finish_tm_prv){
		this.finish_tm_prv = finish_tm_prv;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
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

	public String getPosi_clsf(){
		return this.posi_clsf;
	}

	public String getPrsnt_tm_aft(){
		return this.prsnt_tm_aft;
	}

	public String getPrsnt_tm_prv(){
		return this.prsnt_tm_prv;
	}

	public String getFinish_tm_aft(){
		return this.finish_tm_aft;
	}

	public String getFinish_tm_prv(){
		return this.finish_tm_prv;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}
}

/* 작성시간 : Thu May 21 20:18:58 KST 2009 */