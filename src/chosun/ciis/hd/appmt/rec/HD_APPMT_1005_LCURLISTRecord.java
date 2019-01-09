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


package chosun.ciis.hd.appmt.rec;

import java.sql.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;

/**
 * 
 */


public class HD_APPMT_1005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt;

	public HD_APPMT_1005_LCURLISTRecord(){}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* 작성시간 : Sat Jun 06 13:31:52 KST 2009 */