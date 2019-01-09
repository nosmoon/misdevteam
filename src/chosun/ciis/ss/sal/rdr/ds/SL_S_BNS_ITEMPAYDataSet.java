/***************************************************************************************************
* 파일명 : SL_S_BNS_ITEMPAYDataSet.java
* 기능 : 독자정보관리(판촉물내역팝업-상세조회)
* 작성일자 : 2004-06-03
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(판촉물내역팝업-상세조회)
 *
 */

public class SL_S_BNS_ITEMPAYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String paydt;
	public String bns_itemcd;
	public String bns_itemnm;
	public long bns_itemuprc;
	public long qunt;
	public String bocd;
	public String bonm;
	public long amt;
	public String rdr_extndt;
	public String rdr_extnno;

	public SL_S_BNS_ITEMPAYDataSet(){}
	public SL_S_BNS_ITEMPAYDataSet(String errcode, String errmsg, String paydt, String bns_itemcd, String bns_itemnm, long bns_itemuprc, long qunt, String bocd, String bonm, long amt, String rdr_extndt, String rdr_extnno){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.paydt = paydt;
		this.bns_itemcd = bns_itemcd;
		this.bns_itemnm = bns_itemnm;
		this.bns_itemuprc = bns_itemuprc;
		this.qunt = qunt;
		this.bocd = bocd;
		this.bonm = bonm;
		this.amt = amt;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPaydt(String paydt){
		this.paydt = paydt;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setBns_itemuprc(long bns_itemuprc){
		this.bns_itemuprc = bns_itemuprc;
	}

	public void setQunt(long qunt){
		this.qunt = qunt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAmt(long amt){
		this.amt = amt;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPaydt(){
		return this.paydt;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public long getBns_itemuprc(){
		return this.bns_itemuprc;
	}

	public long getQunt(){
		return this.qunt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public long getAmt(){
		return this.amt;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.paydt = Util.checkString(cstmt.getString(5));
		this.bns_itemcd = Util.checkString(cstmt.getString(6));
		this.bns_itemnm = Util.checkString(cstmt.getString(7));
		this.bns_itemuprc = cstmt.getLong(8);
		this.qunt = cstmt.getLong(9);
		this.bocd = Util.checkString(cstmt.getString(10));
		this.bonm = Util.checkString(cstmt.getString(11));
		this.amt = cstmt.getLong(12);
		this.rdr_extndt = Util.checkString(cstmt.getString(13));
		this.rdr_extnno = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_S_BNS_ITEMPAYDataSet ds = (SL_S_BNS_ITEMPAYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPaydt()%>
<%= ds.getBns_itemcd()%>
<%= ds.getBns_itemnm()%>
<%= ds.getBns_itemuprc()%>
<%= ds.getQunt()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getAmt()%>
<%= ds.getRdr_extndt()%>
<%= ds.getRdr_extnno()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 04 11:50:56 KST 2004 */