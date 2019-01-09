/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
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


public class PL_CLS_1740_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_CLS_1740_LDataSet(){}
	public PL_CLS_1740_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PL_CLS_1740_LPTCRLISTRecord rec = new PL_CLS_1740_LPTCRLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.gnr_qty = Util.checkString(rset0.getString("gnr_qty"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.slip_yn = Util.checkString(rset0.getString("slip_yn"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_CLS_1740_LDataSet ds = (PL_CLS_1740_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_CLS_1740_LPTCRLISTRecord ptcrlistRec = (PL_CLS_1740_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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

<%= ptcrlistRec.yymm%>
<%= ptcrlistRec.gnr_qty%>
<%= ptcrlistRec.amt%>
<%= ptcrlistRec.net_sale_amt%>
<%= ptcrlistRec.slip_yn%>
<%= ptcrlistRec.incmg_dt_tm%>
<%= ptcrlistRec.slip_occr_dt%>
<%= ptcrlistRec.slip_seq%>
<%= ptcrlistRec.slip_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 31 10:54:08 KST 2017 */