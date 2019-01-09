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


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_1320_LDataSet(){}
	public SE_SAL_1320_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SE_SAL_1320_LCURLISTRecord rec = new SE_SAL_1320_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.sub_dept_nm = Util.checkString(rset0.getString("sub_dept_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.jd_sell_net_clsf = Util.checkString(rset0.getString("jd_sell_net_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.prvmm_val_qty = Util.checkString(rset0.getString("prvmm_val_qty"));
			rec.cntr_uprc_be = Util.checkString(rset0.getString("cntr_uprc_be"));
			rec.net_sale_amt_be = Util.checkString(rset0.getString("net_sale_amt_be"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.icdc_uprc = Util.checkString(rset0.getString("icdc_uprc"));
			rec.cntr_uprc = Util.checkString(rset0.getString("cntr_uprc"));
			rec.dnt_amt = Util.checkString(rset0.getString("dnt_amt"));
			rec.fpymt_encur_amt = Util.checkString(rset0.getString("fpymt_encur_amt"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.rdff_rdu_uprc = Util.checkString(rset0.getString("rdff_rdu_uprc"));
			rec.rdff_rdu_uprc_be = Util.checkString(rset0.getString("rdff_rdu_uprc_be"));
			rec.basi_uprc = Util.checkString(rset0.getString("basi_uprc"));
			rec.icdc_net_sale_amt = Util.checkString(rset0.getString("icdc_net_sale_amt"));
			rec.icdc_area = Util.checkString(rset0.getString("icdc_area"));
			rec.basi_amt = Util.checkString(rset0.getString("basi_amt"));
			rec.surplus_amt = Util.checkString(rset0.getString("surplus_amt"));
			rec.subs_uprc = Util.checkString(rset0.getString("subs_uprc"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_1320_LDataSet ds = (SE_SAL_1320_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_1320_LCURLISTRecord curlistRec = (SE_SAL_1320_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yymm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.sub_dept_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_nm%>
<%= curlistRec.jd_sell_net_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.prvmm_val_qty%>
<%= curlistRec.cntr_uprc_be%>
<%= curlistRec.net_sale_amt_be%>
<%= curlistRec.qty%>
<%= curlistRec.icdc_uprc%>
<%= curlistRec.cntr_uprc%>
<%= curlistRec.dnt_amt%>
<%= curlistRec.fpymt_encur_amt%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.rdff_rdu_uprc%>
<%= curlistRec.rdff_rdu_uprc_be%>
<%= curlistRec.basi_uprc%>
<%= curlistRec.icdc_net_sale_amt%>
<%= curlistRec.icdc_area%>
<%= curlistRec.basi_amt%>
<%= curlistRec.surplus_amt%>
<%= curlistRec.subs_uprc%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 06 20:23:46 KST 2009 */