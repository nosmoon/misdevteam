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


public class PL_CLS_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_CLS_1510_LDataSet(){}
	public PL_CLS_1510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PL_CLS_1510_LPTCRLISTRecord rec = new PL_CLS_1510_LPTCRLISTRecord();
			rec.basi_yymm = Util.checkString(rset3.getString("basi_yymm"));
			rec.basi_dt = Util.checkString(rset3.getString("basi_dt"));
			rec.cyov_bal = Util.checkString(rset3.getString("cyov_bal"));
			rec.sale_amt = Util.checkString(rset3.getString("sale_amt"));
			rec.rcpm_amt = Util.checkString(rset3.getString("rcpm_amt"));
			rec.retn_amt = Util.checkString(rset3.getString("retn_amt"));
			rec.meda_amt = Util.checkString(rset3.getString("meda_amt"));
			rec.mmbal_amt = Util.checkString(rset3.getString("mmbal_amt"));
			rec.totbal_amt = Util.checkString(rset3.getString("totbal_amt"));
			rec.clos_yn = Util.checkString(rset3.getString("clos_yn"));
			rec.temp_clos_emp_no = Util.checkString(rset3.getString("temp_clos_emp_no"));
			rec.sale_clos_emp_no = Util.checkString(rset3.getString("sale_clos_emp_no"));
			rec.medi_clsf = Util.checkString(rset3.getString("medi_clsf"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_CLS_1510_LDataSet ds = (PL_CLS_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_CLS_1510_LPTCRLISTRecord ptcrlistRec = (PL_CLS_1510_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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
<%= ptcrlistRec.cyov_bal%>
<%= ptcrlistRec.sale_amt%>
<%= ptcrlistRec.rcpm_amt%>
<%= ptcrlistRec.retn_amt%>
<%= ptcrlistRec.meda_amt%>
<%= ptcrlistRec.mmbal_amt%>
<%= ptcrlistRec.totbal_amt%>
<%= ptcrlistRec.clos_yn%>
<%= ptcrlistRec.temp_clos_emp_no%>
<%= ptcrlistRec.sale_clos_emp_no%>
<%= ptcrlistRec.medi_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 11:14:57 KST 2009 */