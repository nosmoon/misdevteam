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


public class PR_PAPMAKE_1003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_1003_LDataSet(){}
	public PR_PAPMAKE_1003_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_1003_LCURLISTRecord rec = new PR_PAPMAKE_1003_LCURLISTRecord();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.ecnt = Util.checkString(rset0.getString("ecnt"));
			rec.ledt_cd = Util.checkString(rset0.getString("ledt_cd"));
			rec.prt_seq = Util.checkString(rset0.getString("prt_seq"));
			rec.fld_no = Util.checkString(rset0.getString("fld_no"));
			rec.sect = Util.checkString(rset0.getString("sect"));
			rec.last_edt_page = Util.checkString(rset0.getString("last_edt_page"));
			rec.off_plat_tm = Util.checkString(rset0.getString("off_plat_tm"));
			rec.off_plat_end_tm = Util.checkString(rset0.getString("off_plat_end_tm"));
			rec.prt_ex_tm = Util.checkString(rset0.getString("prt_ex_tm"));
			rec.prt_end_tm = Util.checkString(rset0.getString("prt_end_tm"));
			rec.prt_qty = Util.checkString(rset0.getString("prt_qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_1003_LDataSet ds = (PR_PAPMAKE_1003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_1003_LCURLISTRecord curlistRec = (PR_PAPMAKE_1003_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.issu_dt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.ecnt%>
<%= curlistRec.ledt_cd%>
<%= curlistRec.prt_seq%>
<%= curlistRec.fld_no%>
<%= curlistRec.sect%>
<%= curlistRec.last_edt_page%>
<%= curlistRec.off_plat_tm%>
<%= curlistRec.off_plat_end_tm%>
<%= curlistRec.prt_ex_tm%>
<%= curlistRec.prt_end_tm%>
<%= curlistRec.prt_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 16 16:02:14 KST 2009 */