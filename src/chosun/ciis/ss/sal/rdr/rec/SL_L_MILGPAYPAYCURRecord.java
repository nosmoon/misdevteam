/***************************************************************************************************
* 파일명 : SL_L_MILGPAYPAYCURRecord.java
* 기능 : 독자정보관리(마일리지지급내역팝업-목록조회)
* 작성일자 : 2004-06-03
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 독자정보관리(마일리지지급내역팝업-목록조회)
 *
 */

public class SL_L_MILGPAYPAYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String milgpaydt;
	public String milgpayno;
	public String medinm;
	public String paybasinm;
	public int pont;
	public int hdqtallmamt;
	public int boallmamt;
	public String bonm;
	public String margamyn;
	public int rnum;

	public SL_L_MILGPAYPAYCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMilgpaydt(String milgpaydt){
		this.milgpaydt = milgpaydt;
	}

	public void setMilgpayno(String milgpayno){
		this.milgpayno = milgpayno;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setPaybasinm(String paybasinm){
		this.paybasinm = paybasinm;
	}

	public void setPont(int pont){
		this.pont = pont;
	}

	public void setHdqtallmamt(int hdqtallmamt){
		this.hdqtallmamt = hdqtallmamt;
	}

	public void setBoallmamt(int boallmamt){
		this.boallmamt = boallmamt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setMargamyn(String margamyn){
		this.margamyn = margamyn;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMilgpaydt(){
		return this.milgpaydt;
	}

	public String getMilgpayno(){
		return this.milgpayno;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getPaybasinm(){
		return this.paybasinm;
	}

	public int getPont(){
		return this.pont;
	}

	public int getHdqtallmamt(){
		return this.hdqtallmamt;
	}

	public int getBoallmamt(){
		return this.boallmamt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getMargamyn(){
		return this.margamyn;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Sun Jun 06 16:17:42 KST 2004 */