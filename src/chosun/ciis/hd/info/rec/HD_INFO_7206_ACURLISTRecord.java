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


public class HD_INFO_7206_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String actu_slip_no;

	public HD_INFO_7206_ACURLISTRecord(){}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}
}

/* 작성시간 : Thu Apr 25 11:39:21 KST 2013 */