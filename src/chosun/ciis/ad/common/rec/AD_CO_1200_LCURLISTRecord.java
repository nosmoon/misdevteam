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


package chosun.ciis.ad.common.rec;

import java.sql.*;
import chosun.ciis.ad.common.dm.*;
import chosun.ciis.ad.common.ds.*;

/**
 * 
 */


public class AD_CO_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String ern;
	public String presi_nm;
	public String eps_clsf_cd;
	public String addr;
	public String chg_dt;
	public String del_yn;
	public String dlco_clsf;

	public AD_CO_1200_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setEps_clsf_cd(String eps_clsf_cd){
		this.eps_clsf_cd = eps_clsf_cd;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setDel_yn(String del_yn){
		this.del_yn = del_yn;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getEps_clsf_cd(){
		return this.eps_clsf_cd;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getDel_yn(){
		return this.del_yn;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}
}

/* 작성시간 : Mon Dec 10 11:30:37 KST 2012 */