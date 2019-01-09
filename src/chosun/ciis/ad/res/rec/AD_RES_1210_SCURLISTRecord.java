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


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_1210_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bus_seq;
	public String bus_plc;
	public String bus_clsf;

	public AD_RES_1210_SCURLISTRecord(){}

	public void setBus_seq(String bus_seq){
		this.bus_seq = bus_seq;
	}

	public void setBus_plc(String bus_plc){
		this.bus_plc = bus_plc;
	}

	public void setBus_clsf(String bus_clsf){
		this.bus_clsf = bus_clsf;
	}

	public String getBus_seq(){
		return this.bus_seq;
	}

	public String getBus_plc(){
		return this.bus_plc;
	}

	public String getBus_clsf(){
		return this.bus_clsf;
	}
}

/* 작성시간 : Fri Jul 21 16:04:34 KST 2017 */