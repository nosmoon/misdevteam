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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1090_MXX_BUDG_CD_100Record extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_abrv_nm;

	public FC_FUNC_1090_MXX_BUDG_CD_100Record(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_abrv_nm(String budg_abrv_nm){
		this.budg_abrv_nm = budg_abrv_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_abrv_nm(){
		return this.budg_abrv_nm;
	}
}

/* 작성시간 : Mon Jan 02 17:48:41 KST 2012 */