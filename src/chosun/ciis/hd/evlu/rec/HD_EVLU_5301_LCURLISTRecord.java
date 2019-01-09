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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_5301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gbn;
	public String checked;
	public String dept_cd;
	public String dept_nm;
	public String insd_dept_cd;
	public String abrv_nm;

	public HD_EVLU_5301_LCURLISTRecord(){}

	public void setGbn(String gbn){
		this.gbn = gbn;
	}

	public void setChecked(String checked){
		this.checked = checked;
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

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public String getGbn(){
		return this.gbn;
	}

	public String getChecked(){
		return this.checked;
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

	public String getAbrv_nm(){
		return this.abrv_nm;
	}
}

/* 작성시간 : Wed Jun 03 15:03:47 KST 2009 */