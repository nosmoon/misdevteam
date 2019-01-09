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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_1620_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String scat_mm;
	public String indt_nm;
	public String ord_amt_01;
	public String purc_amt_01;
	public String prft_amt_01;
	public String prft_rate_01;
	public String ord_amt_02;
	public String purc_amt_02;
	public String prft_amt_02;
	public String prft_rate_02;
	public String t_no;

	public IS_AGR_1620_LCURLISTRecord(){}

	public void setScat_mm(String scat_mm){
		this.scat_mm = scat_mm;
	}

	public void setIndt_nm(String indt_nm){
		this.indt_nm = indt_nm;
	}

	public void setOrd_amt_01(String ord_amt_01){
		this.ord_amt_01 = ord_amt_01;
	}

	public void setPurc_amt_01(String purc_amt_01){
		this.purc_amt_01 = purc_amt_01;
	}

	public void setPrft_amt_01(String prft_amt_01){
		this.prft_amt_01 = prft_amt_01;
	}

	public void setPrft_rate_01(String prft_rate_01){
		this.prft_rate_01 = prft_rate_01;
	}

	public void setOrd_amt_02(String ord_amt_02){
		this.ord_amt_02 = ord_amt_02;
	}

	public void setPurc_amt_02(String purc_amt_02){
		this.purc_amt_02 = purc_amt_02;
	}

	public void setPrft_amt_02(String prft_amt_02){
		this.prft_amt_02 = prft_amt_02;
	}

	public void setPrft_rate_02(String prft_rate_02){
		this.prft_rate_02 = prft_rate_02;
	}

	public void setT_no(String t_no){
		this.t_no = t_no;
	}

	public String getScat_mm(){
		return this.scat_mm;
	}

	public String getIndt_nm(){
		return this.indt_nm;
	}

	public String getOrd_amt_01(){
		return this.ord_amt_01;
	}

	public String getPurc_amt_01(){
		return this.purc_amt_01;
	}

	public String getPrft_amt_01(){
		return this.prft_amt_01;
	}

	public String getPrft_rate_01(){
		return this.prft_rate_01;
	}

	public String getOrd_amt_02(){
		return this.ord_amt_02;
	}

	public String getPurc_amt_02(){
		return this.purc_amt_02;
	}

	public String getPrft_amt_02(){
		return this.prft_amt_02;
	}

	public String getPrft_rate_02(){
		return this.prft_rate_02;
	}

	public String getT_no(){
		return this.t_no;
	}
}

/* 작성시간 : Wed Jul 04 18:45:59 KST 2012 */