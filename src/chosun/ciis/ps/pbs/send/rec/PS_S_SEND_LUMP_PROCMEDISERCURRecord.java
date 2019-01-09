/***************************************************************************************************
* 파일명 : PS_S_SEND_LUMP_PROC.java
* 기능   : 출판국 발송 관련 기초 코드
* 작성일자 : 2006-04-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/



package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 출판국 -발송 기초 코드
 *
 */

public class PS_S_SEND_LUMP_PROCMEDISERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String mediser_no;
	public String mediser_view;

	public PS_S_SEND_LUMP_PROCMEDISERCURRecord(){}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setMediser_view(String mediser_view){
		this.mediser_view = mediser_view;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getMediser_view(){
		return this.mediser_view;
	}
}

/* 작성시간 : Fri Oct 27 17:45:56 KST 2006 */