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


public class MT_COMMATR_7010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_nm;
	public String ewh_qunt;
	public String ewh_uprc;
	public String ewh_amt;
	public String rest_amt;
	public String tot_amt;
	public String ern;
	public String dlco_cd;
	public String submatr_gbn;

	public MT_COMMATR_7010_LCURLISTRecord(){}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setEwh_qunt(String ewh_qunt){
		this.ewh_qunt = ewh_qunt;
	}

	public void setEwh_uprc(String ewh_uprc){
		this.ewh_uprc = ewh_uprc;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setRest_amt(String rest_amt){
		this.rest_amt = rest_amt;
	}
	
	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}
	
	public void setSubmatr_gbn(String submatr_gbn){
		this.submatr_gbn = submatr_gbn;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getEwh_qunt(){
		return this.ewh_qunt;
	}

	public String getEwh_uprc(){
		return this.ewh_uprc;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getRest_amt(){
		return this.rest_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSubmatr_gbn(){
		return this.submatr_gbn;
	}

}

/* 작성시간 : Tue Dec 18 16:24:50 KST 2012 */