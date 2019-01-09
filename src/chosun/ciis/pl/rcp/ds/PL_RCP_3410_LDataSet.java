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


public class PL_RCP_3410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_3410_LDataSet(){}
	public PL_RCP_3410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset8 = (ResultSet) cstmt.getObject(11);
		while(rset8.next()){
			PL_RCP_3410_LPTCRLISTRecord rec = new PL_RCP_3410_LPTCRLISTRecord();
			rec.dlco_clsf_nm = Util.checkString(rset8.getString("dlco_clsf_nm"));
			rec.area_nm = Util.checkString(rset8.getString("area_nm"));
			rec.dlco_cd = Util.checkString(rset8.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset8.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset8.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset8.getString("dlco_abrv_nm"));
			rec.cyov_bal = Util.checkString(rset8.getString("cyov_bal"));
			rec.sale_amt = Util.checkString(rset8.getString("sale_amt"));
			rec.bal_sum = Util.checkString(rset8.getString("bal_sum"));
			rec.rcpm_amt = Util.checkString(rset8.getString("rcpm_amt"));
			rec.meda_bal = Util.checkString(rset8.getString("meda_bal"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_3410_LDataSet ds = (PL_RCP_3410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_RCP_3410_LPTCRLISTRecord ptcrlistRec = (PL_RCP_3410_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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
<%= ptcrlistRec.cyov_bal%>
<%= ptcrlistRec.sale_amt%>
<%= ptcrlistRec.bal_sum%>
<%= ptcrlistRec.rcpm_amt%>
<%= ptcrlistRec.meda_bal%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */