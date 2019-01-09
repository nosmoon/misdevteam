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


package chosun.ciis.co.cocd.rec;

import java.sql.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;

/**
 * 
 */


public class CO_COCD_1350_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String menu_id;
	public String menu_nm;

	public CO_COCD_1350_MCURLISTRecord(){}

	public void setMenu_id(String menu_id){
		this.menu_id = menu_id;
	}

	public void setMenu_nm(String menu_nm){
		this.menu_nm = menu_nm;
	}

	public String getMenu_id(){
		return this.menu_id;
	}

	public String getMenu_nm(){
		return this.menu_nm;
	}
}

/* 작성시간 : Mon Dec 26 20:36:51 KST 2011 */