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


public class CO_JOB_2000_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String menu_id;
	public String menu_nm;
	public String supr_menu_id;
	public String menu_level;
	public String exec_url;

	public CO_JOB_2000_MCURLIST2Record(){}

	public void setMenu_id(String menu_id){
		this.menu_id = menu_id;
	}

	public void setMenu_nm(String menu_nm){
		this.menu_nm = menu_nm;
	}

	public void setSupr_menu_id(String supr_menu_id){
		this.supr_menu_id = supr_menu_id;
	}

	public void setMenu_level(String menu_level){
		this.menu_level = menu_level;
	}

	public void setExec_url(String exec_url){
		this.exec_url = exec_url;
	}

	public String getMenu_id(){
		return this.menu_id;
	}

	public String getMenu_nm(){
		return this.menu_nm;
	}

	public String getSupr_menu_id(){
		return this.supr_menu_id;
	}

	public String getMenu_level(){
		return this.menu_level;
	}

	public String getExec_url(){
		return this.exec_url;
	}
}

/* 작성시간 : Wed Jun 10 17:35:22 KST 2009 */