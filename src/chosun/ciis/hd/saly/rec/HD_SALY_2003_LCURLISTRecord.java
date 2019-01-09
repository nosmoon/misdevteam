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


public class HD_SALY_2003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aply_basi_dt;

	public HD_SALY_2003_LCURLISTRecord(){}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}
}

/* 작성시간 : Sun Aug 30 20:50:38 KST 2009 */