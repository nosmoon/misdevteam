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


public class MC_COST_2023_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_yn;
	public String workdate;

	public MC_COST_2023_LCURLISTRecord(){}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setWorkdate(String workdate){
		this.workdate = workdate;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getWorkdate(){
		return this.workdate;
	}
}

/* 작성시간 : Thu Jul 16 14:39:16 KST 2009 */