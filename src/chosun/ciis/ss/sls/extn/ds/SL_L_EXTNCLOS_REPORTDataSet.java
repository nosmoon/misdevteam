/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-확장점검 장표조회
* 작성일자 : 2011-11-23
* 작성자 : 이혁
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


public class SL_L_EXTNCLOS_REPORTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cursumlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long tota1;
	public long tota2;
	public long tota3;
	public long totasum;
	public long totb1;
	public long totb2;
	public long totb3;
	public long totbsum;
	public long totc1;
	public long totc2;
	public long totc3;
	public long totcsum;

	public SL_L_EXTNCLOS_REPORTDataSet(){}
	public SL_L_EXTNCLOS_REPORTDataSet(String errcode, String errmsg, long tota1, long tota2, long tota3, long totasum, long totb1, long totb2, long totb3, long totbsum, long totc1, long totc2, long totc3, long totcsum){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tota1 = tota1;
		this.tota2 = tota2;
		this.tota3 = tota3;
		this.totasum = totasum;
		this.totb1 = totb1;
		this.totb2 = totb2;
		this.totb3 = totb3;
		this.totbsum = totbsum;
		this.totc1 = totc1;
		this.totc2 = totc2;
		this.totc3 = totc3;
		this.totcsum = totcsum;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTota1(long tota1){
		this.tota1 = tota1;
	}

	public void setTota2(long tota2){
		this.tota2 = tota2;
	}

	public void setTota3(long tota3){
		this.tota3 = tota3;
	}

	public void setTotasum(long totasum){
		this.totasum = totasum;
	}

	public void setTotb1(long totb1){
		this.totb1 = totb1;
	}

	public void setTotb2(long totb2){
		this.totb2 = totb2;
	}

	public void setTotb3(long totb3){
		this.totb3 = totb3;
	}

	public void setTotbsum(long totbsum){
		this.totbsum = totbsum;
	}

	public void setTotc1(long totc1){
		this.totc1 = totc1;
	}

	public void setTotc2(long totc2){
		this.totc2 = totc2;
	}

	public void setTotc3(long totc3){
		this.totc3 = totc3;
	}

	public void setTotcsum(long totcsum){
		this.totcsum = totcsum;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTota1(){
		return this.tota1;
	}

	public long getTota2(){
		return this.tota2;
	}

	public long getTota3(){
		return this.tota3;
	}

	public long getTotasum(){
		return this.totasum;
	}

	public long getTotb1(){
		return this.totb1;
	}

	public long getTotb2(){
		return this.totb2;
	}

	public long getTotb3(){
		return this.totb3;
	}

	public long getTotbsum(){
		return this.totbsum;
	}

	public long getTotc1(){
		return this.totc1;
	}

	public long getTotc2(){
		return this.totc2;
	}

	public long getTotc3(){
		return this.totc3;
	}

	public long getTotcsum(){
		return this.totcsum;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tota1 = cstmt.getLong(8);
		this.tota2 = cstmt.getLong(9);
		this.tota3 = cstmt.getLong(10);
		this.totasum = cstmt.getLong(11);
		this.totb1 = cstmt.getLong(12);
		this.totb2 = cstmt.getLong(13);
		this.totb3 = cstmt.getLong(14);
		this.totbsum = cstmt.getLong(15);
		this.totc1 = cstmt.getLong(16);
		this.totc2 = cstmt.getLong(17);
		this.totc3 = cstmt.getLong(18);
		this.totcsum = cstmt.getLong(19);
		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			SL_L_EXTNCLOS_REPORTCURSUMLISTRecord rec = new SL_L_EXTNCLOS_REPORTCURSUMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.qtya1 = rset0.getInt("qtya1");
			rec.qtya2 = rset0.getInt("qtya2");
			rec.qtya3 = rset0.getInt("qtya3");
			rec.qtyasum = rset0.getInt("qtyasum");
			rec.qtyb1 = rset0.getInt("qtyb1");
			rec.qtyb2 = rset0.getInt("qtyb2");
			rec.qtyb3 = rset0.getInt("qtyb3");
			rec.qtybsum = rset0.getInt("qtybsum");
			rec.qtyc1 = rset0.getInt("qtyc1");
			rec.qtyc2 = rset0.getInt("qtyc2");
			rec.qtyc3 = rset0.getInt("qtyc3");
			rec.qtycsum = rset0.getInt("qtycsum");
			this.cursumlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_L_EXTNCLOS_REPORTDataSet ds = (SL_L_EXTNCLOS_REPORTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cursumlist.size(); i++){
		SL_L_EXTNCLOS_REPORTCURSUMLISTRecord cursumlistRec = (SL_L_EXTNCLOS_REPORTCURSUMLISTRecord)ds.cursumlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTota1()%>
<%= ds.getTota2()%>
<%= ds.getTota3()%>
<%= ds.getTotasum()%>
<%= ds.getTotb1()%>
<%= ds.getTotb2()%>
<%= ds.getTotb3()%>
<%= ds.getTotbsum()%>
<%= ds.getTotc1()%>
<%= ds.getTotc2()%>
<%= ds.getTotc3()%>
<%= ds.getTotcsum()%>
<%= ds.getCursumlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cursumlistRec.deptcd%>
<%= cursumlistRec.deptnm%>
<%= cursumlistRec.partcd%>
<%= cursumlistRec.partnm%>
<%= cursumlistRec.bocd%>
<%= cursumlistRec.bonm%>
<%= cursumlistRec.qtya1%>
<%= cursumlistRec.qtya2%>
<%= cursumlistRec.qtya3%>
<%= cursumlistRec.qtyasum%>
<%= cursumlistRec.qtyb1%>
<%= cursumlistRec.qtyb2%>
<%= cursumlistRec.qtyb3%>
<%= cursumlistRec.qtybsum%>
<%= cursumlistRec.qtyc1%>
<%= cursumlistRec.qtyc2%>
<%= cursumlistRec.qtyc3%>
<%= cursumlistRec.qtycsum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 23 15:00:57 KST 2011 */