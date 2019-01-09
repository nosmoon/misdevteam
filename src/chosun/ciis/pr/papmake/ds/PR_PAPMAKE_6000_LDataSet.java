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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_6000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_6000_LDataSet(){}
	public PR_PAPMAKE_6000_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PR_PAPMAKE_6000_LCURLISTRecord rec = new PR_PAPMAKE_6000_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.sub_cmpy_clsf = Util.checkString(rset0.getString("sub_cmpy_clsf"));
			rec.sub_cmpy_clsf_nm = Util.checkString(rset0.getString("sub_cmpy_clsf_nm"));
			rec.adjm_obj = Util.checkString(rset0.getString("adjm_obj"));
			rec.adjm_obj_nm = Util.checkString(rset0.getString("adjm_obj_nm"));
			rec.servcost_clsf = Util.checkString(rset0.getString("servcost_clsf"));
			rec.servcost_clsf_nm = Util.checkString(rset0.getString("servcost_clsf_nm"));
			rec.base_prt_servcost = Util.checkString(rset0.getString("base_prt_servcost"));
			rec.addm_prt_servcost = Util.checkString(rset0.getString("addm_prt_servcost"));
			rec.sep_prt_servcost = Util.checkString(rset0.getString("sep_prt_servcost"));
			rec.total = Util.checkString(rset0.getString("total"));
			rec.base_make_servcost = Util.checkString(rset0.getString("base_make_servcost"));
			rec.addm_make_servcost = Util.checkString(rset0.getString("addm_make_servcost"));
			rec.slip_clsf = Util.checkString(rset0.getString("slip_clsf"));
			rec.slip_proc_occr_dt = Util.checkString(rset0.getString("slip_proc_occr_dt"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.tax_stmt_dt = Util.checkString(rset0.getString("tax_stmt_dt"));
			rec.tax_stmt_seq = Util.checkString(rset0.getString("tax_stmt_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_6000_LDataSet ds = (PR_PAPMAKE_6000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_6000_LCURLISTRecord curlistRec = (PR_PAPMAKE_6000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.yymm%>
<%= curlistRec.sub_cmpy_clsf%>
<%= curlistRec.sub_cmpy_clsf_nm%>
<%= curlistRec.adjm_obj%>
<%= curlistRec.adjm_obj_nm%>
<%= curlistRec.servcost_clsf%>
<%= curlistRec.servcost_clsf_nm%>
<%= curlistRec.base_prt_servcost%>
<%= curlistRec.addm_prt_servcost%>
<%= curlistRec.sep_prt_servcost%>
<%= curlistRec.total%>
<%= curlistRec.base_make_servcost%>
<%= curlistRec.addm_make_servcost%>
<%= curlistRec.slip_clsf%>
<%= curlistRec.slip_proc_occr_dt%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.tax_stmt_dt%>
<%= curlistRec.tax_stmt_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jun 14 18:21:38 KST 2009 */