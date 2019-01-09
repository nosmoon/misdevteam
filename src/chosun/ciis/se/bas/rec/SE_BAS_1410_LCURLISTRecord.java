/***************************************************************************************************
* 파일명 : SE_BAS_1410_LCURLISTRecord.java
* 기능 :  판매 - 기준정보 - 담당자 등록 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_BAS_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String chrg_pers;
	public String flnm;
	public String clsf;
	public String dept_cd;
	public String use_yn;
	public String chrg_pers_key;
	
	public SE_BAS_1410_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getChrg_pers_key() {
		return chrg_pers_key;
	}

	public void setChrg_pers_key(String chrg_pers_key) {
		this.chrg_pers_key = chrg_pers_key;
	}

	public String getUse_yn() {
		return use_yn;
	}

	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
}

/* 작성시간 : Thu Jan 15 13:28:22 KST 2009 */