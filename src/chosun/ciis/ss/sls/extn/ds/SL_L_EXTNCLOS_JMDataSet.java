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


public class SL_L_EXTNCLOS_JMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curextncloslist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalqty;
	public long totalcnt;

	public SL_L_EXTNCLOS_JMDataSet(){}
	public SL_L_EXTNCLOS_JMDataSet(String errcode, String errmsg, long totalqty, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalqty = totalqty;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalqty(long totalqty){
		this.totalqty = totalqty;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalqty(){
		return this.totalqty;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totalqty = cstmt.getLong(20);
		this.totalcnt = cstmt.getLong(21);
		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			SL_L_EXTNCLOS_JMCUREXTNCLOSLISTRecord rec = new SL_L_EXTNCLOS_JMCUREXTNCLOSLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.qty = rset0.getInt("qty");
			rec.addrs = Util.checkString(rset0.getString("addrs"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.ddcfmyn = Util.checkString(rset0.getString("ddcfmyn"));
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.issup = Util.checkString(rset0.getString("issup"));
			rec.issupdt = Util.checkString(rset0.getString("issupdt"));
			rec.closmm = Util.checkString(rset0.getString("closmm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curextncloslist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_L_EXTNCLOS_JMDataSet ds = (SL_L_EXTNCLOS_JMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curextncloslist.size(); i++){
		SL_L_EXTNCLOS_JMCUREXTNCLOSLISTRecord curextncloslistRec = (SL_L_EXTNCLOS_JMCUREXTNCLOSLISTRecord)ds.curextncloslist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalqty()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurextncloslist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curextncloslistRec.deptcd%>
<%= curextncloslistRec.deptnm%>
<%= curextncloslistRec.partcd%>
<%= curextncloslistRec.partnm%>
<%= curextncloslistRec.areacd%>
<%= curextncloslistRec.areanm%>
<%= curextncloslistRec.bocd%>
<%= curextncloslistRec.bonm%>
<%= curextncloslistRec.rdr_no%>
<%= curextncloslistRec.rdrnm%>
<%= curextncloslistRec.qty%>
<%= curextncloslistRec.addrs%>
<%= curextncloslistRec.rdr_extndt%>
<%= curextncloslistRec.extnnm%>
<%= curextncloslistRec.ddcfmyn%>
<%= curextncloslistRec.gubun%>
<%= curextncloslistRec.suspdt%>
<%= curextncloslistRec.issup%>
<%= curextncloslistRec.issupdt%>
<%= curextncloslistRec.closmm%>
<%= curextncloslistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Mar 01 15:19:42 KST 2015 */