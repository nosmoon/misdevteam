/***************************************************************************************************
* 파일명 : SS_L_VSCOST_COSTCURCOMMLISTRecord.java
* 기능 : 독자현황-VacationStop-비용-목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황-VacationStop-비용-목록을 위한 Record
 */

public class SS_L_VSCOST_COSTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String basidt;
	public int dlvqty;
	public int amt;
	public String costprocdt;
	public String vaca_arearegncd;
	public String vaca_arearegnnm;
	public String vaca_areacd;
	public String vaca_areanm;
	public String frdt;
	public String todt;
	public String bonm;
	public String deptnm;
	public String areanm;
	public int costbasiamt;

	public SS_L_VSCOST_COSTCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setCostprocdt(String costprocdt){
		this.costprocdt = costprocdt;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_arearegnnm(String vaca_arearegnnm){
		this.vaca_arearegnnm = vaca_arearegnnm;
	}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_areanm(String vaca_areanm){
		this.vaca_areanm = vaca_areanm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setCostbasiamt(int costbasiamt){
		this.costbasiamt = costbasiamt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public int getDlvqty(){
		return this.dlvqty;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getCostprocdt(){
		return this.costprocdt;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_arearegnnm(){
		return this.vaca_arearegnnm;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_areanm(){
		return this.vaca_areanm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public int getCostbasiamt(){
		return this.costbasiamt;
	}
}

/* 작성시간 : Wed May 26 19:34:12 KST 2004 */