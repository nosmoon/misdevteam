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


package chosun.ciis.hd.job.rec;

import java.sql.*;
import chosun.ciis.hd.job.dm.*;
import chosun.ciis.hd.job.ds.*;

/**
 * 
 */


public class HD_JOB_1003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ov_frdt_tm;

	public HD_JOB_1003_LCURLISTRecord(){}

	public void setOv_frdt_tm(String ov_frdt_tm){
		this.ov_frdt_tm = ov_frdt_tm;
	}

	public String getOv_frdt_tm(){
		return this.ov_frdt_tm;
	}
}

/* 작성시간 : Wed Jul 01 15:07:27 KST 2009 */