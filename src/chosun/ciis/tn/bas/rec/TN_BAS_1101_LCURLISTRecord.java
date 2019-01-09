/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.rec;

import java.sql.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.ds.*;

/**
 * 
 */


public class TN_BAS_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptidx;
	public String organidx;
	public String deptname;
	public String deptcategory;
	public String deptcategory_nm;
	public String description;

	public TN_BAS_1101_LCURLISTRecord(){}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public void setDeptname(String deptname){
		this.deptname = deptname;
	}

	public void setDeptcategory(String deptcategory){
		this.deptcategory = deptcategory;
	}

	public void setDeptcategory_nm(String deptcategory_nm){
		this.deptcategory_nm = deptcategory_nm;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getOrganidx(){
		return this.organidx;
	}

	public String getDeptname(){
		return this.deptname;
	}

	public String getDeptcategory(){
		return this.deptcategory;
	}

	public String getDeptcategory_nm(){
		return this.deptcategory_nm;
	}

	public String getDescription(){
		return this.description;
	}
}

/* 작성시간 : Wed Jun 22 18:08:39 KST 2016 */