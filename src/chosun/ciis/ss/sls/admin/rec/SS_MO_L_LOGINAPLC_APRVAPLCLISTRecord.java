/***************************************************************************************************
* 파일명 : SS_MO_L_LOGINAPLC_APRVDataSet.java
* 기능 : 관리자-모바일관리-로그인승인신청리스트를 위한 DM
* 작성일자 : 2016-09-22
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 컬럼명변경으로인한 수정 및 센터명으로 조회할 수 있도록 추가
* 수정자 : 장선희
* 수정일자 : 2017-01-20 마감 42분전!!
* 백업 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 현임여부, ciis휴대번호(센터대표일때만) 추가
* 수정자 : 장선희
* 수정일자 : 2017-07-05
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;
/**
 *
 */


public class SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String boemp_no;
	public String dutycd;
	public String dutynm;
	public String flnm;
	public String boemp_id;
	public String crm_ptph;
	public String ciis_ptph;
	public String crm_boheadprn;
	public String ciis_boheadprn;
	public String maprvstatcd;
	public String maprvstatnm;
	public String nowboheadyn;
	public String mblockyn;

	public SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
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

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setDutycd(String dutycd){
		this.dutycd = dutycd;
	}

	public void setDutynm(String dutynm){
		this.dutynm = dutynm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBoemp_id(String boemp_id){
		this.boemp_id = boemp_id;
	}

	public void setCrm_ptph(String crm_ptph){
		this.crm_ptph = crm_ptph;
	}

	public void setCiis_ptph(String ciis_ptph){
		this.ciis_ptph = ciis_ptph;
	}

	public void setCrm_boheadprn(String crm_boheadprn){
		this.crm_boheadprn = crm_boheadprn;
	}

	public void setCiis_boheadprn(String ciis_boheadprn){
		this.ciis_boheadprn = ciis_boheadprn;
	}

	public void setMaprvstatcd(String maprvstatcd){
		this.maprvstatcd = maprvstatcd;
	}

	public void setMaprvstatnm(String maprvstatnm){
		this.maprvstatnm = maprvstatnm;
	}

	public void setNowboheadyn(String nowboheadyn){
		this.nowboheadyn = nowboheadyn;
	}

	public void setMblockyn(String mblockyn){
		this.mblockyn = mblockyn;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
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

	public String getAreanm(){
		return this.areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getDutycd(){
		return this.dutycd;
	}

	public String getDutynm(){
		return this.dutynm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getBoemp_id(){
		return this.boemp_id;
	}

	public String getCrm_ptph(){
		return this.crm_ptph;
	}

	public String getCiis_ptph(){
		return this.ciis_ptph;
	}

	public String getCrm_boheadprn(){
		return this.crm_boheadprn;
	}

	public String getCiis_boheadprn(){
		return this.ciis_boheadprn;
	}

	public String getMaprvstatcd(){
		return this.maprvstatcd;
	}

	public String getMaprvstatnm(){
		return this.maprvstatnm;
	}

	public String getNowboheadyn(){
		return this.nowboheadyn;
	}

	public String getMblockyn(){
		return this.mblockyn;
	}
}

/* 작성시간 : Thu Jul 13 11:08:57 KST 2017 */