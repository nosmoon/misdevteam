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


public class HD_INFO_1004_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt;
	public String lvcmpy_dt;

	public HD_INFO_1004_SCURLISTRecord(){}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}
}

/* 작성시간 : Thu Jul 02 14:21:55 KST 2009 */