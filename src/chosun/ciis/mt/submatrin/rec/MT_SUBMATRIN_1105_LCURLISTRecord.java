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


package chosun.ciis.mt.submatrin.rec;

import java.sql.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.ds.*;

/**
 * 
 */


public class MT_SUBMATRIN_1105_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String ewh_dt;
	public String ewh_uprc;

	public MT_SUBMATRIN_1105_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_uprc(String ewh_uprc){
		this.ewh_uprc = ewh_uprc;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_uprc(){
		return this.ewh_uprc;
	}
}

/* 작성시간 : Mon Apr 13 11:49:42 KST 2009 */