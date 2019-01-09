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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_1043_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_item_cd;
	public String mang_item_cdnm;

	public FC_ACCT_1043_LCURLISTRecord(){}

	public void setMang_item_cd(String mang_item_cd){
		this.mang_item_cd = mang_item_cd;
	}

	public void setMang_item_cdnm(String mang_item_cdnm){
		this.mang_item_cdnm = mang_item_cdnm;
	}

	public String getMang_item_cd(){
		return this.mang_item_cd;
	}

	public String getMang_item_cdnm(){
		return this.mang_item_cdnm;
	}
}

/* 작성시간 : Wed Apr 01 20:48:15 KST 2009 */