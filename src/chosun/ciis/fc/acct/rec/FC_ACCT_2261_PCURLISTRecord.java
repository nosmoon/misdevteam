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


public class FC_ACCT_2261_PCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_cd_2;

	public FC_ACCT_2261_PCURLISTRecord(){}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}
}

/* 작성시간 : Thu May 21 14:38:08 KST 2009 */