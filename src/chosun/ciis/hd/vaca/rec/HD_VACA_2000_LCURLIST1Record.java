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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_2000_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String occr_vaca_dds;
	public String use_vaca_dds;
	public String duty_vaca_dds;
	public String rmn_vaca_dds;

	public HD_VACA_2000_LCURLIST1Record(){}

	public void setOccr_vaca_dds(String occr_vaca_dds){
		this.occr_vaca_dds = occr_vaca_dds;
	}

	public void setUse_vaca_dds(String use_vaca_dds){
		this.use_vaca_dds = use_vaca_dds;
	}

	public void setDuty_vaca_dds(String duty_vaca_dds){
		this.duty_vaca_dds = duty_vaca_dds;
	}

	public void setRmn_vaca_dds(String rmn_vaca_dds){
		this.rmn_vaca_dds = rmn_vaca_dds;
	}

	public String getOccr_vaca_dds(){
		return this.occr_vaca_dds;
	}

	public String getUse_vaca_dds(){
		return this.use_vaca_dds;
	}

	public String getDuty_vaca_dds(){
		return this.duty_vaca_dds;
	}

	public String getRmn_vaca_dds(){
		return this.rmn_vaca_dds;
	}
}

/* 작성시간 : Tue Oct 20 15:36:45 KST 2009 */