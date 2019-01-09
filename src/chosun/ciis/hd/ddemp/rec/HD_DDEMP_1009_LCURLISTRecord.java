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


package chosun.ciis.hd.ddemp.rec;

import java.sql.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;

/**
 * 
 */


public class HD_DDEMP_1009_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_cd_1;

	public HD_DDEMP_1009_LCURLISTRecord(){}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}
}

/* 작성시간 : Mon Aug 10 10:43:19 KST 2009 */