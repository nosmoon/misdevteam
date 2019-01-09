/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1310_LDataSet(){}
	public SE_BOI_1310_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(16);
		while(rset10.next()){
			SE_BOI_1310_LCURLISTRecord rec = new SE_BOI_1310_LCURLISTRecord();
			rec.area_nm = Util.checkString(rset10.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset10.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset10.getString("bo_head_nm"));
			rec.bo_head_prn = Util.checkString(rset10.getString("bo_head_prn"));
			rec.chrg_flnm = Util.checkString(rset10.getString("chrg_flnm"));
			rec.dept_nm = Util.checkString(rset10.getString("dept_nm"));
			rec.bo_zip = Util.checkString(rset10.getString("bo_zip"));
			rec.bo_addr = Util.checkString(rset10.getString("bo_addr"));
			rec.bo_telno = Util.checkString(rset10.getString("bo_telno"));
			rec.bo_cntr_dt = Util.checkString(rset10.getString("bo_cntr_dt"));
			rec.fst_jd_yymm = Util.checkString(rset10.getString("fst_jd_yymm"));
			rec.bo_feat_nm = Util.checkString(rset10.getString("bo_feat_nm"));
			rec.bo_mang_grad_clasnm = Util.checkString(rset10.getString("bo_mang_grad_clasnm"));
			rec.qty_sell_net_nm = Util.checkString(rset10.getString("qty_sell_net_nm"));
			rec.sido_nm = Util.checkString(rset10.getString("sido_nm"));
			rec.adms_dstc_nm = Util.checkString(rset10.getString("adms_dstc_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_1310_LDataSet ds = (SE_BOI_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_1310_LCURLISTRecord curlistRec = (SE_BOI_1310_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.bo_head_prn%>
<%= curlistRec.chrg_flnm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.bo_zip%>
<%= curlistRec.bo_addr%>
<%= curlistRec.bo_telno%>
<%= curlistRec.bo_cntr_dt%>
<%= curlistRec.fst_jd_yymm%>
<%= curlistRec.bo_feat_nm%>
<%= curlistRec.bo_mang_grad_clasnm%>
<%= curlistRec.qty_sell_net_nm%>
<%= curlistRec.sido_nm%>
<%= curlistRec.adms_dstc_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 03 10:01:21 KST 2009 */