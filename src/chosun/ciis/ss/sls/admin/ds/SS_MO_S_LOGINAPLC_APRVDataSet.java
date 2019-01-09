/***************************************************************************************************
* 파일명 : SS_MO_S_LOGINAPLC_APRVDataSet.java
* 기능 : 관리자-모바일관리-로그인승인신청 초기화면을 위한 DataSet
* 작성일자 : 2016-09-28
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 담당자명, 입사일자, 퇴사일자. 센터예비등록일자, 센터등록일자, 센터계약일자, 매일최초,최종로그인
* 수정자 : 장선희
* 수정일자 : 2017-07-06
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *  관리자-모바일관리-로그인승인신청 초기화면을 위한 DataSet
 */


public class SS_MO_S_LOGINAPLC_APRVDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bocd;
	public String bonm;
	public String presi_nm;
	public String tel_no;
	public String bo_addr;
	public String boemp_no;
	public String flnm;
	public String dutycd;
	public String dutynm;
	public String boemp_id;
	public String maprvaplcdt;
	public String tel;
	public String ptph;
	public String deviceid;
	public String gcmid;
	public String logindt;
	public String appuseyn;
	public String maprvstatcd;
	public String maprvstatnm;
	public String ddaprvid;
	public String ddaprvdt;
	public String ddremk;
	public String ddaprvnm;
	public String in_cmpy_dt;
	public String lv_cmpy_dt;
	public String bo_resv_reg_dt;
	public String bo_reg_dt;
	public String bo_cntr_dt;
	public String min_login_dt;
	public String max_login_dt;
	public String mblockyn;

	public SS_MO_S_LOGINAPLC_APRVDataSet(){}
	public SS_MO_S_LOGINAPLC_APRVDataSet(String errcode, String errmsg, String deptnm, String partnm, String areanm, String bocd, String bonm, String presi_nm, String tel_no, String bo_addr, String boemp_no, String flnm, String dutycd, String dutynm, String boemp_id, String maprvaplcdt, String tel, String ptph, String deviceid, String gcmid, String logindt, String appuseyn, String maprvstatcd, String maprvstatnm, String ddaprvid, String ddaprvdt, String ddremk, String ddaprvnm, String in_cmpy_dt, String lv_cmpy_dt, String bo_resv_reg_dt, String bo_reg_dt, String bo_cntr_dt, String min_login_dt, String max_login_dt, String mblockyn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.deptnm = deptnm;
		this.partnm = partnm;
		this.areanm = areanm;
		this.bocd = bocd;
		this.bonm = bonm;
		this.presi_nm = presi_nm;
		this.tel_no = tel_no;
		this.bo_addr = bo_addr;
		this.boemp_no = boemp_no;
		this.flnm = flnm;
		this.dutycd = dutycd;
		this.dutynm = dutynm;
		this.boemp_id = boemp_id;
		this.maprvaplcdt = maprvaplcdt;
		this.tel = tel;
		this.ptph = ptph;
		this.deviceid = deviceid;
		this.gcmid = gcmid;
		this.logindt = logindt;
		this.appuseyn = appuseyn;
		this.maprvstatcd = maprvstatcd;
		this.maprvstatnm = maprvstatnm;
		this.ddaprvid = ddaprvid;
		this.ddaprvdt = ddaprvdt;
		this.ddremk = ddremk;
		this.ddaprvnm = ddaprvnm;
		this.in_cmpy_dt = in_cmpy_dt;
		this.lv_cmpy_dt = lv_cmpy_dt;
		this.bo_resv_reg_dt = bo_resv_reg_dt;
		this.bo_reg_dt = bo_reg_dt;
		this.bo_cntr_dt = bo_cntr_dt;
		this.min_login_dt = min_login_dt;
		this.max_login_dt = max_login_dt;
		this.mblockyn = mblockyn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setBo_addr(String bo_addr){
		this.bo_addr = bo_addr;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDutycd(String dutycd){
		this.dutycd = dutycd;
	}

	public void setDutynm(String dutynm){
		this.dutynm = dutynm;
	}

	public void setBoemp_id(String boemp_id){
		this.boemp_id = boemp_id;
	}

	public void setMaprvaplcdt(String maprvaplcdt){
		this.maprvaplcdt = maprvaplcdt;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

	public void setPtph(String ptph){
		this.ptph = ptph;
	}

	public void setDeviceid(String deviceid){
		this.deviceid = deviceid;
	}

	public void setGcmid(String gcmid){
		this.gcmid = gcmid;
	}

	public void setLogindt(String logindt){
		this.logindt = logindt;
	}

	public void setAppuseyn(String appuseyn){
		this.appuseyn = appuseyn;
	}

	public void setMaprvstatcd(String maprvstatcd){
		this.maprvstatcd = maprvstatcd;
	}

	public void setMaprvstatnm(String maprvstatnm){
		this.maprvstatnm = maprvstatnm;
	}

	public void setDdaprvid(String ddaprvid){
		this.ddaprvid = ddaprvid;
	}

	public void setDdaprvdt(String ddaprvdt){
		this.ddaprvdt = ddaprvdt;
	}

	public void setDdremk(String ddremk){
		this.ddremk = ddremk;
	}

	public void setDdaprvnm(String ddaprvnm){
		this.ddaprvnm = ddaprvnm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLv_cmpy_dt(String lv_cmpy_dt){
		this.lv_cmpy_dt = lv_cmpy_dt;
	}

	public void setBo_resv_reg_dt(String bo_resv_reg_dt){
		this.bo_resv_reg_dt = bo_resv_reg_dt;
	}

	public void setBo_reg_dt(String bo_reg_dt){
		this.bo_reg_dt = bo_reg_dt;
	}

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setMin_login_dt(String min_login_dt){
		this.min_login_dt = min_login_dt;
	}

	public void setMax_login_dt(String max_login_dt){
		this.max_login_dt = max_login_dt;
	}

	public void setMblockyn(String mblockyn){
		this.mblockyn = mblockyn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
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

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getBo_addr(){
		return this.bo_addr;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDutycd(){
		return this.dutycd;
	}

	public String getDutynm(){
		return this.dutynm;
	}

	public String getBoemp_id(){
		return this.boemp_id;
	}

	public String getMaprvaplcdt(){
		return this.maprvaplcdt;
	}

	public String getTel(){
		return this.tel;
	}

	public String getPtph(){
		return this.ptph;
	}

	public String getDeviceid(){
		return this.deviceid;
	}

	public String getGcmid(){
		return this.gcmid;
	}

	public String getLogindt(){
		return this.logindt;
	}

	public String getAppuseyn(){
		return this.appuseyn;
	}

	public String getMaprvstatcd(){
		return this.maprvstatcd;
	}

	public String getMaprvstatnm(){
		return this.maprvstatnm;
	}

	public String getDdaprvid(){
		return this.ddaprvid;
	}

	public String getDdaprvdt(){
		return this.ddaprvdt;
	}

	public String getDdremk(){
		return this.ddremk;
	}

	public String getDdaprvnm(){
		return this.ddaprvnm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLv_cmpy_dt(){
		return this.lv_cmpy_dt;
	}

	public String getBo_resv_reg_dt(){
		return this.bo_resv_reg_dt;
	}

	public String getBo_reg_dt(){
		return this.bo_reg_dt;
	}

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getMin_login_dt(){
		return this.min_login_dt;
	}

	public String getMax_login_dt(){
		return this.max_login_dt;
	}

	public String getMblockyn(){
		return this.mblockyn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.deptnm = Util.checkString(cstmt.getString(6));
		this.partnm = Util.checkString(cstmt.getString(7));
		this.areanm = Util.checkString(cstmt.getString(8));
		this.bocd = Util.checkString(cstmt.getString(9));
		this.bonm = Util.checkString(cstmt.getString(10));
		this.presi_nm = Util.checkString(cstmt.getString(11));
		this.tel_no = Util.checkString(cstmt.getString(12));
		this.bo_addr = Util.checkString(cstmt.getString(13));
		this.boemp_no = Util.checkString(cstmt.getString(14));
		this.flnm = Util.checkString(cstmt.getString(15));
		this.dutycd = Util.checkString(cstmt.getString(16));
		this.dutynm = Util.checkString(cstmt.getString(17));
		this.boemp_id = Util.checkString(cstmt.getString(18));
		this.maprvaplcdt = Util.checkString(cstmt.getString(19));
		this.tel = Util.checkString(cstmt.getString(20));
		this.ptph = Util.checkString(cstmt.getString(21));
		this.deviceid = Util.checkString(cstmt.getString(22));
		this.gcmid = Util.checkString(cstmt.getString(23));
		this.logindt = Util.checkString(cstmt.getString(24));
		this.appuseyn = Util.checkString(cstmt.getString(25));
		this.maprvstatcd = Util.checkString(cstmt.getString(26));
		this.maprvstatnm = Util.checkString(cstmt.getString(27));
		this.ddaprvid = Util.checkString(cstmt.getString(28));
		this.ddaprvdt = Util.checkString(cstmt.getString(29));
		this.ddremk = Util.checkString(cstmt.getString(30));
		this.ddaprvnm = Util.checkString(cstmt.getString(31));
		this.in_cmpy_dt = Util.checkString(cstmt.getString(32));
		this.lv_cmpy_dt = Util.checkString(cstmt.getString(33));
		this.bo_resv_reg_dt = Util.checkString(cstmt.getString(34));
		this.bo_reg_dt = Util.checkString(cstmt.getString(35));
		this.bo_cntr_dt = Util.checkString(cstmt.getString(36));
		this.min_login_dt = Util.checkString(cstmt.getString(37));
		this.max_login_dt = Util.checkString(cstmt.getString(38));
		this.mblockyn = Util.checkString(cstmt.getString(39));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_MO_S_LOGINAPLC_APRVDataSet ds = (SS_MO_S_LOGINAPLC_APRVDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeptnm()%>
<%= ds.getPartnm()%>
<%= ds.getAreanm()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getPresi_nm()%>
<%= ds.getTel_no()%>
<%= ds.getBo_addr()%>
<%= ds.getBoemp_no()%>
<%= ds.getFlnm()%>
<%= ds.getDutycd()%>
<%= ds.getDutynm()%>
<%= ds.getBoemp_id()%>
<%= ds.getMaprvaplcdt()%>
<%= ds.getTel()%>
<%= ds.getPtph()%>
<%= ds.getDeviceid()%>
<%= ds.getGcmid()%>
<%= ds.getLogindt()%>
<%= ds.getAppuseyn()%>
<%= ds.getMaprvstatcd()%>
<%= ds.getMaprvstatnm()%>
<%= ds.getDdaprvid()%>
<%= ds.getDdaprvdt()%>
<%= ds.getDdremk()%>
<%= ds.getDdaprvnm()%>
<%= ds.getIn_cmpy_dt()%>
<%= ds.getLv_cmpy_dt()%>
<%= ds.getBo_resv_reg_dt()%>
<%= ds.getBo_reg_dt()%>
<%= ds.getBo_cntr_dt()%>
<%= ds.getMin_login_dt()%>
<%= ds.getMax_login_dt()%>
<%= ds.getMblockyn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 21 11:48:06 KST 2017 */