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


package chosun.ciis.co.mng.rec;

import java.sql.*;
import chosun.ciis.co.mng.dm.*;
import chosun.ciis.co.mng.ds.*;

/**
 * 
 */


public class CO_MNG_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd 		;
	public String menu_id	    ;
	public String exctl_catl    ;
	public String supr_menu_id  ;
	public String menu_levl     ;
	public String menu_seqo     ;
	public String menu_nm       ;
	public String exec_url      ;
	public String role_id       ;
	
	public String getAcct_cd() {
		return acct_cd;
	}
	public void setAcct_cd(String acct_cd) {
		this.acct_cd = acct_cd;
	}
	public String getExctl_catl() {
		return exctl_catl;
	}
	public void setExctl_catl(String exctl_catl) {
		this.exctl_catl = exctl_catl;
	}
	public String getExec_url() {
		return exec_url;
	}
	public void setExec_url(String exec_url) {
		this.exec_url = exec_url;
	}
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_levl() {
		return menu_levl;
	}
	public void setMenu_levl(String menu_levl) {
		this.menu_levl = menu_levl;
	}
	public String getMenu_nm() {
		return menu_nm;
	}
	public void setMenu_nm(String menu_nm) {
		this.menu_nm = menu_nm;
	}
	public String getMenu_seqo() {
		return menu_seqo;
	}
	public void setMenu_seqo(String menu_seqo) {
		this.menu_seqo = menu_seqo;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getSupr_menu_id() {
		return supr_menu_id;
	}
	public void setSupr_menu_id(String supr_menu_id) {
		this.supr_menu_id = supr_menu_id;
	}

	
}

/* 작성시간 : Mon Feb 02 12:10:07 KST 2009 */