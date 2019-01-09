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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_2600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String full_seq;
	public String chk_seq;
	public String temp_seq;
	public String stdy_seq;

	public HD_AFFR_2600_LCURLISTRecord(){}

	public void setFull_seq(String full_seq){
		this.full_seq = full_seq;
	}

	public void setChk_seq(String chk_seq){
		this.chk_seq = chk_seq;
	}

	public void setTemp_seq(String temp_seq){
		this.temp_seq = temp_seq;
	}

	public void setStdy_seq(String stdy_seq){
		this.stdy_seq = stdy_seq;
	}

	public String getFull_seq(){
		return this.full_seq;
	}

	public String getChk_seq(){
		return this.chk_seq;
	}

	public String getTemp_seq(){
		return this.temp_seq;
	}

	public String getStdy_seq(){
		return this.stdy_seq;
	}
}

/* 작성시간 : Thu Apr 02 08:52:56 KST 2009 */