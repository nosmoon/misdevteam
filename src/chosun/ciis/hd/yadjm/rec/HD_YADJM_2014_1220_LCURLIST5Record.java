/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사급여-연말정산관리
* 작성일자 : 2014-12-30
* 작성자 : 이태식
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


public class HD_YADJM_2014_1220_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String befrduty_cnt;

	public HD_YADJM_2014_1220_LCURLIST5Record(){}

	public void setBefrduty_cnt(String befrduty_cnt){
		this.befrduty_cnt = befrduty_cnt;
	}

	public String getBefrduty_cnt(){
		return this.befrduty_cnt;
	}
}

/* 작성시간 : Sat Jan 03 16:18:47 KST 2015 */