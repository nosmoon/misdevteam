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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_1011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt;

	public HD_LVCMPY_1011_LCURLISTRecord(){}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* 작성시간 : Thu Sep 03 22:38:11 KST 2009 */