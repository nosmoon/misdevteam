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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_1005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt_yn;

	public HD_INFO_1005_LCURLISTRecord(){}

	public void setCnt_yn(String cnt_yn){
		this.cnt_yn = cnt_yn;
	}

	public String getCnt_yn(){
		return this.cnt_yn;
	}
}

/* 작성시간 : Wed Jun 03 18:01:15 KST 2009 */