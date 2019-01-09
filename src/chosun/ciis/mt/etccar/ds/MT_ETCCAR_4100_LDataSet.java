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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_4100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_4100_LDataSet(){}
	public MT_ETCCAR_4100_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_ETCCAR_4100_LCURLIST1Record rec = new MT_ETCCAR_4100_LCURLIST1Record();
			rec.clam_dt = Util.checkString(rset0.getString("clam_dt"));
			rec.use_dt = Util.checkString(rset0.getString("use_dt"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.cmpy_mang_nm = Util.checkString(rset0.getString("cmpy_mang_nm"));
			rec.clam_item_kind = Util.checkString(rset0.getString("clam_item_kind"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.oil_clsf = Util.checkString(rset0.getString("oil_clsf"));
			rec.unit_prc = rset0.getInt("unit_prc");
			rec.qunt = rset0.getInt("qunt");
			rec.clam_amt = rset0.getInt("clam_amt");
			rec.dlco = Util.checkString(rset0.getString("dlco"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.clos_dt = Util.checkString(rset0.getString("clos_dt"));
			rec.itemclam_dt = Util.checkString(rset0.getString("itemclam_dt"));
			rec.itemclam_seq = Util.checkString(rset0.getString("itemclam_seq"));
			rec.itemclam_sub_seq = Util.checkString(rset0.getString("itemclam_sub_seq"));
			rec.clam_yn = Util.checkString(rset0.getString("clam_yn"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_4100_LDataSet ds = (MT_ETCCAR_4100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCCAR_4100_LCURLIST1Record curlist1Rec = (MT_ETCCAR_4100_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.clam_dt%>
<%= curlist1Rec.use_dt%>
<%= curlist1Rec.car_no%>
<%= curlist1Rec.cmpy_mang_nm%>
<%= curlist1Rec.clam_item_kind%>
<%= curlist1Rec.item_nm%>
<%= curlist1Rec.oil_clsf%>
<%= curlist1Rec.unit_prc%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.clam_amt%>
<%= curlist1Rec.dlco%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.clos_dt%>
<%= curlist1Rec.itemclam_dt%>
<%= curlist1Rec.itemclam_seq%>
<%= curlist1Rec.itemclam_sub_seq%>
<%= curlist1Rec.clam_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 24 10:12:55 KST 2012 */