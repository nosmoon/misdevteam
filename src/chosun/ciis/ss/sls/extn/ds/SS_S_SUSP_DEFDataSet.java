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


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_S_SUSP_DEFDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String deptnm;
	public String areanm;
	public String bonm;
	public String agentnm;
	public String rdrnm;
	public String cns_stat;
	public Timestamp cns_cnfmdt;
	public String bo_stat;
	public Timestamp bo_cnfmdt;
	public String svcnm;
	public String svcmm;
	public String giftcard;
	public String set_medicd;
	public String remk;

	public SS_S_SUSP_DEFDataSet(){}
	public SS_S_SUSP_DEFDataSet(String errcode, String errmsg, String deptnm, String areanm, String bonm, String agentnm, String rdrnm, String cns_stat, Timestamp cns_cnfmdt, String bo_stat, Timestamp bo_cnfmdt, String svcnm, String svcmm, String giftcard, String set_medicd, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.deptnm = deptnm;
		this.areanm = areanm;
		this.bonm = bonm;
		this.agentnm = agentnm;
		this.rdrnm = rdrnm;
		this.cns_stat = cns_stat;
		this.cns_cnfmdt = cns_cnfmdt;
		this.bo_stat = bo_stat;
		this.bo_cnfmdt = bo_cnfmdt;
		this.svcnm = svcnm;
		this.svcmm = svcmm;
		this.giftcard = giftcard;
		this.set_medicd = set_medicd;
		this.remk = remk;
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

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAgentnm(String agentnm){
		this.agentnm = agentnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setCns_stat(String cns_stat){
		this.cns_stat = cns_stat;
	}

	public void setCns_cnfmdt(Timestamp cns_cnfmdt){
		this.cns_cnfmdt = cns_cnfmdt;
	}

	public void setBo_stat(String bo_stat){
		this.bo_stat = bo_stat;
	}

	public void setBo_cnfmdt(Timestamp bo_cnfmdt){
		this.bo_cnfmdt = bo_cnfmdt;
	}

	public void setSvcnm(String svcnm){
		this.svcnm = svcnm;
	}

	public void setSvcmm(String svcmm){
		this.svcmm = svcmm;
	}

	public void setGiftcard(String giftcard){
		this.giftcard = giftcard;
	}

	public void setSet_medicd(String set_medicd){
		this.set_medicd = set_medicd;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAgentnm(){
		return this.agentnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getCns_stat(){
		return this.cns_stat;
	}

	public Timestamp getCns_cnfmdt(){
		return this.cns_cnfmdt;
	}

	public String getBo_stat(){
		return this.bo_stat;
	}

	public Timestamp getBo_cnfmdt(){
		return this.bo_cnfmdt;
	}

	public String getSvcnm(){
		return this.svcnm;
	}

	public String getSvcmm(){
		return this.svcmm;
	}

	public String getGiftcard(){
		return this.giftcard;
	}

	public String getSet_medicd(){
		return this.set_medicd;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.deptnm = Util.checkString(cstmt.getString(5));
		this.areanm = Util.checkString(cstmt.getString(6));
		this.bonm = Util.checkString(cstmt.getString(7));
		this.agentnm = Util.checkString(cstmt.getString(8));
		this.rdrnm = Util.checkString(cstmt.getString(9));
		this.cns_stat = Util.checkString(cstmt.getString(10));
		this.cns_cnfmdt = cstmt.getTimestamp(11);
		this.bo_stat = Util.checkString(cstmt.getString(12));
		this.bo_cnfmdt = cstmt.getTimestamp(13);
		this.svcnm = Util.checkString(cstmt.getString(14));
		this.svcmm = Util.checkString(cstmt.getString(15));
		this.giftcard = Util.checkString(cstmt.getString(16));
		this.set_medicd = Util.checkString(cstmt.getString(17));
		this.remk = Util.checkString(cstmt.getString(18));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_SUSP_DEFDataSet ds = (SS_S_SUSP_DEFDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeptnm()%>
<%= ds.getAreanm()%>
<%= ds.getBonm()%>
<%= ds.getAgentnm()%>
<%= ds.getRdrnm()%>
<%= ds.getCns_stat()%>
<%= ds.getCns_cnfmdt()%>
<%= ds.getBo_stat()%>
<%= ds.getBo_cnfmdt()%>
<%= ds.getSvcnm()%>
<%= ds.getSvcmm()%>
<%= ds.getGiftcard()%>
<%= ds.getSet_medicd()%>
<%= ds.getRemk()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 15:54:34 KST 2015 */