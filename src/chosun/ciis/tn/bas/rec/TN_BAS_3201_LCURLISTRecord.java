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


public class TN_BAS_3201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String paymethodcode;
	public String parentpaymethodcode;
	public String depth_nm;
	public String depth;
	public String paymethodtype;
	public String paymethodtype_nm;
	public String paymethod;
	public String canmodify;
	public String displayorder;
	public String useinsert;
	public String useinsert_nm;

	public TN_BAS_3201_LCURLISTRecord(){}

	public void setPaymethodcode(String paymethodcode){
		this.paymethodcode = paymethodcode;
	}

	public void setParentpaymethodcode(String parentpaymethodcode){
		this.parentpaymethodcode = parentpaymethodcode;
	}

	public void setDepth_nm(String depth_nm){
		this.depth_nm = depth_nm;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public void setPaymethodtype(String paymethodtype){
		this.paymethodtype = paymethodtype;
	}

	public void setPaymethodtype_nm(String paymethodtype_nm){
		this.paymethodtype_nm = paymethodtype_nm;
	}

	public void setPaymethod(String paymethod){
		this.paymethod = paymethod;
	}

	public void setCanmodify(String canmodify){
		this.canmodify = canmodify;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public void setUseinsert_nm(String useinsert_nm){
		this.useinsert_nm = useinsert_nm;
	}

	public String getPaymethodcode(){
		return this.paymethodcode;
	}

	public String getParentpaymethodcode(){
		return this.parentpaymethodcode;
	}

	public String getDepth_nm(){
		return this.depth_nm;
	}

	public String getDepth(){
		return this.depth;
	}

	public String getPaymethodtype(){
		return this.paymethodtype;
	}

	public String getPaymethodtype_nm(){
		return this.paymethodtype_nm;
	}

	public String getPaymethod(){
		return this.paymethod;
	}

	public String getCanmodify(){
		return this.canmodify;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}

	public String getUseinsert(){
		return this.useinsert;
	}

	public String getUseinsert_nm(){
		return this.useinsert_nm;
	}
}

/* 작성시간 : Thu Aug 18 15:50:50 KST 2016 */