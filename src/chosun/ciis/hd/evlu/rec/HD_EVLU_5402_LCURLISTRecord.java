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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_5402_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String evlu_subj_cd;
	public String evlu_item_cd;
	public String evlu_clon_cd;
	public String evlu_item_cd_nm;
	public String viewpoint;

	public HD_EVLU_5402_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setEvlu_subj_cd(String evlu_subj_cd){
		this.evlu_subj_cd = evlu_subj_cd;
	}

	public void setEvlu_item_cd(String evlu_item_cd){
		this.evlu_item_cd = evlu_item_cd;
	}

	public void setEvlu_clon_cd(String evlu_clon_cd){
		this.evlu_clon_cd = evlu_clon_cd;
	}

	public void setEvlu_item_cd_nm(String evlu_item_cd_nm){
		this.evlu_item_cd_nm = evlu_item_cd_nm;
	}

	public void setViewpoint(String viewpoint){
		this.viewpoint = viewpoint;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getEvlu_subj_cd(){
		return this.evlu_subj_cd;
	}

	public String getEvlu_item_cd(){
		return this.evlu_item_cd;
	}

	public String getEvlu_clon_cd(){
		return this.evlu_clon_cd;
	}

	public String getEvlu_item_cd_nm(){
		return this.evlu_item_cd_nm;
	}

	public String getViewpoint(){
		return this.viewpoint;
	}
}

/* 작성시간 : Thu Jun 04 09:40:28 KST 2009 */