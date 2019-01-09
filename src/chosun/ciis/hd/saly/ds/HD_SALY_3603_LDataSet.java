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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_3603_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_3603_LDataSet(){}
	public HD_SALY_3603_LDataSet(String errcode, String errmsg){
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
			HD_SALY_3603_LCURLISTRecord rec = new HD_SALY_3603_LCURLISTRecord();
			rec.saly_yy = Util.checkString(rset0.getString("saly_yy"));
			rec.saly_no = Util.checkString(rset0.getString("saly_no"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.bsgwanm = Util.checkString(rset0.getString("bsgwanm"));
			rec.pay_saly = Util.checkString(rset0.getString("pay_saly"));
			rec.yymm_alon = Util.checkString(rset0.getString("yymm_alon"));
			rec.hody_alon = Util.checkString(rset0.getString("hody_alon"));
			rec.non_regu_alon_stot = Util.checkString(rset0.getString("non_regu_alon_stot"));
			rec.etc_saly_amt1 = Util.checkString(rset0.getString("etc_saly_amt1"));
			rec.etc_saly_amt = Util.checkString(rset0.getString("etc_saly_amt"));
			rec.lvcmpy_alon = Util.checkString(rset0.getString("lvcmpy_alon"));
			rec.corr_base_stay_fee = Util.checkString(rset0.getString("corr_base_stay_fee"));
			rec.bns = Util.checkString(rset0.getString("bns"));
			rec.mm_saly = Util.checkString(rset0.getString("mm_saly"));
			rec.non_tax_stot = Util.checkString(rset0.getString("non_tax_stot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_3603_LDataSet ds = (HD_SALY_3603_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_3603_LCURLISTRecord curlistRec = (HD_SALY_3603_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.saly_yy%>
<%= curlistRec.saly_no%>
<%= curlistRec.enp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.bsgwanm%>
<%= curlistRec.pay_saly%>
<%= curlistRec.yymm_alon%>
<%= curlistRec.hody_alon%>
<%= curlistRec.non_regu_alon_stot%>
<%= curlistRec.etc_saly_amt1%>
<%= curlistRec.etc_saly_amt%>
<%= curlistRec.lvcmpy_alon%>
<%= curlistRec.corr_base_stay_fee%>
<%= curlistRec.bns%>
<%= curlistRec.mm_saly%>
<%= curlistRec.non_tax_stot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 10 10:14:34 KST 2013 */