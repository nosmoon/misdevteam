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


public class MT_COMMATR_3200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_3200_LDataSet(){}
	public MT_COMMATR_3200_LDataSet(String errcode, String errmsg){
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
			MT_COMMATR_3200_LCURLISTRecord rec = new MT_COMMATR_3200_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.yy = Util.checkString(rset0.getString("yy"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.busn_prft = Util.checkString(rset0.getString("busn_prft"));
			rec.busn_prft_rate = Util.checkString(rset0.getString("busn_prft_rate"));
			rec.thterm_net_prft = Util.checkString(rset0.getString("thterm_net_prft"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_COMMATR_3200_LDataSet ds = (MT_COMMATR_3200_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_3200_LCURLISTRecord curlistRec = (MT_COMMATR_3200_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.dlco_no%>
<%= curlistRec.seq%>
<%= curlistRec.yy%>
<%= curlistRec.sale_amt%>
<%= curlistRec.busn_prft%>
<%= curlistRec.busn_prft_rate%>
<%= curlistRec.thterm_net_prft%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 13 09:53:20 KST 2009 */