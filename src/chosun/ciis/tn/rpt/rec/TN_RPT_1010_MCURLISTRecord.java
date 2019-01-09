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


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 
 */


public class TN_RPT_1010_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String organidx;
	public String deptidx;
	public String deptname;
	public String deptcategory;
	public String description;
	public String displayorder;

	public TN_RPT_1010_MCURLISTRecord(){}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setDeptname(String deptname){
		this.deptname = deptname;
	}

	public void setDeptcategory(String deptcategory){
		this.deptcategory = deptcategory;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public String getOrganidx(){
		return this.organidx;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getDeptname(){
		return this.deptname;
	}

	public String getDeptcategory(){
		return this.deptcategory;
	}

	public String getDescription(){
		return this.description;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}
}

/* 작성시간 : Tue Aug 23 10:19:23 KST 2016 */