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


public class HD_YADJM_2003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yadjm;

	public HD_YADJM_2003_LCURLISTRecord(){}

	public void setYadjm(String yadjm){
		this.yadjm = yadjm;
	}

	public String getYadjm(){
		return this.yadjm;
	}
}

/* 작성시간 : Mon Jun 08 17:20:10 KST 2009 */