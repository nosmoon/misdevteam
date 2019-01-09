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


package chosun.ciis.en.comm.rec;

import java.sql.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.ds.*;

/**
 * 
 */


public class EN_COMM_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_code;
	public String evnt_nm;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;

	public EN_COMM_1100_LCURLISTRecord(){}

	public void setEvnt_code(String evnt_code){
		this.evnt_code = evnt_code;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public String getEvnt_code(){
		return this.evnt_code;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}
}

/* 작성시간 : Mon Apr 06 11:43:12 KST 2009 */