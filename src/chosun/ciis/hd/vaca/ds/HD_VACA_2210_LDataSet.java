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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_2210_LDataSet(){}
	public HD_VACA_2210_LDataSet(String errcode, String errmsg){
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
			HD_VACA_2210_LCURLISTRecord rec = new HD_VACA_2210_LCURLISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.year_vaca_dds_sum = Util.checkString(rset0.getString("year_vaca_dds_sum"));
			rec.add_vaca_dds_sum = Util.checkString(rset0.getString("add_vaca_dds_sum"));
			rec.occr_vaca_dds_sum = Util.checkString(rset0.getString("occr_vaca_dds_sum"));
			rec.use_vaca_dds_sum = Util.checkString(rset0.getString("use_vaca_dds_sum"));
			rec.vaca_rmn_dds_sum = Util.checkString(rset0.getString("vaca_rmn_dds_sum"));
			rec.yymm_alon_sum = Util.checkString(rset0.getString("yymm_alon_sum"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_VACA_2210_LDataSet ds = (HD_VACA_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_2210_LCURLISTRecord curlistRec = (HD_VACA_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cd_nm%>
<%= curlistRec.year_vaca_dds_sum%>
<%= curlistRec.add_vaca_dds_sum%>
<%= curlistRec.occr_vaca_dds_sum%>
<%= curlistRec.use_vaca_dds_sum%>
<%= curlistRec.vaca_rmn_dds_sum%>
<%= curlistRec.yymm_alon_sum%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 04 15:46:20 KST 2009 */