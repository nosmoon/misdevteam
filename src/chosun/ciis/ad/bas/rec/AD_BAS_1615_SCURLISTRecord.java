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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1615_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String make_dt;
	public String dlco_no;
	public String dlco_nm;
	public String diary_titl;
	public String make_pers_nm;
	public String diary_cont;

	public AD_BAS_1615_SCURLISTRecord(){}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDiary_titl(String diary_titl){
		this.diary_titl = diary_titl;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public void setDiary_cont(String diary_cont){
		this.diary_cont = diary_cont;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDiary_titl(){
		return this.diary_titl;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}

	public String getDiary_cont(){
		return this.diary_cont;
	}
}

/* 작성시간 : Wed Aug 26 19:54:01 KST 2009 */