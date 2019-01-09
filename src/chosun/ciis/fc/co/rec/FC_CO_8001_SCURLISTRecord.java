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


package chosun.ciis.fc.co.rec;

import java.sql.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

/**
 * 
 */


public class FC_CO_8001_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cdnm;

	public FC_CO_8001_SCURLISTRecord(){}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}
}

/* 작성시간 : Wed Mar 04 19:44:34 KST 2009 */