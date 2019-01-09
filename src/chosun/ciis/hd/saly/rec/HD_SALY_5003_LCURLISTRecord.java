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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_5003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mng_salyprt_yn;

	public HD_SALY_5003_LCURLISTRecord(){}

	public void setMng_salyprt_yn(String mng_salyprt_yn){
		this.mng_salyprt_yn = mng_salyprt_yn;
	}

	public String getMng_salyprt_yn(){
		return this.mng_salyprt_yn;
	}
}

/* 작성시간 : Mon Aug 31 21:17:54 KST 2009 */