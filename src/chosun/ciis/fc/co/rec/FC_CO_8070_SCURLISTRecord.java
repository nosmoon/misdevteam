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


package chosun.ciis.fc.co.rec;

import java.sql.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

/**
 * 
 */


public class FC_CO_8070_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ern;

	public FC_CO_8070_SCURLISTRecord(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public String getErn(){
		return this.ern;
	}
}

/* 작성시간 : Thu Sep 17 15:15:49 KST 2009 */