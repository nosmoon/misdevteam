/***************************************************************************************************
* 파일명   : PS_S_PRINT_INIT.java
* 기능     : 출력 - 초기 화면
* 작성일자 : 2006-02-01
* 작성자   : 전현표 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :   
* 백업     :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.print.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.ds.*;

/**
 * 출력 - 초기 화면
 *
 */

public class PS_S_PRINT_INITMEDISERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String mediser_no;
	public String mediser_view;

	public PS_S_PRINT_INITMEDISERCURRecord(){}

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

/* 작성시간 : Wed May 06 11:07:41 KST 2009 */