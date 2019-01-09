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


public class PL_RCP_3510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_3510_LDataSet(){}
	public PL_RCP_3510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			PL_RCP_3510_LPTCRLISTRecord rec = new PL_RCP_3510_LPTCRLISTRecord();
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.magz_deal_yn = Util.checkString(rset0.getString("magz_deal_yn"));
			rec.sep_book_deal_yn = Util.checkString(rset0.getString("sep_book_deal_yn"));
			rec.gurt_amt_tot_amt = Util.checkString(rset0.getString("gurt_amt_tot_amt"));
			rec.gurt_amt_altn = Util.checkString(rset0.getString("gurt_amt_altn"));
			rec.gurt_amt = Util.checkString(rset0.getString("gurt_amt"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_3510_LDataSet ds = (PL_RCP_3510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_RCP_3510_LPTCRLISTRecord ptcrlistRec = (PL_RCP_3510_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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

<%= ptcrlistRec.dlco_clsf_nm%>
<%= ptcrlistRec.area_nm%>
<%= ptcrlistRec.dlco_cd%>
<%= ptcrlistRec.dlco_seq%>
<%= ptcrlistRec.dlco_nm%>
<%= ptcrlistRec.dlco_abrv_nm%>
<%= ptcrlistRec.magz_deal_yn%>
<%= ptcrlistRec.sep_book_deal_yn%>
<%= ptcrlistRec.gurt_amt_tot_amt%>
<%= ptcrlistRec.gurt_amt_altn%>
<%= ptcrlistRec.gurt_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 14:05:51 KST 2009 */