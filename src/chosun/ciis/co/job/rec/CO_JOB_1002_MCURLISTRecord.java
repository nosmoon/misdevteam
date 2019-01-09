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


package chosun.ciis.co.job.rec;

import java.sql.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.ds.*;

/**
 * 
 */


public class CO_JOB_1002_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String empno;
	public String empnm;

	public CO_JOB_1002_MCURLISTRecord(){}

	public void setEmpno(String empno){
		this.empno = empno;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public String getEmpno(){
		return this.empno;
	}

	public String getEmpnm(){
		return this.empnm;
	}
}

/* 작성시간 : Thu Mar 15 17:02:49 KST 2012 */