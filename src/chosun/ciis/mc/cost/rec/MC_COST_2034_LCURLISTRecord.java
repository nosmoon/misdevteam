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


public class MC_COST_2034_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_yn;
	public String clos_mm;

	public MC_COST_2034_LCURLISTRecord(){}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_mm(String clos_mm){
		this.clos_mm = clos_mm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_mm(){
		return this.clos_mm;
	}
}

/* 작성시간 : Mon May 11 18:44:41 KST 2009 */