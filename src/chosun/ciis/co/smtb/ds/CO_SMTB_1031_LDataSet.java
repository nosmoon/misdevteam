/***************************************************************************************************
* 파일명 : .java
* 기능 :  공통-세금계산서-목록조회(스마트빌)
* 작성일자 : 2010-03-23
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.smtb.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.rec.*;

/**
 * 공통-세금계산서-목록조회(스마트빌)
 */


public class CO_SMTB_1031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList tax_stmtlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_SMTB_1031_LDataSet(){}
	public CO_SMTB_1031_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			CO_SMTB_1031_LTAX_STMTLISTRecord rec = new CO_SMTB_1031_LTAX_STMTLISTRecord();
			rec.conversation_id = Util.checkString(rset0.getString("conversation_id"));
			rec.supbuy_type = Util.checkString(rset0.getString("supbuy_type"));
			rec.direction = Util.checkString(rset0.getString("direction"));
			rec.dti_wdate = Util.checkString(rset0.getString("dti_wdate"));
			rec.blank_cnt = Util.checkString(rset0.getString("blank_cnt"));
			rec.dti_type = Util.checkString(rset0.getString("dti_type"));
			rec.tax_demand = Util.checkString(rset0.getString("tax_demand"));
			rec.seq_id = Util.checkString(rset0.getString("seq_id"));
			rec.sup_com_id = Util.checkString(rset0.getString("sup_com_id"));
			rec.sup_com_regno = Util.checkString(rset0.getString("sup_com_regno"));
			rec.sup_rep_name = Util.checkString(rset0.getString("sup_rep_name"));
			rec.sup_com_name = Util.checkString(rset0.getString("sup_com_name"));
			rec.sup_com_type = Util.checkString(rset0.getString("sup_com_type"));
			rec.sup_com_classify = Util.checkString(rset0.getString("sup_com_classify"));
			rec.sup_com_addr = Util.checkString(rset0.getString("sup_com_addr"));
			rec.sup_bizplace_code = Util.checkString(rset0.getString("sup_bizplace_code"));
			rec.byr_com_regno = Util.checkString(rset0.getString("byr_com_regno"));
			rec.byr_rep_name = Util.checkString(rset0.getString("byr_rep_name"));
			rec.byr_com_name = Util.checkString(rset0.getString("byr_com_name"));
			rec.byr_com_type = Util.checkString(rset0.getString("byr_com_type"));
			rec.byr_com_classify = Util.checkString(rset0.getString("byr_com_classify"));
			rec.byr_com_addr = Util.checkString(rset0.getString("byr_com_addr"));
			rec.byr_tel_num = Util.checkString(rset0.getString("byr_tel_num"));
			rec.byr_email = Util.checkString(rset0.getString("byr_email"));
			rec.sup_amount = Util.checkString(rset0.getString("sup_amount"));
			rec.tax_amount = Util.checkString(rset0.getString("tax_amount"));
			rec.total_amount = Util.checkString(rset0.getString("total_amount"));
			rec.dtt_yn = Util.checkString(rset0.getString("dtt_yn"));
			rec.remark = Util.checkString(rset0.getString("remark"));
			rec.dti_status = Util.checkString(rset0.getString("dti_status"));
			rec.dti_status_nm = Util.checkString(rset0.getString("dti_status_nm"));
			rec.return_code = Util.checkString(rset0.getString("return_code"));
			rec.return_description = Util.checkString(rset0.getString("return_description"));
			rec.sbdescription = Util.checkString(rset0.getString("sbdescription"));
			rec.created_by = Util.checkString(rset0.getString("created_by"));
			rec.creation_date = Util.checkString(rset0.getString("creation_date"));
			rec.last_updated_by = Util.checkString(rset0.getString("last_updated_by"));
			rec.last_update_date = Util.checkString(rset0.getString("last_update_date"));
			rec.amend_code = Util.checkString(rset0.getString("amend_code"));
			rec.amend_code_nm = Util.checkString(rset0.getString("amend_code_nm"));
			this.tax_stmtlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_SMTB_1031_LDataSet ds = (CO_SMTB_1031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.tax_stmtlist.size(); i++){
		CO_SMTB_1031_LTAX_STMTLISTRecord tax_stmtlistRec = (CO_SMTB_1031_LTAX_STMTLISTRecord)ds.tax_stmtlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTax_stmtlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= tax_stmtlistRec.conversation_id%>
<%= tax_stmtlistRec.supbuy_type%>
<%= tax_stmtlistRec.direction%>
<%= tax_stmtlistRec.dti_wdate%>
<%= tax_stmtlistRec.blank_cnt%>
<%= tax_stmtlistRec.dti_type%>
<%= tax_stmtlistRec.tax_demand%>
<%= tax_stmtlistRec.seq_id%>
<%= tax_stmtlistRec.sup_com_id%>
<%= tax_stmtlistRec.sup_com_regno%>
<%= tax_stmtlistRec.sup_rep_name%>
<%= tax_stmtlistRec.sup_com_name%>
<%= tax_stmtlistRec.sup_com_type%>
<%= tax_stmtlistRec.sup_com_classify%>
<%= tax_stmtlistRec.sup_com_addr%>
<%= tax_stmtlistRec.sup_bizplace_code%>
<%= tax_stmtlistRec.byr_com_regno%>
<%= tax_stmtlistRec.byr_rep_name%>
<%= tax_stmtlistRec.byr_com_name%>
<%= tax_stmtlistRec.byr_com_type%>
<%= tax_stmtlistRec.byr_com_classify%>
<%= tax_stmtlistRec.byr_com_addr%>
<%= tax_stmtlistRec.byr_tel_num%>
<%= tax_stmtlistRec.byr_email%>
<%= tax_stmtlistRec.sup_amount%>
<%= tax_stmtlistRec.tax_amount%>
<%= tax_stmtlistRec.total_amount%>
<%= tax_stmtlistRec.dtt_yn%>
<%= tax_stmtlistRec.remark%>
<%= tax_stmtlistRec.dti_status%>
<%= tax_stmtlistRec.dti_status_nm%>
<%= tax_stmtlistRec.return_code%>
<%= tax_stmtlistRec.return_description%>
<%= tax_stmtlistRec.sbdescription%>
<%= tax_stmtlistRec.created_by%>
<%= tax_stmtlistRec.creation_date%>
<%= tax_stmtlistRec.last_updated_by%>
<%= tax_stmtlistRec.last_update_date%>
<%= tax_stmtlistRec.amend_code%>
<%= tax_stmtlistRec.amend_code_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 01 15:25:54 KST 2010 */