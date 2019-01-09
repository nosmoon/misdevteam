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


public class TN_BAS_3001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fundidx;
	public String topfundidx;
	public String parentfundidx;
	public String depth;
	public String fund;
	public String fundcode;
	public String displayorder;
	public String memo;
	public String supportidx;
	public String supportidx_nm;
	public String personreceiptcode;
	public String personreceiptcode_nm;
	public String companyreceiptcode;
	public String companyreceiptcode_nm;
	public String useinsert;
	public String useinsert_nm;

	public TN_BAS_3001_LCURLISTRecord(){}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setTopfundidx(String topfundidx){
		this.topfundidx = topfundidx;
	}

	public void setParentfundidx(String parentfundidx){
		this.parentfundidx = parentfundidx;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public void setFund(String fund){
		this.fund = fund;
	}

	public void setFundcode(String fundcode){
		this.fundcode = fundcode;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setSupportidx_nm(String supportidx_nm){
		this.supportidx_nm = supportidx_nm;
	}

	public void setPersonreceiptcode(String personreceiptcode){
		this.personreceiptcode = personreceiptcode;
	}

	public void setPersonreceiptcode_nm(String personreceiptcode_nm){
		this.personreceiptcode_nm = personreceiptcode_nm;
	}

	public void setCompanyreceiptcode(String companyreceiptcode){
		this.companyreceiptcode = companyreceiptcode;
	}

	public void setCompanyreceiptcode_nm(String companyreceiptcode_nm){
		this.companyreceiptcode_nm = companyreceiptcode_nm;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public void setUseinsert_nm(String useinsert_nm){
		this.useinsert_nm = useinsert_nm;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getTopfundidx(){
		return this.topfundidx;
	}

	public String getParentfundidx(){
		return this.parentfundidx;
	}

	public String getDepth(){
		return this.depth;
	}

	public String getFund(){
		return this.fund;
	}

	public String getFundcode(){
		return this.fundcode;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getSupportidx_nm(){
		return this.supportidx_nm;
	}

	public String getPersonreceiptcode(){
		return this.personreceiptcode;
	}

	public String getPersonreceiptcode_nm(){
		return this.personreceiptcode_nm;
	}

	public String getCompanyreceiptcode(){
		return this.companyreceiptcode;
	}

	public String getCompanyreceiptcode_nm(){
		return this.companyreceiptcode_nm;
	}

	public String getUseinsert(){
		return this.useinsert;
	}

	public String getUseinsert_nm(){
		return this.useinsert_nm;
	}
}

/* 작성시간 : Mon Jul 25 16:55:22 KST 2016 */