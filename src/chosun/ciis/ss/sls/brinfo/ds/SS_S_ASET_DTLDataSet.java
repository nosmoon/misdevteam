/***************************************************************************************************
* 파일명 : SS_S_ASET_DTLDataSet.java
* 기능 : 지국Info-지국비품현황-상세 상세
* 작성일자 : 2004-02-01
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-지국비품현황-상세 상세
 *
 */


public class SS_S_ASET_DTLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String asetseq;
	public String asetclascd;
	public String asetclascdnm;
	public String asetnm;
	public String spec;
	public String mnftcmpy;
	public String buyplac;
	public String buydt;
	public String buyamt;
	public String hdqtsplyamt;
	public String mantcont;
	public String wstedt;
	public String remk;

	public SS_S_ASET_DTLDataSet(){}
	public SS_S_ASET_DTLDataSet(String errcode, String errmsg, String asetseq, String asetclascd, String asetclascdnm, String asetnm, String spec, String mnftcmpy, String buyplac, String buydt, String buyamt, String hdqtsplyamt, String mantcont, String wstedt, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.asetseq = asetseq;
		this.asetclascd = asetclascd;
		this.asetclascdnm = asetclascdnm;
		this.asetnm = asetnm;
		this.spec = spec;
		this.mnftcmpy = mnftcmpy;
		this.buyplac = buyplac;
		this.buydt = buydt;
		this.buyamt = buyamt;
		this.hdqtsplyamt = hdqtsplyamt;
		this.mantcont = mantcont;
		this.wstedt = wstedt;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAsetseq(String asetseq){
		this.asetseq = asetseq;
	}

	public void setAsetclascd(String asetclascd){
		this.asetclascd = asetclascd;
	}

	public void setAsetclascdnm(String asetclascdnm){
		this.asetclascdnm = asetclascdnm;
	}

	public void setAsetnm(String asetnm){
		this.asetnm = asetnm;
	}

	public void setSpec(String spec){
		this.spec = spec;
	}

	public void setMnftcmpy(String mnftcmpy){
		this.mnftcmpy = mnftcmpy;
	}

	public void setBuyplac(String buyplac){
		this.buyplac = buyplac;
	}

	public void setBuydt(String buydt){
		this.buydt = buydt;
	}

	public void setBuyamt(String buyamt){
		this.buyamt = buyamt;
	}

	public void setHdqtsplyamt(String hdqtsplyamt){
		this.hdqtsplyamt = hdqtsplyamt;
	}

	public void setMantcont(String mantcont){
		this.mantcont = mantcont;
	}

	public void setWstedt(String wstedt){
		this.wstedt = wstedt;
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

	public String getAsetseq(){
		return this.asetseq;
	}

	public String getAsetclascd(){
		return this.asetclascd;
	}

	public String getAsetclascdnm(){
		return this.asetclascdnm;
	}

	public String getAsetnm(){
		return this.asetnm;
	}

	public String getSpec(){
		return this.spec;
	}

	public String getMnftcmpy(){
		return this.mnftcmpy;
	}

	public String getBuyplac(){
		return this.buyplac;
	}

	public String getBuydt(){
		return this.buydt;
	}

	public String getBuyamt(){
		return this.buyamt;
	}

	public String getHdqtsplyamt(){
		return this.hdqtsplyamt;
	}

	public String getMantcont(){
		return this.mantcont;
	}

	public String getWstedt(){
		return this.wstedt;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.asetseq = Util.checkString(cstmt.getString(5));
		this.asetclascd = Util.checkString(cstmt.getString(6));
		this.asetclascdnm = Util.checkString(cstmt.getString(7));
		this.asetnm = Util.checkString(cstmt.getString(8));
		this.spec = Util.checkString(cstmt.getString(9));
		this.mnftcmpy = Util.checkString(cstmt.getString(10));
		this.buyplac = Util.checkString(cstmt.getString(11));
		this.buydt = Util.checkString(cstmt.getString(12));
		this.buyamt = Util.checkString(cstmt.getString(13));
		this.hdqtsplyamt = Util.checkString(cstmt.getString(14));
		this.mantcont = Util.checkString(cstmt.getString(15));
		this.wstedt = Util.checkString(cstmt.getString(16));
		this.remk = Util.checkString(cstmt.getString(17));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_ASET_DTLDataSet ds = (SS_S_ASET_DTLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAsetseq()%>
<%= ds.getAsetclascd()%>
<%= ds.getAsetclascdnm()%>
<%= ds.getAsetnm()%>
<%= ds.getSpec()%>
<%= ds.getMnftcmpy()%>
<%= ds.getBuyplac()%>
<%= ds.getBuydt()%>
<%= ds.getBuyamt()%>
<%= ds.getHdqtsplyamt()%>
<%= ds.getMantcont()%>
<%= ds.getWstedt()%>
<%= ds.getRemk()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Feb 01 21:21:34 KST 2004 */