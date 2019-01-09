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


package chosun.ciis.mt.submatrcla.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRCLA_1120_LDataSet(){}
	public MT_SUBMATRCLA_1120_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_SUBMATRCLA_1120_LCURLISTRecord rec = new MT_SUBMATRCLA_1120_LCURLISTRecord();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.clam_qunt = Util.checkString(rset0.getString("clam_qunt"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.pay_posb_dt = Util.checkString(rset0.getString("pay_posb_dt"));
			rec.fix_qunt = Util.checkString(rset0.getString("fix_qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.res_yn = Util.checkString(rset0.getString("res_yn"));
			rec.recp_pers = Util.checkString(rset0.getString("recp_pers"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.job_cntc_no = Util.checkString(rset0.getString("job_cntc_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.misno_matr = Util.checkString(rset0.getString("misno_matr"));
			rec.apcn_dt = Util.checkString(rset0.getString("apcn_dt"));
			rec.clam_clsf = Util.checkString(rset0.getString("clam_clsf"));
			rec.paper_clsf = Util.checkString(rset0.getString("paper_clsf"));
			rec.frex_unit = Util.checkString(rset0.getString("frex_unit"));
			rec.frex_uprc = Util.checkString(rset0.getString("frex_uprc"));

			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRCLA_1120_LDataSet ds = (MT_SUBMATRCLA_1120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRCLA_1120_LCURLISTRecord curlistRec = (MT_SUBMATRCLA_1120_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.matr_cd%>
<%= curlistRec.item_nm%>
<%= curlistRec.std%>
<%= curlistRec.unit%>
<%= curlistRec.clam_qunt%>
<%= curlistRec.usag%>
<%= curlistRec.pay_posb_dt%>
<%= curlistRec.fix_qunt%>
<%= curlistRec.uprc%>
<%= curlistRec.amt%>
<%= curlistRec.res_yn%>
<%= curlistRec.recp_pers%>
<%= curlistRec.nm_korn%>
<%= curlistRec.job_cntc_no%>
<%= curlistRec.remk%>
<%= curlistRec.sub_seq%>
<%= curlistRec.seq%>
<%= curlistRec.occr_dt%>
<%= curlistRec.misno_matr%>
<%= curlistRec.apcn_dt%>
<%= curlistRec.clam_clsf%>
<%= curlistRec.paper_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 07 20:37:36 KST 2009 */