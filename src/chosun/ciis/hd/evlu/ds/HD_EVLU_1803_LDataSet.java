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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_1803_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_1803_LDataSet(){}
	public HD_EVLU_1803_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_EVLU_1803_LCURLISTRecord rec = new HD_EVLU_1803_LCURLISTRecord();
			rec.sel_chk = Util.checkString(rset0.getString("sel_chk"));
			rec.evlu_part_nm = Util.checkString(rset0.getString("evlu_part_nm"));
			rec.evlu_indx_nm = Util.checkString(rset0.getString("evlu_indx_nm"));
			rec.act_indx_def = Util.checkString(rset0.getString("act_indx_def"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			rec.evlu_part_cd = Util.checkString(rset0.getString("evlu_part_cd"));
			rec.evlu_indx_cd = Util.checkString(rset0.getString("evlu_indx_cd"));
			rec.act_indx_cd = Util.checkString(rset0.getString("act_indx_cd"));
			rec.gub_note = Util.checkString(rset0.getString("gub_note"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_1803_LDataSet ds = (HD_EVLU_1803_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_1803_LCURLISTRecord curlistRec = (HD_EVLU_1803_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sel_chk%>
<%= curlistRec.evlu_part_nm%>
<%= curlistRec.evlu_indx_nm%>
<%= curlistRec.act_indx_def%>
<%= curlistRec.db_status%>
<%= curlistRec.evlu_part_cd%>
<%= curlistRec.evlu_indx_cd%>
<%= curlistRec.act_indx_cd%>
<%= curlistRec.gub_note%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 26 16:56:40 KST 2014 */