/***************************************************************************************************
* 파일명 : SS_S_MIGRWORKINFODataSet.java
* 기능 : 관리자-마이그레이션-상세를 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
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
 * 관리자-마이그레이션-상세를 위한 DataSet
 */

public class SS_S_MIGRWORKINFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String bocd;
	public Timestamp bodbupfrdt;
	public Timestamp bodbuptodt;
	public String bodbupstatcd;
	public String bodbupstat;
	public Timestamp billdbupfrdt;
	public Timestamp billdbuptodt;
	public String billdbupstat;
	public Timestamp boswitfrdt;
	public Timestamp boswittodt;
	public String boswitstat;
	public Timestamp billswitfrdt;
	public Timestamp billswittodt;
	public String billswitstat;

	public SS_S_MIGRWORKINFODataSet(){}
	public SS_S_MIGRWORKINFODataSet(String errcode, String errmsg, String bocd, Timestamp bodbupfrdt, Timestamp bodbuptodt, String bodbupstatcd, String bodbupstat, Timestamp billdbupfrdt, Timestamp billdbuptodt, String billdbupstat, Timestamp boswitfrdt, Timestamp boswittodt, String boswitstat, Timestamp billswitfrdt, Timestamp billswittodt, String billswitstat){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bocd = bocd;
		this.bodbupfrdt = bodbupfrdt;
		this.bodbuptodt = bodbuptodt;
		this.bodbupstatcd = bodbupstatcd;
		this.bodbupstat = bodbupstat;
		this.billdbupfrdt = billdbupfrdt;
		this.billdbuptodt = billdbuptodt;
		this.billdbupstat = billdbupstat;
		this.boswitfrdt = boswitfrdt;
		this.boswittodt = boswittodt;
		this.boswitstat = boswitstat;
		this.billswitfrdt = billswitfrdt;
		this.billswittodt = billswittodt;
		this.billswitstat = billswitstat;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBodbupfrdt(Timestamp bodbupfrdt){
		this.bodbupfrdt = bodbupfrdt;
	}

	public void setBodbuptodt(Timestamp bodbuptodt){
		this.bodbuptodt = bodbuptodt;
	}

	public void setBodbupstatcd(String bodbupstatcd){
		this.bodbupstatcd = bodbupstatcd;
	}

	public void setBodbupstat(String bodbupstat){
		this.bodbupstat = bodbupstat;
	}

	public void setBilldbupfrdt(Timestamp billdbupfrdt){
		this.billdbupfrdt = billdbupfrdt;
	}

	public void setBilldbuptodt(Timestamp billdbuptodt){
		this.billdbuptodt = billdbuptodt;
	}

	public void setBilldbupstat(String billdbupstat){
		this.billdbupstat = billdbupstat;
	}

	public void setBoswitfrdt(Timestamp boswitfrdt){
		this.boswitfrdt = boswitfrdt;
	}

	public void setBoswittodt(Timestamp boswittodt){
		this.boswittodt = boswittodt;
	}

	public void setBoswitstat(String boswitstat){
		this.boswitstat = boswitstat;
	}

	public void setBillswitfrdt(Timestamp billswitfrdt){
		this.billswitfrdt = billswitfrdt;
	}

	public void setBillswittodt(Timestamp billswittodt){
		this.billswittodt = billswittodt;
	}

	public void setBillswitstat(String billswitstat){
		this.billswitstat = billswitstat;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBocd(){
		return this.bocd;
	}

	public Timestamp getBodbupfrdt(){
		return this.bodbupfrdt;
	}

	public Timestamp getBodbuptodt(){
		return this.bodbuptodt;
	}

	public String getBodbupstatcd(){
		return this.bodbupstatcd;
	}

	public String getBodbupstat(){
		return this.bodbupstat;
	}

	public Timestamp getBilldbupfrdt(){
		return this.billdbupfrdt;
	}

	public Timestamp getBilldbuptodt(){
		return this.billdbuptodt;
	}

	public String getBilldbupstat(){
		return this.billdbupstat;
	}

	public Timestamp getBoswitfrdt(){
		return this.boswitfrdt;
	}

	public Timestamp getBoswittodt(){
		return this.boswittodt;
	}

	public String getBoswitstat(){
		return this.boswitstat;
	}

	public Timestamp getBillswitfrdt(){
		return this.billswitfrdt;
	}

	public Timestamp getBillswittodt(){
		return this.billswittodt;
	}

	public String getBillswitstat(){
		return this.billswitstat;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bocd = Util.checkString(cstmt.getString(4));
		this.bodbupfrdt = cstmt.getTimestamp(5);
		this.bodbuptodt = cstmt.getTimestamp(6);
		this.bodbupstatcd = Util.checkString(cstmt.getString(7));
		this.bodbupstat = Util.checkString(cstmt.getString(8));
		this.billdbupfrdt = cstmt.getTimestamp(9);
		this.billdbuptodt = cstmt.getTimestamp(10);
		this.billdbupstat = Util.checkString(cstmt.getString(11));
		this.boswitfrdt = cstmt.getTimestamp(12);
		this.boswittodt = cstmt.getTimestamp(13);
		this.boswitstat = Util.checkString(cstmt.getString(14));
		this.billswitfrdt = cstmt.getTimestamp(15);
		this.billswittodt = cstmt.getTimestamp(16);
		this.billswitstat = Util.checkString(cstmt.getString(17));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_MIGRWORKINFODataSet ds = (SS_S_MIGRWORKINFODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBocd()%>
<%= ds.getBodbupfrdt()%>
<%= ds.getBodbuptodt()%>
<%= ds.getBodbupstatcd()%>
<%= ds.getBodbupstat()%>
<%= ds.getBilldbupfrdt()%>
<%= ds.getBilldbuptodt()%>
<%= ds.getBilldbupstat()%>
<%= ds.getBoswitfrdt()%>
<%= ds.getBoswittodt()%>
<%= ds.getBoswitstat()%>
<%= ds.getBillswitfrdt()%>
<%= ds.getBillswittodt()%>
<%= ds.getBillswitstat()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 14 04:07:15 KST 2004 */