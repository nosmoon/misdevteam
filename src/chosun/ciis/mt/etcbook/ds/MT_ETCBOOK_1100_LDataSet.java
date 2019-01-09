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


package chosun.ciis.mt.etcbook.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcbook.dm.*;
import chosun.ciis.mt.etcbook.rec.*;

/**
 * 
 */


public class MT_ETCBOOK_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCBOOK_1100_LDataSet(){}
	public MT_ETCBOOK_1100_LDataSet(String errcode, String errmsg){
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
			MT_ETCBOOK_1100_LCURLISTRecord rec = new MT_ETCBOOK_1100_LCURLISTRecord();
			rec.ck = Util.checkString(rset0.getString("ck"));
			rec.clam_dt = Util.checkString(rset0.getString("clam_dt"));
			rec.draft_deptnm = Util.checkString(rset0.getString("draft_deptnm"));
			rec.subs_frdt = Util.checkString(rset0.getString("subs_frdt"));
			rec.sbend_dt = Util.checkString(rset0.getString("sbend_dt"));
			rec.book_cd = Util.checkString(rset0.getString("book_cd"));
			rec.book_nm = Util.checkString(rset0.getString("book_nm"));
			rec.qty = rset0.getInt("qty");
			rec.uprc_won = rset0.getInt("uprc_won");
			rec.curc_clsf = Util.checkString(rset0.getString("curc_clsf"));
			rec.uprc_frex = rset0.getInt("uprc_frex");
			rec.dlvs_plac = Util.checkString(rset0.getString("dlvs_plac"));
			rec.dlvs_dt = Util.checkString(rset0.getString("dlvs_dt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.extd_dt = Util.checkString(rset0.getString("extd_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.buy_plac_clsf = Util.checkString(rset0.getString("buy_plac_clsf"));
			rec.istt_hdqt_yn = Util.checkString(rset0.getString("istt_hdqt_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCBOOK_1100_LDataSet ds = (MT_ETCBOOK_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCBOOK_1100_LCURLISTRecord curlistRec = (MT_ETCBOOK_1100_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.ck%>
<%= curlistRec.clam_dt%>
<%= curlistRec.draft_deptnm%>
<%= curlistRec.subs_frdt%>
<%= curlistRec.sbend_dt%>
<%= curlistRec.book_cd%>
<%= curlistRec.book_nm%>
<%= curlistRec.qty%>
<%= curlistRec.uprc_won%>
<%= curlistRec.curc_clsf%>
<%= curlistRec.uprc_frex%>
<%= curlistRec.dlvs_plac%>
<%= curlistRec.dlvs_dt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.dept_cd%>
<%= curlistRec.aplc_dt%>
<%= curlistRec.extd_dt%>
<%= curlistRec.remk%>
<%= curlistRec.buy_plac_clsf%>
<%= curlistRec.istt_hdqt_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 17:16:18 KST 2009 */