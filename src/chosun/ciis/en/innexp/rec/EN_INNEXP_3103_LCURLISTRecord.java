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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_3103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String type_cd;
	public String type_nm;
	public String evnt_yy;
	public String amt;

	public EN_INNEXP_3103_LCURLISTRecord(){}

	public void setType_cd(String type_cd){
		this.type_cd = type_cd;
	}

	public void setType_nm(String type_nm){
		this.type_nm = type_nm;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getType_cd(){
		return this.type_cd;
	}

	public String getType_nm(){
		return this.type_nm;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Thu Apr 30 17:52:37 KST 2009 */