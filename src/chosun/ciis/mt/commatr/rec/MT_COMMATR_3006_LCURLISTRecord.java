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

import somo.framework.util.Util;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_3006_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String matr_nm;
	public String ewh_amt;
	public String aewh_amt;
	public String ewh_qunt;
	public String ewh_uprc;
	
	public MT_COMMATR_3006_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setAewh_amt(String aewh_amt){
		this.aewh_amt = aewh_amt;
	}
	
	public void setEwh_qunt(String ewh_qunt){
		this.ewh_qunt = ewh_qunt;
	}
	
	public void setEwh_uprc(String ewh_uprc){
		this.ewh_uprc = ewh_uprc;
	}
	
	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getAewh_amt(){
		return this.aewh_amt;
	}

	public String getEwh_qunt(){
		return this.ewh_qunt;
	}
	
	public String getEwh_uprc(){
		return this.ewh_uprc;
	}
	
}

/* 작성시간 : Sat Jul 11 13:38:11 KST 2009 */