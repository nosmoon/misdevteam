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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_5213_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String posi_nm;
	public String flnm;
	public String dspch_prd;

	public HD_SRCH_5213_LCURLIST2Record(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDspch_prd(String dspch_prd){
		this.dspch_prd = dspch_prd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDspch_prd(){
		return this.dspch_prd;
	}
}

/* 작성시간 : Tue Sep 18 13:37:19 KST 2018 */