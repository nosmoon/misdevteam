/***************************************************************************************************
* 파일명 : 
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


package chosun.ciis.pl.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.rec.*;

/**
 * 
 */


public class PL_RCP_3210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_3210_LDataSet(){}
	public PL_RCP_3210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			PL_RCP_3210_LPTCRLISTRecord rec = new PL_RCP_3210_LPTCRLISTRecord();
			rec.rcpm_dt = Util.checkString(rset1.getString("rcpm_dt"));
			rec.basi_yymm = Util.checkString(rset1.getString("basi_yymm"));
			rec.dlco_clsf_nm = Util.checkString(rset1.getString("dlco_clsf_nm"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset1.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset1.getString("dlco_abrv_nm"));
			rec.rcpm_shet_no = Util.checkString(rset1.getString("rcpm_shet_no"));
			rec.rmtt_plac = Util.checkString(rset1.getString("rmtt_plac"));
			rec.budg_nm = Util.checkString(rset1.getString("budg_nm"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.rmtt_dt = Util.checkString(rset1.getString("rmtt_dt"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_3210_LDataSet ds = (PL_RCP_3210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_RCP_3210_LPTCRLISTRecord ptcrlistRec = (PL_RCP_3210_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPtcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= ptcrlistRec.rcpm_dt%>
<%= ptcrlistRec.basi_yymm%>
<%= ptcrlistRec.dlco_clsf_nm%>
<%= ptcrlistRec.dlco_cd%>
<%= ptcrlistRec.dlco_seq%>
<%= ptcrlistRec.dlco_nm%>
<%= ptcrlistRec.dlco_abrv_nm%>
<%= ptcrlistRec.rcpm_shet_no%>
<%= ptcrlistRec.rmtt_plac%>
<%= ptcrlistRec.budg_nm%>
<%= ptcrlistRec.amt%>
<%= ptcrlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 10 18:34:54 KST 2009 */