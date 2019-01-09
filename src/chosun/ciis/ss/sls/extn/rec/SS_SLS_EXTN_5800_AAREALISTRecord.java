/***************************************************************************************************
* 占쏙옙占싹몌옙 : 
* 占쏙옙占� : 
* 占쌜쇽옙占쏙옙占쏙옙 : 2017-01-05
* 占쌜쇽옙占쏙옙 : 占쏙옙 占쏙옙 홍
***************************************************************************************************/
/***************************************************************************************************
* 占쏙옙占쏙옙占쏙옙占쏙옙 : 
* 占쏙옙占쏙옙占쏙옙 :  
* 占쏙옙占쏙옙占쏙옙占쏙옙 : 
* 占쏙옙占� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;
/**
 * 
 */

 
public class SS_SLS_EXTN_5800_AAREALISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;
	public String dept_cd;
	public String supr_dept_cd;

	public SS_SLS_EXTN_5800_AAREALISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}
}

/* �옉�꽦�떆媛� : Mon Feb 12 14:35:03 KST 2018 */