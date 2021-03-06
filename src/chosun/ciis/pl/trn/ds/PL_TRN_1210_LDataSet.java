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


package chosun.ciis.pl.trn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.trn.dm.*;
import chosun.ciis.pl.trn.rec.*;

/**
 * 
 */


public class PL_TRN_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deal_ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_TRN_1210_LDataSet(){}
	public PL_TRN_1210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset9 = (ResultSet) cstmt.getObject(9);
		while(rset9.next()){
			PL_TRN_1210_LDEAL_PTCRLISTRecord rec = new PL_TRN_1210_LDEAL_PTCRLISTRecord();
			rec.deal_dt = Util.checkString(rset9.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset9.getString("deal_grp_seq"));
			rec.dlco_cd = Util.checkString(rset9.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset9.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset9.getString("dlco_nm"));
			rec.send_plac_seq = Util.checkString(rset9.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset9.getString("send_plac_nm"));
			rec.basi_yymm = Util.checkString(rset9.getString("basi_yymm"));
			rec.basi_dt = Util.checkString(rset9.getString("basi_dt"));
			rec.clos_yn = Util.checkString(rset9.getString("clos_yn"));
			rec.deal_qty = Util.checkString(rset9.getString("deal_qty"));
			rec.deal_amt = Util.checkString(rset9.getString("deal_amt"));
			this.deal_ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_TRN_1210_LDataSet ds = (PL_TRN_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.deal_ptcrlist.size(); i++){
		PL_TRN_1210_LDEAL_PTCRLISTRecord deal_ptcrlistRec = (PL_TRN_1210_LDEAL_PTCRLISTRecord)ds.deal_ptcrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeal_ptcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= deal_ptcrlistRec.deal_dt%>
<%= deal_ptcrlistRec.deal_grp_seq%>
<%= deal_ptcrlistRec.dlco_cd%>
<%= deal_ptcrlistRec.dlco_seq%>
<%= deal_ptcrlistRec.dlco_nm%>
<%= deal_ptcrlistRec.send_plac_seq%>
<%= deal_ptcrlistRec.send_plac_nm%>
<%= deal_ptcrlistRec.basi_yymm%>
<%= deal_ptcrlistRec.basi_dt%>
<%= deal_ptcrlistRec.clos_yn%>
<%= deal_ptcrlistRec.deal_qty%>
<%= deal_ptcrlistRec.deal_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 15 14:35:10 KST 2009 */