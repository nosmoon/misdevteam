/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_LNK_2010_LDataSet(){}
	public TN_LNK_2010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			TN_LNK_2010_LCURLISTRecord rec = new TN_LNK_2010_LCURLISTRecord();
			rec.aplc_path = Util.checkString(rset0.getString("aplc_path"));
			rec.requestdate = Util.checkString(rset0.getString("requestdate"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.proof_file = Util.checkString(rset0.getString("proof_file"));
			rec.aplc_file = Util.checkString(rset0.getString("aplc_file"));
			rec.result_file = Util.checkString(rset0.getString("result_file"));
			rec.tot_cnt = rset0.getInt("tot_cnt");
			rec.tot_err_cnt = rset0.getInt("tot_err_cnt");
			rec.stat1 = Util.checkString(rset0.getString("stat1"));
			rec.stat2 = Util.checkString(rset0.getString("stat2"));
			rec.stat3 = Util.checkString(rset0.getString("stat3"));
			rec.stat4 = Util.checkString(rset0.getString("stat4"));
			rec.cmsidx = Util.checkString(rset0.getString("cmsidx"));
			rec.deptidx = Util.checkString(rset0.getString("deptidx"));
			rec.status = Util.checkString(rset0.getString("status"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_2010_LDataSet ds = (TN_LNK_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_2010_LCURLISTRecord curlistRec = (TN_LNK_2010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.aplc_path%>
<%= curlistRec.requestdate%>
<%= curlistRec.paydate%>
<%= curlistRec.proof_file%>
<%= curlistRec.aplc_file%>
<%= curlistRec.result_file%>
<%= curlistRec.tot_cnt%>
<%= curlistRec.tot_err_cnt%>
<%= curlistRec.stat1%>
<%= curlistRec.stat2%>
<%= curlistRec.stat3%>
<%= curlistRec.stat4%>
<%= curlistRec.cmsidx%>
<%= curlistRec.deptidx%>
<%= curlistRec.status%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 21 10:31:09 KST 2016 */