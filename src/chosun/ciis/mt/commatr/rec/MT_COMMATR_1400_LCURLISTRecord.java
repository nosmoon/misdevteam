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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_1400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String matr_cd;
	public String matr_nm;
	public String fac_clsf;
	public String safe_stok;
	public String dd_time_ordr_qunt;

	public MT_COMMATR_1400_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSafe_stok(String safe_stok){
		this.safe_stok = safe_stok;
	}

	public void setDd_time_ordr_qunt(String dd_time_ordr_qunt){
		this.dd_time_ordr_qunt = dd_time_ordr_qunt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSafe_stok(){
		return this.safe_stok;
	}

	public String getDd_time_ordr_qunt(){
		return this.dd_time_ordr_qunt;
	}
}

/* 작성시간 : Fri Jul 03 13:28:59 KST 2009 */