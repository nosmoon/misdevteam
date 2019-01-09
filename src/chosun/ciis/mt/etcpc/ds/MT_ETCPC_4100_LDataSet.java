/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.etcpc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_4100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_4100_LDataSet(){}
	public MT_ETCPC_4100_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			MT_ETCPC_4100_LCURLIST1Record rec = new MT_ETCPC_4100_LCURLIST1Record();
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.mchn_mang_no = Util.checkString(rset0.getString("mchn_mang_no"));
			rec.use_pers_flnm = Util.checkString(rset0.getString("use_pers_flnm"));
			rec.use_usag = Util.checkString(rset0.getString("use_usag"));
			rec.mdnm = Util.checkString(rset0.getString("mdnm"));
			rec.mchn_stat = Util.checkString(rset0.getString("mchn_stat"));
			rec.kep_plac = Util.checkString(rset0.getString("kep_plac"));
			rec.buy_dt = Util.checkString(rset0.getString("buy_dt"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.sygg = Util.checkString(rset0.getString("sygg"));
			rec.wste_dd_pers = Util.checkString(rset0.getString("wste_dd_pers"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCPC_4100_LDataSet ds = (MT_ETCPC_4100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_4100_LCURLIST1Record curlist1Rec = (MT_ETCPC_4100_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.use_dept_nm%>
<%= curlist1Rec.mchn_mang_no%>
<%= curlist1Rec.use_pers_flnm%>
<%= curlist1Rec.use_usag%>
<%= curlist1Rec.mdnm%>
<%= curlist1Rec.mchn_stat%>
<%= curlist1Rec.kep_plac%>
<%= curlist1Rec.buy_dt%>
<%= curlist1Rec.pay_dt%>
<%= curlist1Rec.sygg%>
<%= curlist1Rec.wste_dd_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 30 17:11:24 KST 2009 */