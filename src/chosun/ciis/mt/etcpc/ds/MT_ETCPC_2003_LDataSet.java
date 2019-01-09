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


public class MT_ETCPC_2003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_2003_LDataSet(){}
	public MT_ETCPC_2003_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			MT_ETCPC_2003_LCURLIST1Record rec = new MT_ETCPC_2003_LCURLIST1Record();
			rec.mchn_mang_no = Util.checkString(rset0.getString("mchn_mang_no"));
			rec.modl_mang_no = Util.checkString(rset0.getString("modl_mang_no"));
			rec.modl_nm = Util.checkString(rset0.getString("modl_nm"));
			rec.serl_no = Util.checkString(rset0.getString("serl_no"));
			rec.rsrt_dt = Util.checkString(rset0.getString("rsrt_dt"));
			rec.use_pers = Util.checkString(rset0.getString("use_pers"));
			rec.use_pers_flnm = Util.checkString(rset0.getString("use_pers_flnm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCPC_2003_LDataSet ds = (MT_ETCPC_2003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_2003_LCURLIST1Record curlist1Rec = (MT_ETCPC_2003_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.mchn_mang_no%>
<%= curlist1Rec.modl_mang_no%>
<%= curlist1Rec.modl_nm%>
<%= curlist1Rec.serl_no%>
<%= curlist1Rec.rsrt_dt%>
<%= curlist1Rec.use_pers%>
<%= curlist1Rec.use_pers_flnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 23 20:41:00 KST 2009 */