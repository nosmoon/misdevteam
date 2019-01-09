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


package chosun.ciis.as.com.rec;

import java.sql.*;
import chosun.ciis.as.com.dm.*;
import chosun.ciis.as.com.ds.*;

/**
 * 
 */


public class AS_COM_1800_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bund_nm;

	public AS_COM_1800_LCURLISTRecord(){}

	public void setBund_nm(String bund_nm){
		this.bund_nm = bund_nm;
	}

	public String getBund_nm(){
		return this.bund_nm;
	}
}

/* 작성시간 : Mon Mar 02 13:33:07 KST 2009 */