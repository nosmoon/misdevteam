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


public class PL_RCP_3310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_3310_LDataSet(){}
	public PL_RCP_3310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			PL_RCP_3310_LPTCRLISTRecord rec = new PL_RCP_3310_LPTCRLISTRecord();
			rec.colt_clsf_nm = Util.checkString(rset0.getString("colt_clsf_nm"));
			rec.setup_stat_nm = Util.checkString(rset0.getString("setup_stat_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.colt_obj_nm = Util.checkString(rset0.getString("colt_obj_nm"));
			rec.prty_rank = Util.checkString(rset0.getString("prty_rank"));
			rec.acqr_dt = Util.checkString(rset0.getString("acqr_dt"));
			rec.colt_setup_amt = Util.checkString(rset0.getString("colt_setup_amt"));
			rec.plcw = Util.checkString(rset0.getString("plcw"));
			rec.gurt_strt_dd = Util.checkString(rset0.getString("gurt_strt_dd"));
			rec.gurt_end_dd = Util.checkString(rset0.getString("gurt_end_dd"));
			rec.insr_stock_no = Util.checkString(rset0.getString("insr_stock_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_3310_LDataSet ds = (PL_RCP_3310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_RCP_3310_LPTCRLISTRecord ptcrlistRec = (PL_RCP_3310_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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

<%= ptcrlistRec.colt_clsf_nm%>
<%= ptcrlistRec.setup_stat_nm%>
<%= ptcrlistRec.dlco_cd%>
<%= ptcrlistRec.dlco_seq%>
<%= ptcrlistRec.dlco_nm%>
<%= ptcrlistRec.dlco_abrv_nm%>
<%= ptcrlistRec.colt_obj_nm%>
<%= ptcrlistRec.prty_rank%>
<%= ptcrlistRec.acqr_dt%>
<%= ptcrlistRec.colt_setup_amt%>
<%= ptcrlistRec.plcw%>
<%= ptcrlistRec.gurt_strt_dd%>
<%= ptcrlistRec.gurt_end_dd%>
<%= ptcrlistRec.insr_stock_no%>
<%= ptcrlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */