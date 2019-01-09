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


public class HD_SRCH_3000_LSENDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aprv_in_cmpy;
	public String emp;

	public HD_SRCH_3000_LSENDLISTRecord(){}

	public void setAprv_in_cmpy(String aprv_in_cmpy){
		this.aprv_in_cmpy = aprv_in_cmpy;
	}

	public void setEmp(String emp){
		this.emp = emp;
	}

	public String getAprv_in_cmpy(){
		return this.aprv_in_cmpy;
	}

	public String getEmp(){
		return this.emp;
	}
}

/* 작성시간 : Mon Feb 24 11:00:33 KST 2014 */