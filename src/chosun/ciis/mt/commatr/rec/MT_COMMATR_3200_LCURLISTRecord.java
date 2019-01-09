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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_3200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_no;
	public String seq;
	public String yy;
	public String sale_amt;
	public String busn_prft;
	public String busn_prft_rate;
	public String thterm_net_prft;

	public MT_COMMATR_3200_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setBusn_prft(String busn_prft){
		this.busn_prft = busn_prft;
	}

	public void setBusn_prft_rate(String busn_prft_rate){
		this.busn_prft_rate = busn_prft_rate;
	}

	public void setThterm_net_prft(String thterm_net_prft){
		this.thterm_net_prft = thterm_net_prft;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getBusn_prft(){
		return this.busn_prft;
	}

	public String getBusn_prft_rate(){
		return this.busn_prft_rate;
	}

	public String getThterm_net_prft(){
		return this.thterm_net_prft;
	}
}

/* 작성시간 : Mon Jul 13 09:53:20 KST 2009 */