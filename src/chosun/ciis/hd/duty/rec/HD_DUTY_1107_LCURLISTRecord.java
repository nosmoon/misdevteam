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


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_1107_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt;

	public HD_DUTY_1107_LCURLISTRecord(){}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* 작성시간 : Tue Jul 21 22:38:13 KST 2009 */