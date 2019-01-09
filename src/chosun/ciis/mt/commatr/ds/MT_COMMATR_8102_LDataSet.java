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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_8102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_8102_LDataSet(){}
	public MT_COMMATR_8102_LDataSet(String errcode, String errmsg){
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
			MT_COMMATR_8102_LCURLISTRecord rec = new MT_COMMATR_8102_LCURLISTRecord();
			rec.somodat = Util.checkString(rset0.getString("somodat"));
			rec.bpwt = Util.checkString(rset0.getString("bpwt"));
			rec.pchpwt_1 = Util.checkString(rset0.getString("pchpwt_1"));
			rec.pchpwt = Util.checkString(rset0.getString("pchpwt"));
			rec.pcsim62cnt = Util.checkString(rset0.getString("pcsim62cnt"));
			rec.pcsim31cnt = Util.checkString(rset0.getString("pcsim31cnt"));
			rec.pcsim46cnt = Util.checkString(rset0.getString("pcsim46cnt"));
			rec.pcseoljiwt = Util.checkString(rset0.getString("pcseoljiwt"));
			rec.hpdan = Util.checkString(rset0.getString("hpdan"));
			rec.sim62dan = Util.checkString(rset0.getString("sim62dan"));
			rec.sim31dan = Util.checkString(rset0.getString("sim31dan"));
			rec.sim46dan = Util.checkString(rset0.getString("sim46dan"));
			rec.seoldan = Util.checkString(rset0.getString("seoldan"));
			rec.pcgitapaji = Util.checkString(rset0.getString("pcgitapaji"));
			rec.gitadan = Util.checkString(rset0.getString("gitadan"));
			rec.bpdan = Util.checkString(rset0.getString("bpdan"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));			
			this.curlist.add(rec);
		}
		
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_COMMATR_8102_LCURLIST2Record rec = new MT_COMMATR_8102_LCURLIST2Record();
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.titl = Util.checkString(rset1.getString("titl"));
			rec.reso_amt = Util.checkString(rset1.getString("reso_amt"));
			rec.adpay_amt = Util.checkString(rset1.getString("adpay_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_8102_LDataSet ds = (MT_COMMATR_8102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_8102_LCURLISTRecord curlistRec = (MT_COMMATR_8102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.somodat%>
<%= curlistRec.bpwt%>
<%= curlistRec.pchpwt_1%>
<%= curlistRec.pchpwt%>
<%= curlistRec.pcsim62cnt%>
<%= curlistRec.pcsim31cnt%>
<%= curlistRec.pcsim46cnt%>
<%= curlistRec.pcseoljiwt%>
<%= curlistRec.hpdan%>
<%= curlistRec.sim62dan%>
<%= curlistRec.sim31dan%>
<%= curlistRec.sim46dan%>
<%= curlistRec.seoldan%>
<%= curlistRec.pcgitapaji%>
<%= curlistRec.gitadan%>
<%= curlistRec.bpdan%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 15 17:28:43 KST 2013 */