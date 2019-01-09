/***************************************************************************************************
* 파일명 : SS_L_INSRCOST_SPLYCURCOMMLISTRecord.java
* 기능 : 지국지원-상해보험-비용(지원담당)-목록을 위한 Record
* 작성일자 : 2004-02-20
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
 * 지국지원-상해보험-비용(지원담당)-목록을 위한 Record
 */

public class SS_L_INSRCOST_SPLYCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String basidt;
	public int aplcqunt;
	public int totamt;
	public int hdqtsplyqunt;
	public int hdqtsplyamt;
	public int clamamt;
	public String busnchrgclamtend;
	public String splychrgclamtyn;
	public String splychrgclamtdt;

	public SS_L_INSRCOST_SPLYCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setAplcqunt(int aplcqunt){
		this.aplcqunt = aplcqunt;
	}

	public void setTotamt(int totamt){
		this.totamt = totamt;
	}

	public void setHdqtsplyqunt(int hdqtsplyqunt){
		this.hdqtsplyqunt = hdqtsplyqunt;
	}

	public void setHdqtsplyamt(int hdqtsplyamt){
		this.hdqtsplyamt = hdqtsplyamt;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
	}

	public void setBusnchrgclamtend(String busnchrgclamtend){
		this.busnchrgclamtend = busnchrgclamtend;
	}

	public void setSplychrgclamtyn(String splychrgclamtyn){
		this.splychrgclamtyn = splychrgclamtyn;
	}

	public void setSplychrgclamtdt(String splychrgclamtdt){
		this.splychrgclamtdt = splychrgclamtdt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public int getAplcqunt(){
		return this.aplcqunt;
	}

	public int getTotamt(){
		return this.totamt;
	}

	public int getHdqtsplyqunt(){
		return this.hdqtsplyqunt;
	}

	public int getHdqtsplyamt(){
		return this.hdqtsplyamt;
	}

	public int getClamamt(){
		return this.clamamt;
	}

	public String getBusnchrgclamtend(){
		return this.busnchrgclamtend;
	}

	public String getSplychrgclamtyn(){
		return this.splychrgclamtyn;
	}

	public String getSplychrgclamtdt(){
		return this.splychrgclamtdt;
	}
}

/* 작성시간 : Sun Feb 22 14:02:12 KST 2004 */