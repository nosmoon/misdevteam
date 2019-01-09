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


package chosun.ciis.is.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.rec.*;

/**
 * 
 */


public class IS_COM_1111_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_COM_1111_LDataSet(){}
	public IS_COM_1111_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			IS_COM_1111_LCURLISTRecord rec = new IS_COM_1111_LCURLISTRecord();
			rec.dlco_cd_seq = Util.checkString(rset0.getString("dlco_cd_seq"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.corp_clsf_nm = Util.checkString(rset0.getString("corp_clsf_nm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.asnt_dstc_cd = Util.checkString(rset0.getString("asnt_dstc_cd"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.send_qty = Util.checkString(rset0.getString("send_qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_COM_1111_LDataSet ds = (IS_COM_1111_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_COM_1111_LCURLISTRecord curlistRec = (IS_COM_1111_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_cd_seq%>
<%= curlistRec.dlco_abrv_nm%>
<%= curlistRec.ern%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.presi_nm%>
<%= curlistRec.corp_clsf_nm%>
<%= curlistRec.addr%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_seq%>
<%= curlistRec.asnt_dstc_cd%>
<%= curlistRec.asnt_dstc_cd_nm%>
<%= curlistRec.send_qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 09 19:38:16 KST 2012 */