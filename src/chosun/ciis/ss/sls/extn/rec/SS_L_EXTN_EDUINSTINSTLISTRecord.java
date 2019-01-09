/***************************************************************************************************
* 파일명 : .java
* 기능 : 에듀/제휴 확장 목록 조회  
* 작성일자 : 2009-05-28
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 에듀/제휴 확장 목록 조회  
 */

public class SS_L_EXTN_EDUINSTINSTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String type1;
	public String type2;
	public String insttnm;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String cntrbgndd;
	public String cntrto_dd;
	public int subsqty;
	public String ldgrnm;
	public String rdr_extndd;
	public int subsuprc;
	public int bns_itemuprc;
	public int comsuprc;
	public int totsubsamt;
	public int tot_bnsitem_amt;
	public int totcomsamt;
	public String remk;
	public String insttcd;
	public String dept_cd;
	public String part_cd;
	public String area_cd;
	public String bocd;

	public SS_L_EXTN_EDUINSTINSTLISTRecord(){}

	public void setType1(String type1){
		this.type1 = type1;
	}

	public void setType2(String type2){
		this.type2 = type2;
	}

	public void setInsttnm(String insttnm){
		this.insttnm = insttnm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setCntrbgndd(String cntrbgndd){
		this.cntrbgndd = cntrbgndd;
	}

	public void setCntrto_dd(String cntrto_dd){
		this.cntrto_dd = cntrto_dd;
	}

	public void setSubsqty(int subsqty){
		this.subsqty = subsqty;
	}

	public void setLdgrnm(String ldgrnm){
		this.ldgrnm = ldgrnm;
	}

	public void setRdr_extndd(String rdr_extndd){
		this.rdr_extndd = rdr_extndd;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setBns_itemuprc(int bns_itemuprc){
		this.bns_itemuprc = bns_itemuprc;
	}

	public void setComsuprc(int comsuprc){
		this.comsuprc = comsuprc;
	}

	public void setTotsubsamt(int totsubsamt){
		this.totsubsamt = totsubsamt;
	}

	public void setTot_bnsitem_amt(int tot_bnsitem_amt){
		this.tot_bnsitem_amt = tot_bnsitem_amt;
	}

	public void setTotcomsamt(int totcomsamt){
		this.totcomsamt = totcomsamt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setInsttcd(String insttcd){
		this.insttcd = insttcd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getType1(){
		return this.type1;
	}

	public String getType2(){
		return this.type2;
	}

	public String getInsttnm(){
		return this.insttnm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getCntrbgndd(){
		return this.cntrbgndd;
	}

	public String getCntrto_dd(){
		return this.cntrto_dd;
	}

	public int getSubsqty(){
		return this.subsqty;
	}

	public String getLdgrnm(){
		return this.ldgrnm;
	}

	public String getRdr_extndd(){
		return this.rdr_extndd;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}

	public int getBns_itemuprc(){
		return this.bns_itemuprc;
	}

	public int getComsuprc(){
		return this.comsuprc;
	}

	public int getTotsubsamt(){
		return this.totsubsamt;
	}

	public int getTot_bnsitem_amt(){
		return this.tot_bnsitem_amt;
	}

	public int getTotcomsamt(){
		return this.totcomsamt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getInsttcd(){
		return this.insttcd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getBocd(){
		return this.bocd;
	}
}

/* 작성시간 : Thu May 28 16:26:56 KST 2009 */