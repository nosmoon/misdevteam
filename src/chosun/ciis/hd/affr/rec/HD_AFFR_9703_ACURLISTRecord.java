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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_9703_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String proc_no;

	public HD_AFFR_9703_ACURLISTRecord(){}

	public void setProc_no(String proc_no){
		this.proc_no = proc_no;
	}

	public String getProc_no(){
		return this.proc_no;
	}
}

/* 작성시간 : Tue Aug 11 15:15:05 KST 2009 */