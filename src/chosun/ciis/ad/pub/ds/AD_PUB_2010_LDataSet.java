/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_2010_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tot_adv_fee;
	public String tot_area;
	public String tot_cnt;

	public AD_PUB_2010_LDataSet(){}
	public AD_PUB_2010_LDataSet(String errcode, String errmsg, String tot_adv_fee, String tot_area, String tot_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_adv_fee = tot_adv_fee;
		this.tot_area = tot_area;
		this.tot_cnt = tot_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_adv_fee(String tot_adv_fee){
		this.tot_adv_fee = tot_adv_fee;
	}

	public void setTot_area(String tot_area){
		this.tot_area = tot_area;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTot_adv_fee(){
		return this.tot_adv_fee;
	}

	public String getTot_area(){
		return this.tot_area;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.tot_adv_fee = Util.checkString(cstmt.getString(12));
		this.tot_area = Util.checkString(cstmt.getString(13));
		this.tot_cnt = Util.checkString(cstmt.getString(14));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			AD_PUB_2010_LCURLISTRecord rec = new AD_PUB_2010_LCURLISTRecord();
			rec.indt_clsf_nm1 = Util.checkString(rset0.getString("indt_clsf_nm1"));
			rec.indt_clsf_nm2 = Util.checkString(rset0.getString("indt_clsf_nm2"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.hndl_plac_cd = Util.checkString(rset0.getString("hndl_plac_cd"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.sum_area = Util.checkString(rset0.getString("sum_area"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.min_dt = Util.checkString(rset0.getString("min_dt"));
			rec.max_dt = Util.checkString(rset0.getString("max_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_2010_LDataSet ds = (AD_PUB_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2010_LCURLISTRecord curlistRec = (AD_PUB_2010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTot_adv_fee()%>
<%= ds.getTot_area()%>
<%= ds.getTot_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.indt_clsf_nm1%>
<%= curlistRec.indt_clsf_nm2%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn%>
<%= curlistRec.hndl_plac_cd%>
<%= curlistRec.advt_fee%>
<%= curlistRec.sum_area%>
<%= curlistRec.cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 26 15:44:57 KST 2009 */