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


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1930_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_1930_LDataSet(){}
	public HD_YADJM_1930_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_YADJM_1930_LCURLISTRecord rec = new HD_YADJM_1930_LCURLISTRecord();
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.firmnm = Util.checkString(rset0.getString("firmnm"));
			rec.dona_plac_clsf = Util.checkString(rset0.getString("dona_plac_clsf"));
			rec.dona_yymm = Util.checkString(rset0.getString("dona_yymm"));
			rec.dona_ptcr_noit = Util.checkString(rset0.getString("dona_ptcr_noit"));
			rec.dona_ptcr_amt = Util.checkString(rset0.getString("dona_ptcr_amt"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.rshp = Util.checkString(rset0.getString("rshp"));
			rec.obj_pers_flnm = Util.checkString(rset0.getString("obj_pers_flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.corr_txn_prd_dduc_amt = Util.checkString(rset0.getString("corr_txn_prd_dduc_amt"));
			rec.cyov_amt = Util.checkString(rset0.getString("cyov_amt"));
			rec.lastyear_cyov_amt = Util.checkString(rset0.getString("lastyear_cyov_amt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_1930_LDataSet ds = (HD_YADJM_1930_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_1930_LCURLISTRecord curlistRec = (HD_YADJM_1930_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.ern%>
<%= curlistRec.firmnm%>
<%= curlistRec.dona_plac_clsf%>
<%= curlistRec.dona_yymm%>
<%= curlistRec.dona_ptcr_noit%>
<%= curlistRec.dona_ptcr_amt%>
<%= curlistRec.rmks%>
<%= curlistRec.rshp%>
<%= curlistRec.obj_pers_flnm%>
<%= curlistRec.prn%>
<%= curlistRec.corr_txn_prd_dduc_amt%>
<%= curlistRec.cyov_amt%>
<%= curlistRec.lastyear_cyov_amt%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 11 19:37:49 KST 2012 */