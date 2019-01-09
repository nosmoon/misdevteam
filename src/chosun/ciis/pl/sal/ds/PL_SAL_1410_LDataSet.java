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


package chosun.ciis.pl.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.sal.dm.*;
import chosun.ciis.pl.sal.rec.*;

/**
 * 
 */


public class PL_SAL_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ordr_ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_SAL_1410_LDataSet(){}
	public PL_SAL_1410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			PL_SAL_1410_LORDR_PTCRLISTRecord rec = new PL_SAL_1410_LORDR_PTCRLISTRecord();
			rec.ordr_dt = Util.checkString(rset0.getString("ordr_dt"));
			rec.ordr_grp_seq = Util.checkString(rset0.getString("ordr_grp_seq"));
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			rec.owh_yn = Util.checkString(rset0.getString("owh_yn"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.phone_no = Util.checkString(rset0.getString("phone_no"));
			rec.send_plac_addr = Util.checkString(rset0.getString("send_plac_addr"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.deal_qty = Util.checkString(rset0.getString("deal_qty"));
			rec.deal_amt = Util.checkString(rset0.getString("deal_amt"));
			this.ordr_ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_SAL_1410_LDataSet ds = (PL_SAL_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ordr_ptcrlist.size(); i++){
		PL_SAL_1410_LORDR_PTCRLISTRecord ordr_ptcrlistRec = (PL_SAL_1410_LORDR_PTCRLISTRecord)ds.ordr_ptcrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getOrdr_ptcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= ordr_ptcrlistRec.ordr_dt%>
<%= ordr_ptcrlistRec.ordr_grp_seq%>
<%= ordr_ptcrlistRec.basi_dt%>
<%= ordr_ptcrlistRec.send_plac_nm%>
<%= ordr_ptcrlistRec.owh_yn%>
<%= ordr_ptcrlistRec.rcpm_amt%>
<%= ordr_ptcrlistRec.medi_clsf%>
<%= ordr_ptcrlistRec.dlco_cd%>
<%= ordr_ptcrlistRec.dlco_seq%>
<%= ordr_ptcrlistRec.dlco_nm%>
<%= ordr_ptcrlistRec.phone_no%>
<%= ordr_ptcrlistRec.send_plac_addr%>
<%= ordr_ptcrlistRec.clos_yn%>
<%= ordr_ptcrlistRec.deal_qty%>
<%= ordr_ptcrlistRec.deal_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 20:36:33 KST 2009 */