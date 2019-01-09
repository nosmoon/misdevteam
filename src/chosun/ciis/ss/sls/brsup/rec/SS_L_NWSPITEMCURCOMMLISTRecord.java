/***************************************************************************************************
* 파일명 : SS_L_NWSPITEMCURCOMMLISTRecord.java
* 기능 : 지국지원-신문지원물품-등록-목록을 위한 Record
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-신문지원물품-등록-목록을 위한 Record
 */

public class SS_L_NWSPITEMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String itemcd;
	public String itemnm;
	public int qunt;
	public int uprc;
	public int divnuprc;
	public int insddivnuprc;
	public String rcpmchrgpersclsf;
	public String unit;
	public String clamchrgpersclsf;
	public String itemclsf;
	public String itemclsfnm;
	public String sendclsf;
	public String sendclsfnm;
	public String costclsf;
	public String costclsfnm;
	public String aplcfrdt;
	public String aplctodt;
	public String aplcclostm;
	public String remk;

	public SS_L_NWSPITEMCURCOMMLISTRecord(){}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setQunt(int qunt){
		this.qunt = qunt;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setDivnuprc(int divnuprc){
		this.divnuprc = divnuprc;
	}

	public void setInsddivnuprc(int insddivnuprc){
		this.insddivnuprc = insddivnuprc;
	}

	public void setRcpmchrgpersclsf(String rcpmchrgpersclsf){
		this.rcpmchrgpersclsf = rcpmchrgpersclsf;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setClamchrgpersclsf(String clamchrgpersclsf){
		this.clamchrgpersclsf = clamchrgpersclsf;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setItemclsfnm(String itemclsfnm){
		this.itemclsfnm = itemclsfnm;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setSendclsfnm(String sendclsfnm){
		this.sendclsfnm = sendclsfnm;
	}

	public void setCostclsf(String costclsf){
		this.costclsf = costclsf;
	}

	public void setCostclsfnm(String costclsfnm){
		this.costclsfnm = costclsfnm;
	}

	public void setAplcfrdt(String aplcfrdt){
		this.aplcfrdt = aplcfrdt;
	}

	public void setAplctodt(String aplctodt){
		this.aplctodt = aplctodt;
	}

	public void setAplcclostm(String aplcclostm){
		this.aplcclostm = aplcclostm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public int getQunt(){
		return this.qunt;
	}

	public int getUprc(){
		return this.uprc;
	}

	public int getDivnuprc(){
		return this.divnuprc;
	}

	public int getInsddivnuprc(){
		return this.insddivnuprc;
	}

	public String getRcpmchrgpersclsf(){
		return this.rcpmchrgpersclsf;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getClamchrgpersclsf(){
		return this.clamchrgpersclsf;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getItemclsfnm(){
		return this.itemclsfnm;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getSendclsfnm(){
		return this.sendclsfnm;
	}

	public String getCostclsf(){
		return this.costclsf;
	}

	public String getCostclsfnm(){
		return this.costclsfnm;
	}

	public String getAplcfrdt(){
		return this.aplcfrdt;
	}

	public String getAplctodt(){
		return this.aplctodt;
	}

	public String getAplcclostm(){
		return this.aplcclostm;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Jan 28 21:18:50 KST 2004 */