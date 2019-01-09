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


package chosun.ciis.ad.evlu.rec;

import java.sql.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.ds.*;

/**
 * 
 */


public class AD_EVLU_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_yyyymmdd;
	public String yoil;
	public String scorecode;
	public String scor;
	public String remk;
	public String evlu_pers_emp_no;

	public AD_EVLU_2210_LCURLISTRecord(){}

	public void setPubc_yyyymmdd(String pubc_yyyymmdd){
		this.pubc_yyyymmdd = pubc_yyyymmdd;
	}

	public void setYoil(String yoil){
		this.yoil = yoil;
	}

	public void setScorecode(String scorecode){
		this.scorecode = scorecode;
	}

	public void setScor(String scor){
		this.scor = scor;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEvlu_pers_emp_no(String evlu_pers_emp_no){
		this.evlu_pers_emp_no = evlu_pers_emp_no;
	}

	public String getPubc_yyyymmdd(){
		return this.pubc_yyyymmdd;
	}

	public String getYoil(){
		return this.yoil;
	}

	public String getScorecode(){
		return this.scorecode;
	}

	public String getScor(){
		return this.scor;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEvlu_pers_emp_no(){
		return this.evlu_pers_emp_no;
	}
}

/* 작성시간 : Mon Mar 22 15:16:45 KST 2010 */