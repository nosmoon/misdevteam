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


public class TN_BAS_2101_LCURLIST_2Record extends java.lang.Object implements java.io.Serializable{

	public String relationidx;
	public String relationtype;
	public String relationtype_nm;
	public String relation1;
	public String relation2;
	public String displayorder;

	public TN_BAS_2101_LCURLIST_2Record(){}

	public void setRelationidx(String relationidx){
		this.relationidx = relationidx;
	}

	public void setRelationtype(String relationtype){
		this.relationtype = relationtype;
	}

	public void setRelationtype_nm(String relationtype_nm){
		this.relationtype_nm = relationtype_nm;
	}

	public void setRelation1(String relation1){
		this.relation1 = relation1;
	}

	public void setRelation2(String relation2){
		this.relation2 = relation2;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public String getRelationidx(){
		return this.relationidx;
	}

	public String getRelationtype(){
		return this.relationtype;
	}

	public String getRelationtype_nm(){
		return this.relationtype_nm;
	}

	public String getRelation1(){
		return this.relation1;
	}

	public String getRelation2(){
		return this.relation2;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}
}

/* 작성시간 : Thu Jul 14 14:03:37 KST 2016 */