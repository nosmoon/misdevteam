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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_3101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String ordr_req_dd;
	public String dlco_cd;
	public String dlco_nm;
	public String matr_cd;
	public String matr_nm;
	public String unit;
	public String std_modl;
	public String ordr_req_qunt;
	public String matr_cnfm_qunt;
	public String matr_acpn_yn;

	public MT_SUBMATROUT_3101_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setOrdr_req_dd(String ordr_req_dd){
		this.ordr_req_dd = ordr_req_dd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setOrdr_req_qunt(String ordr_req_qunt){
		this.ordr_req_qunt = ordr_req_qunt;
	}

	public void setMatr_cnfm_qunt(String matr_cnfm_qunt){
		this.matr_cnfm_qunt = matr_cnfm_qunt;
	}

	public void setMatr_acpn_yn(String matr_acpn_yn){
		this.matr_acpn_yn = matr_acpn_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getOrdr_req_dd(){
		return this.ordr_req_dd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getOrdr_req_qunt(){
		return this.ordr_req_qunt;
	}

	public String getMatr_cnfm_qunt(){
		return this.matr_cnfm_qunt;
	}

	public String getMatr_acpn_yn(){
		return this.matr_acpn_yn;
	}
}

/* 작성시간 : Thu May 07 18:41:36 KST 2009 */