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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1702_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1702_LDataSet(){}
	public AS_ASET_1702_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AS_ASET_1702_LCURLISTRecord rec = new AS_ASET_1702_LCURLISTRecord();
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.rcpm_tot_amt = Util.checkString(rset0.getString("rcpm_tot_amt"));
			rec.actu_slip = Util.checkString(rset0.getString("actu_slip"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.misu_remk = Util.checkString(rset0.getString("misu_remk"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.ref_occr_dt = Util.checkString(rset0.getString("ref_occr_dt"));
			rec.ref_occr_seq = Util.checkString(rset0.getString("ref_occr_seq"));
			rec.actu_slip_dt = Util.checkString(rset0.getString("actu_slip_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.dlco_ern = Util.checkString(rset0.getString("dlco_ern"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1702_LDataSet ds = (AS_ASET_1702_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1702_LCURLISTRecord curlistRec = (AS_ASET_1702_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpm_dt%>
<%= curlistRec.remk%>
<%= curlistRec.rcpm_tot_amt%>
<%= curlistRec.actu_slip%>
<%= curlistRec.rcpm_shet_no%>
<%= curlistRec.chg_dt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.misu_amt%>
<%= curlistRec.misu_remk%>
<%= curlistRec.occr_dt%>
<%= curlistRec.occr_seq%>
<%= curlistRec.ref_occr_dt%>
<%= curlistRec.ref_occr_seq%>
<%= curlistRec.actu_slip_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.dlco_ern%>
<%= curlistRec.dlco_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 20:33:45 KST 2009 */