/***************************************************************************************************
* 파일명 : SE_MO_SAL_2320_LDataSet.java
* 기능 : 매출관리-출장전자료조회-지대청구 / 모바일) 지대마감 - 지대청구
* 작성일자 : 2017-03-01
* 작성자 : 장선희
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


public class SE_MO_SAL_2320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String title;

	public SE_MO_SAL_2320_LDataSet(){}
	public SE_MO_SAL_2320_LDataSet(String errcode, String errmsg, String title){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.title = title;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTitle(){
		return this.title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.title = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_MO_SAL_2320_LCURLISTRecord rec = new SE_MO_SAL_2320_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.app_gurt = Util.checkString(rset0.getString("app_gurt"));
			rec.net_sale_amt_610 = Util.checkString(rset0.getString("net_sale_amt_610"));
			rec.smt_amt1 = Util.checkString(rset0.getString("smt_amt1"));
			rec.compen_divn_amt = Util.checkString(rset0.getString("compen_divn_amt"));
			rec.tax_compen_divn_amt = Util.checkString(rset0.getString("tax_compen_divn_amt"));
			rec.vat_compen_divn_amt = Util.checkString(rset0.getString("vat_compen_divn_amt"));
			rec.smt_amt2 = Util.checkString(rset0.getString("smt_amt2"));
			rec.smt = Util.checkString(rset0.getString("smt"));
			rec.sub_amt = Util.checkString(rset0.getString("sub_amt"));
			rec.pdlv_altn_amt = Util.checkString(rset0.getString("pdlv_altn_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_MO_SAL_2320_LDataSet ds = (SE_MO_SAL_2320_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_MO_SAL_2320_LCURLISTRecord curlistRec = (SE_MO_SAL_2320_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTitle()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yymm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.app_gurt%>
<%= curlistRec.net_sale_amt_610%>
<%= curlistRec.smt_amt1%>
<%= curlistRec.compen_divn_amt%>
<%= curlistRec.tax_compen_divn_amt%>
<%= curlistRec.vat_compen_divn_amt%>
<%= curlistRec.smt_amt2%>
<%= curlistRec.smt%>
<%= curlistRec.sub_amt%>
<%= curlistRec.pdlv_altn_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 24 19:52:35 KST 2017 */