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


public class TN_BAS_4001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String receiptcodeidx;
	public String category;
	public String receiptcode;
	public String receiptcodetype;
	public String description;
	public String useinsert;

	public TN_BAS_4001_LCURLISTRecord(){}

	public void setReceiptcodeidx(String receiptcodeidx){
		this.receiptcodeidx = receiptcodeidx;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public void setReceiptcode(String receiptcode){
		this.receiptcode = receiptcode;
	}

	public void setReceiptcodetype(String receiptcodetype){
		this.receiptcodetype = receiptcodetype;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public String getReceiptcodeidx(){
		return this.receiptcodeidx;
	}

	public String getCategory(){
		return this.category;
	}

	public String getReceiptcode(){
		return this.receiptcode;
	}

	public String getReceiptcodetype(){
		return this.receiptcodetype;
	}

	public String getDescription(){
		return this.description;
	}

	public String getUseinsert(){
		return this.useinsert;
	}
}

/* 작성시간 : Thu Jun 30 14:08:53 KST 2016 */