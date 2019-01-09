/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1104_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_1104_LDataSet(){}
	public HD_LVCMPY_1104_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_1104_LCURLISTRecord rec = new HD_LVCMPY_1104_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.saly_pay_mm = Util.checkString(rset0.getString("saly_pay_mm"));
			rec.saly_fr_dt = Util.checkString(rset0.getString("saly_fr_dt"));
			rec.saly_to_dt = Util.checkString(rset0.getString("saly_to_dt"));
			rec.saly_cnt = Util.checkString(rset0.getString("saly_cnt"));
			rec.pay_saly1 = Util.checkString(rset0.getString("pay_saly1"));
			rec.pay_saly2 = Util.checkString(rset0.getString("pay_saly2"));
			rec.yymm_alon1 = Util.checkString(rset0.getString("yymm_alon1"));
			rec.yymm_alon2 = Util.checkString(rset0.getString("yymm_alon2"));
			rec.hody_alon1 = Util.checkString(rset0.getString("hody_alon1"));
			rec.hody_alon2 = Util.checkString(rset0.getString("hody_alon2"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			HD_LVCMPY_1104_LCURLIST2Record rec = new HD_LVCMPY_1104_LCURLIST2Record();
			rec.saly_total_cnt = Util.checkString(rset1.getString("saly_total_cnt"));
			rec.sum_total_saly1 = Util.checkString(rset1.getString("sum_total_saly1"));
			rec.sum_total_saly2 = Util.checkString(rset1.getString("sum_total_saly2"));
			rec.sum_total_yymm1 = Util.checkString(rset1.getString("sum_total_yymm1"));
			rec.sum_total_yymm2 = Util.checkString(rset1.getString("sum_total_yymm2"));
			rec.sum_total_hody1 = Util.checkString(rset1.getString("sum_total_hody1"));
			rec.sum_total_hody2 = Util.checkString(rset1.getString("sum_total_hody2"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_1104_LDataSet ds = (HD_LVCMPY_1104_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_1104_LCURLISTRecord curlistRec = (HD_LVCMPY_1104_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_LVCMPY_1104_LCURLIST2Record curlist2Rec = (HD_LVCMPY_1104_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.saly_pay_mm%>
<%= curlistRec.saly_fr_dt%>
<%= curlistRec.saly_to_dt%>
<%= curlistRec.saly_cnt%>
<%= curlistRec.pay_saly1%>
<%= curlistRec.pay_saly2%>
<%= curlistRec.yymm_alon1%>
<%= curlistRec.yymm_alon2%>
<%= curlistRec.hody_alon1%>
<%= curlistRec.hody_alon2%>
<%= curlist2Rec.saly_total_cnt%>
<%= curlist2Rec.sum_total_saly1%>
<%= curlist2Rec.sum_total_saly2%>
<%= curlist2Rec.sum_total_yymm1%>
<%= curlist2Rec.sum_total_yymm2%>
<%= curlist2Rec.sum_total_hody1%>
<%= curlist2Rec.sum_total_hody2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 18 18:29:09 KST 2016 */