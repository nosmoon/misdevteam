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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_3530_PCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String podr_slip_no;
	public String dlco_no;
	public String podr_amt;
	public String misu_amt;
	public String mms_misu_mat;
	public String slcrg_pers;
	public String mchrg_pers;

	public AD_PUB_3530_PCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setPodr_slip_no(String podr_slip_no){
		this.podr_slip_no = podr_slip_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setPodr_amt(String podr_amt){
		this.podr_amt = podr_amt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setMms_misu_mat(String mms_misu_mat){
		this.mms_misu_mat = mms_misu_mat;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getPodr_slip_no(){
		return this.podr_slip_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getPodr_amt(){
		return this.podr_amt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getMms_misu_mat(){
		return this.mms_misu_mat;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}
}

/* 작성시간 : Fri Nov 18 17:03:38 KST 2016 */