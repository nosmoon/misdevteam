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


public class PL_RCP_3010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_3010_LDataSet(){}
	public PL_RCP_3010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			PL_RCP_3010_LPTCRLISTRecord rec = new PL_RCP_3010_LPTCRLISTRecord();
			rec.dlco_clsf_nm = Util.checkString(rset2.getString("dlco_clsf_nm"));
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset2.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset2.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset2.getString("dlco_abrv_nm"));
			rec.rcpm_dt = Util.checkString(rset2.getString("rcpm_dt"));
			rec.rcpm_shet_no = Util.checkString(rset2.getString("rcpm_shet_no"));
			rec.budg_nm1 = Util.checkString(rset2.getString("budg_nm1"));
			rec.d_amt = Util.checkString(rset2.getString("d_amt"));
			rec.budg_nm2 = Util.checkString(rset2.getString("budg_nm2"));
			rec.c_amt = Util.checkString(rset2.getString("c_amt"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_3010_LDataSet ds = (PL_RCP_3010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_RCP_3010_LPTCRLISTRecord ptcrlistRec = (PL_RCP_3010_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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
<%= ptcrlistRec.dlco_cd%>
<%= ptcrlistRec.dlco_seq%>
<%= ptcrlistRec.dlco_nm%>
<%= ptcrlistRec.dlco_abrv_nm%>
<%= ptcrlistRec.rcpm_dt%>
<%= ptcrlistRec.rcpm_shet_no%>
<%= ptcrlistRec.budg_nm1%>
<%= ptcrlistRec.d_amt%>
<%= ptcrlistRec.budg_nm2%>
<%= ptcrlistRec.c_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 17:49:59 KST 2009 */