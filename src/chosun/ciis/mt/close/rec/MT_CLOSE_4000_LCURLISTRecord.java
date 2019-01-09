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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_4000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dstb_rat_cd;
	public String dstb_rat_nm;
	public String basi;
	public String calc_styl;

	public MT_CLOSE_4000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setDstb_rat_nm(String dstb_rat_nm){
		this.dstb_rat_nm = dstb_rat_nm;
	}

	public void setBasi(String basi){
		this.basi = basi;
	}

	public void setCalc_styl(String calc_styl){
		this.calc_styl = calc_styl;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getDstb_rat_nm(){
		return this.dstb_rat_nm;
	}

	public String getBasi(){
		return this.basi;
	}

	public String getCalc_styl(){
		return this.calc_styl;
	}
}

/* 작성시간 : Thu May 07 10:35:17 KST 2009 */