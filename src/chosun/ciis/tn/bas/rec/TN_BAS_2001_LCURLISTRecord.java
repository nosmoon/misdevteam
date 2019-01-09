/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.rec;

import java.sql.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.ds.*;

/**
 * 
 */


public class TN_BAS_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String membercategorycode;
	public String parentmembercategorycode;
	public String membertype;
	public String membertype_nm;
	public String depth;
	public String membercategory;
	public String displayorder;
	public String description;
	public String useinsert_nm;
	public String useinsert;

	public TN_BAS_2001_LCURLISTRecord(){}

	public void setMembercategorycode(String membercategorycode){
		this.membercategorycode = membercategorycode;
	}

	public void setParentmembercategorycode(String parentmembercategorycode){
		this.parentmembercategorycode = parentmembercategorycode;
	}

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public void setMembertype_nm(String membertype_nm){
		this.membertype_nm = membertype_nm;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public void setMembercategory(String membercategory){
		this.membercategory = membercategory;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setUseinsert_nm(String useinsert_nm){
		this.useinsert_nm = useinsert_nm;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public String getMembercategorycode(){
		return this.membercategorycode;
	}

	public String getParentmembercategorycode(){
		return this.parentmembercategorycode;
	}

	public String getMembertype(){
		return this.membertype;
	}

	public String getMembertype_nm(){
		return this.membertype_nm;
	}

	public String getDepth(){
		return this.depth;
	}

	public String getMembercategory(){
		return this.membercategory;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}

	public String getDescription(){
		return this.description;
	}

	public String getUseinsert_nm(){
		return this.useinsert_nm;
	}

	public String getUseinsert(){
		return this.useinsert;
	}
}

/* 작성시간 : Thu Jul 07 18:53:57 KST 2016 */