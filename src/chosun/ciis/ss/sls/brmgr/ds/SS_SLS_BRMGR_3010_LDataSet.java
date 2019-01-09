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


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_3010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String closyn;

	public SS_SLS_BRMGR_3010_LDataSet(){}
	public SS_SLS_BRMGR_3010_LDataSet(String errcode, String errmsg, String closyn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.closyn = closyn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_SLS_BRMGR_3010_LCURCOMMLISTRecord rec = new SS_SLS_BRMGR_3010_LCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.gugun = Util.checkString(rset0.getString("gugun"));
			rec.noval_qty = Util.checkString(rset0.getString("noval_qty"));
			rec.val_qty = Util.checkString(rset0.getString("val_qty"));
			rec.nocnfm_qty = Util.checkString(rset0.getString("nocnfm_qty"));
			rec.err_qty = Util.checkString(rset0.getString("err_qty"));
			rec.dup_err_qty = Util.checkString(rset0.getString("dup_err_qty"));
			rec.bs_qty = Util.checkString(rset0.getString("bs_qty"));
			rec.resv_qty = Util.checkString(rset0.getString("resv_qty"));
			rec.icdc_qty = Util.checkString(rset0.getString("icdc_qty"));
			rec.issu_qty = Util.checkString(rset0.getString("issu_qty"));
			rec.postyn = Util.checkString(rset0.getString("postyn"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			this.curcommlist.add(rec);
		}
		this.closyn = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_3010_LDataSet ds = (SS_SLS_BRMGR_3010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_BRMGR_3010_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_BRMGR_3010_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getClosyn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.gugun%>
<%= curcommlistRec.noval_qty%>
<%= curcommlistRec.val_qty%>
<%= curcommlistRec.nocnfm_qty%>
<%= curcommlistRec.err_qty%>
<%= curcommlistRec.dup_err_qty%>
<%= curcommlistRec.bs_qty%>
<%= curcommlistRec.resv_qty%>
<%= curcommlistRec.icdc_qty%>
<%= curcommlistRec.issu_qty%>
<%= curcommlistRec.postyn%>
<%= curcommlistRec.issu_dt%>
<%= curcommlistRec.medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 09 17:06:24 KST 2017 */