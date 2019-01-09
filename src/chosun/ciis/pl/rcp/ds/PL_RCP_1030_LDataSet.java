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


public class PL_RCP_1030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList closinfocur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String gurt_amt;

	public PL_RCP_1030_LDataSet(){}
	public PL_RCP_1030_LDataSet(String errcode, String errmsg, String gurt_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.gurt_amt = gurt_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setGurt_amt(String gurt_amt){
		this.gurt_amt = gurt_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getGurt_amt(){
		return this.gurt_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.gurt_amt = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			PL_RCP_1030_LCLOSINFOCURRecord rec = new PL_RCP_1030_LCLOSINFOCURRecord();
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.medi_clsf_nm = Util.checkString(rset0.getString("medi_clsf_nm"));
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.cyov_bal = Util.checkString(rset0.getString("cyov_bal"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.thmm_bal = Util.checkString(rset0.getString("thmm_bal"));
			rec.meda_bal = Util.checkString(rset0.getString("meda_bal"));
			rec.tot_bal = Util.checkString(rset0.getString("tot_bal"));
			this.closinfocur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_1030_LDataSet ds = (PL_RCP_1030_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.closinfocur.size(); i++){
		PL_RCP_1030_LCLOSINFOCURRecord closinfocurRec = (PL_RCP_1030_LCLOSINFOCURRecord)ds.closinfocur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getGurt_amt()%>
<%= ds.getClosinfocur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= closinfocurRec.medi_clsf%>
<%= closinfocurRec.medi_clsf_nm%>
<%= closinfocurRec.basi_yymm%>
<%= closinfocurRec.cyov_bal%>
<%= closinfocurRec.sale_amt%>
<%= closinfocurRec.rcpm_amt%>
<%= closinfocurRec.thmm_bal%>
<%= closinfocurRec.meda_bal%>
<%= closinfocurRec.tot_bal%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 15 19:27:25 KST 2009 */