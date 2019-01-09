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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_2127_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tms;
	public String clos_yn;
	public String fix_yn;
	public String to_char_incmg_dt_tm;

	public MC_BUDG_2127_LCURLISTRecord(){}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public void setTo_char_incmg_dt_tm(String to_char_incmg_dt_tm){
		this.to_char_incmg_dt_tm = to_char_incmg_dt_tm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getTo_char_incmg_dt_tm(){
		return this.to_char_incmg_dt_tm;
	}
}

/* 작성시간 : Wed May 27 14:40:43 KST 2009 */