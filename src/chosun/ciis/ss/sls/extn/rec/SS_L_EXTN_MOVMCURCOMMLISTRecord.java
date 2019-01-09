/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_EXTN_MOVMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptcdnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areacdnm;
	public String bocd;
	public String bocdnm;
	public int boqty;
	public int bo_isqty;
	public int bo_prvqty;
	public int bo_boqty;
	public int empqty;
	public int cmpyqty;
	public int exgqty;
	public int rdrqty;
	public int cybqty;
	public int ccqty;
	public int camp_sm_qty;
	public int camp_etc_qty;
	public int campqty;
	public int movmqty;
	public int jmextnqty;
	public int movmtrsfqty;
	public int nopayqty;
	public int halfpayqty;
	public int sumqty;
	public int subsumqty;

	public SS_L_EXTN_MOVMCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptcdnm(String deptcdnm){
		this.deptcdnm = deptcdnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreacdnm(String areacdnm){
		this.areacdnm = areacdnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBocdnm(String bocdnm){
		this.bocdnm = bocdnm;
	}

	public void setBoqty(int boqty){
		this.boqty = boqty;
	}

	public void setBo_isqty(int bo_isqty){
		this.bo_isqty = bo_isqty;
	}

	public void setBo_prvqty(int bo_prvqty){
		this.bo_prvqty = bo_prvqty;
	}

	public void setBo_boqty(int bo_boqty){
		this.bo_boqty = bo_boqty;
	}

	public int getCmpyqty() {
		return cmpyqty;
	}

	public void setCmpyqty(int cmpyqty) {
		this.cmpyqty = cmpyqty;
	}

	public void setEmpqty(int empqty){
		this.empqty = empqty;
	}

	public void setExgqty(int exgqty){
		this.exgqty = exgqty;
	}

	public void setRdrqty(int rdrqty){
		this.rdrqty = rdrqty;
	}

	public void setCybqty(int cybqty){
		this.cybqty = cybqty;
	}

	public void setCcqty(int ccqty){
		this.ccqty = ccqty;
	}

	public int getCamp_sm_qty() {
		return camp_sm_qty;
	}

	public void setCamp_sm_qty(int camp_sm_qty) {
		this.camp_sm_qty = camp_sm_qty;
	}

	public int getCamp_etc_qty() {
		return camp_etc_qty;
	}

	public void setCamp_etc_qty(int camp_etc_qty) {
		this.camp_etc_qty = camp_etc_qty;
	}

	public void setCampqty(int campqty){
		this.campqty = campqty;
	}

	public void setMovmqty(int movmqty){
		this.movmqty = movmqty;
	}

	public void setJmextnqty(int jmextnqty){
		this.jmextnqty = jmextnqty;
	}

	public void setMovmtrsfqty(int movmtrsfqty){
		this.movmtrsfqty = movmtrsfqty;
	}

	public void setNopayqty(int nopayqty){
		this.nopayqty = nopayqty;
	}

	public void setHalfpayqty(int halfpayqty){
		this.halfpayqty = halfpayqty;
	}

	public void setSumqty(int sumqty){
		this.sumqty = sumqty;
	}

	public void setSubsumqty(int subsumqty){
		this.subsumqty = subsumqty;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptcdnm(){
		return this.deptcdnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreacdnm(){
		return this.areacdnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBocdnm(){
		return this.bocdnm;
	}

	public int getBoqty(){
		return this.boqty;
	}

	public int getBo_isqty(){
		return this.bo_isqty;
	}

	public int getBo_prvqty(){
		return this.bo_prvqty;
	}

	public int getBo_boqty(){
		return this.bo_boqty;
	}

	public int getEmpqty(){
		return this.empqty;
	}

	public int getExgqty(){
		return this.exgqty;
	}

	public int getRdrqty(){
		return this.rdrqty;
	}

	public int getCybqty(){
		return this.cybqty;
	}

	public int getCcqty(){
		return this.ccqty;
	}

	public int getCampqty(){
		return this.campqty;
	}

	public int getMovmqty(){
		return this.movmqty;
	}

	public int getJmextnqty(){
		return this.jmextnqty;
	}

	public int getMovmtrsfqty(){
		return this.movmtrsfqty;
	}

	public int getNopayqty(){
		return this.nopayqty;
	}

	public int getHalfpayqty(){
		return this.halfpayqty;
	}

	public int getSumqty(){
		return this.sumqty;
	}

	public int getSubsumqty(){
		return this.subsumqty;
	}
}

/* 작성시간 : Tue Jul 12 11:00:43 KST 2016 */