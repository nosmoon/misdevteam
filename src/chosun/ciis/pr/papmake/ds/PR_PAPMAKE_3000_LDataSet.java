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


public class PR_PAPMAKE_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_3000_LDataSet(){}
	public PR_PAPMAKE_3000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PR_PAPMAKE_3000_LCURLISTRecord rec = new PR_PAPMAKE_3000_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.basi_prt_qty = Util.checkString(rset0.getString("basi_prt_qty"));
			rec.base_servcost = Util.checkString(rset0.getString("base_servcost"));
			rec.basi_excs_qty = Util.checkString(rset0.getString("basi_excs_qty"));
			rec.basi_excs_servcost = Util.checkString(rset0.getString("basi_excs_servcost"));
			rec.basi_make_pcnt = Util.checkString(rset0.getString("basi_make_pcnt"));
			rec.base_make_servcost = Util.checkString(rset0.getString("base_make_servcost"));
			rec.basi_excs_pcnt = Util.checkString(rset0.getString("basi_excs_pcnt"));
			rec.basi_excs_make_servcost = Util.checkString(rset0.getString("basi_excs_make_servcost"));
			rec.basi_ovt_prt_qty = Util.checkString(rset0.getString("basi_ovt_prt_qty"));
			rec.basi_sep_prtn_servcost = Util.checkString(rset0.getString("basi_sep_prtn_servcost"));
			rec.crps_cost = Util.checkString(rset0.getString("crps_cost"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_3000_LDataSet ds = (PR_PAPMAKE_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_3000_LCURLISTRecord curlistRec = (PR_PAPMAKE_3000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.seq%>
<%= curlistRec.aply_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.basi_prt_qty%>
<%= curlistRec.base_servcost%>
<%= curlistRec.basi_excs_qty%>
<%= curlistRec.basi_excs_servcost%>
<%= curlistRec.basi_make_pcnt%>
<%= curlistRec.base_make_servcost%>
<%= curlistRec.basi_excs_pcnt%>
<%= curlistRec.basi_excs_make_servcost%>
<%= curlistRec.basi_ovt_prt_qty%>
<%= curlistRec.basi_sep_prtn_servcost%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 17:04:43 KST 2009 */