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


package chosun.ciis.pl.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1710_LDataSet(){}
	public PL_BAS_1710_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PL_BAS_1710_LPTCRLISTRecord rec = new PL_BAS_1710_LPTCRLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.aply_bgn_yymm = Util.checkString(rset0.getString("aply_bgn_yymm"));
			rec.aply_end_yymm = Util.checkString(rset0.getString("aply_end_yymm"));
			rec.sale_aply_clsf = Util.checkString(rset0.getString("sale_aply_clsf"));
			rec.sale_aply_clsf_nm = Util.checkString(rset0.getString("sale_aply_clsf_nm"));
			rec.sale_rate = Util.checkString(rset0.getString("sale_rate"));
			rec.purc_aply_clsf = Util.checkString(rset0.getString("purc_aply_clsf"));
			rec.purc_aply_clsf_nm = Util.checkString(rset0.getString("purc_aply_clsf_nm"));
			rec.purc_rate = Util.checkString(rset0.getString("purc_rate"));
			rec.cntr_amt = Util.checkString(rset0.getString("cntr_amt"));
			rec.dcrate_basi = Util.checkString(rset0.getString("dcrate_basi"));
			rec.dcrate_basi_rate = Util.checkString(rset0.getString("dcrate_basi_rate"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1710_LDataSet ds = (PL_BAS_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_BAS_1710_LPTCRLISTRecord ptcrlistRec = (PL_BAS_1710_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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

<%= ptcrlistRec.medi_cd%>
<%= ptcrlistRec.dlco_clsf%>
<%= ptcrlistRec.dlco_clsf_nm%>
<%= ptcrlistRec.aply_bgn_yymm%>
<%= ptcrlistRec.aply_end_yymm%>
<%= ptcrlistRec.sale_aply_clsf%>
<%= ptcrlistRec.sale_aply_clsf_nm%>
<%= ptcrlistRec.sale_rate%>
<%= ptcrlistRec.purc_aply_clsf%>
<%= ptcrlistRec.purc_aply_clsf_nm%>
<%= ptcrlistRec.purc_rate%>
<%= ptcrlistRec.cntr_amt%>
<%= ptcrlistRec.dcrate_basi%>
<%= ptcrlistRec.dcrate_basi_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 20:27:49 KST 2009 */