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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_5203_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String result;

	public HD_YADJM_5203_LCURLISTRecord(){}

	public void setResult(String result){
		this.result = result;
	}

	public String getResult(){
		return this.result;
	}
}

/* 작성시간 : Mon Jan 25 14:24:49 KST 2010 */