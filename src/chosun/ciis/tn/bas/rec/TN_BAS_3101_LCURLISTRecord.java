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


public class TN_BAS_3101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String supportidx;
	public String topsupportidx;
	public String parentsupportidx;
	public String depth;
	public String depth_nm;
	public String support;
	public String supportcode;
	public String displayorder;
	public String memo;
	public String useinsert;
	public String useinsert_nm;

	public TN_BAS_3101_LCURLISTRecord(){}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setTopsupportidx(String topsupportidx){
		this.topsupportidx = topsupportidx;
	}

	public void setParentsupportidx(String parentsupportidx){
		this.parentsupportidx = parentsupportidx;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public void setDepth_nm(String depth_nm){
		this.depth_nm = depth_nm;
	}

	public void setSupport(String support){
		this.support = support;
	}

	public void setSupportcode(String supportcode){
		this.supportcode = supportcode;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public void setUseinsert_nm(String useinsert_nm){
		this.useinsert_nm = useinsert_nm;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getTopsupportidx(){
		return this.topsupportidx;
	}

	public String getParentsupportidx(){
		return this.parentsupportidx;
	}

	public String getDepth(){
		return this.depth;
	}

	public String getDepth_nm(){
		return this.depth_nm;
	}

	public String getSupport(){
		return this.support;
	}

	public String getSupportcode(){
		return this.supportcode;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getUseinsert(){
		return this.useinsert;
	}

	public String getUseinsert_nm(){
		return this.useinsert_nm;
	}
}

/* 작성시간 : Thu Aug 18 19:27:56 KST 2016 */