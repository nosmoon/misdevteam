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


package chosun.ciis.en.comm.rec;

import java.sql.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.ds.*;

/**
 * 
 */


public class EN_COMM_1005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;

	public EN_COMM_1005_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}
}

/* 작성시간 : Tue Apr 07 17:01:59 KST 2009 */