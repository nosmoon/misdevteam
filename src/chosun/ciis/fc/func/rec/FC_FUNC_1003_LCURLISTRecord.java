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


public class FC_FUNC_1003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_frdt;
	public String pubc_todt;
	public String slcrg_pers;
	public String slcrg_pers_nm;

	public FC_FUNC_1003_LCURLISTRecord(){}

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}
}

/* 작성시간 : Wed Mar 11 17:32:41 KST 2009 */