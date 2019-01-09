/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-상세조회화면
* 작성일자 :009/05/04
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 통합정보지원시스템-판촉물재고현황-상세조회화면
 */

public class SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpycd;
	public String itemcd;
	public String bns_itemcd;
	public String itemnm;
	public String bonm;
	public String inoutdt;
	public String aftdivnclsf;
	public String aftdivnclsfnm;
	public String unit;
	public int uprc;
	public double qunt;
	public String team;
	public String part;
	public String area;
	public String bo;
	public double no_valqunt;
	public double valqunt;
	public String mainware;
	public String pyungware;
	public String sungware;
	public String remk;
	public int seq;

	public SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord(){}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setInoutdt(String inoutdt){
		this.inoutdt = inoutdt;
	}

	public void setAftdivnclsf(String aftdivnclsf){
		this.aftdivnclsf = aftdivnclsf;
	}

	public void setAftdivnclsfnm(String aftdivnclsfnm){
		this.aftdivnclsfnm = aftdivnclsfnm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setQunt(double qunt){
		this.qunt = qunt;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setPart(String part){
		this.part = part;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setBo(String bo){
		this.bo = bo;
	}

	public void setNo_valqunt(double no_valqunt){
		this.no_valqunt = no_valqunt;
	}

	public void setValqunt(double valqunt){
		this.valqunt = valqunt;
	}

	public void setMainware(String mainware){
		this.mainware = mainware;
	}

	public void setPyungware(String pyungware){
		this.pyungware = pyungware;
	}

	public void setSungware(String sungware){
		this.sungware = sungware;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getInoutdt(){
		return this.inoutdt;
	}

	public String getAftdivnclsf(){
		return this.aftdivnclsf;
	}

	public String getAftdivnclsfnm(){
		return this.aftdivnclsfnm;
	}

	public String getUnit(){
		return this.unit;
	}

	public int getUprc(){
		return this.uprc;
	}

	public double getQunt(){
		return this.qunt;
	}

	public String getTeam(){
		return this.team;
	}

	public String getPart(){
		return this.part;
	}

	public String getArea(){
		return this.area;
	}

	public String getBo(){
		return this.bo;
	}

	public double getNo_valqunt(){
		return this.no_valqunt;
	}

	public double getValqunt(){
		return this.valqunt;
	}

	public String getMainware(){
		return this.mainware;
	}

	public String getPyungware(){
		return this.pyungware;
	}

	public String getSungware(){
		return this.sungware;
	}

	public String getRemk(){
		return this.remk;
	}

	public int getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Thu Jul 02 10:50:55 PDT 2009 */