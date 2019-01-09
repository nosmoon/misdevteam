/***************************************************************************************************
* 파일명 : SS_L_MILGPAYCURCOMMLISTRecord.java
* 기능 : 지국경영-마일리지현황 상세
* 작성일자 : 2004-03-16
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-마일리지현황 상세
 *
 */

public class SS_L_MILGPAYCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String milgpaydt;
	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String medicdnm;
	public int pont;
	public String payclsfcd;
	public String payclsfcdnm;
	public String paybasicd;
	public String paybasinm;
	public int adjmexchrate;
	public int adjmamt;
	public int hdqtallmamt;
	public int boallmamt;

	public SS_L_MILGPAYCURCOMMLISTRecord(){}

	public void setMilgpaydt(String milgpaydt){
		this.milgpaydt = milgpaydt;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setPont(int pont){
		this.pont = pont;
	}

	public void setPayclsfcd(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public void setPayclsfcdnm(String payclsfcdnm){
		this.payclsfcdnm = payclsfcdnm;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public void setPaybasinm(String paybasinm){
		this.paybasinm = paybasinm;
	}

	public void setAdjmexchrate(int adjmexchrate){
		this.adjmexchrate = adjmexchrate;
	}

	public void setAdjmamt(int adjmamt){
		this.adjmamt = adjmamt;
	}

	public void setHdqtallmamt(int hdqtallmamt){
		this.hdqtallmamt = hdqtallmamt;
	}

	public void setBoallmamt(int boallmamt){
		this.boallmamt = boallmamt;
	}

	public String getMilgpaydt(){
		return this.milgpaydt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public int getPont(){
		return this.pont;
	}

	public String getPayclsfcd(){
		return this.payclsfcd;
	}

	public String getPayclsfcdnm(){
		return this.payclsfcdnm;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}

	public String getPaybasinm(){
		return this.paybasinm;
	}

	public int getAdjmexchrate(){
		return this.adjmexchrate;
	}

	public int getAdjmamt(){
		return this.adjmamt;
	}

	public int getHdqtallmamt(){
		return this.hdqtallmamt;
	}

	public int getBoallmamt(){
		return this.boallmamt;
	}
}

/* 작성시간 : Wed Mar 17 23:08:54 KST 2004 */