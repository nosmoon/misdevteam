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


public class MT_ETCCAR_6000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_6000_LDataSet(){}
	public MT_ETCCAR_6000_LDataSet(String errcode, String errmsg){
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
			MT_ETCCAR_6000_LCURLISTRecord rec = new MT_ETCCAR_6000_LCURLISTRecord();
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			rec.oil_clsf_1 = rset0.getDouble("oil_clsf_1");
			rec.oil_clsf_2 = rset0.getDouble("oil_clsf_2");
			rec.oil_clsf_3 = rset0.getDouble("oil_clsf_3");
			rec.oil_clsf_4 = rset0.getDouble("oil_clsf_4");
			rec.oil_clsf_5 = rset0.getDouble("oil_clsf_5");
			rec.oil_clsf_6 = rset0.getDouble("oil_clsf_6");
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_ETCCAR_6000_LDataSet ds = (MT_ETCCAR_6000_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCCAR_6000_LCURLISTRecord curlistRec = (MT_ETCCAR_6000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aply_dt%>
<%= curlistRec.oil_clsf_1%>
<%= curlistRec.oil_clsf_2%>
<%= curlistRec.oil_clsf_3%>
<%= curlistRec.oil_clsf_4%>
<%= curlistRec.oil_clsf_5%>
<%= curlistRec.oil_clsf_6%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 23 14:44:34 KST 2009 */