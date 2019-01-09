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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_1210_LDataSet(){}
	public AD_BAS_1210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			AD_BAS_1210_LCURLISTRecord rec = new AD_BAS_1210_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.cntr_seq = Util.checkString(rset0.getString("cntr_seq"));
			rec.cntr_dt = Util.checkString(rset0.getString("cntr_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.cntr_type = Util.checkString(rset0.getString("cntr_type"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_opn = Util.checkString(rset0.getString("slcrg_opn"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.mchrg_opn = Util.checkString(rset0.getString("mchrg_opn"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.colt_amt = Util.checkString(rset0.getString("colt_amt"));
			rec.mm_avg_pubc_amt = Util.checkString(rset0.getString("mm_avg_pubc_amt"));
			rec.colt_ratio = Util.checkString(rset0.getString("colt_ratio"));
			rec.avg_due_dd = Util.checkString(rset0.getString("avg_due_dd"));
			rec.taem_chf_opn = Util.checkString(rset0.getString("taem_chf_opn"));
			rec.main_dlco_nm = Util.checkString(rset0.getString("main_dlco_nm"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1210_LDataSet ds = (AD_BAS_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1210_LCURLISTRecord curlistRec = (AD_BAS_1210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.cntr_seq%>
<%= curlistRec.cntr_dt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.cntr_type%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.slcrg_opn%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.mchrg_opn%>
<%= curlistRec.presi_nm%>
<%= curlistRec.colt_amt%>
<%= curlistRec.mm_avg_pubc_amt%>
<%= curlistRec.colt_ratio%>
<%= curlistRec.avg_due_dd%>
<%= curlistRec.taem_chf_opn%>
<%= curlistRec.main_dlco_nm%>
<%= curlistRec.chg_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 10 10:54:13 KST 2012 */