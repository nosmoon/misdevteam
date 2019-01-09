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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_1041_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String offi_cdnm;
	public String dept_cd;
	public String offi_nm;

	public MC_COST_1041_MCURLISTRecord(){}

	public void setOffi_cdnm(String offi_cdnm){
		this.offi_cdnm = offi_cdnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public String getOffi_cdnm(){
		return this.offi_cdnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}
}

/* 작성시간 : Wed May 06 11:48:32 KST 2009 */