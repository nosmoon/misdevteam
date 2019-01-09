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


package chosun.ciis.pl.cls.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.rec.*;

/**
 * 
 */


public class PL_CLS_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_CLS_1410_LDataSet(){}
	public PL_CLS_1410_LDataSet(String errcode, String errmsg){
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
			PL_CLS_1410_LPTCRLISTRecord rec = new PL_CLS_1410_LPTCRLISTRecord();
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.deli_qty = Util.checkString(rset0.getString("deli_qty"));
			rec.deli_amt = Util.checkString(rset0.getString("deli_amt"));
			rec.widr_qty = Util.checkString(rset0.getString("widr_qty"));
			rec.widr_amt = Util.checkString(rset0.getString("widr_amt"));
			rec.retn_qty = Util.checkString(rset0.getString("retn_qty"));
			rec.retn_amt = Util.checkString(rset0.getString("retn_amt"));
			rec.sale_qty = Util.checkString(rset0.getString("sale_qty"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.temp_clos_emp_no = Util.checkString(rset0.getString("temp_clos_emp_no"));
			rec.sale_clos_emp_no = Util.checkString(rset0.getString("sale_clos_emp_no"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_CLS_1410_LDataSet ds = (PL_CLS_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_CLS_1410_LPTCRLISTRecord ptcrlistRec = (PL_CLS_1410_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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

<%= ptcrlistRec.basi_yymm%>
<%= ptcrlistRec.basi_dt%>
<%= ptcrlistRec.slip_no%>
<%= ptcrlistRec.deli_qty%>
<%= ptcrlistRec.deli_amt%>
<%= ptcrlistRec.widr_qty%>
<%= ptcrlistRec.widr_amt%>
<%= ptcrlistRec.retn_qty%>
<%= ptcrlistRec.retn_amt%>
<%= ptcrlistRec.sale_qty%>
<%= ptcrlistRec.sale_amt%>
<%= ptcrlistRec.temp_clos_emp_no%>
<%= ptcrlistRec.sale_clos_emp_no%>
<%= ptcrlistRec.medi_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 16 16:46:24 KST 2009 */