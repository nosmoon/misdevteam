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


package chosun.ciis.hd.card.rec;

import java.sql.*;
import chosun.ciis.hd.card.dm.*;
import chosun.ciis.hd.card.ds.*;

/**
 * 
 */


public class HD_CARD_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String lvl;
	public String dept_cd;
	public String dept_nm;
	public String insd_dept_cd;

	public HD_CARD_1100_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}


	public void setLvl(String lvl){
		this.lvl = lvl;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setInsd_dept_cd(String insd_dept_cd){
		this.insd_dept_cd = insd_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLvl(){
		return this.lvl;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getInsd_dept_cd(){
		return this.insd_dept_cd;
	}
}

/* 작성시간 : Mon Jul 16 14:09:21 KST 2012 */